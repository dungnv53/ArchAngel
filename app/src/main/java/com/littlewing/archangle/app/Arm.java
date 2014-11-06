package com.littlewing.archangle.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by dungnv on 11/6/14.
 */
public class Arm {
    private int bom_x;
    private int bom_y;
//    private final String bomb = "spacepix/bomb1.png";
    private boolean destroyed;
    Bitmap bom_pic[] = new Bitmap[5];
    private int b_idx;			// index for bomb image
    private int damage;		// the hp that enemy lose

    public Arm(int x, int y, Context context) {
        setDestroyed(true);
        this.bom_x = x;
        this.bom_y = y;

        Resources res = context.getResources();
        bom_pic[0] = BitmapFactory.decodeResource(res, R.drawable.effect_00);
        bom_pic[1] = BitmapFactory.decodeResource(res, R.drawable.effect_01);
        bom_pic[2] = BitmapFactory.decodeResource(res, R.drawable.effect_02);
        bom_pic[3] = BitmapFactory.decodeResource(res, R.drawable.effect_03);
        bom_pic[4] = BitmapFactory.decodeResource(res, R.drawable.effect_07);
    }
    public Arm(int paramInt1, int paramInt2) {
        this.bom_x = paramInt1;
        this.bom_y = paramInt2;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
    public void setX(int paramInt) {
        this.bom_x = paramInt;
    }
    public void setY(int paramInt) {
        this.bom_y = paramInt;
    }
    public int getX() {
        return this.bom_x;
    }
    public int getY() {
        return this.bom_y;
    }
    public int getItemIdx() {
        return this.b_idx;
    }
    public void setItemIdx(int paramInt) {
        this.b_idx = paramInt;
    }
    public void dropBomb(int paramInt1, int paramInt2) {
        while (this.bom_y < paramInt2)
        {
            this.bom_x = paramInt1;
            this.bom_y += 12;
            // need set_y ?
            if (this.bom_y >= paramInt2)
                this.destroyed = true;
        } // ; cug dc ma ko cung dc, y?
    }
    public Bitmap getImage(int i) { // chua cho id
        if(i < 5 && i >= 0)
            return this.bom_pic[i];
        else
            return this.bom_pic[0];
    }
    public void setImage(Bitmap[] paramBitmap) {
        this.bom_pic = paramBitmap;
    }
}
