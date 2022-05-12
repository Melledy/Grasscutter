package emu.grasscutter.game.quest.content;

import emu.grasscutter.data.custom.QuestConfigData.QuestCondition;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.enums.QuestTriggerType;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTriggerType.QUEST_CONTENT_COMPLETE_TALK)
public class ContentCompleteTalk extends QuestBaseHandler {

	@Override
	public boolean execute(GameQuest quest, QuestCondition condition, int... params) {
		return condition.getParam()[0] == params[0];
	}
	
}
