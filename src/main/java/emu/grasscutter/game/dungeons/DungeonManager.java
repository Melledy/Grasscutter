package emu.grasscutter.game.dungeons;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.data.excels.DungeonData;
import emu.grasscutter.data.excels.DungeonPassConfigData;
import emu.grasscutter.game.dungeons.dungeon_results.BaseDungeonResult;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.game.props.WatcherTriggerType;
import emu.grasscutter.game.quest.enums.LogicType;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.scripts.constants.EventType;
import emu.grasscutter.scripts.data.ScriptArgs;
import emu.grasscutter.server.packet.send.PacketDungeonWayPointNotify;
import emu.grasscutter.server.packet.send.PacketGadgetAutoPickDropInfoNotify;
import emu.grasscutter.utils.Utils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import lombok.Getter;
import lombok.NonNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * TODO handle time limits
 * TODO handle respawn points
 * TODO handle team wipes and respawns
 * TODO check monster level and levelConfigMap
 */
public class DungeonManager {

    @Getter private final Scene scene;
    @Getter private final DungeonData dungeonData;
    @Getter private final DungeonPassConfigData passConfigData;

    @Getter private final int[] finishedConditions;
    private final IntSet rewardedPlayers = new IntOpenHashSet();
    private boolean isended = false;
    private Set<Integer> activeDungeonWayPoints = new HashSet<>();

    public DungeonManager(@NonNull Scene scene, @NonNull DungeonData dungeonData) {
        this.scene = scene;
        this.dungeonData = dungeonData;
        this.passConfigData = GameData.getDungeonPassConfigDataMap().get(dungeonData.getPassCond());
        this.finishedConditions = new int[passConfigData.getConds().size()];
        this.scene.setDungeonManager(this);
    }

    public void triggerEvent(DungeonPassConditionType conditionType, int... params) {
        if(isended){
            return;
        }
        for (int i = 0; i < passConfigData.getConds().size(); i++) {
            var cond = passConfigData.getConds().get(i);
            if (conditionType == cond.getCondType()) {
                if (getScene().getWorld().getServer().getDungeonSystem().triggerCondition(cond, params)) {
                    finishedConditions[i] = 1;
                }

            }
        }

        if (isFinishedSuccessfully()) {
            finishDungeon();
        }

    }

    public boolean isFinishedSuccessfully(){
        return LogicType.calculate(passConfigData.getLogicType(), finishedConditions);
    }

    public int getLevelForMonster(int id){
        //TODO should use levelConfigMap? and how?
        return dungeonData.getShowLevel();
    }

    public boolean activateRespawnPoint(int pointId){
        //TODO implement
        scene.broadcastPacket(new PacketDungeonWayPointNotify(activeDungeonWayPoints.add(pointId), activeDungeonWayPoints));

        Grasscutter.getLogger().warn("[unimplemented] trying to activate respawn point {}", pointId);
        return true;
    }

    public boolean getStatueDrops(Player player, boolean useCondensed) {
        if (!isFinishedSuccessfully() || dungeonData.getRewardPreviewData() == null || dungeonData.getRewardPreviewData().getPreviewItems().length == 0) {
            return false;
        }

        // Already rewarded
        if (rewardedPlayers.contains(player.getUid())) {
            return false;
        }


        if(!handleCost(player, useCondensed)){
            return false;
        }

        // Get and roll rewards.
        List<GameItem> rewards = new ArrayList<>(this.rollRewards(useCondensed));
        // Add rewards to player and send notification.
        player.getInventory().addItems(rewards, ActionReason.DungeonStatueDrop);
        player.sendPacket(new PacketGadgetAutoPickDropInfoNotify(rewards));

        rewardedPlayers.add(player.getUid());

        scene.getScriptManager().callEvent(EventType.EVENT_DUNGEON_REWARD_GET,
            new ScriptArgs());
        return true;
    }

    public boolean handleCost(Player player, boolean useCondensed){
        int resinCost = dungeonData.getStatueCostCount() != 0 ? dungeonData.getStatueCostCount() : 20;
        if(resinCost == 0){
            return true;
        }
        if (useCondensed) {
            // Check if condensed resin is usable here.
            // For this, we use the following logic for now:
            // The normal resin cost of the dungeon has to be 20.
            if (resinCost != 20) {
                return false;
            }

            // Spend the condensed resin and only proceed if the transaction succeeds.
            return player.getResinManager().useCondensedResin(1);
        }
        else if(dungeonData.getStatueCostID() == 106){
            // Spend the resin and only proceed if the transaction succeeds.
            return player.getResinManager().useResin(resinCost);
        }
        return true;
    }

