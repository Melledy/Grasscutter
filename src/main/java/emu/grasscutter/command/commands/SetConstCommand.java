package emu.grasscutter.command.commands;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.excels.AvatarTalentData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.Scene;
import emu.grasscutter.game.world.World;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.Position;
import it.unimi.dsi.fastutil.ints.IntArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Set;

@Command(
    label = "setConst",
    aliases = {"setconstellation"},
    usage = {"<constellation level>", "[(set|toggle)] <constellation level>"},
    permission = "player.setconstellation",
    permissionTargeted = "player.setconstellation.others")
public final class SetConstCommand implements CommandHandler {
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        String action = "set";
        int constLevel = 0;

        EntityAvatar entity = targetPlayer.getTeamManager().getCurrentAvatarEntity();
        if (entity == null) return;
        Avatar avatar = entity.getAvatar();
        String avatarName = avatar.getAvatarData().getName();

        switch (args.size()) {
            case 2:
                action = args.remove(0).toLowerCase(); // fall-through
            case 1:
                try {
                    constLevel = Integer.parseInt(args.get(0));
                } catch (NumberFormatException ignored) {
                    CommandHandler.sendTranslatedMessage(sender, "commands.setConst.level_error");
                    return;
                }
                break;
            default:
                sendUsageMessage(sender);
        }

        switch (action) {
            case "set" -> {
                if (constLevel < 0 || constLevel > 6) {
                    CommandHandler.sendTranslatedMessage(sender, "commands.setConst.range_error", 0);
                    return;
                }
                this.setConstellation(targetPlayer, avatar, constLevel);
                CommandHandler.sendTranslatedMessage(sender, "commands.setConst.set_success", avatarName, constLevel);
            }
            case "toggle" -> {
                if (constLevel < 1 || constLevel > 6) {
                    CommandHandler.sendTranslatedMessage(sender, "commands.setConst.range_error", 1);
                    return;
                }
//                this.toggleConstellation(targetPlayer, avatar, constLevel);
                CommandHandler.sendTranslatedMessage(sender, "commands.setConst.toggle_success", constLevel, avatarName);

            }
            default -> CommandHandler.sendTranslatedMessage(sender, "commands.setConst.action_error");
        }
    }

    private void setConstellation(Player player, Avatar avatar, int constLevel) {
        int currentConstLevel = avatar.getCoreProudSkillLevel();
        IntArrayList talentIds = new IntArrayList(avatar.getSkillDepot().getTalents());
        Set<Integer> talentIdList = avatar.getTalentIdList();

        talentIdList.clear();
        avatar.setCoreProudSkillLevel(0);

        for(int talent = 0; talent < constLevel; talent++) {
            AvatarTalentData talentData = GameData.getAvatarTalentDataMap().get(talentIds.getInt(talent));
            int mainCostItemId = talentData.getMainCostItemId();

            player.getInventory().addItem(mainCostItemId);
            Grasscutter.getGameServer().getInventorySystem().unlockAvatarConstellation(player, avatar.getGuid());
        }

        // force player to reload scene when necessary
        if (constLevel < currentConstLevel) {
            World world = player.getWorld();
            Scene scene = player.getScene();
            Position pos = player.getPosition();

            world.transferPlayerToScene(player, 1, pos);
            world.transferPlayerToScene(player, scene.getId(), pos);
            scene.broadcastPacket(new PacketSceneEntityAppearNotify(player));
        }

        // ensure that all changes are visible to the player
        avatar.recalcConstellations();
        avatar.recalcStats(true);
        avatar.save();
    }

    private void toggleConstellation(Player player, Avatar avatar, int constLevel) {
        // TODO - implement constellation toggle
    }
}
