package win.regin.renju;


import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



public class HintConstant {
    /**
     * Game start
     */
    public static final int GAME_START = 1;
    /**
     * Game end
     */
    public static final int GAME_OVER = 2;
    /**
     * Play action
     */
    public static final int GAME_MOVE = 3;

    @IntDef({GAME_START, GAME_OVER, GAME_MOVE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HintType {
    }
}