    private List<GameItem> rollRewards(boolean useCondensed) {
        List<GameItem> rewards = new ArrayList<>();
        int dungeonId = this.dungeonData.getId();
        // If we have specific drop data for this dungeon, we use it.
        if (GameData.getDungeonDropDataMap().containsKey(dungeonId)) {
            List<DungeonDropEntry> dropEntries = GameData.getDungeonDropDataMap().get(dungeonId);

            // Roll for each drop group.
            for (var entry : dropEntries) {
                // Determine the number of drops we get for this entry.
                int start = entry.getCounts().get(0);
                int end = entry.getCounts().get(entry.getCounts().size() - 1);
                var candidateAmounts = IntStream.range(start, end + 1).boxed().collect(Collectors.toList());

                int amount = Utils.drawRandomListElement(candidateAmounts, entry.getProbabilities());

                if (useCondensed) {
                    amount += Utils.drawRandomListElement(candidateAmounts, entry.getProbabilities());
                }

                // Double rewards in multiplay mode, if specified.
                if (entry.isMpDouble() && this.getScene().getPlayerCount() > 1) {
                    amount *= 2;
                }

                // Roll items for this group.
                // Here, we have to handle stacking, or the client will not display results correctly.
                // For now, we use the following logic: If the possible drop item are a list of multiple items,
                // we roll them separately. If not, we stack them. This should work out in practice, at least
                // for the currently existing set of dungeons.
                if (entry.getItems().size() == 1) {
                    rewards.add(new GameItem(entry.getItems().get(0), amount));
                }
                else {
                    for (int i = 0; i < amount; i++) {
                        // int itemIndex = ThreadLocalRandom.current().nextInt(0, entry.getItems().size());
                        // int itemId = entry.getItems().get(itemIndex);
                        int itemId = Utils.drawRandomListElement(entry.getItems(), entry.getItemProbabilities());
                        rewards.add(new GameItem(itemId, 1));
                    }
                }
            }
        }
        // Otherwise, we fall back to the preview data.
        else {
            Grasscutter.getLogger().info("No drop data found or dungeon {}, falling back to preview data ...", dungeonId);
            for (ItemParamData param : dungeonData.getRewardPreviewData().getPreviewItems()) {
                rewards.add(new GameItem(param.getId(), Math.max(param.getCount(), 1)));
            }
        }

        return rewards;
    }

    public void startDungeon() {
        scene.getPlayers().forEach(p-> p.getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_ENTER_DUNGEON, dungeonData.getId()));
    }

    public void finishDungeon() {
        notifyEndDungeon(true);
        endDungeon(BaseDungeonResult.DungeonEndReason.COMPLETED);
    }

    public void notifyEndDungeon(boolean successfully){
        scene.getPlayers().forEach(p -> {
            // Quest trigger
            p.getQuestManager().triggerEvent(successfully?
                QuestTrigger.QUEST_CONTENT_FINISH_DUNGEON : QuestTrigger.QUEST_CONTENT_FAIL_DUNGEON,
                dungeonData.getId());

            // Battle pass trigger
            if(dungeonData.getType().isCountsToBattlepass() && successfully) {
                p.getBattlePassManager().triggerMission(WatcherTriggerType.TRIGGER_FINISH_DUNGEON);
            }
        });
        scene.getScriptManager().callEvent(EventType.EVENT_DUNGEON_SETTLE,
            new ScriptArgs(successfully ? 1 : 0));
    }

    public void quitDungeon() {
        notifyEndDungeon(false);
        endDungeon(BaseDungeonResult.DungeonEndReason.QUIT);
    }

    public void failDungeon() {
        notifyEndDungeon(false);
        endDungeon(BaseDungeonResult.DungeonEndReason.FAILED);
    }

    public void endDungeon(BaseDungeonResult.DungeonEndReason endReason) {
        if(scene.getDungeonSettleListeners()!=null) {
            scene.getDungeonSettleListeners().forEach(o -> o.onDungeonSettle(this, endReason));
        }
        isended = true;
    }

    public void restartDungeon() {
        this.scene.setKilledMonsterCount(0);
        this.rewardedPlayers.clear();
        Arrays.fill(finishedConditions, 0);
        this.isended = false;
        this.activeDungeonWayPoints.clear();
    }

    public void cleanUpScene(){
        this.scene.setDungeonManager(null);
        this.scene.setKilledMonsterCount(0);
    }
}