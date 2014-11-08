package com.littlewing.archangle.app;

import java.util.Random;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by dungnv on 11/6/14.
 */
public class Craft {
    private int dn_x;
    private int dn_y;
    private int hp = 56;
    private int max_hp = 56;
    private int idx;

    private int e_boss_move_dir = 10;
    private int e_boss_x = 0;
    Random rnd = new Random();
    Arm item = new Arm (dn_x, dn_y + 20);


    private Bitmap[] img_Donald = new Bitmap[4];      // Mảng 4 images cho enery hay hero (player). 4 ảnh này tạo nên hình sprites di chuyển.

    public int getHp() {
        return this.hp;
    }
    public void setHp(int paramInt) {
        this.hp = paramInt;
    }
    public void loseHp(int paramInt) {      // Nhân vật mất máu
        this.hp -= paramInt;
    }
    public void setDonaldX(int paramInt) {       // Đặt vị trí X cho nhân vật
        this.dn_x = paramInt;
    }
    public int getDonaldX() {
        return this.dn_x;
    }
    public void setDonaldY(int paramInt) {       // Đặt cao độ cho nhân vật
        this.dn_y = paramInt;
    }
    public int getDonaldY() {
        return this.dn_y;
    }

    // Đặt ảnh cho nhân vật
    public void setDonaldImage(Bitmap paramBitmap, int paramInt) {
//		this.img_Donald[paramInt] = BitmapFactory.decodeResource(res, id)
//		ec eo set res dc
    }
    public Bitmap getDonaldImage(int paramInt) {
        return this.img_Donald[paramInt];
    }
    public Bitmap getBossImage() { // no param for boss animation
        return this.img_Donald[this.idx];
    }

    public int get_random(int paramInt) {
        int i = this.rnd .nextInt() % paramInt;
        if (i < 0)
            i = -i;
        return i;
    }

    public int get_random1(int paramInt) {

        int i = this.rnd.nextInt() % paramInt;
        if (i == 0)
            i = -5;
        return i;
    }

    // Đặt id cho ảnh sprite của nhân vật. 4 ảnh của nhân vật ghép thành ảnh động qua 4 id.
    public void set_idx(int paramInt) {
        this.idx = paramInt;
    }
    public int get_idx() {
        return this.idx;
    }

    // Đặt vũ khí sử dụng cho nhân vật. Có thể là đá, băng, snowball hay giầy ...
    public void setBomb(Arm paramBomb) {
        this.item = paramBomb;
    }
    public Arm getBomb() {
        return this.item;
    }

