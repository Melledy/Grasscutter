package emu.grasscutter.game.activity.condition;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * This annotation marks condition types for NewActivityCondExcelConfigData.json. To use it you should mark
 * class that extends ActivityConditionBaseHandler, and it will be automatically picked during activity manager initiation.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityCondition {
    ActivityConditions value();
}
