package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.def.QuestData;
import emu.grasscutter.data.def.QuestData.QuestCondition;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_STATE_EQUAL)
public class ConditionStateEqual extends QuestBaseHandler {

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, int... params) {
		GameQuest checkQuest = quest.getOwner().getQuestManager().getQuestById(params[0]);

		if (checkQuest != null) {
			return checkQuest.getState().getValue() == params[1];
		}

		return false;
	}

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, String... params) {
		return false;
	}

	@Override
	public boolean execute(GameQuest quest, QuestData.QuestExec condition, String... params) {
		return false;
	}

}
