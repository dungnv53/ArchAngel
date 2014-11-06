package com.littlewing.archangle.app;

import android.media.JetPlayer;

/**
 * Created by dungnv on 11/6/14.
 */

/**
 * A GameEvent subclass for events from the JetPlayer.
 */
class JetGameEvent extends GameEvent {
    /**
     * Simple constructor to make populating this event easier.
     */
    public JetGameEvent(JetPlayer player, short segment, byte track, byte channel,
                        byte controller, byte value) {
        this.player = player;
        this.segment = segment;
        this.track = track;
        this.channel = channel;
        this.controller = controller;
        this.value = value;
    }

    public JetPlayer player;
    public short segment;
    public byte track;
    public byte channel;
    public byte controller;
    public byte value;
}