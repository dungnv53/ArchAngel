package com.littlewing.archangle.app;

/**
 * Created by dungnv on 11/6/14.
 */
/**
 * Base class for any external event passed to the JetBoyThread. This can
 * include user input, system events, network input, etc.
 */
class GameEvent {
    public GameEvent() {
        eventTime = System.currentTimeMillis();
    }

    long eventTime;
}
