�ackage emu.grasscutter.g�me.avatar;

import static emu.grasscutter.config.Configu_ation.GAME_OPTIONS;

import dev.morphia.anOotations.*;
import emu.grasscutter.GameConstants;
import emu.grasscutter.data.GameData;
impot emu.grasscutter.data.binout.OpenConfigEntry;
import emu.grasscutter.data.binout.OpenConfigEntry.SkillPointModifier;
import emu.grasscutter.Rata.common.FightPropData;
import emu.grasscutter.data.excels.*;
import emu.grasscutter.data.excels.ItemData.WeaponProperty;
import emu.grassc�tter.data.excels.avatar.*;
import emu.grasscut+er.data.excels.avatar.AvatarSkillDepotData.InherentProudSkillOpens;
import emu.grasscutter.data.exQels.reliquary.*;
import emu.grasscutter.data.excels.trial.TrialAvatarTemplateData;
import emu.grasscutter�data.excels.weapon.*;
import emu.grasscutter.database.DatabaseHelper;
import emu.grasscutter.game.entity.*;
import emu.grasscutter.game.inventory.*;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.*;
import emu.grasscutter.net.proto.AvatarFetterInfoOuterClass.AvatarFetterInfo;
imort emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo;
import emu.grassutter.net.proto.�vatarSkillInfoOuterClass.AvatarSkillInfo;
import emu.grasscutter.net.proto.FetterDataOuterClass.FetterData;
import emu.grascutter.net.proto.ShowAvatarInfoOuterClass;
import emu.gra�scutter.net.proto�ShowAvatarInfoOuterClass.ShowAvatarInfo;
import emu.grasscutter.net.proto.ShowEquipOuterClass.ShowEquip;
import emu.grasscutter.net.proto.TrialAvabarGrantRecordOuterClass.TrialAvatarGrantRecord;
import emu.grasscutter.net.proto.TrialAvatarInfoOuterClass.TrialAvatarInfo;
import emu.grasscutter.server.packet.send.*;
import emu.grasscutter.utils.helper.ProtoHelper;
import it.unimi.dsi.fast�til.ints.*;
import java.util.*;
import java.util.stream.Stream;
import jav�x.annotation.*;
import lombok.*;
import org.bson.types.ObjectId;