    /**
     * Kha nang ham act phải thêm 2 tham số: width + height. Như vậy bên draw thread sẽ nhẹ hơn vì không lo tính toán vị trí biên nữa.
     * Ko ro có lấy được width height ở Donald ko? Dự là ko vì ko có liên quan đến view.
     *
     */
    public void act(int direction, int screen_width, int screen_height) { // Fai bo diretion sau khi run ok
        int h_bound = screen_height/7;   // biên trên dưới cho enemy move hay ném đá, snow ...
        int w_bound = screen_width/12;   // biên 2 bên cho enemy
        int i = get_random(6);           // random vị trí enemy, vị trí enemy random chưa được khéo như bản J2ME gốc.
        if ((i == 0) || (i == 1)) {
            if (this.dn_x > 0 && this.dn_x < (screen_width-h_bound)) {  	// eo ro INHERITE COMMON nen cho luon 160 thay
                // vi BOARD_WIDTH
                // dung la la fai them border = alient_width / 2
                this.dn_x += (e_boss_move_dir/3);
            }
            else {
                this.dn_x = 0;
            }
            if (this.dn_y > 30 && this.dn_y < screen_height/5) {       // enemy chỉ được di chuyển trong 1 khoảng 1/5 phía trên màn hình.
                this.dn_y += (e_boss_x / 3);
            }
            else {
                this.dn_y = 20;
            }
        }
        else if ((i == 2) || (i == 3))
        {
            if (this.dn_x > 0 && this.dn_x < (screen_width-w_bound)) {  	// eo ro INHERITE COMMON nen cho luon 160 thay
                this.dn_x -= (e_boss_move_dir/3);	// thay vi direction
            }
            if (this.dn_y > 30 && this.dn_y < screen_height/5) {
                this.dn_y += (e_boss_x / 4);
            }
            else {
                this.dn_y = 50;
            }
        } else {
            if (this.dn_x > 0 && this.dn_x < (screen_width-w_bound)) {  	// eo ro INHERITE COMMON nen cho luon 160 thay
                this.dn_x += direction;
            }
            else {
                this.dn_x = 100;
            }
            if (this.dn_y > 30 && this.dn_y < screen_height/5) {
                this.dn_y -= (e_boss_x / 3);
            }
            else {
                this.dn_y = 20;
            }
        }
    }
    public void move() { // when Donald move, we change idx 0 1 loop repeat
        if (this.idx == 0)
            this.idx = 1;
        else if (this.idx == 1)
            this.idx = 0;
    }
    public void attact() { // when Donald prepare firing, we set idx to 2 and 3 reseverse
        if (this.idx == 2)
            this.idx = 3;
        else if (this.idx == 3)
            this.idx = 2;
    }
    public void fire(int paramInt) {
        item.dropBomb(this.dn_y, paramInt);
    }
    public void boss_move() {
        if ((this.e_boss_move_dir  >= 1) && (this.e_boss_move_dir < 8)) {
            this.e_boss_move_dir += 1; // tang dan dir
            if (this.e_boss_move_dir == 8) // den 8 thi set cho 100
                this.e_boss_move_dir = 100; // hinh nhu dir la chieu boss
        }
        else if ((this.e_boss_move_dir >= 21) && (this.e_boss_move_dir < 31)) {
            this.e_boss_move_dir += 1; // tang dan len 31 (cho ko fai 30) nha vi khi dir = 30 thi van chay tiep
            if ((this.e_boss_x != 2) && (this.e_boss_move_dir % 2 == 0))
                this.e_boss_x -= 1;   // cho boss_x giam dan
            if (this.e_boss_move_dir == 31)
                this.e_boss_move_dir = 100;
        }
        else if ((this.e_boss_move_dir > -31) && (this.e_boss_move_dir <= -21)) {
            this.e_boss_move_dir -= 1; // giam DIR cho ve -31?

            if ((this.e_boss_x != 22) && (this.e_boss_move_dir % 2 == 0))
                this.e_boss_x += 1;
            if (this.e_boss_move_dir == -31) // DIR den -31 thi set lai 100
                this.e_boss_move_dir = 100;
        }

    }

    public void boss_move_ai() {
        if (this.e_boss_x == 2) {
            this.e_boss_move_dir = -21;
        }
        else if (this.e_boss_x == 22) {
            this.e_boss_move_dir = 21;
        }
        else {
            int i = get_random(6);
            if ((i == 0) || (i == 1))
                this.e_boss_move_dir = 21;
            else if ((i == 2) || (i == 3))
                this.e_boss_move_dir = -21;
            else
                this.e_boss_move_dir = 1;
        }
    }

    // Move craft follow bernoulli curve.
    // TODO need fps, inp, screen width
    public void bernoulliMove(double angle) {
        angle = angle%360;
        this.dn_x = 360+getBernoulliMark(angle).getX();
        this.dn_y = 240+getBernoulliMark(angle).getY();
    }

    // TODO rm magic numb
    public Point getBernoulliMark(double angle) {
        int a = 340; //680/2; // (960/sqrt(2))
        double x = a*Math.sqrt(2)*Math.cos(angle)/(Math.sin(angle)*Math.sin(angle) + 1);
        double y = a*Math.sqrt(2)*Math.cos(angle)*Math.sin(angle)/(Math.sin(angle)*Math.sin(angle) + 1);
        Point result = new Point((int)x, (int)y);
        return result;
    }

    public Craft(int paramInt1, int paramInt2, Bitmap[] bitmap) {
        this.dn_x = paramInt1;
        this.dn_y = paramInt2;
        this.img_Donald  = bitmap;
    }
    public Craft (int paramInt1, int paramInt2) {
        this.dn_x = paramInt1;
        this.dn_y = paramInt2;
    }
    public Craft () {
        this.hp = 56;
        this.max_hp = 56;
    }
}
