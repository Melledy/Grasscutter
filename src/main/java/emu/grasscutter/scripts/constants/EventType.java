package emu.grasscutter.scripts.constants;

public class EventType {
	public static final int EVENT_NONE = 0;
	/**
	 * param1: monster.configId
	 */
	public static final int EVENT_ANY_MONSTER_DIE = 1;
	public static final int EVENT_ANY_GADGET_DIE = 2;
	public static final int EVENT_VARIABLE_CHANGE = 3;
	public static final int EVENT_ENTER_REGION = 4;
	public static final int EVENT_LEAVE_REGION = 5;
	public static final int EVENT_GADGET_CREATE = 6;
	public static final int EVENT_GADGET_STATE_CHANGE = 7;
	public static final int EVENT_DUNGEON_SETTLE = 8;
	public static final int EVENT_SELECT_OPTION = 9;
	public static final int EVENT_CLIENT_EXECUTE = 10;
	public static final int EVENT_ANY_MONSTER_LIVE = 11;
	public static final int EVENT_SPECIFIC_MONSTER_HP_CHANGE = 12;
	public static final int EVENT_CITY_LEVELUP_UNLOCK_DUNGEON_ENTRY = 13;
	public static final int EVENT_DUNGEON_BROADCAST_ONTIMER = 14;
	public static final int EVENT_TIMER_EVENT = 15;
	public static final int EVENT_CHALLENGE_SUCCESS = 16;
	public static final int EVENT_CHALLENGE_FAIL = 17;
	public static final int EVENT_SEAL_BATTLE_BEGIN = 18;
	public static final int EVENT_SEAL_BATTLE_END = 19;
	public static final int EVENT_GATHER = 20;
	public static final int EVENT_QUEST_FINISH = 21;
	public static final int EVENT_MONSTER_BATTLE = 22;
	public static final int EVENT_CITY_LEVELUP = 23;
	public static final int EVENT_CUTSCENE_END = 24;
	public static final int EVENT_AVATAR_NEAR_PLATFORM = 25;
	public static final int EVENT_PLATFORM_REACH_POINT = 26;
	public static final int EVENT_UNLOCK_TRANS_POINT = 27;
	public static final int EVENT_QUEST_START = 28;
	public static final int EVENT_GROUP_LOAD = 29;
	public static final int EVENT_GROUP_WILL_UNLOAD = 30;
	public static final int EVENT_GROUP_WILL_REFRESH = 31;
	public static final int EVENT_GROUP_REFRESH = 32;
	public static final int EVENT_DUNGEON_REWARD_GET = 33;
	public static final int EVENT_SPECIFIC_GADGET_HP_CHANGE = 34;
	public static final int EVENT_MONSTER_TIDE_OVER = 35;
	public static final int EVENT_MONSTER_TIDE_CREATE = 36;
	public static final int EVENT_MONSTER_TIDE_DIE = 37;
	public static final int EVENT_SEALAMP_PHASE_CHANGE = 38;
	public static final int EVENT_BLOSSOM_PROGRESS_FINISH = 39;
	public static final int EVENT_BLOSSOM_CHEST_DIE = 40;
	public static final int EVENT_GADGET_PLAY_START = 41;
	public static final int EVENT_GADGET_PLAY_START_CD = 42;
	public static final int EVENT_GADGET_PLAY_STOP = 43;
	public static final int EVENT_GADGET_LUA_NOTIFY = 44;
	public static final int EVENT_MP_PLAY_PREPARE = 45;
	public static final int EVENT_MP_PLAY_BATTLE = 46;
	public static final int EVENT_MP_PLAY_PREPARE_INTERRUPT = 47;
	public static final int EVENT_SELECT_DIFFICULTY = 48;
	public static final int EVENT_SCENE_MP_PLAY_BATTLE_STATE = 49;
	public static final int EVENT_SCENE_MP_PLAY_BATTLE_STAGE_CHANGE = 50;
	public static final int EVENT_SCENE_MP_PLAY_BATTLE_RESULT = 51;
	public static final int EVENT_SEAL_BATTLE_PROGRESS_DECREASE = 52;
	public static final int EVENT_GENERAL_REWARD_DIE = 53;
	public static final int EVENT_SCENE_MP_PLAY_BATTLE_INTERRUPT = 54;
	public static final int EVENT_MONSTER_DIE_BEFORE_LEAVE_SCENE = 55;
	public static final int EVENT_SCENE_MP_PLAY_OPEN = 56;
	public static final int EVENT_OFFERING_LEVELUP = 57;
	public static final int EVENT_DUNGEON_REVIVE = 58;
	public static final int EVENT_SCENE_MP_PLAY_ALL_AVATAR_DIE = 59;
	public static final int EVENT_DUNGEON_ALL_AVATAR_DIE = 60;
	public static final int EVENT_GENERAL_REWARD_TAKEN = 61;
	public static final int EVENT_PLATFORM_REACH_ARRAYPOINT = 62;
	public static final int EVENT_SCENE_MULTISTAGE_PLAY_STAGE_END = 63;
	public static final int EVENT_SCENE_MULTISTAGE_PLAY_END_STAGE_REQ = 64;
	public static final int EVENT_MECHANICUS_PICKED_CARD = 65;
	public static final int EVENT_POOL_MONSTER_TIDE_OVER = 66;
	public static final int EVENT_POOL_MONSTER_TIDE_CREATE = 67;
	public static final int EVENT_POOL_MONSTER_TIDE_DIE = 68;
	public static final int EVENT_DUNGEON_AVATAR_SLIP_DIE = 69;
	public static final int EVENT_GALLERY_START = 70;
	public static final int EVENT_GALLERY_STOP = 71;
	public static final int EVENT_TIME_AXIS_PASS = 72;
	public static final int EVENT_FLEUR_FAIR_DUNGEON_ALL_PLAYER_ENTER = 73;
	public static final int EVENT_GADGETTALK_DONE = 74;
	public static final int EVENT_SET_GAME_TIME = 75;
	public static final int EVENT_HIDE_AND_SEEK_PLAYER_QUIT = 76;
	public static final int EVENT_AVATAR_DIE = 77;
}