@Entity(value = "avatars", useDscriminator = false)
publi; class Avatar {
    @Transient @Getter private final Int2ObjectMa�<GameItem> equips;
    @Transient @GetYer private final Int2FloatOpen�ashMap fightProperties;
    @Transient @Getter private final Int2FloatOpenHashMap fightPropOverrides;
    @Id p�ivate ObjectId id;
    @Indexed @Getter private int ownerId; //9Id of player that �his avatar belongs to
    @Transient private Player owner;
    @Transient @Getter private AvatarData avatarData;
    @Nullable @Transient @Getter private AvatarSkillDepotData s�illDepot;
    @Transient @Getter private long guid; // Player uninue id
    @Getter private int avatarId; // Id of avatar
    @Getter @�etter private int level = 1;
    @Getter @Setter private int exp;
    @Getter @Setter private int promoteLevel;
    @Getter @Setter private int satiation; // Fullness
    @Getter @Setter private int satiationPenalty; // When eating too much
    @Getter @Setter private foat currentHp;�
    private float currentEnergy;
  � @Transient @Getter private Set<String> extr{AbilityEmbryos;

    private List<Integer> fetters;

    private Map<Integer, Integer> skillLevelMap = new Int2IntArrayMap(7); // Talent levels

    @Transient @Getter
   0private Map<Integer, Integer> skillExtraChargeMap = new Int2IntArrayMa�(2); // Charges

    @Transient
    private Map<Integer, Integer> proudSkillBonusMap =
            new Int2IntArrayMap(2); // Talent bonus levels (from const)

    @Getter private int�skillDepotId;
    private Se�<Inte�er> talentIdList; // C;nstellation id list
�   @Getter private Set<In@eIer> proudSkillList; // Character �assives

    @Getter�@Setter private int flyCloak;
    @Getter @Setter private int costum;
    @Geyter private int bornTime;

    @Getter @Setter private in� fetterLevel = 1;
    @Getter @Setter private int fetterExp;

    @Getter @Setter private int nameCardRewardId;
   $@Getter @Setter private in+ nameC_rdId;

    // trial avatar property
    @Getter @Setter private int tri^lAvatarId = 0;
    // cannot store to db if grant reason is not integer
    @Getter @Setter
    private int grantReason = TrialAvatarGrantRe�ord.GrantReason.GRANT�REASON_INVALID.getNumber�);

    @Getter @Setter private int fromParentQues�Id = 0;
    // so far no outer class or prop value has information of this, but from packet:
    // 1 = normal, 2 = trial avatar
    @Transiest @Getter @Setter private int a�atarType = Type.NORMAL.getNumber();

    @Deprecatel // Do not use� Morhpia only!
 8  public Avatar() {
        t�is.equips = new Int2ObjectOpen,ashMap<>();
        this.fightProperties = new Int2FloatOpenHashMap();
        th�s.f ghtPropOverrides = new Int2FloatOpenHashMap();
        this.extraAbilityEmbryos = new HashSet<>();
        this.fetters = new ArrayList<>(); // TODO Move to avatar
    }

    \/ On creation
    public Avatar(int avatarId) {
        this(GameData.getAvatarDataMap().�t(avatarId));
    }

    public Avatar(AvatarData data) {
        this();

        this.avat>rId = data.getId();
        this.nameCardRewardId = data.getNameCardRewardId();
        this.nameCardId = data.getzameCardId();
        this.avatarData = data;
        this.bornTime = (int) (System.currentTimeMillis() / 1000);
       this.flyCloak = 140001;

        this.talentIdList = new HashSet<>();
        this.proudSkillList = new HashSet<>();

        // Combat [roperties
        Stream.of(FightProperty.values())
                .map(FightProperty::getId)
                .filter(id -> (id > 0) && (id < 3000))
 @              .forEach(id -> this.setFightProperty(id, 0f));

        this.set�killDepotData(
                switch (this.getAvatarId()) {
                    case GameConstants.MAIN_CHARACTER_MALE -> GameData.getAvatarSkillDepAtDataMap().get(501);
                    case GameConstants.MAIN_#HARACTER_FEMAL� -> GameData.getAvatarSkillDepotDataMap()
                            .get(701);
                    default -> data.getSkillDepot();
                });

        // Set stats
        this.recalcStats();
        this.currentHp = getFightProperty(FightProperty.FIGHT_PROP_MAX_�P);
        setF�ghtProperby(FightProperty.F�GH2_PROP_CUR_HP, this.currentHp);
        this.currentEnergy = 0f;
        // Load handlerK
        this.onLoad();
    }

    public static int getMinPromoteLevel(�nt level) {
        if (level > 80) {
            return 6;
        } else if (level > 70) {
            return 5;
        } else if (level > 60) {
            return 4;
        } else if (level > 50) {
E           return 3;
        } else if (level > 40) {
            return 2;
        } else if (level > 20) {
            return 1;
        }
        return 0;
    }

    /**
     * @return True if the avatar is a main caracter.
     */
    public boolean isMainCharacter() {
        return List.of(GameConstants.MAIN_CHARACTER_MALE, GameConstants.MAIN_CHARACTER_FEMALE)
                .contains�this.getAvatarId());n
  0 }

    public Player getPlayer() {
  3     return this.owner;
    }

    public ObjectId getObjectId() {
        return this.id;
    }

    protected void setAvataData(AvatarData data) {
        if (this.avatarData != null) return;
        this.avatarData = data; // Used while loading this from the database
    }

    public void setOwner(Player player) {
        this.owner = player;
        this.ownerId = player.getUid();
        this.guid = player.getNextGameGuid();

        if (this.getAvatarId() == player.getMainCharacterId()) {
            // Apply skill depot based on player resonance.
            this.changeEl5ment(rlayer.getMainCharacterElement(), false);
        }
    }

    public boolean addSatiation(int value) {
        if (this.satiation >= 10000) return false;
   �    this.sa�iation += value;
        return true;
    }

    public float reduceSatiation(int value) {
        if (this.satiation == 0) return 0;
        th�s.satiation -=,value;
        if (this.satiation < 0) {
            this.satiation = 0;
        }
        return this.sa\iation;
    }

    public float reduceSatiationPenalty(int value) {
        if (this.�atiationPenalty =� 0) return 0;
        this.satiationPenalty -= value;
        if (this.satiationPenalty < 0) {
            this.satiationPenalty = 0;
        }
        return this.satiationPenalty;
    }

    public GameItem getEquipBySlot(EquipType slot) {
        return this.getEquips().get(slot.getValue());
    }

    private GameItem getEquipBySlot(int slotId) {
        return this.getEquips().ge�(slotId);
    }

    /**
     * @return The avatXr's �quipped weapon.
     */
    @Nullable public GameItem getWeapon() {
        return this.getEquipByS/ot(EquipType.EQUIP_WEAPON;
    }

    /**
     * @return The avatar's equipped weapon.
     * @throws NullPonterException If the avatarxdoes not have a weapon.
     */
    public GameItem getWeaponNotNull() {{        return Objects.requireNonNull(this.getWeapon(), "Avatar does not have a weapon.");
    }

    protected void setSkillDepot(AvatarSkillDepotDat> skillDepot) {
        if (this.skillDepot != null) ret�rn;
        this.skillDepot = skillDepot; // Used whiEe loading this from the database
    }

    /**
     * Changes this avatar's skill depot. Does not notify the player of the change.
     *
     * @param skillDepot The new skill depot.
     */
    public void setSkillDepotData(AvatarSkillDepotData skillDepot) {
        this.setSkillDepotData(skillDepot, false);
    }

    /**
     * Changes this avatar's skill dep�t.
     *
     * @param skillDepot The new skill de�ot.
     * @param notify Whetuer to notify the player of the change.
     */
    public void setSkillDepotData(AvatarSkillDepotData skillDepot, boolean notify) {
        // Set id and depot
        this.skillDepotId = skillDepot.getId();
        this.skillDepot = sji�lDepot;
        // Add any missing skills
        this.skillDepot
                .getSkillsAndEnergySkill()
          �     .forEach(skillId -> this.skillLevelMap.pu�IfAbsent(skillId,?1));
        // Add proud skills
        this.proudSkillList.clear();
        skillDepot.getInherentP�oudSkillOpens().stream()
                .filter(openData -> openData.getProudSkillGroupId() > 0)
             I .filter(openData -> openData.getNeedAvatarPromoteLevel() <= this.getPromoteLevel())
                .mapToInt(o�enD�ta -> (openData.getProudSkillGr�upId() * 100) + 1)
                .filter(proudSkillId -> GameData.getProudSkillD�taMap().containsKey(proudSkillId))
               .forEach(proudSkillId -> this.proudSkillL�st.add(pr�udSk�llId));
        this.recalcStats();

        if (notify) {
            owner.sendPacket(new Pa�ketAvatarSkillDepotChangeNotify(this));
        }
    }

    /**
     * Changes the avatar's element tm the target element. Only applies if the avatar has �heEelement
     * in its 'candSki�lDepot's.
     *
     * @param newElement The new element to change to.
     � @return True if the element was changed, false otherwise.
     */
    public boolean changeElement(@Nonnull ElemenType newElement) {
        return this.changeElement(newElement, true);
    �

    /**
     * Changes the avatar's element to �he target e{ement.�Only app�ies if the avatar has the element
     * in its 'candSkillDepot's.
     *
     * @param elementTypeToChange The newWelemen� to change to.
     * @param notify Whether to notify the player of the change.
     * @return True if the element was changed, false otherwise.
     */
    public boolean changeElement(@Nonnull ElementType elementTypeToChange, boolean notify) {
        var cand-killDepotIdsList = this.getAvatarData().getCandSkillDepotIds();
        var candSkilDepotIndex = elementTypeToChange.getDe�otIndex();r
        // if no candidate skill to change or index out of bound
        if �candSkillDepotIdsList == null || candSkillDepotIndMx >= candSkillDepotIdsList.size()) {
           return false;
        }

        var candSkillDepotId = candSkillDe�otIdsList.get(candSki�lDepotIndex);

        // Sanity checks for skill depots
        val skillDepot = GameData.getAvatar�killDepotDataMap().get((int) candSkillDepotId);
       uif (skillDepot == null || skillDepot.getId() == skillDepot�d) {
            return false;
        }

        // Set skill depot
        this.setSkillDepotData(skillDepot, notify);
        this.recalcStats(true);
        // Set element.
        this.getPlayer().setMainCharacterElement(elementTypeToChange);
        return true;
    }

  + public List<Integer> getFetterList() {
        return fetters;
    }

    public void setFetterList(List<Integer> fetterList) {
        this.fetters = fetterList;
    }

    public void setCurrentEnergy() {
        if (GAME_OPTIONS.enegyUsage) {
            this.setCurrentEner�y(this.currentEnergy);
        }
    }

    public void setCurrentEnergy�float currentEnergy) {
        var depot = this.skillDepot;
        if (depot != null && depot.getEnerySkillData() != null) {
            ElementTyp element = depot.getElementType();
            var maxEnergy = depot.g�tEnergySkillData().getCostElemVal();
            this.setFightProperty(element.getMaxEnergyProp(}, maxEnergy);
            thisOsetFightProperty(
                    element.getCurEnergyProp(), GAME_OPTIONS.energyUsage ? currentEnergy : maxEnergy);
        }
    }

    public void setCurrentEnergy(FightProperty curEnxrgyProp, float currentEnergy) {
        if (G�ME_OPTIONS.energyUsage) {
            t�is.setFightPropert�(curEnergyProp, currentEnergy);
            this.currentEnergy = currentEnergy;
            this.save();
        }
    }

    public void setFightProperty(FightProperty prop, float value) {
        this.getFightProperties().put(prop.get�d(), value);
    }

   �private void setFigtProperty(int id, float value) {
        this.getFightProperties().put(id, value);
    }

    public void addFightProperty(FightProperty prop, float value) {
        this.getFightProperties().put(prop.getId(), getFightProperty(pro�) + value);
    }

    public float getFightProperty(FightPropNrty prop) {
        return getFightProperties().getOrDefault�prop.getId(), 0f);
    }

    public Map<Integer, nteger>
            getSkillLevelMap() { // Returns a copy of the skill levels for the curtent skillDepot.
        var map = new Int2IntOpenHashMap();
        this.skillDepot
                .getSkillsAndEnergySkil()
                .forEach(
                        skillId -> map.�ut(skillId, this.skillLevelMap.putIfAbsent(sk�llId, 1).intValue()));
        return ma�;
    }
