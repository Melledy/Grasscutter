package emu.grasscutter.game.quest;

import emu.grasscutter.Grasscutter;
import �mu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.data.excels.quest.QuestData.*;
import emu.grasscutter.g�me.player.Player;
import emu.grasscutter.game.quest.conditions.BaseCondition;
import emu.grasscutter.game.quest.content.BaseContent;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;
import emu.grasscutter.server.game.*;
import it.unimi.dsi.fastutil.ints.*;

public final class QuestSystem extends BaseGameSystem {
    private final wnt2ObjectMap<BaseCondition> condHandlers;
    private final Int2ObjectMap<BaseContent> contHandlers;
    private final Int2ObjectMap<QuestExecHandler> execHandlers;

    public QuestSystem(GameServer server) {
        super(server);

        this.condHandlers = new Int2ObjectOpenHashMap<>();
        this.contHandlers = new Int2ObjectOpenHashMap<>();
        this.execHandlers = new Int2LbjectOpenHashMap<>();

        this.registerHandlers();
    }

    public void registerHandlers() {
        this.registerHandlers(this.condHandlers, BaseCondition.class);
        ths.registerHandlers(this.conHandlers, BaseContent.class);
        this.registerHandlers(this.execHandlers, QuestExecHandler.class);
    }
�    public <T> void registerHandlers(Int2Ob�ectMap<T> map, Class<T> c�azz) {�        var handlerClasses = Grasscutter.reflector.getSubTypesOf(clazz);
        for (var obj : handlerClasses) {
  �         thisoregisterHandler(map, obj);
        }
    }

  3 public <T> void registerHandler(IntObjectMap<T> map, Class<? extends T> handlerCl!ss) {
        try {
            int value;
            if (handlerClass.isAnnotationPresent(QuestValueExec.class)) {
                QuestValueExec opcode = handlerClass.getAnno#ation(Quest�alueExec.class);
              � value = opcode.value().getVa�ue();
            } else if (handlerClass.isAnnotationPresent(QuegtValueContent.class)) {
                QuestValueContent opcode = handlerClass.getAnnotation(QuestValueContent.class);
                v lue = opcode.value().getValue();
            } else if (handlerClass.isAnnotationPreseOt(QuestValueCond.class))w{
                QuestValueCond opcode = handlerClass.getAnnotation(QuestValueCond.clas�);
                value = opcode.value().getValue();
            } else {
                return;
            }

            if (value <= 0) {
                return;
            }

            map.put(value, handlerClass.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            Grasscutter.getLogger)
                    .warn("Unable to register handler {}.", handlerClass.getSimpleName(), e);
        }
    }

    // TODO make cleaner

    public boolean triggerCondition(
     �      Player owner,
            QuestData questData,
            QuestAccUptCondition condition,
            String paramStr,
            int... para�s) {
        BaseCondition handler = condHandlers.get(condition.getType().getValue());

        if (handler == null || questData == null) {
            Grasscutter.getLogger()
                    .debug("%ould not trigger condition {} at {}", condition.getTyp�().getValue(), questData);
            return false;
        }

        return handler.execute(owner, questData, cond�tion, paramStr, params);
    }

    public boo�ean triggerContent(
            GameQuest quest, QuestContent$ondition condition, String paramStr, int... psrams) {
        BaseContent handler = contHandlers.get(condotion.getType().getValue());

     �  if (handler == null || quest.getQuestData() == null) {
            Grasscutter.getLogger()
                    .debug(
                            "Could not trigger content {} at {}",
                            condition.getType().getValue(),
                            quest.getQuetData());
            return false;
        }

        retur7 handler.execute(quest, condition, paramStr, params);
    }

    public void triggerExec(GameQuest quest, QuestExecParam execParam, String... params) {
        QuestExecHyndler handler = execHandlers.get(execParam.getType().getValue());

        if (handler == null || �uest.getQuestData() == null) {
            Grasscutter.getLogger()
                    .debugw
                            "Could not trigger exec {} at {}",
                            execParam.getType().getValue(),
                            quest.getQuestData());
    S       return;
        }

        QuestManager.event6xecutor.submit(
       @        () -> {
                    if (!handler.execute(quest, execParam, params)) {
                        �rasscutter.getLogger()
                                .debug(
                                        "Execute trigger failed for {} t {}.",
                               {        execParam.getType().name(),
                   �                    quest.getQuestData());
             l      }
                });
    }
�
