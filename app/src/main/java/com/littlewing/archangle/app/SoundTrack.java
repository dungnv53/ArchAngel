package com.littlewing.archangle.app;

/**
 * Created by dungnv on 11/6/14.
 */
public class SoundTrack {

    public boolean[][] initMuteMask(boolean muteMask[][]) {
        // JET info: this are the mute arrays associated with the music beds in the
        // JET info: JET file
        for (int ii = 0; ii < 8; ii++) {
            for (int xx = 0; xx < 32; xx++) {
                muteMask[ii][xx] = true;
            }
        }

        muteMask[0][2] = false;
        muteMask[0][3] = false;
        muteMask[0][4] = false;
        muteMask[0][5] = false;

        muteMask[1][2] = false;
        muteMask[1][3] = false;
        muteMask[1][4] = false;
        muteMask[1][5] = false;
        muteMask[1][8] = false;
        muteMask[1][9] = false;

        muteMask[2][2] = false;
        muteMask[2][3] = false;
        muteMask[2][6] = false;
        muteMask[2][7] = false;
        muteMask[2][8] = false;
        muteMask[2][9] = false;

        muteMask[3][2] = false;
        muteMask[3][3] = false;
        muteMask[3][6] = false;
        muteMask[3][11] = false;
        muteMask[3][12] = false;

        muteMask[4][2] = false;
        muteMask[4][3] = false;
        muteMask[4][10] = false;
        muteMask[4][11] = false;
        muteMask[4][12] = false;
        muteMask[4][13] = false;

        muteMask[5][2] = false;
        muteMask[5][3] = false;
        muteMask[5][10] = false;
        muteMask[5][12] = false;
        muteMask[5][15] = false;
        muteMask[5][17] = false;

        muteMask[6][2] = false;
        muteMask[6][3] = false;
        muteMask[6][14] = false;
        muteMask[6][15] = false;
        muteMask[6][16] = false;
        muteMask[6][17] = false;

        muteMask[7][2] = false;
        muteMask[7][3] = false;
        muteMask[7][6] = false;
        muteMask[7][14] = false;
        muteMask[7][15] = false;
        muteMask[7][16] = false;
        muteMask[7][17] = false;
        muteMask[7][18] = false;

        // set all tracks to play
        for (int xx = 0; xx < 32; xx++) {
            muteMask[8][xx] = false;
        }

        return muteMask;
    }
}