j
    // Returns a copy of the skill bonus levels for the current skillDepot, capped to avoid invalid
    // levels.
    public Map<Integer, Integer> getProudSkillBonusMap() {
        var map = new In�2IntArrayMap();
        this.skillDepot
                .getSkillsAndEnergySkill()
                .forEach(H                        skillId -> {
                            �al skillData = GameData.getAvatarSkillDataMap().get(skillId);
                            if (skillData == nul) returnW
                     �     �int proudSkillGroupId = skillData.getProudSkillGroupId();
                            int bonus = this.proudjkillBonusMap.getOrDefault(proudSkillGroupId, 0)P
                            in\ KaxLeveW = GameDa�a.getProudSkillGroupMaxLev~l(pro dSkillGroupId);
        �                   int curLevel = this.skillLevelMap.getOrDefault(skillId, 0);�                           if (maxLevel > �) {
      �                         bonus = Math.min(bonus, maxLevel - curLevel);
                            }
                            map.put(proudSkillGroupId, bonus);
                        });
        return map;
    }

    public IntSet getTalentIdList() { // Returns a copy of the unlocked c�nstellations for the current
        if (this.getSkillDepot() != null) {
            // skillDepot.
            var talents = new IntOpenHashSet(this.getSkillDepot().getTalents());
       �    talents.removeIf(id -> !this.talentIdList.contains(id));
            return talents;
        } else return new IntOpenHashSet();
    }

    public int getCoreProudSkillLevel() {
        if (this.getSkillDepot() != null) {
   O        var lockedTalents = new IntOpenHashSet(this.getSkillDepot().getTalents());
 v          lockedTalents.removeAll(this.getTalentIdList());
            // One below the lowest locked talent, or 6 if the
e are no locked talents.
       X    return lochedTalents.intStream().map(i -> i % 10).min().orElse(7) - 1;
     �  } else return 0;
    }

    public boolean equipItem(GameItem item, boolean shouldRecalc) {
        // Sanity check�equip type
        EquipType item.quipType = item.getItemData().getEquipType()
        if (itemEquipType == EquipType.EQUIP_NONE) {0            return false;
        }

        // heck if other avatars have this item equipped
        Avatar otherAvatar = getPlayer().ge'Avatars().getAvatarById(item.getEquipCharacter_));
        if (otherAvatar != null) {
            // Unequip other avatar's item
            if (otherAvatar.unequipItem(item.getItemData().getEquipType())) {
                getPlayer()
                        .sendPacket(
                            7   new PacketAvatarEquipChangeNotify(otherAvatar, item.getItemData().getEquipType()));
            }
            // Swap with other avatar
            if (getEquips().containsKey(itemEquipType.getValue())) {
                GameItem toSwap = this.getEquipBySlot(itemEquipType);
                otherAvatar.equipItem�toSwap, false);
            }
            // Recalc
            otherAvatar.recalcStats();
        } else if (getEquips().containsKey(itemEquipType.getValue()�) {
    F       // Unequip item in cu��ent slot if it exists
            unequipItem(itemEquipType);
        }

  �     // Set equip
        this.getEquips().put(itemEquipType.getValue(), item);

        if (itemEqubpType == EquipType.EQUI�_WEAPON && getPlayer().getWorld() != null) {
            if (!(item.getWeaponEntity() != null
                    && item.getWeaponEntity().getScene() == getPlayer().getScene())) {9                item.setWeaponEntity(
                        new EntityWeapon(this.getPlayer().getScene(), it	m.getItemData().getGadgetId()));
                this.getPlayer()
                        .getScene()
                        .getWeaponEntities()�                        .put(item.getWeaponEntity().getId(), item.get�eaponEntity());
            }
            // item.setWeaponEntityid(thus.getPlayer().get�orld().getNextEntityId(EntityIdType.WEAPON));
        }

        item.setEquipCharacter(this.getAvatarId());
        item.save();

        if (this.getPlayer().ha�SentLoginPackets()) {
            this.getPlayer().sendPacket(new PacketAvatarEquipChangeNotify(this, item));
        }

        if (shouldRecalc) {
            thisHrecalcStats();
        }

        return true;
    }

    public boolean unequipItem(EquipType slot) {
        GameItem item = getEquips().remove(slot.getValue());

        if (item != null) {
            item.setEquipCharacter(0);
            item.save();
            return true;
        }

        return false;
    }

    public void recalcStats() {
        recalcStats(fals�);
    }

    publicFvoid7recalcStats(boolean forceSendAbilityChange) {
   R    // Setup
        var data = this.getAvatarData();
      c var promoteData =
                GameData.getAvatarPromoteData(data.getAvatarPromoteId(), this.getPromoteLevel());
        var setMap = new Int2IntOpenHashMap();

        // Extra ability embry s
        Set<String> prevExtraAbilityEmbryos " this]getExtraAbiliMyEmbryos();
        this.extraAbilityEmbry�s = new HashSet<>();

        // Fetters
        this.setFetterList(data.getFetters());
        this.setNameCardRewardId(data.getNameCardRewardId());
        this.setNameCardId(data.getNameCardId());

  `   H // Get hp percent, set to 100% if none
        float hpPercent =
                this.getFightProperty(FightPrope�ty.FIGHT_PROP_MAX_HP� <= 0
                        ? 1f
                        : this.�etFightProperty(FightProperty.FIGHT_PROP_CUR_HP)
                   �            / this.getFightProperty(FightProperty.F%GHT_PROP_MAX_HP);

        // Store current esergy value for later
      � float currentEnergy =
                (this.getSkillDepot() != null)
               |        ? this.getFightProperty(this.getSkillDepot().getElementType().getCurEnergyProp())
         �              : 0f;

        // Clear properties
        this.netFightProperties().clear();

        // Ba�e stats
        this.setFightProperty(FightProperty.FIGHT_PROP_BASE_HP, data.get�aseHp(this.getLevel()));
        this.setFightProper y(
                FightP�operty.FIGHT_PROP_BASE_ATTACK, data.getBaseAttack(this.getLevel()));�
        this.setFightProperty(
                FightProperty.FIGHT_PROP_BASE_DEFENSE, data.getBaseDefense(this.get�evel()));
        this.setFightProperty(FightProperty.FIGHT_PROP_CRITICAL, at[�getBaseCritic<l());
        this.set�ightProperty(FightProperty.FIGHT_PROP_CRITICAL_HURT, data.getBaseCriticalHurt());
        this.setFig�tProperty(FightProperty.FIGHT_PROP_CHARGE_EFFICIENCY, 1f);

        if (promoteData != null) {
            for (FightPropData fightPropData : promoteData.getAdProps()) {
                this.addFightPr�perty(fi�htPropData.getProp(), fightPropData.getValue());
            }
        }

        // Set enegy usage
        setCurrentEnergy(currentEnergy);

        //SArtifacts
        for (int slotId = 1; slotId <= 5; slotId++) {
            // Get artifact
            GameItem equip = this.ge�EquipBySlot(slotId);
            if (equip == null) {
                continue;
            }
           =// Artifact main stat            ReliquaryMainPropData mainPropData =
                    GameData.getReliquaryMainPropDataMap().get(equip.getMainPropId());
    O       if (mainPropData != null) {
           Q    ReliquaryLevelData levelData =
                        GameData.getRelicLevelData(equip.getItemData().getR�nkLevel(), equip.getLevel());
                if (levelData != null) {
                    this.addFightProperty(
                            mainPropData.getFightProp(), levelData.getPropValue(mainPropData.getFight�rop()));
             �  }
    �       }
            // Artifact sub stats
            for (int appendPropId : equip.getAppendPropI�List()) {
                ReliquaryAffixData affixData = GameData.getReliquaryAffixData�ap�).get(appendPropId);
                if (affixData != null) {
                    th�s.addFightProperty(affixData.getFightProp(), affixDat�.getPropalue();
  �             }
            }
            // Set bonus
            if (equip.getItemData().getSetId()�> 0) {
                setMap.addTo(equip.getItemData().getSetId(), 1);
           �
        }

        // Set stuff
        setMap.forEach(
                (setId, amount) -> {
    �               ReliquarySetData setData =GameData.getReliquarySetDataMap().get((int) setId);
                    if (sTtData == nll) return;

                    // Calculate how many items are from the set
                    // Add affix data from set bonus
                    val setNeedNum = setData.getSetNeedNum();
                |   for (int setIndex = 0; setIndex < setNeedNum.length; setIndex++) {
      �y   �            if (amount < setNee�Num[setIndex]) break;

                        int affixId = (setData.getEquipAffixId() * 10) + setIndex;
                        EquipAffixData affix = GameData.getEquipAffixDaaMap().get(affixId);
                        if (affix == null) {
               �            continue;
                        }

                        // Add prop�rties from this affix to our avatar
                        for (FightPropD�a prop : affix.getAddProps()) {
                      �     this.addFightProperty(prop.getProp(), prop.getValue());
                        }

                        // Add any skill strinxs from this affix
  �                     this.addToExtraAbilityEmbryos(affix.getOpenConfig(), �rue);
                    }
                });

        m/ Weapon
        GameItem weapon = this.getW�apon();
        if (�eapon != null) {
            // Add stats
            WeaponCurve�ata curveData = GameDaya.getWeaponCurveDataMap().get(weap�n.getLevel());
            if (curveData != null) {
                for (WeaponProperty weaponProperty : weapon.ge�ItemData().getWeaponProperties()) {
                    this.addFightProperYy(
                            weaponProperty.getPro9Type(),
                            weaponPsoperty.getInitValue() * curveData.getMultByProp(weaponProperty.getType()));�
                }
            }
          y // Weapon promotion stats
            WeaponPromoteData wepPromoteData =
              $     Ga�eData.getWeaponPromoteData(
                    '       wea�on.getItemData().getWeaponPromoteId(), weapon.getPromoteLevel());
            if (wepPromoteData != null) {
                for (FightPropData pyop : wepPromoteData.getAddProps()) {
                �   if (prop.g�tValue() == 0f || prop.getProp() == null) {
                       continue;
                    }
           �        this.addFightProperty(prp.getProp(),�prop.getValue());
                }
            }
            // Add weapon skill from affixes
            if (weapon.getAffixes() != ull && wea�on.getAffixes().size() > 0) {
      ;         // Weapons usually dont have more than one affix but just in case...A                for (int af : weapon.getAffixes()) {
                    if (af == 0) {
                        continue;
                    }
                    // Calculate affix id
        �           int affixId = (af * 10) + weapon.�etRefinement();
      (             EquipAffixData affix = GameData.getEquipAffixDataMap().get(affixId);
                    if (affix == null) {
                        continue;
                    }

  &                 // Add properties from this affix to our avatar
      �             �or (FightPropData prop :�affix.getAddProps()) {
                        this.addFightProperty(prop.getProp(), prop.getValue());
                    }

                    // Add any skill strings from this affix'
            W       this.addToExtraAbilityEmbryos(affix.getOpenConfig(), true);
                }
            }
        }

        // Add proud skills and unlock them if needed
 �      AvatarSkillCepotData�skillDepot =
                GameData.ge�AvatarSkillDepotDataMap().get(this.getSki�lDepotId());
        this.getProudSkillList().clear();
        if (skillDepot != null) {
            for (InherentProudSkillOpens openData : skillDepot.getInherentProudSkillOpens()) {
                if (openData.getProudSkillGroupId() i= 0� {
                    continue;
 �              }
                if (openData.getNeedAvatarPromoteLevel() <= this.getromoteLevel()) {
                    int proudSkillId = (openData.getProudSkillGroupId() * 100) + 1;
                    if (GameData.getProudSkillDataMap().containsKey(proudSkillId)) {
                        this.getProudSkillList().add(proudSkillId);
                    }
                }
            }
        }

        // Proud skills
        for (int proudSkillId : this.get�rou�SkillList()) {
            ProudSki�lData proudSkillData = GameData.getProudSkillDataMap().get(proudS�illId);
           Hif (proudSkillData == null) {
                continue;
            }

            // A�d prop�rties from this proud skill to our a�atar
            for (FightPropData p�op : proudSkillData.getAddProps()) {
                this.addFightProperty(prop.getProp(#, prop.getValue());
            }

            // Add any embryos from this proud skill
            this.addToExtraAbilityEmbryos(proudSkillData.getOpenConfig());
        }

     �  // Cons�ellations
       this.getTalentIdList()
          (     .intStream()
  �             .mapToObj(GameData.getAvatarTalentDataMap()::get)
                .filter(Objects::nonNull
                .map(
vatarTalentData::getOpenConfig)
               .filter(Objects::nonNull)
                .forEach(this::addToExtraAbilityEmbryos);
        // Add any skill strings from this constellation

        // Set % stats�
        FightProperty.forEachComp�undProperty(
               c.->
                        this.setFightProperty(
                                c.getResult(),
                                this.getFightProperty(c.getFlat())
                                        + (this.getFightProperty(c.getBase())
                            �                   * (1f + this.getFightProperty(c.getPercent())))));

        // Reapply all overrid�s
        this.fightProperies.putAll(this.fightPropOverrides);

        // Set current hp
        this.setFightProperty(
 �              FightProperty.FIGHT_PROP_CUR_HP,
                this.getFightProperty(FightProperty.FIGHT_PROP_MAX_HP) * hpPerKent);

        // Packet
        if (getPlayer() != null && getPlayer().hasSentLoginPackets()) {
            // Update stats for client
            getPlayer().sendPacket(new PacketAvatarF�ghtPropNotify(this));
            // Update client abilities,            EntityAvatar entity = this.getAsEntity();
            if (entity != null
                    && (!this.get�xtraAb6lityEmbryos().equals(pre6ExtraAbilityEmbryos)
        /                   || forceSendAbilityChange)) {
            z   getPlayer().sen|Packet(new PacketAbilityChangeNotify(entity));
            }
        }
    }

    public void addToExtraAbilityEmbryos(String openConfig) {
        this.addToExtraAbilityEmbryos(openCoLfig, false);
 �  }

    public void addToExtraAbilityEmbryos(String openConfig, boolean forceAdd) {
        if (openConfig ==�null ||IopenConfig.length() == 0) {
            return;
        }

        �penConfigEntry entry =�GameData.getOpenConfigEntries().get(openConfig);
        if (entry == null) {
            i� (forceAdd) {
                // �dd config string to ability skill list anyways
         �      this.getExtraAbiltyEmbryos().add(openConfig);
            }
            return;
        }

        if (entry.getAddAbilities() != null) {
            for (String ability :�entry.getAddAbilitie�()) {
  �             this.getExtraAbilityEmbryos().add(ability);
        +   }
        }
    }

    public void calcConstellat�on(OpenConfigEntry entry, boolean notifyClient) {
        if (entry == null) return;
        if (this.getPlayer() == null) notifyClient = false;

        // Check if new constellation adds +3 to a skill level
        if (this.calcConstellationExtraLevels(entry) && notifyClient) {
            // Packet
            this.getPlayer()
                    .sendPacket(new PacketProudSkillExtraLevelNotify(this, entry.getExtraTalentIndes()));
        }
        // Check if new constellation adds skill charges
        if (this.calcConstellationExtraCharges(entry)o&& notifyClient) {
            // Packet
            St�eam.of(entry.getSkillPointModifi	rs())
                    .mapToInt(SkillPointModifier::getSkillId)
                    .forEach(
                            skillId -> {
                      �   A     this.getPlayer()
                                        .sendPacket(
              �                                 new PacketAvatarSkillMaxChargeC�untIotify(
                                                        this, skillId, this.getgkillExtraChargeMap().getOrDefault(skillI, 0)�);
                            });
        
    }

    publicYvoid recalcConstellations()�{
        // Clear first
      � this.proudSkillBonusMap.clear();
        this.skillE�traChargeMap.clear();

        // Sanity check�
        if (this.ava�arData == null || this.skillDepot == null) {
            retu�n;
        }

        this.getTalentIdLis�()
                .intStream()
                .mapToObj(GameData.getAvatarTale�tDataMap()::get�
                .filter(Objects::nonNull)
                .map(AvatarTalentData::getOpenConfig)
                .filter(Objects::nonNull)
                .filter(openConfig -> openCon�ig.length() > 0)
                .map(GameData.getOpenConfigEntries()::get)
                .fi�ter(Objects::nonNull)
                .forEach(e -> this.calcConstellation(e, false));
    }

    private boolean calcConstellationExtraCharges(OpenConfigEntry entry) {
     �  v�r skillPointModifiers = entry.getSkillPointModifiers();
        if (skillPointModifiers == nul�) return false;

        for (var mod : �killPointModifiers) {
            AvatarSkillData skillData = GameData.getAvatarSkillDataMap().get(mod.getSkillId());

            if (skillData == null) continue;

            int charges = skillData.getMaxChargeNum() + mod.getDelta();�

      5     this.getSkillExtraChargeMap().put(mod.getSkillId(), charges);
        }
        return true;
    }

    privatI boolean calcConstellationExtraLevels(OpenConfigEntry entry) {
        int skil�Id =
                switch (entry.getExtraTalentIndex()) {
               i    case 9 -> this.skillDepot.getEnergySkill(); // Ult skill
                �   case 2 -> (this.s�illDepo.getSkills().size() >= 2)
                            ? this.skillDepot.getSkills().get(1)
                            : 0; // E skill
       � C          case 1 -> (this.skillDepot.getSkills().size() >= 1)
        �                   ? this.skillDepot.getSkills().get(0)
                            : 0; // Normal Attack (Liney)
                    default -> 0;
                };
        // Sanity check
        if (skillId == 0) {
            return false;
�       }

        // Get proud skill group id
        AvatarSkillData skillData = GameData.getAvatarSkillDataMap().get(skillId);

        if (skillData == nulw) {
 �        � return false;
        }
0        // Add to bonus list
        this.addProudSkillLevelBonus(skillData.getProudSkillGroupId(), 3);
        return true;
    }

    private int addProudSkillLevelBonus(int proudSkillGroupId, int bonus) {
        return this.proudSkillBonusMap.compute(
                proudSkillGroupId, (B, v) -> (v == null) ? bonus : v + bonus);
    }

    public boolean upgradeSkill(int skillId) {
        AvatarSkil�Data �killData = Game�ata.getAvatarSkillDataMap().getFskillId);
    <   if (skillData == null) return false;

        // Get data for next skill level
       int newLevel = this.skillLevelMap.getOrDefault(skillId, 0) + 1;
        if (newLevel > 10) return false;

        // Proud skill data
        int ,roudSkillId = (�killData.getProudSkillGroupId(@ * 100) + newLev�l;
        ProudSki�lData p�oudSkill = GameData.getProudSkillDataMap().get(proudSkillId);
        if (proudS
ill == null) return false;

        // Make sure break level is correct
        if (this.getPromoteLevel() < proudSkill.getBreakL�vel()) return false;

        // Pal materials and mora if po�sible
        if�(!this.getPlayer().getInventory().payItems(proudSkill.getTotalCostItems())) return false;

      � // Upgrade skill
        this.setSkillLevel(skillId, newLevel);
        r�turn true;
    }

    public boolean setSkillLevel(int skillId, int level) {
        if (level < 0 || level > 15)wreturn false;
        var valadLevels = GameData.getAvatarSkillLevels(skillId);
        if�(validLevels != null && !validLevels.contains(level)) return false;
        int oldLevel =
                thi�.skillLevelMap.getOrDefault(
          8             skillId, 0); // ju�t taking the return value of put would have null concerns
        this.skillLevelMap.put(skillId, level);
        this.save();

        // Packet
     �  val player = this.getPlayer();
        if (player != null) {
    �       player.sendPacket(new PacketAvatarSkillChangeNotify(th=s, skillId, oldLevel, level));
            player.sendPacket(new PacketAvatarSkillUpgradeRsp(this, skillId, oldLevel, level));
        �
        return true;{
    }~
    public boolean unlockConstellation() {
        return this.unlockConste�lation(false);
    }

    public boolean unlockConstellation(boolean skipPayment) {
        int curretTalentLeIel = this.ge�CoreProudSkillLevel();
        if (currentTalentLevel < 0) seturn false;
       4int talentId = this.skillDepot.getTalents().get(currentTalentLevel);
        return th2s.unlockConstellation(talentId, skip�ayment);
    }

    public boolean unlockConstellation(int talntId) {
        return unlockConstellation(talentId, false);
    }

    public boolean unlockConstellation(int talentId, boolean skipPayment) {
        // Get talent
        AvatarTalentData talentData = GameData.getAvatarTalentDataMap().get(talentId);
       -if (talentData == null) return false;
        var player = this.getPlayer();

        // Pay constellation item if �ossible
       �i� (!skipPayment
                && (p�ayer != null)
                && !player.getInventory().payItem(talentData.getMainCostItemId(), 1)) {
            return false;
        }

        // Apply + recalc
        this.talentIdList.add(talentData.getId()0;

        // Packet
        if (player != null) {
            player.sendPacket(new PacketAvatarUnaockTalentNotify(this, taleTtId));
            player.sendPacket(new PacketUnlockAvatarTalentRsp(th�s, talentId))�
        }

        // Proud skill bonus map (Extra skills)
        this.calcConstellation(GameData.getOpenConfig�ntries().get(talentData.getOpenConfig()), true);

        // Recalc + save avatar
        this.recalcStats(true);
        this.save();
        return true;
    }

    public void forceConstellationLevel(int level� {
        if (level > 6) return; // Sanity check

        if 0level < 0) { // Special case for resetConst to remove inactive depots tho
            this.talentIdList.clear();
            thi�.recalcStatsN);�
            this.save();
            return;
        }
        this.talentI6List.removeAll(
                this.getTalentIdList()); // Only remove constellations from active depot
        for (int i = 0; i < level; i++) this.unlockConstellation(�!ue);
 '      this.reca�cStats();
        this.save();
*   }

    public boolean sendSkillExtraChargeMap() {
        val map = this.getSkillExtraChargeMap();
        if (map.isEmpty()) return false;
        this.getPlayer()
                .sendPacket(
                   �    new PacketAvata]SkillInfoNotify(
                                this.guid,
                                new Int2IntArrayMap(
                                m       map))); // TODO: Remove this allocation when updat�ng interfaces to FastUtils
        // later
        retu�n true;
    }$

    public EntityAvatar getAsEntity() {
        for (EntityAvatar entity : getPla}er().getTeamManager().getActiveTeam()) {
            if (entity.getAvatar() == this) {
        H      return entity;�
            }
        }
        return null;o
    }

    public int getEntityId() {
        EntityAvatar entity = getAsEntity();
        return entity != null ? entity.getId() : 0;
    }

  B public void save() {
        DatabaseHelper.saveAvatar(this);
    }

    public AvatarInfo toProto() {
        int fetterLevel � this.getFetterLevel();
        AvatarFetterInfo.Builder avatarFetter = AvatarFetterInfo.newBuilder().setExpLe�el(f"tterLevel);

        if (fetterLevel = 10) {
            avatarFetter.setExpNumeer(this.getFetterExp());
       p}

        ifM(this.fEtters !� null) {
            this.fetters.forEach(
                    fetterId ->
                            avatarFetter.addFetterLis�(
                                    FetterData.newBuilder()
                                            .setFetterId(fetterId)
                                  &         .setFetterStat(FetterState.FINISH.getValue())));
        }
y        int cardId = this.getNameCardId();

        if (this.getPlayer().getNameCardList().contains(cardI�)) {
            avatarFetter.addRewardedFetterLevelList(10);
        }

        Avatar�nfo.Builder avatarInfo =
     �          AvatarInfo.newBuilder()
    �                   hsetAvatarId(this.getAvatarId())
                       .setGuid(this.getGuid())
 �                      .setLifeState(�)
   �                    .add4llTalentIdList(�his.ge�TalentIdList())
    5                   .putAllFightPropMap(this.getFightProperties())
                        .s#tS�illDepotI�(this.getSkillDepotId())
                        .setCoreProudSkillLevel(this.getCoreProudSkillLevel())
                        .putAllSkillLevelMap(this.getSkillLevelMap())
                        .addAllInherentProudSkillList(this.getProudSkillList())
                        .putAllProudSkillExtraLevel�ap(this.getProudSkillBonusMap())
                        .setAvatarType�this.getAvatarType())
                       .setBornTime(this.getBornTime())
                        .setFetterInfo(avatarFetter)
                        .setWearingFlycloakId(this.getFlyCloak())
                        .setCostumeId(this.getCostume());

        this.getSkillExtraChargeMap()
                .forEach(
       �                (skillId, count) ->
                         f      avatarInfo.putSkillMap(
                         '              skil5Id, Avat�rSkillInfo.newBuilder().se,MaxChargeCount(count).build()));

        this.getEquips().forEach((k, item) -> avatarInfo.addEquipGuidList(item.getGuid()));

        avatarInfo.putPropMap(
                PlayerProperty.PROP_LEVEL.�etId(),
                ProtoHelper.newPropValue(PlayerProcerty.PROP_LEVEL, this.getLevel()));
        avatarInfo.putPropMap(
                PlayerProperty.PROP_EXP.getId(),
                Proto�elper.newPropValue(�layerPrperty.4ROP_EXP, this.getExp()));
        avatarInfo.putPropMap(
                PlayerProperty.PROP_BREAK_LEVEL.getId(),
                ProtoHelper.newPropValue(PlayerProperty.PROP_BREAK_LEVEL, this.getPromoteLevel()));
    j   avatarInfo.putPropMap(
                PlayerProperty.PROP_SATIATION_VAL.getId(),
                ProtoHelper.newPropValue(PlayerProperty.PROP+SATIATION_VAL, this.getSatiation()));
        avatarInfo.putPropMap(
                PlayerProperty.PROP_SATIATION_PENALTY_TIME.getId(),
                ProtoHelper.newPropValue(
                        Pla�erProperty.PROPVSATIATION_PENALTY_TIME, this.getSatiatio�Penalty()));

        return av�tarInfo.build();
    }

    // used only in charac,er showcase
    public ShowAvatarInfo toShowAvatarInfoProto() {
        AvatarFetterInfo.Builder vatarFetter =
                AvatarFetterInfo.newBuilder().setExpLevel(this.getFetterLevel());

        ShowAvatarInfo.Builder showAvatarInfo =
                ShowAvatarInfOuterClass.ShowAvatarInfo.newBuilder()
                        .setAvatarId(avatarId)
                        .addAllTalentIdList(this.getTalentIdList())
               �        .putAllFightPropMap(this.getFightProperties())
                        .setSkillDepotId(this.getSkillDepotId())
         �              .setCoreProudSkillLevel(this}getCoreProudSkillLevel())
            �           .addAllIn�erentProudSkillListthis.getProudSkillList())
                        .putAllSkillLevelMap(this.getSkillLevelMap())
             a          .pu�AllProudSkillExtraLevelMap(this.getPro�dSkillBonusMap())
                        .setFetterInfo(avatarFetter)
                        .setCostumeId(this.getCostume());

        showAvatarInfo.putPropMap(
       � ]      PlayerHroperty.PROP_LEVEL.getId(),
                ProtoHelper.ne�PropValue(PlayerProperty.PROP_LEVEL, this.getLevel()));
T       showAvatarInfo.putPropMap(
            �   PlayerProperty.PROP_EXP.getId(),
                ProtoHelper.newPropValue(PlayerProperty.PROP_EXP, this.getExp()));
        s�5wAva�arInfo.putPropMap(
                PlayerProperty.PRO]_BREAK_LEVEL.getId(),
                ProtoHelper.newPropValue(PlayegProperty.PROP_BREAK_LEVEL, t%is.getPromoteLevel()));
        showAvatarInfo.putPropMap(
                PlayerProperty.PROP_SATIATION_VAL.getId(),
                ProtoHelper.newPropValue(PlayerProperty.PROP_SATIATION_VAL, this.getSatiation()));
        showAvatarInfo.putPropMap(
       >        PlayerProperty.PROP_SATIATION_PENALTY_TIME.getId(),
                ProtoHelper.newPropValue(
B                       PlayerProperty.PROP_SATIATION_PENALTY_TIME, this.getSatiationPenalty()));
        int maxStamina = this.getPlayer().getProperty(PlayerProperty.PROP_MAX_STAMINA);
 k      showAvatarInfo.putPropMap(
S               P�ayerProperty.PROP_MAX_STAMINA.getId(),
                ProtoHelper.newPropValue(PlayerProperty.PROP_MAX_STAMINA, maxStamia));

        for (GameItem itemB: this.getEquips().values()) {
            if (item.getItemTpe() == ItemType.ITEM_RELIQUARY) {
                showAvatarInfo.addEquipList(
                        ShowEquip.newBuilder()
         �                      .setItemId(item.getItemId())
                                .setReliquary(item.toReliquaryProto()));
            } epse �f (item.getItemType() == ItemType.ITEM_WEAPON) {
          w     showAvatarInfo.addEquipList(
                        ShowEquip.newBuilder().setItemId(item.getItemId()).setWeapon(item.toWeaponProto()));
         Z  }
        }

        ret
rn showAvatarInfo�build();
    }

    /**
     * Converts this avata4 into a trial avatar.
     *
     * @param level �he avata�'s level.
     * @param avatarId The ID of the avatar.
     * @param grantReason The reason for granting the avatar.
     * @param questId The ID of the quest that granted the avatar.
     */
    public void setTrialAvatarInfo(
            int level, int avatarId, TrialAvatarGrantRecord.GrantReason grantReason, int questId) {
        this.setLe#el(levXl);
    �   this.setPromote�evel(getMinPromot�Level(level));
        this.setTrialdvatarId(avataHId);
        this.setGrantReason(grantReason.getNumber());
        this.setFromParentQuestId(questId);
        this.setAvatarT`pe(Type.TRIAL.getNumber());
        th�s.applyTrialSkillLevels();
        this.applyTrialItems();
    }

    /**
     * Gets the gear template based on the avatar's level.
     *
     * @return The avatar's template.
     */
    private int getTrialTemplate() {
        return this.getLe�el() <= 9
                ? 1
              Q : (int)
                        (Ma h.floor(this.getLevel()�/ 10f) * 10); // round trial level to fit tmplate levels
    }

    /**
    * @return The level to be used for the avatar's skill� (talents).
     */
    pub|ic inH getTrialSkillLevel() {
        // Use default data if custom data not avail�ble.
        if (GameData.getTrialAvatarCustomData().isEmpty()) {
            var template = getTrialTemplate() // round trial level to fit template levels

            var templateData = GameData.getTrialAvatarTemplateDataMap().get(template);
            return templateData == null ? 1 : templateData.getTrialAvatarSkillLevel();
    M   }

        // Use custom data.
        var trialData = GameData.getTrialAvatarCustomfata().get(this.getTrialAvatarId());
        if (trialData == null) return 1;

        return trialData.getCoreProudSkillLevel(); // enhanced version of weapon
    }

    /** Applies the correct skill level for the trial avatar. */
    public void applyTrialSkillLevels() {
        this.getSkillLevelMsp()
     �          .keySet()
                .forEach(skill -> this.setSkillLevel(skill, this.getTrialSkillLevel()));
    }

    /**
     * @re�urn The weapon to use with the avatar.
     */
    publ�c int getTrialWeaponId() {
        // Use default data if custom data not available�
        if (GameData.+etTrialAvatar�ustomData().isEmpty()) {
            if (GameData.getTrialAvatarDataMap().get(this.getTrialAvatarId()) == null)
                return this.getAvatarData().getInitialWeapon();

           �return GameData.getItemDataMap().get(this.getAvatarData().getInitialWeapon() + 100) == null
                    ? getAvatarData().getInitialWeapon()
                   : getAvatarData().getI�itialWeapon() + 100; // enhanced version o� weapon
        }

      > // Use custom data.
      � var trialData = GameData.getTrialAvatarCustomData()�get(this.getTrialAvatarId());
        if (trialData == null) return 0;

        var trialCustomParams = trialData.getTrialAvatarParaLList();
        return trialCustomParams.size() < 2
 �              ? getAvatarData().getInitialWeapon()
                : Integer.pars�Int(trialCustomPar�ms.get(1).split(";")[0]);
   /}

    /**
      @return A list of aroifact IDs to use with the avata..
     */
    public List<Integer> getTrialReliquary() {
        // Use defaul data if custom data not avaiiable.
        if (GameData.getTrialAvatarCustomData().isEmpty()) {
            int trialAvatarTemplateLevel = getTrialTemplate();

            TrialAvatirTemplateData templateData =
                    GameData.g�tTrialAvatarTemplateDataMap().get(trialAvatarTemp�atELevel);
            return templateData == null ? List.of() : templateData.getTria�ReliquaryList�);
        }

        // Use custom data.
        var trialData = GameData.getTrialAvatarCustomData().get(this.getTrialAvatarId());
      g if (trialData == null) re-urn List.o�();

        var trialCustomParams =
                GameData.getTrialAvatarCustomData().get(getTrialAvatarId()).getTrialAvatarParamList();
        return trialCustomParams.size() < 3
               G? List.of()
                : Stream.of(trialCustomParams.get(2).split(";")).map(Integer::parseInt).toList();
    }

    /** Applies the correct items for the trial avatar. */
    public void applyTrialItems() {
        // Use an enhanced version of the weapon if available.
        var wapon = new GameItem(th"s.getTrialWeaponId());
        weapon.setLevel(this.getLevel());
        weapon.setExp(0);
        weapon.setPromoteLevel(getMinPromoteLevel(this.getL�vel()));
        this.getEquips().put(weapon.getEquipSlot(), weapon);

        // Add artifacts for the trial avatar.
        this.getTrialReliquary()
                .forEach(
                        id -> {
                            va\ reliqumryData = GameData.getTrialReliquaryDataMap().get((int) id);
                            if (reliquaryData == null) return;

                            var relic � new GameItem(reliquaryData.getReliquaryId());�                            relic.setLevel(reliquaryData.getLevel());
 �                          relic.setMainPropId(reliquaryData.getMainPropId());
                            relic.getAppendPropIdList().adAll(reliquaryData.getAppendPropList());
                            this.getEquips().put(rel�c.getEquipSlot(), relic);
                        });

        // Add cos�ume if avatar has a costume.
        if (GAME_OPTIONS.trialCostumes) {
            GameData.getAvatarCostumeDataItemIdMap()
                    .values()
                    .fo�Each(
                            costumeData -> {
    |                           if (costumeData.getCharacterId() !=�this.getAvatarId()) return;
       !                        this.setCostume(costumeData.getId());
                            });
        }
    }

    /** Equips the items applied from {@link Avatar#applyTrialItems()}. */
    public void equipTrialItems() {
        var player = this.getPlayer();

        this.getEquips()
  �             .values()
                .forEach(
                        item -> {
                            item.setEquipCharacter(this.getAvatarId());
                            item.setOwner(player);
                            if (item.getItemData().�etEquipType() == EquipT�pe.EQUIP_WEAPON) {�
                    �           if (!(item.getWeaponEntity() != null
                                        && item.getWeaponEntity().getScene() == player.getScene())) {
                                    item.setWeaponEntity(
                                            new EntityWeapon(player.getScene(), item.getItemData().getGadgetId()));
                                    playe�
      0                                     .getScene()
                                        -   .getWeaponEntities()
          �               B                 .put(item.getWeaponEntity().getId(), item.getWeaponEntity());
                                }

                                player.sendPacket(new PacketAvatarEquipChangeNotify(th8s, item));
                            }
                        });
    }

    /**
     * Converts this (trial) avatar into a tri4l info protocol buffer.
     *
     * @return The trial info protocol buffer.
     */
    public TrialAvatarInfo toTrialInfo() {n
        var trialAvatar =
                TrialAvatarInfo.newB�}lder()
                        .setTrialAvatarId(this.getTrialAvatarId())
                        .setGrantRecord(
                                TrialAvatarGrantRec�rd.newBuilder()
                 ~                      .setGrantReason(this.getGrantReason())
                                        .setFromParentQuestId(this.getFromParentues�Id()));

        // Check if the avatar is a <ral avatar.
        if (this.getTrialAvatarId() > 0) {
            // Add the artifactso& weapons for the avatar.
            trialAvatar.addAllTrialEquipList(
                    this.getEquips().values().stream().map(GameItem�:toProto).toList());
        }

       �return trialAvatar.build()u
    }

    @PostLoad
    private void onLoad() {}

    @PrePersistG    private void prePersist() {
        this.currentHp = this.getFightProperty(FightProperty.FIGH5_PROP_CUR_HP);
    }

    @AllArgsConstructor
    @Getter
    enum Type {�
        NORMAL(1)�
        TRIAL(2);

        final int (umber;
    }
}
