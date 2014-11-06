package com.littlewing.archangle.app;

/**
 * Created by dungnv on 11/6/14.
 */

import android.view.KeyEvent;

/**
 * A GameEvent subclass for key based user input. Values are those used by
 * the standard onKey
 */
class KeyGameEvent extends GameEvent {
    /**
     * Simple constructor to make populating this event easier.
     */
    public KeyGameEvent(int keyCode, boolean up, KeyEvent msg) {
        this.keyCode = keyCode;
        this.msg = msg;
        this.up = up;
    }

    public int keyCode;
    public KeyEvent msg;
    public boolean up;
}
