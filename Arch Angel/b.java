import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public class b extends Canvas
  implements Runnable
{
  public int a;
  public boolean b;
  public final byte c;
  public final byte d;
  public final byte e;
  public final byte f;
  public final byte g;
  public final byte h;
  public final byte i;
  public final byte j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  public int p;
  public int q;
  public e r;
  public int s;
  public int t;
  public int u;
  public boolean v;
  public String[][] w;
  public int x;
  public int y;
  public boolean z;
  public int aa;
  public int ab;
  public int ac;
  public int ad;
  public int ae;
  public int af;
  public int ag;
  public boolean ah;
  public final ArchAngel ai;

  public void a(Graphics paramGraphics)
  {
    int i1;
    switch (this.ai.z)
    {
    case 0:
      this.ai.ak.a("font");
      this.ai.ak.a(5, 5);
      this.ai.ak.d();
      this.ai.ak.a("end");
      for (i1 = 0; i1 < 2; ++i1)
        this.ai.ak.a(i1, 31 + i1);
      this.ai.ak.d();
      this.ai.z += 1;
      break;
    case 1:
      if (this.ai.x == 0)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 320);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 0, 240, 40);
        paramGraphics.drawLine(0, 42, 240, 42);
        paramGraphics.drawLine(0, 45, 240, 45);
        paramGraphics.fillRect(0, 50, 240, 6);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 3, 0, 0);
        this.ai.ak.a(paramGraphics, 5, 27, 25);
        this.ai.ak.a(paramGraphics, 4, 0, 60);
        this.ai.ak.a(paramGraphics, 3, 0, 280);
        this.ai.ak.a(paramGraphics, 31, 0, 80);
        this.ai.ak.a(paramGraphics, 32, 0, 175);
        this.ai.a(paramGraphics);
        this.ai.a(paramGraphics, "SKIP", true);
        this.ai.a(paramGraphics, "NEXT", false);
        this.ai.al.a("end");
      }
      this.ai.z = 11;
      break;
    case 15:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.ai.x, 240, 200 - 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 31, 0, 80);
        this.ai.ak.a(paramGraphics, 32, 0, 175);
        paramGraphics.setClip(0, 0, 240, 320);
        this.ai.ak.a(paramGraphics, 4, 0, 60 + 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 280 - 5 * this.ai.x);
      }
      if (this.ai.x == 21)
      {
        this.ai.ak.a(31);
        this.ai.ak.a(32);
        this.ai.ak.a("select");
        for (i1 = 0; i1 < 7; ++i1)
          this.ai.ak.a(i1, 6 + i1);
        this.ai.ak.d();
        this.ai.b = 3;
      }
    }
    if (this.ai.z >= 15)
      return;
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 227, 240, 53);
    paramGraphics.setColor(16777130);
    paramGraphics.drawRect(0, 227, 239, 53);
    k(paramGraphics, this.ai.z, 228);
  }

  public void b(Graphics paramGraphics)
  {
    label126: int i1;
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
      {
        this.ai.c = 0;
        this.ai.ak.a("font");
        this.ai.ak.a(1, 1);
        this.ai.ak.d();
        this.ai.a(paramGraphics);
        this.ai.a(paramGraphics, "OK", false);
        this.ai.s = false;
        break label126:
      }
      this.ai.z = 1;
      break;
    case 1:
      paramGraphics.setColor(107, 222, 255);
      paramGraphics.fillRect(45, 93, 150, 33);
      this.ai.ak.a(paramGraphics, 62, 103, "YOU ARE DEAD");
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      this.ai.ak.a(paramGraphics, 50, 129, "You have been");
      this.ai.ak.a(paramGraphics, 50, 144, "hit deadly.");
      paramGraphics.setColor(0);
      paramGraphics.fillRect(49, 172 + this.ai.c * 15, 75, 15);
      this.ai.ak.a(paramGraphics, 50, 174, "1. Retry");
      this.ai.ak.a(paramGraphics, 50, 189, "2. Back");
      break;
    case 2:
      for (i1 = 11; i1 < 19; ++i1)
        this.ai.ak.a(24 + i1);
      this.ai.ak.b();
      this.ai.ak.a();
      this.ai.b = 25;
      break;
    case 3:
      if (this.ai.x < 16)
      {
        if (this.ai.x == 0)
        {
          for (i1 = 11; i1 < 19; ++i1)
            this.ai.ak.a(24 + i1);
          this.ai.ak.b();
          this.ai.ak.a();
        }
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, this.ai.x * 10);
        paramGraphics.fillRect(0, 300 - this.ai.x * 10, 240, this.ai.x * 10);
      }
      if (this.ai.x != 16)
        break label521;
      this.ai.b = 5;
    }
    label521:
  }

  public void c(Graphics paramGraphics)
  {
    label211: int i1;
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 4, 0, 160 - 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 180 + 5 * this.ai.x);
      }
      if (this.ai.x != 20)
        break label211;
      this.ai.a(paramGraphics);
      this.ai.z += 1;
      break;
    case 1:
      if (this.ai.x < 22)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 80, 240, 200);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 6, -210 + this.ai.x * 10, 118);
        this.ai.ak.a(paramGraphics, 7, 247 - this.ai.x * 10, 204);
        this.ai.ak.a(paramGraphics, 9, -148 + this.ai.x * 10, 125);
        this.ai.ak.a(paramGraphics, 10, 266 - this.ai.x * 10, 211);
      }
      if (this.ai.x != 21)
        break label431;
      this.ai.z += 1;
      break;
    case 2:
      this.ai.ak.a(paramGraphics, 6, 0, 118);
      this.ai.ak.a(paramGraphics, 7, 37, 204);
      this.ai.ak.a(paramGraphics, 8, 41, 122 + this.l * 86);
      this.ai.ak.a(paramGraphics, 9, 62, 125);
      this.ai.ak.a(paramGraphics, 10, 56, 211);
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.ak.a(paramGraphics, 3, 0, 280);
      this.ai.w = true;
      break;
    case 3:
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 80, 240, 200);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      if (this.ai.x < 21)
      {
        this.ai.ak.a(paramGraphics, 6, 0 - this.ai.x * 10, 118);
        this.ai.ak.a(paramGraphics, 7, 37 + this.ai.x * 10, 204);
        this.ai.ak.a(paramGraphics, 9, 62 - this.ai.x * 10, 125);
        this.ai.ak.a(paramGraphics, 10, 56 + this.ai.x * 10, 211);
      }
      else if (this.ai.x < 43)
      {
        this.ai.ak.a(paramGraphics, 6, -210 + (this.ai.x - 21) * 10, 118);
        this.ai.ak.a(paramGraphics, 7, 247 - (this.ai.x - 21) * 10, 204);
        this.ai.ak.a(paramGraphics, 11, -155 + (this.ai.x - 21) * 10, 125);
        this.ai.ak.a(paramGraphics, 12, 265 - (this.ai.x - 21) * 10, 211);
      }
      if (this.ai.x != 42)
        break label931;
      this.ai.z += 1;
      break;
    case 4:
      this.ai.ak.a(paramGraphics, 6, 0, 118);
      this.ai.ak.a(paramGraphics, 7, 37, 204);
      this.ai.ak.a(paramGraphics, 8, 41, 122 + this.ai.ah * 86);
      this.ai.ak.a(paramGraphics, 11, 55, 125);
      this.ai.ak.a(paramGraphics, 12, 55, 211);
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.ak.a(paramGraphics, 3, 0, 280);
      break;
    case 5:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.ai.x, 240, 200 - 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 6, 0, 118);
        this.ai.ak.a(paramGraphics, 7, 37, 204);
        this.ai.ak.a(paramGraphics, 8, 41, 122 + this.ai.ah * 86);
        this.ai.ak.a(paramGraphics, 11, 55, 125);
        this.ai.ak.a(paramGraphics, 12, 55, 211);
        paramGraphics.setClip(0, 0, 240, 320);
        this.ai.ak.a(paramGraphics, 4, 0, 60 + 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 280 - 5 * this.ai.x);
      }
      if (this.ai.x != 20)
        break label1386;
      for (i1 = 0; i1 < 7; ++i1)
        this.ai.ak.a(6 + i1);
      this.ai.b = 26;
      break;
    case 6:
      if (this.ai.x < 20)
      {
        this.ai.w = false;
        paramGraphics.setColor(0);
        paramGraphics.fillRect(41, 208, 160, 26);
        this.ai.ak.a(paramGraphics, 47, 218, "A SAVED GAME IS NOT FOUND.", 0);
      }
      if (this.ai.x != 20)
        break label1467;
      this.ai.z = 2;
      break;
    case 7:
      label431: label1467: for (i1 = 0; i1 < 7; ++i1)
        label1386: this.ai.ak.a(6 + i1);
      label931: this.ai.k = true;
      this.ai.d();
      this.ai.aj.b();
      this.ai.b = 9;
      this.l = 0;
    }
  }

  public void d(Graphics paramGraphics)
  {
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 4, 0, 160 - 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 180 + 5 * this.ai.x);
        paramGraphics.setClip(0, 180 - 5 * this.ai.x, 240, 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 29, 0, 80);
      }
      if (this.ai.x == 20)
        this.ai.z += 1;
      break;
    case 1:
      if (this.ai.x == 0)
        this.ai.al.a("open");
      this.ai.z = 11;
      break;
    case 18:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.ai.x, 240, 200 - 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 29, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.ai.ak.a(paramGraphics, 4, 0, 60 + 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 280 - 5 * this.ai.x);
      }
      if (this.ai.x == 20)
      {
        this.ai.ak.a(29);
        this.ai.b = 2;
      }
    }
    if (this.ai.z < 18)
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 227, 240, 53);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(0, 227, 239, 53);
      k(paramGraphics, this.ai.z, 228);
      this.ai.ak.a(paramGraphics, 3, 0, 280);
    }
    this.ai.a(paramGraphics);
    this.ai.a(paramGraphics, "SKIP", true);
    this.ai.a(paramGraphics, "NEXT", false);
  }

  public void e(Graphics paramGraphics)
  {
    switch (this.ai.z)
    {
    case 0:
      this.ai.al.a("about");
      this.ai.z += 1;
      break;
    case 1:
      this.ai.ak.a(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.ai.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(2, 119, 238, 181);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(2, 119, 237, 180);
      j(paramGraphics, this.ai.z, 130);
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
    }
  }

  public void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 14;
    if (this.ai.b == 7)
      i2 = 30;
    this.ai.al.a(paramInt1);
    this.ai.al.b = 0;
    this.ai.p = this.ai.al.o;
    String str;
    while ((str = this.ai.al.a()) != null)
    {
      if ((this.ai.b == 26) || (this.ai.b == 27))
        paramGraphics.setColor(16777215);
      else
        paramGraphics.setColor(0);
      int i4 = str.indexOf(".");
      if (i4 == 1)
      {
        int i3;
        try
        {
          i3 = Integer.parseInt(str.substring(0, i4));
        }
        catch (Exception localException)
        {
          i3 = -1;
        }
        if (i3 > this.ai.al.b)
          this.ai.al.b = i3;
        if (i3 == this.ai.al.a)
          paramGraphics.setColor(14361600);
      }
      if (this.ai.b == 13)
      {
        paramGraphics.drawString(str, i2, i1 + 8, 20);
      }
      else
      {
        if (this.ai.b != 7)
          paramGraphics.drawString(str, i2, i1, 20);
        if ((this.ai.b == 10) && (paramInt1 == 51) && (((this.ai.al.a <= 2) || (this.ai.al.a == 4))))
          paramGraphics.setColor(0);
      }
      if (this.ai.b == 13)
      {
        if (this.ai.al.a == 2)
          paramGraphics.setColor(0);
        else
          paramGraphics.setColor(40960);
        paramGraphics.drawString(this.ai.an[(1 - this.ai.af)], 83, 119, 20);
      }
      i1 += 17;
    }
    if (this.ai.s)
    {
      paramGraphics.setColor(0);
      paramGraphics.drawString("1.YES   2.NO", 88, 105, 17);
    }
    this.ai.g = false;
  }

  public void keyPressed(int paramInt)
  {
    int i1 = super.getGameAction(paramInt);
    if (this.ai.h)
      return;
    switch (this.ai.b)
    {
    case 0:
      if (this.ai.z != 1)
        break label204;
      this.ai.z += 1;
      break;
    case 3:
      if (this.ai.z == 2)
        switch (paramInt)
        {
        case -4:
        case -2:
          this.l += 1;
          if (this.l > 1)
            this.l = 0;
          this.ai.a("s_menu_move", 1);
          break;
        case -3:
        case -1:
          this.l += -1;
          if (this.l < 0)
            this.l = 1;
          this.ai.a("s_menu_move", 1);
          break;
        case -7:
        case -5:
          if (this.l == 0)
          {
            this.ai.z += 1;
            this.l = 0;
          }
          else if (this.ai.w == true)
          {
            if (this.ai.e())
              this.ai.z = 7;
            else
              this.ai.z = 6;
          }
        case -6:
        }
      else if (this.ai.z == 4)
        switch (paramInt)
        {
        case -4:
        case -3:
        case -2:
        case -1:
          this.ai.ah = (1 - this.ai.ah);
          this.ai.a("s_menu_move", 1);
          break;
        case -7:
        case -5:
          this.ai.ak.a("open");
          this.ai.ak.a(0, 29);
          this.ai.ak.d();
          this.ai.z += 1;
        case -6:
        }
      this.ai.q = true;
      break;
    case 26:
      if ((this.ai.z <= 1) || (this.ai.z >= 18))
        break label636;
      switch (paramInt)
      {
      case -7:
      case -5:
        this.ai.z += 1;
        break;
      case -6:
        this.ai.z = 18;
      }
      break;
    case 5:
      if (this.ai.z != 3)
        break label870;
      switch (paramInt)
      {
      case -4:
      case -2:
      case 56:
        this.l += 1;
        if (this.l > 4)
          this.l = 0;
        this.ai.a("s_menu_move", 1);
        this.ai.e = true;
        break;
      case -3:
      case -1:
      case 50:
        this.l += -1;
        if (this.l < 0)
          this.l = 4;
        this.ai.a("s_menu_move", 1);
        this.ai.e = true;
        break;
      case -6:
        this.ai.b = 9;
        break;
      case -7:
      case -5:
        if (this.l == 5)
        {
          this.ai.b = 4;
          break label867:
        }
        this.ai.b = (byte)(8 + this.l);
      }
      break;
    case 2:
      break;
    case 8:
      if (((paramInt != -7) && (paramInt != -5)) || (this.ai.z <= 0))
        break label911;
      this.ai.z += 1;
      break;
    case 9:
      if (this.ai.z < 11)
        break label980;
      if ((paramInt == -7) || (paramInt == -5))
      {
        if (this.ai.z > 0)
          this.ai.z += 1;
        break label980:
      }
      if (paramInt != -6)
        break label980;
      this.ai.z = 999;
      break;
    case 25:
      if ((this.ai.z != 4) || (this.ai.m != true))
        break label1841;
      if ((this.ai.am.bi == 1) && (paramInt != 53) && (paramInt != -5))
      {
        this.ai.am.b(false);
        this.ai.c();
      }
      if ((this.ai.am.bi == 3) && (this.ai.ag != 1) && (paramInt != 53) && (paramInt != -5))
      {
        keyReleased(53);
        this.ai.am.d(false);
        this.ai.c();
      }
      if ((paramInt == 53) || (paramInt == -5))
      {
        keyReleased(50);
        this.ai.am.e();
        this.ai.am.ba = 0;
        this.ai.am.a9 = 0;
        this.ai.am.bd = 0;
      }
      switch (paramInt)
      {
      case 49:
        this.ai.am.e(true);
        this.ai.am.ba = 3;
        break;
      case 51:
        this.ai.am.e(false);
        this.ai.am.ba = 4;
        break;
      case 53:
        if ((this.ai.am.bi == 1) && (this.ai.m == true))
          this.ai.am.b(true);
        if ((this.ai.am.bi != 3) || (this.ai.n != true))
          break label1361;
        this.ai.am.bh = false;
        this.ai.am.d(true);
        break;
      case 57:
        if (this.ai.am.bi != 1)
          break label1388;
        this.ai.am.c();
        break;
      case 50:
        this.ai.am.c(true);
        this.ai.am.a9 = 1;
        break;
      case 56:
        this.ai.am.c(false);
        this.ai.am.a9 = 2;
        break;
      case 52:
        this.ai.am.a(true);
        this.ai.am.ba = 1;
        break;
      case 54:
        this.ai.am.a(false);
        this.ai.am.ba = 2;
        break;
      case 48:
        if (this.ai.am.bi != 3)
          break label1561;
        this.ai.am.az = false;
        if (this.ai.aj.t < this.ai.aj.r)
          this.ai.a("s_reload", 1);
        this.ai.am.bh = true;
        break;
      case 55:
      default:
        switch (paramInt)
        {
        case -2:
          this.ai.am.c(false);
          this.ai.am.a9 = 2;
          break;
        case -1:
          this.ai.am.c(true);
          this.ai.am.a9 = 1;
          break;
        case -4:
          this.ai.am.a(false);
          this.ai.am.ba = 2;
          break;
        case -3:
          this.ai.am.a(true);
          this.ai.am.ba = 1;
          break;
        case -7:
          if (!this.ai.l)
            break label1727;
          this.ai.b = 13;
          break;
        case -6:
          if (!this.ai.l)
            break label1749;
          this.ai.b = 14;
          break;
        case -5:
          if ((this.ai.am.bi == 1) && (this.ai.m == true))
            this.ai.am.b(true);
          if ((this.ai.am.bi != 3) || (this.ai.n != true))
            break label1835;
          this.ai.am.bh = false;
          this.ai.am.d(true);
        }
      }
      break;
    case 11:
      if (paramInt == -6)
      {
        if (this.ai.z < 10)
          this.ai.z = this.ai.p;
        break label2201:
      }
      int i2 = -1;
      if ((paramInt >= 49) && (paramInt <= 51))
      {
        if (this.ai.z < 10)
          i2 = paramInt - 49 + 1;
      }
      else
      {
        switch (paramInt)
        {
        case -3:
        case -2:
          if (this.ai.z < 10)
          {
            this.ai.al.a += 1;
            this.ai.x = -1;
            this.ai.g = true;
          }
          break;
        case -4:
        case -1:
          if (this.ai.z < 10)
          {
            this.ai.al.a += -1;
            this.ai.x = -1;
            this.ai.g = true;
          }
          break;
        case -7:
        case -5:
          if (this.ai.z == 5)
            i2 = this.ai.al.a;
          else
            i2 = 1;
        case -6:
        }
        if (this.ai.al.a <= 0)
          this.ai.al.a = this.ai.al.b;
        if (this.ai.al.a > this.ai.al.b)
          this.ai.al.a = 1;
      }
      if ((i2 <= 0) || (this.ai.al.m[(i2 - 1)] <= 0))
        break label2201;
      this.ai.z = this.ai.al.m[(i2 - 1)];
      this.ai.x = 0;
      break;
    case 12:
      System.gc();
      if (this.v == true)
      {
        this.ai.x = -1;
        if ((paramInt == 50) || (paramInt == -5) || (paramInt == 49) || (paramInt == -7))
          this.ai.a = 1;
        if ((((paramInt == 50) || (paramInt == 49) || (paramInt == -5) || (paramInt == -7) || (paramInt == -6))) && (this.ai.s))
          this.ai.s = false;
        if ((this.ai.z == 100) || (this.ai.z == 200) || (this.ai.z == 300))
          switch (paramInt)
          {
          case -1:
            if (this.ai.a == 1)
            {
              this.ai.a = 7;
              this.ai.r = true;
            }
            else
            {
              this.ai.a += 8;
              this.ai.a = ((this.ai.a += -1) % 8);
            }
            break;
          case -2:
            if (this.ai.a == 7)
              this.ai.a = 1;
            else
              this.ai.a = (++this.ai.a % 8);
          }
        if ((((this.ai.z == 111) || (this.ai.z == 211) || (this.ai.z == 311))) && (((paramInt == -7) || (paramInt == -5))))
        {
          this.ai.a = 1;
          if (this.ai.p > 0)
            this.ai.z = this.ai.p;
        }
        this.ai.q = true;
      }
      if (this.v != true)
        break label2669;
      if (paramInt == -6)
      {
        this.ai.a = 1;
        if (this.ai.p > 0)
          this.ai.z = this.ai.p;
        break label2669:
      }
      if ((this.ai.z == 111) || (this.ai.z == 211) || (this.ai.z == 311))
        break label2669;
      a(paramInt, i1);
      break;
    case 7:
      if ((paramInt == -1) || (paramInt == -2))
        this.ai.c = (1 - this.ai.c);
      if ((paramInt != -7) && (paramInt != -5))
        break label2740;
      if (this.ai.c == 0)
      {
        this.ai.z = 2;
        break label2740:
      }
      this.ai.z = 3;
      break;
    case 4:
      if ((this.ai.z != 1) || (paramInt != -6))
        break label2768;
      this.ai.b = 5;
      break;
    case 1:
    case 10:
      if (this.ai.z == 1)
        this.ai.al.e = false;
      if (paramInt == -6)
        if (this.ai.b == 1)
        {
          this.ai.z = 10;
        }
        else if ((this.ai.z == 100) || (this.ai.z == 200) || (this.ai.z == 300))
        {
          this.ai.z = 50;
        }
        else if (((this.ai.z >= 101) && (this.ai.z <= 104)) || ((this.ai.z >= 201) && (this.ai.z <= 205)) || ((this.ai.z >= 301) && (this.ai.z <= 304)))
        {
          this.ai.z += -1;
        }
        else if (this.ai.p > 0)
        {
          if (this.ai.z == 61)
            this.ai.al.e = true;
          this.ai.z = this.ai.p;
        }
      else if (this.ai.v)
        a(paramInt, i1);
      this.ai.w = true;
      break;
    case 13:
      if ((paramInt == -6) || (!this.ai.v))
        break label3203;
      a(paramInt, i1);
      if ((this.ai.am.az == true) && (this.q == 1) && (this.ai.al.a == 1) && (((paramInt == -7) || (paramInt == -5) || (paramInt == 49))))
        this.ai.a("s_plasma", 0);
      if ((this.ai.al.a != 1) || ((paramInt != -7) && (paramInt != -5) && (paramInt != 49)))
        break label3203;
      this.ai.am.e();
      this.ai.am.ba = 0;
      this.ai.am.a9 = 0;
      this.ai.am.bd = 0;
      break;
    case 6:
      if ((paramInt != -7) || ((this.ai.z != 2) && (this.ai.z != 4)))
        break label3247;
      this.ai.z += 1;
      break;
    case 14:
      if ((paramInt != -7) && (paramInt != -5) && (paramInt != 35))
        break label3349;
      this.ai.z += 1;
      if (this.ai.am.az == true)
        this.ai.a("s_plasma", 0);
      this.ai.am.e();
      this.ai.am.ba = 0;
      this.ai.am.a9 = 0;
      this.ai.am.bd = 0;
      break;
    case 27:
      label204: label636: if ((this.ai.z <= 1) || (this.ai.z >= 15))
        break label3432;
      switch (paramInt)
      {
      case -7:
      case -5:
        label911: label980: label1749: this.ai.z += 1;
        label3203: label3349: label2201: label1561: label1835: label3247: label1841: label2740: label1727: label2768: label1361: break;
      case -6:
        label867: label870: label1388: label2669: this.ai.z = 15;
      }
    }
    label3432:
  }

  public void f(Graphics paramGraphics)
  {
    if ((this.ai.z > 0) && (this.ai.x > 0))
      return;
    switch (this.ai.z)
    {
    case 0:
      this.y = 1;
      this.ai.ak.a(paramGraphics, 14, 17, 89);
      paramGraphics.setClip(17, 89, 223, 25);
      this.ai.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
      paramGraphics.setClip(0, 0, 240, 320);
      if (this.ai.x == 0)
        this.ai.al.a("system");
      q(paramGraphics);
      return;
    case 1:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.al.c = true;
      this.ai.al.d = false;
      this.ai.al.h = 1;
      this.ai.al.g = this.y;
      if (this.ai.u)
        this.ai.f();
      this.ai.u = false;
      break;
    case 11:
      this.ai.b();
      this.ai.z = 12;
      break;
    case 100:
    case 200:
    case 300:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "NEXT", false);
      break;
    case 101:
    case 102:
    case 103:
    case 201:
    case 202:
    case 203:
    case 204:
    case 301:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "PREV", true);
      this.ai.a(paramGraphics, "NEXT", false);
      break;
    case 104:
    case 205:
    case 302:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "PREV", true);
      this.ai.a(paramGraphics, "OK", false);
      break;
    case 21:
      if (this.ai.e())
      {
        this.ai.d();
        this.ai.al.a("system");
        this.ai.z = 22;
      }
      else
      {
        this.ai.z = 23;
      }
      break;
    case 12:
    case 22:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "OK", false);
      break;
    case 10:
      this.ai.al.c = false;
      this.y = 1;
      break;
    case 20:
      this.ai.al.c = false;
      this.y = 2;
      break;
    case 33:
      this.ai.af = (1 - this.ai.af);
      if (this.ai.af == 0)
        this.ai.c();
      this.ai.u = true;
    case 30:
      this.ai.al.c = false;
      this.y = 3;
      this.ai.z = (31 + this.ai.af);
      break;
    case 43:
      this.ai.ag = (1 - this.ai.ag);
      this.ai.u = true;
    case 40:
      this.ai.al.c = false;
      this.y = 4;
      this.ai.z = (41 + this.ai.ag);
      break;
    case 50:
      this.ai.al.c = false;
      this.y = 5;
      this.ai.al.a("helpmain");
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.al.d = true;
      this.ai.z = 61;
      break;
    case 99:
      this.ai.al.d = false;
      this.ai.al.h = 1;
      this.ai.al.a("help0");
      this.ai.z += 1;
      break;
    case 199:
      this.ai.al.d = false;
      this.ai.al.h = 2;
      this.ai.al.a("help1");
      this.ai.z += 1;
      break;
    case 299:
      this.ai.al.d = false;
      this.ai.al.h = 3;
      this.ai.al.a("help2");
      this.ai.z += 1;
      break;
    case 399:
      this.ai.al.a("help3");
      this.ai.z += 1;
      break;
    case 500:
      this.ai.al.a("system");
      this.ai.z = 1;
      if (this.ai.b != 10)
        return;
      break;
    case 70:
      this.ai.b = 5;
      return;
    case 999:
      this.ai.c();
      this.ai.b();
      this.ai.destroyApp(false);
      this.ai.notifyDestroyed();
      return;
    }
    if (!this.ai.w)
      return;
    c(paramGraphics, this.ai.z, 150);
  }

  public void b(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    b(paramGraphics, paramInt1);
    this.ai.al.a(paramInt1);
    this.ai.al.b = 0;
    this.ai.p = this.ai.al.o;
    switch (this.x)
    {
    case 0:
      paramGraphics.setColor(430330);
      break;
    case 1:
      paramGraphics.setColor(65280);
      break;
    case 2:
      paramGraphics.setColor(16776960);
    }
    String str;
    while ((str = this.ai.al.a()) != null)
    {
      this.ai.ak.a(paramGraphics, 10, i1, str, this.x);
      paramGraphics.setClip(0, 0, 240, 300);
      int i3 = str.indexOf("=");
      if (i3 == 1)
      {
        int i2;
        try
        {
          i2 = Integer.parseInt(str.substring(0, i3));
        }
        catch (Exception localException)
        {
          i2 = -1;
        }
        if (i2 > this.ai.al.b)
          this.ai.al.b = i2;
        if (i2 == this.ai.al.a)
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(7, i1 - 2, str.length() * 6 + 6, 9);
          this.ai.ak.a(paramGraphics, 10, i1, str, 3);
        }
      }
      i1 += 11;
    }
    this.ai.g = false;
  }

  public void g(Graphics paramGraphics)
  {
    paramGraphics.setColor(0);
    this.ai.ak.a(paramGraphics, 12, 145, "Save equipment");
    this.ai.ak.a(paramGraphics, 12, 160, "as you are using.");
  }

  public void a(int paramInt1, int paramInt2)
  {
    int i1 = -1;
    if ((paramInt1 >= 49) && (paramInt1 <= 57))
    {
      i1 = paramInt1 - 49 + 1;
      if (this.ai.b == 13)
        this.ai.al.a = i1;
    }
    else if ((paramInt1 != -8) && (paramInt1 != 42) && (paramInt1 != 48) && (paramInt1 != 35))
    {
      switch (paramInt1)
      {
      case -4:
      case -2:
        this.ai.al.a += 1;
        this.ai.x = -1;
        this.ai.g = true;
        break;
      case -3:
      case -1:
        this.ai.al.a += -1;
        this.ai.x = -1;
        this.ai.g = true;
        break;
      default:
        i1 = this.ai.al.a;
      }
      if (this.ai.al.a <= 0)
        this.ai.al.a = this.ai.al.b;
      if (this.ai.al.a > this.ai.al.b)
        this.ai.al.a = 1;
    }
    if ((i1 <= 0) || (this.ai.al.m[(i1 - 1)] <= 0))
      return;
    this.ai.z = this.ai.al.m[(i1 - 1)];
    this.ai.x = 0;
  }

  public void h(Graphics paramGraphics)
  {
    if ((this.ai.z > 0) && (this.ai.x > 0))
      return;
    int i1;
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x < 4)
      {
        if (this.ai.x == 0)
        {
          this.ai.a("m_briefing", 0);
          this.ai.ak.a("brief");
        }
        this.ai.ak.a(this.ai.x, 17 + this.ai.x);
      }
      if (this.ai.x == 4)
      {
        this.ai.ak.d();
        this.ai.ak.a("boss" + this.ai.aj.b);
        this.ai.ak.a(8, 21);
        this.ai.ak.d();
        if (this.ai.k)
        {
          this.ai.ak.a("menu");
          for (i1 = 0; i1 < 4; ++i1)
            this.ai.ak.a(i1, 13 + i1);
          this.ai.ak.d();
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 80, 240, 220);
          this.ai.ak.a(paramGraphics, 15, 33, 60);
          paramGraphics.setClip(198, 60, 18, 20);
          this.ai.ak.a(paramGraphics, 16, 198, 60 - this.ai.aj.b * 20);
          paramGraphics.setClip(0, 0, 240, 320);
        }
        this.ai.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.ai.ak.a(paramGraphics, 13, 60, 90);
        if (this.ai.aj.b < 4)
          this.ai.ak.a("enermy" + this.ai.aj.b);
        else
          this.ai.ak.a("boss" + (this.ai.aj.b - 4));
        this.ai.ak.a(8, 22);
        this.ai.ak.d();
        this.ai.a(paramGraphics);
        if (this.ai.b == 9)
          this.ai.a(paramGraphics, "SKIP", true);
        this.ai.a(paramGraphics, "NEXT", false);
        this.ai.z += 1;
        this.ai.p = -1;
        this.ai.h = false;
      }
      return;
    case 1:
      this.ai.z = 11;
      this.ai.a(this.ai.aj.b + 1);
      paramGraphics.setColor(65280);
      break;
    case 999:
      if (this.ai.b == 9)
        this.ai.b = 25;
      else
        this.ai.b = 5;
      this.ai.aj.c = this.ai.aj.b;
      for (i1 = 0; i1 < 6; ++i1)
        this.ai.ak.a(17 + i1);
      return;
    }
    if (this.ai.z >= 11)
      f(paramGraphics, this.ai.z, 242);
    if (this.ai.al.a(this.ai.z + 1))
      return;
    if (this.ai.b == 9)
    {
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "START", false);
    }
    else
    {
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "OPTIONS", false);
    }
    this.ai.aa = (this.ai.z = 998);
  }

  public void i(Graphics paramGraphics)
  {
    if ((this.ai.z > 0) && (this.ai.x > 0))
      return;
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
        this.ai.al.a("system");
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "PLAY", true);
      this.ai.a(paramGraphics, "OK", false);
      q(paramGraphics);
      return;
    case 1:
      this.ai.z = 2;
      break;
    case 10:
      this.ai.b = 2;
      return;
    }
    f(paramGraphics);
  }

  public void a()
  {
  }

  public void c(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    this.ai.w = false;
    i(paramGraphics, paramInt1, paramInt2);
  }

  public void j(Graphics paramGraphics)
  {
    this.ai.ac = this.ai.aj.b;
    this.ai.am.z = 0;
    if (this.ai.ac < 3)
      this.ai.ad = 0;
    else if ((this.ai.ac == 3) || (this.ai.ac == 4))
      this.ai.ad = 1;
    else if (this.ai.ac > 4)
      this.ai.ad = 2;
    this.ai.am.bj = 16749568;
    this.ai.am.bk = 16768512;
    int i1;
    switch (this.ai.z)
    {
    case 0:
      this.ai.m = false;
      this.ai.n = false;
      this.ai.l = false;
      this.l = 1;
      this.ai.ak.b();
      this.ai.ak.a();
      this.ai.ak.a(2);
      this.ai.ak.a(5);
      this.ai.aj.a();
      this.ai.a(this.ai.aj.b + 1);
      this.ai.am.a();
      this.ai.ak.a("etc");
      this.ai.ak.a(0, 111);
      this.ai.ak.d();
      this.ai.ak.a("aa");
      this.ai.ak.a(0, 24);
      this.ai.ak.a(9, 33);
      this.ai.ak.a(10, 34);
      this.ai.ak.d();
      this.ai.z += 1;
      break;
    case 1:
      switch (this.ai.x)
      {
      case 0:
        this.ai.ak.a("background" + this.ai.ad);
        for (i1 = 0; i1 < 2; ++i1)
          this.ai.ak.a(i1, 7 + i1);
        break;
      case 1:
        for (i1 = 0; i1 < 9; ++i1)
          this.ai.ak.a(i1 + 2, 9 + i1);
        if (this.ai.ad == 2)
          for (i1 = 0; i1 < 3; ++i1)
            this.ai.ak.a(i1 + 11, 18 + i1);
        this.ai.ak.d();
        break;
      case 2:
        System.gc();
        this.ai.z += 1;
      }
      a(paramGraphics, this.ai.x);
      break;
    case 2:
      switch (this.ai.x)
      {
      case 0:
        this.ai.ak.a("ui");
        for (i1 = 0; i1 < 3; ++i1)
          this.ai.ak.a(i1, 21 + i1);
        this.ai.ak.d();
        this.ai.ak.a("effect");
        for (i1 = 0; i1 < 13; ++i1)
          this.ai.ak.a(i1, 71 + i1);
        this.ai.ak.d();
        break;
      case 1:
        System.gc();
        this.ai.z += 1;
      }
      a(paramGraphics, this.ai.x + 3);
      break;
    case 3:
      a(paramGraphics, this.ai.x + 5);
      switch (this.ai.x)
      {
      case 0:
        this.ai.ak.a("aa");
        for (i1 = 0; i1 < 11; ++i1)
          this.ai.ak.a(i1, 24 + i1);
        this.ai.ak.d();
        break;
      case 1:
        if (this.ai.ac < 4)
          this.ai.ak.a("enermy" + this.ai.ac);
        else
          this.ai.ak.a("boss" + (this.ai.ac - 4));
        for (i1 = 0; i1 < 8; ++i1)
          this.ai.ak.a(i1, 53 + i1);
        this.ai.ak.d();
        break;
      case 2:
        this.ai.ak.a("fence" + this.ai.ad);
        for (i1 = 0; i1 < 8; ++i1)
          this.ai.ak.a(i1, 44 + i1);
        this.ai.ak.a("plasma");
        for (i1 = 18; i1 < 24; ++i1)
          this.ai.ak.a(i1, 84 + i1);
        this.ai.ak.d();
        break;
      case 3:
        this.ai.c();
        System.gc();
        this.ai.z += 1;
      }
      break;
    case 4:
      if (this.ai.x == 0)
      {
        this.ai.ak.a(111);
        this.b = false;
        t(paramGraphics);
        this.ai.j = false;
      }
      paramGraphics.setClip(0, 0, 240, 320);
      this.ai.am.a(paramGraphics);
      o(paramGraphics);
      if ((this.ai.x < 10) && (this.ai.j == true))
      {
        this.ai.ak.a(paramGraphics, 135, 27, "", 0);
        paramGraphics.setColor(16711680);
        paramGraphics.fillRect(80, 194, 80, 10);
        this.ai.ak.a(paramGraphics, 86, 197, "NO MISSILE", 0);
      }
      if (this.ai.ab != 25)
      {
        this.ai.am.bl = true;
        this.b = true;
        this.ai.z = 5;
      }
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "OPTIONS", false);
      this.ai.a(paramGraphics, "PAUSE", true);
      break;
    case 5:
      paramGraphics.setClip(0, 0, 240, 300);
      this.ai.am.a(paramGraphics);
      this.ai.am.f();
      this.ai.z = 6;
      break;
    case 6:
      this.ai.ak.b();
      this.ai.ak.a();
      this.ai.b = this.ai.ab;
    }
  }

  public void a(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 170;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.ai.a(paramGraphics);
    this.ai.a(paramGraphics, "OK", false);
    paramGraphics.setColor(7171414);
    paramGraphics.fillRect(6, 127, 226, 147);
    paramGraphics.setColor(9605802);
    paramGraphics.drawRect(6, 127, 225, 146);
    paramGraphics.setColor(9605717);
    paramGraphics.fillRect(15, 140, 72, 42);
    paramGraphics.setColor(16777130);
    paramGraphics.drawRect(15, 139, 72, 43);
    this.ai.ak.a(paramGraphics, 18, 141, 60, 40, i1 - 1, paramInt2);
    switch (paramInt2)
    {
    case 0:
      str2 = "MISSILE";
      break;
    case 1:
      str2 = "PLASMA CANON";
      break;
    case 2:
      str2 = "ARMOR";
    }
    this.r.a(i1);
    String str1 = this.r.a();
    this.ai.ak.a(paramGraphics, 100, 145, str2);
    this.ai.ak.a(paramGraphics, 100, 165, str1);
    i3 += 30;
    switch (i2)
    {
    case 0:
      this.t = this.ai.aj.q;
      break;
    case 1:
      i2 = 0;
      this.t = this.ai.aj.v;
      break;
    case 2:
      i2 = 1;
      this.t = this.ai.aj.l;
      i4 = 3;
    }
    this.t += this.ai.aj.a;
    for (int i5 = 0; i5 < i4; ++i5)
    {
      this.ai.ak.a(paramGraphics, 20, i3, this.w[i2][i5] + ":" + this.r.m[i5]);
      i3 += 15;
    }
    this.u = this.r.m[i4];
  }

  public void k(Graphics paramGraphics)
  {
    if (this.ai.x > 0)
      return;
    switch (this.ai.z)
    {
    case 0:
      this.ai.c();
      this.ai.aq = null;
      this.ai.a(paramGraphics);
      this.ai.al.a("subm");
      this.ai.z = 1;
      this.ai.al.c = false;
      break;
    case 1:
      this.ai.s = true;
      if (this.ai.al.c)
        this.ai.al.g = 4;
      break;
    case 2:
      this.ai.s = false;
      this.ai.al.c = true;
      this.ai.al.g = 1;
      break;
    case 40:
      this.ai.f();
      this.ai.ab = 5;
    case 10:
      this.ai.f();
      this.ai.y = (this.ai.b = 25);
      this.ai.z = 4;
      return;
    case 20:
      this.ai.af = (1 - this.ai.af);
      if (this.ai.af == 0)
        this.ai.c();
      this.ai.z = 1;
      return;
    case 30:
      this.ai.ag = (1 - this.ai.ag);
      if (this.ai.ag == 0)
        this.ai.am.d(false);
      this.ai.z = 1;
      return;
    case 999:
      this.ai.c();
      this.ai.f();
      this.ai.b();
      this.ai.destroyApp(false);
      this.ai.notifyDestroyed();
      return;
    }
    if (this.ai.t)
    {
      this.ai.am.a(paramGraphics);
      o(paramGraphics);
      this.ai.t = false;
    }
    c(paramGraphics, this.ai.z, 217);
    this.ai.a(paramGraphics);
    this.ai.a(paramGraphics, "OK", false);
  }

  public void l(Graphics paramGraphics)
  {
    int i1 = 133;
    int i2 = 0;
    int i3 = 0;
    paramGraphics.setColor(0);
    if (this.ai.am.m != null)
    {
      i3 = this.ai.am.h * this.ai.am.u;
      this.ai.ak.a(paramGraphics, 50, i1, this.ai.am.m + ":" + this.ai.am.h + "x" + this.ai.am.u);
      i1 += 16;
      i2 += i3;
    }
    if (this.ai.am.q != null)
    {
      i3 = this.ai.am.i * this.ai.am.t;
      this.ai.ak.a(paramGraphics, 50, i1, this.ai.am.q + ":" + this.ai.am.i + "x" + this.ai.am.t);
      i1 += 16;
      i2 += i3;
    }
    i3 = -this.ai.aj.i * (this.ai.aj.g - this.ai.aj.j);
    this.ai.ak.a(paramGraphics, 50, i1, "Maintenance Fee:");
    this.ai.ak.a(paramGraphics, 59, i1 += 16, "" + i3);
    i1 += 25;
    i2 += i3;
    this.ai.ak.a(paramGraphics, 50, i1, "Total:" + i2);
    this.ai.aj.a += i2;
  }

  public void m(Graphics paramGraphics)
  {
    switch (this.ai.z)
    {
    case 0:
      this.ai.k = false;
      this.ai.ak.a();
      this.ai.ak.b();
      this.ai.ak.a("menu");
      for (int i1 = 0; i1 < 4; ++i1)
        this.ai.ak.a(i1, 13 + i1);
      this.ai.ak.d();
      this.ai.ak.a("font");
      for (i1 = 1; i1 < 3; ++i1)
        this.ai.ak.a(i1, i1);
      this.ai.ak.a(5, 5);
      this.ai.ak.d();
      this.ai.w = true;
      this.ai.al.c = false;
      this.ai.al.d = false;
      this.ai.z += 1;
      break;
    case 1:
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, 240, 320);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 0, 240, 40);
      paramGraphics.drawLine(0, 42, 240, 42);
      paramGraphics.drawLine(0, 45, 240, 45);
      paramGraphics.fillRect(0, 50, 240, 6);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      this.ai.ak.a(paramGraphics, 3, 0, 0);
      this.ai.ak.a(paramGraphics, 5, 27, 25);
      this.ai.ak.a(paramGraphics, 4, 0, 160);
      this.ai.ak.a(paramGraphics, 3, 0, 180);
      this.ai.z += 1;
      break;
    case 2:
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 80, 240, 200);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 4, 0, 160 - 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 180 + 5 * this.ai.x);
        paramGraphics.setClip(0, 180 - 5 * this.ai.x, 240, 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 14, 17, 89 + this.l * 33);
        this.ai.ak.a(paramGraphics, 13, 60, 90);
      }
      if (this.ai.x == 20)
      {
        this.ai.ak.d();
        this.ai.ak.a("etc");
        this.ai.ak.a(3, 114);
        this.ai.z += 1;
      }
      break;
    case 3:
      this.ai.ak.a(paramGraphics, 15, 33, 60);
      paramGraphics.setClip(198, 60, 18, 20);
      this.ai.ak.a(paramGraphics, 16, 198, 60 - this.ai.aj.b * 20);
      paramGraphics.setClip(0, 0, 240, 280);
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 80, 240, 200);
      paramGraphics.setColor(4802901);
      paramGraphics.fillRect(0, 119, 240, 30);
      paramGraphics.fillRect(0, 171, 240, 10);
      paramGraphics.fillRect(0, 205, 240, 30);
      this.ai.ak.a(paramGraphics, 14, 17, 89 + this.l * 33);
      this.ai.ak.a(paramGraphics, 13, 60, 90);
      this.ai.ak.a(paramGraphics, 3, 0, 280);
    }
    this.ai.a(paramGraphics);
    this.ai.a(paramGraphics, "PLAY", true);
    this.ai.a(paramGraphics, "OK", false);
  }

  public void d(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    int i2 = 5;
    this.ai.al.a(paramInt1);
    String str;
    while ((str = this.ai.al.a()) != null)
    {
      paramGraphics.setColor(16777215);
      if (this.ai.b == 4)
        paramGraphics.drawString(str, 120, i1, 17);
      i1 += 17;
    }
  }

  public void e(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    b(paramGraphics, paramInt1, paramInt2);
  }

  public void n(Graphics paramGraphics)
  {
    if (this.ai.x > 0)
      return;
    switch (this.ai.z)
    {
    case 0:
      this.ai.c();
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 150, 240, 15);
      this.ai.ak.a(paramGraphics, 98, 152, "PAUSE");
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "RESUME", false);
      break;
    case 1:
      this.ai.y = (this.ai.b = 25);
      this.ai.z = 4;
      return;
    }
  }

  public void b(Graphics paramGraphics, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i3 = 190;
    int i4 = 3;
    String str2 = null;
    int i2 = paramInt1 / 100 - 1;
    int i1 = paramInt1 % 100;
    this.r.a(i1);
    String str1 = this.r.a();
    paramGraphics.setClip(0, 0, 176, 80);
    switch (paramInt2)
    {
    case 0:
      paramGraphics.setColor(430330);
      break;
    case 1:
      paramGraphics.setColor(65280);
      break;
    case 2:
      paramGraphics.setColor(16776960);
    }
    paramGraphics.setClip(0, 0, 240, 320);
    this.ai.ak.a(paramGraphics, 13, 131, 60, 40, i1 - 1, paramInt2);
    switch (paramInt2)
    {
    case 0:
      this.x = 0;
      str2 = "MISSILE";
      this.t = this.ai.aj.q;
      break;
    case 1:
      this.x = 1;
      i2 = 0;
      str2 = "PLASMA CANON";
      this.t = this.ai.aj.v;
      break;
    case 2:
      this.x = 2;
      i2 = 1;
      str2 = "ARMOR";
      this.t = this.ai.aj.l;
    }
    this.t += this.ai.aj.a;
    this.ai.ak.a(paramGraphics, 100, 140, str2);
    for (int i5 = 0; i5 < i4; ++i5)
    {
      this.ai.ak.a(paramGraphics, 130, i3, this.w[i2][i5] + ":" + this.r.m[i5], this.x);
      i3 += 11;
    }
    if (!paramBoolean)
      return;
    this.ai.ak.a(paramGraphics, 130, 235, "MY MONEY:", this.x);
    this.ai.ak.a(paramGraphics, 130, 245, "" + this.ai.aj.a, this.x);
  }

  public void f(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    h(paramGraphics, paramInt1, paramInt2);
  }

  public void a(Graphics paramGraphics, int paramInt)
  {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, 240, 320);
    this.ai.ak.a(paramGraphics, 24, 90, 169);
    paramGraphics.setClip(100, 180, 12, 11);
    this.ai.ak.a(paramGraphics, 33, 100, 180 - 11 * (paramInt % 2));
    paramGraphics.setClip(128, 180, 12, 11);
    this.ai.ak.a(paramGraphics, 34, 128, 180 - 11 * (paramInt % 2));
    paramGraphics.setColor(16711680);
    paramGraphics.setClip(87, 200, 66, 14);
    paramGraphics.fillRect(87, 217 - paramInt * 3, 66, paramInt * 3);
    this.ai.ak.a(paramGraphics, 111, 87, 200);
  }

  public void paint(Graphics paramGraphics)
  {
    if (this.ah)
      return;
    this.ah = true;
    this.ai.x += 1;
    if (this.ai.b != this.ai.y)
    {
      this.ai.x = 0;
      this.ai.z = 0;
      this.ai.aa = 0;
      this.ai.p = -1;
      this.b = true;
      this.ai.y = this.ai.b;
      this.ai.i = false;
    }
    else if (this.ai.z != this.ai.aa)
    {
      this.ai.x = 0;
      this.ai.aa = this.ai.z;
    }
    switch (this.ai.b)
    {
    case 25:
      j(paramGraphics);
      break;
    case 0:
      u(paramGraphics);
      break;
    case 3:
      c(paramGraphics);
      break;
    case 1:
      i(paramGraphics);
      break;
    case 5:
      m(paramGraphics);
      break;
    case 13:
      k(paramGraphics);
      break;
    case 14:
      n(paramGraphics);
      break;
    case 9:
      if (this.ai.aj.c != this.ai.aj.b)
        h(paramGraphics);
      else
        this.ai.b = 25;
      break;
    case 8:
      h(paramGraphics);
      break;
    case 10:
      f(paramGraphics);
      break;
    case 11:
      r(paramGraphics);
      break;
    case 12:
      s(paramGraphics);
      break;
    case 4:
      e(paramGraphics);
      break;
    case 26:
      d(paramGraphics);
      break;
    case 2:
      v(paramGraphics);
      break;
    case 7:
      b(paramGraphics);
      break;
    case 6:
      p(paramGraphics);
      break;
    case 27:
      a(paramGraphics);
    }
    this.ah = false;
  }

  public b(ArchAngel paramArchAngel)
  {
    (this.ai = paramArchAngel).getClass();
    this.a = 0;
    this.b = true;
    this.c = -1;
    this.d = -2;
    this.e = -3;
    this.f = -4;
    this.g = -5;
    this.h = -6;
    this.i = -7;
    this.j = -8;
    this.k = 0;
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.o = -1;
    this.p = -1;
    this.v = true;
    this.w = new String[][] { { "DAMAGE", "BULLET/M", "PRICE" }, { "DEFENCE", "REPAIR", "PRICE" } };
    this.y = 1;
    this.z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = 0;
    this.ag = 0;
    this.ah = false;
  }

  public void b()
  {
  }

  public void o(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 40);
    switch (this.ai.am.aa)
    {
    case 0:
      if (this.ai.ac < 4)
        this.ai.ak.a(paramGraphics, 75, 10, "ENERMY:" + this.ai.am.m, 0);
      else
        this.ai.ak.a(paramGraphics, 75, 10, this.ai.am.m, 0);
      this.ai.ak.a(paramGraphics, 75, 20, "N:" + (this.ai.am.y - this.ai.am.u), 0);
      if (this.ai.am.y - this.ai.am.u <= 0)
      {
        this.ai.am.a1 = true;
        this.ai.am.aa = this.ai.am.ac;
      }
      break;
    case 1:
      paramGraphics.setColor(14408703);
      paramGraphics.drawString(this.ai.am.ca + " m", 120, 3, 17);
      i1 = this.ai.am.f;
      int i2 = Math.abs(i1) / 60 + 1;
      if ((i1 <= 5) && (i1 >= -5))
      {
        paramGraphics.fillRect(112, 20, 1, 7);
      }
      else
      {
        int i3;
        if (i1 > 5)
          for (i3 = 0; i3 < i2; ++i3)
            this.ai.ak.a(paramGraphics, 23, 114 + i3 * 4, 20);
        else if (i1 < -5)
          for (i3 = 0; i3 < i2; ++i3)
            this.ai.ak.a(paramGraphics, 22, 106 - i3 * 4, 20);
      }
      break;
    case 2:
      if (this.ai.ac < 7)
      {
        this.ai.ak.a(paramGraphics, 87, 8, this.ai.am.q, 0);
      }
      else
      {
        this.ai.ak.a(paramGraphics, 89, 5, "ARCHANGEL", 0);
        this.ai.ak.a(paramGraphics, 89, 11, "   MK2   ", 0);
      }
      this.ai.ak.a(paramGraphics, 82, 18, "HP:", 0);
      paramGraphics.setColor(9605802);
      paramGraphics.fillRect(102, 17, 42, 7);
      paramGraphics.setColor(14408703);
      paramGraphics.drawRect(102, 17, 41, 6);
      paramGraphics.setColor(16776960);
      paramGraphics.fillRect(103, 18, this.ai.ae, 5);
    }
    int i1 = 40 * this.ai.aj.j >> 9;
    paramGraphics.setColor(255);
    paramGraphics.fillRect(192, 5, i1 / 2, 4);
    if (this.ai.am.bi == 3)
    {
      if (this.ai.am.bh == true)
      {
        if (this.ai.aj.t < this.ai.aj.r)
          this.ai.aj.t += 3;
        if (this.ai.aj.t == this.ai.aj.r)
          this.ai.am.bh = false;
      }
      if (this.ai.aj.t <= 0)
      {
        paramGraphics.setColor(16711680);
        if (this.ai.x / 2 % 2 == 0)
        {
          paramGraphics.fillRect(80, 194, 80, 19);
          this.ai.ak.a(paramGraphics, 86, 197, "PRESS 0 KEY", 0);
          this.ai.ak.a(paramGraphics, 92, 205, "TO RELOAD", 0);
        }
      }
      i1 = this.ai.aj.t * 40 / this.ai.aj.r;
    }
    else if (this.ai.am.bi == 1)
    {
      i1 = this.ai.aj.o * 40 / this.ai.aj.m;
    }
    else
    {
      i1 = 40;
    }
    paramGraphics.setColor(16711680);
    paramGraphics.fillRect(192, 17, i1, 4);
  }

  public void p(Graphics paramGraphics)
  {
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
      {
        for (int i1 = 11; i1 < 19; ++i1)
          this.ai.ak.a(24 + i1);
        this.ai.ak.a();
        this.ai.ak.a("font");
        this.ai.ak.a(1, 1);
        this.ai.ak.d();
        this.ai.a(paramGraphics);
        this.ai.a(paramGraphics, "OK", false);
        this.ai.s = false;
        this.ai.m = false;
      }
      q(paramGraphics);
      break;
    case 1:
      this.ai.a("m_win", 1);
      this.ai.ak.a("result");
      this.ai.ak.a(2, paramGraphics, 45, 93);
      this.ai.ak.a(1, paramGraphics, 62, 98);
      this.ai.ak.d();
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(45, 126, 150, 107);
      if (this.ai.aj.b == 7)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 300);
        this.ai.b = 27;
        break label303:
      }
      this.ai.z = 4;
      break;
    case 4:
      if (this.ai.x != 0)
        break label321;
      l(paramGraphics);
      break;
    case 2:
    case 3:
    default:
      if (this.ai.x < 16)
      {
        label303: label321: paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, this.ai.x * 10);
        paramGraphics.fillRect(0, 300 - this.ai.x * 10, 240, this.ai.x * 10);
      }
      if (this.ai.x != 16)
        break label448;
      this.ai.ak.a();
      System.gc();
      this.ai.aj.b += 1;
      this.ai.b();
      this.ai.b = 5;
    }
    label448:
  }

  public void g(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i3 = 93;
    int i4 = 0;
    String str1 = null;
    String str2 = null;
    int i1 = paramInt1 / 100 - 1;
    int i2 = paramInt1 % 100;
    switch (i1)
    {
    case 0:
      i4 = this.ai.aj.q;
      if (this.ai.aj.d == i2)
      {
        g(paramGraphics);
        return;
      }
      this.ai.aj.d = i2;
      this.ai.aj.a(this.r);
      break;
    case 1:
      i4 = this.ai.aj.v;
      if (this.ai.aj.e == i2)
      {
        g(paramGraphics);
        return;
      }
      this.ai.aj.e = i2;
      this.ai.aj.c(this.r);
      break;
    case 2:
      i4 = this.ai.aj.l;
      if (this.ai.aj.f == i2)
      {
        g(paramGraphics);
        return;
      }
      this.ai.aj.f = i2;
      this.ai.aj.d(this.r);
    }
    this.ai.aj.a += i4 - paramInt2;
    switch (this.x)
    {
    case 0:
      str1 = "missile";
      str2 = this.ai.aj.p;
      break;
    case 1:
      str1 = "plasma canon";
      str2 = this.ai.aj.u;
      break;
    case 2:
      str1 = "Armor";
      str2 = this.ai.aj.k;
    }
    this.ai.ak.a(paramGraphics, 12, 135, "You bought the");
    this.ai.ak.a(paramGraphics, 12, 150, str1);
    this.ai.ak.a(paramGraphics, 12, 165, str2);
    this.ai.ak.a(paramGraphics, 12, 195, "My money : " + this.ai.aj.a);
  }

  public void q(Graphics paramGraphics)
  {
    this.ai.z += 1;
    this.ai.p = -1;
    this.ai.h = false;
  }

  public void keyReleased(int paramInt)
  {
    switch (this.ai.b)
    {
    case 25:
      if (this.ai.am.bi == 1)
      {
        if ((paramInt == -5) || (paramInt == 53))
        {
          this.ai.am.b(false);
          this.ai.c();
        }
      }
      else if ((this.ai.am.bi == 3) && (((paramInt == -5) || (paramInt == 53))) && (this.ai.ag != 1))
      {
        this.ai.am.d(false);
        this.ai.c();
      }
      if ((paramInt != 49) && (paramInt != 50) && (paramInt != 51) && (paramInt != 52) && (paramInt != 54) && (paramInt != 57) && (paramInt != -1) && (paramInt != -2) && (paramInt != -4) && (paramInt != -3))
        break label228;
      this.ai.am.e();
      this.ai.am.ba = 0;
      this.ai.am.a9 = 0;
      this.ai.am.bd = 0;
    }
    label228:
  }

  public void h(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    paramGraphics.setColor(9605802);
    paramGraphics.fillRect(0, 119, 240, 181);
    if (paramInt1 == 11)
    {
      this.ai.ak.a(paramGraphics, 17, 10, 126);
    }
    else if ((paramInt1 >= 12) && (paramInt1 < 14))
    {
      this.ai.ak.a(paramGraphics, 20, 6, 126);
      this.ai.ak.c(paramGraphics, 22, 55, 170);
      this.ai.ak.a(paramGraphics, 140, 140, "NAME:", 0);
      this.ai.ak.a(paramGraphics, 140, 150, this.ai.am.m, 0);
      this.ai.ak.a(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.ai.ak.a(paramGraphics, 140, 170, this.ai.am.k + "MP", 0);
    }
    else if (paramInt1 >= 14)
    {
      this.ai.ak.a(paramGraphics, 20, 6, 126);
      this.ai.ak.c(paramGraphics, 21, 55, 170);
      this.ai.ak.a(paramGraphics, 140, 140, "NAME:", 0);
      this.ai.ak.a(paramGraphics, 140, 150, this.ai.am.q, 0);
      this.ai.ak.a(paramGraphics, 140, 160, "DAMAGE:", 0);
      this.ai.ak.a(paramGraphics, 140, 170, this.ai.am.o + "MP", 0);
    }
    this.ai.ak.a(paramGraphics, 18, 189, 175);
    this.ai.ak.a(paramGraphics, 19, 0, 235);
    paramGraphics.setColor(0);
    this.ai.al.a(paramInt1);
    this.ai.al.b = 0;
    this.ai.p = this.ai.al.o;
    String str;
    while ((str = this.ai.al.a()) != null)
    {
      paramGraphics.setColor(0);
      int i3 = str.indexOf(".");
      if (i3 == 1)
      {
        int i2;
        try
        {
          i2 = Integer.parseInt(str.substring(0, i3));
        }
        catch (Exception localException)
        {
          i2 = -1;
        }
        if (i2 > this.ai.al.b)
          this.ai.al.b = i2;
      }
      paramGraphics.drawString(str, 11, i1, 20);
      i1 += 17;
    }
    this.ai.g = false;
  }

  public void i(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.ai.v = false;
    if ((this.ai.b == 12) && (((paramInt1 == 100) || (paramInt1 == 200) || (paramInt1 == 300))))
    {
      b(paramGraphics, paramInt1, 130);
    }
    else
    {
      int i1 = paramInt2;
      int i4 = 10;
      if (this.ai.b != 7)
      {
        if (this.ai.b == 13)
        {
          i4 = 5;
          paramGraphics.setColor(4343106);
          paramGraphics.fillRect(0, 217, 140, 83);
          paramGraphics.setColor(14605311);
          paramGraphics.drawRect(0, 217, 139, 82);
          this.q = paramInt1;
        }
        else
        {
          this.ai.ak.a(paramGraphics, 2, 2, 120);
        }
      }
      else if (this.ai.b == 7)
      {
        i4 = 18;
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(13, 76, 150, 107);
      }
      else
      {
        i4 = 30;
      }
      paramGraphics.setColor(40960);
      this.ai.al.a(paramInt1);
      this.ai.al.b = 0;
      this.ai.p = this.ai.al.o;
      String str;
      while ((str = this.ai.al.a()) != null)
      {
        paramGraphics.setColor(0);
        int i3 = str.indexOf(".");
        if (i3 == 1)
        {
          int i2;
          try
          {
            i2 = Integer.parseInt(str.substring(0, i3));
          }
          catch (Exception localException)
          {
            i2 = -1;
          }
          if (i2 > this.ai.al.b)
            this.ai.al.b = i2;
          if (i2 == this.ai.al.a)
            if (this.ai.b == 13)
            {
              paramGraphics.setColor(83967);
              paramGraphics.fillRect(i4 + 15, i1 + 6, str.length() * 5 + 3, 9);
            }
            else
            {
              paramGraphics.setColor(0);
              paramGraphics.fillRect(i4 - 2, i1 - 2, str.length() * 9 + 3, 15);
            }
        }
        if (this.ai.b == 13)
        {
          this.ai.ak.a(paramGraphics, i4, i1 + 8, str, 0);
          paramGraphics.setColor(0);
          if (this.ai.s)
          {
            paramGraphics.setColor(0);
            this.ai.ak.a(paramGraphics, i4 + 66, 236, this.ai.an[(1 - this.ai.af)], 0);
            this.ai.ak.a(paramGraphics, i4 + 72, 247, this.ai.ao[(1 - this.ai.ag)], 0);
          }
        }
        else
        {
          this.ai.ak.a(paramGraphics, i4, i1, str);
          if ((this.ai.b == 10) && (paramInt1 == 51) && (((this.ai.al.a <= 2) || (this.ai.al.a == 4))))
            paramGraphics.setColor(0);
        }
        if (this.ai.b == 13)
          i1 += 11;
        else
          i1 += 15;
      }
      if (this.ai.b == 11)
      {
        paramGraphics.setColor(9540180);
        paramGraphics.fillRect(10, 135, 70, 42);
        this.ai.ak.a(paramGraphics, 114, 10, 135);
        paramGraphics.setColor(0);
        this.ai.ak.a(paramGraphics, 12, 180, "My money:" + this.ai.aj.a);
        this.ai.ak.a(paramGraphics, 10, 210, "1.Missile");
        this.ai.ak.a(paramGraphics, 10, 225, "2.Plasma Canon");
        this.ai.ak.a(paramGraphics, 10, 240, "3.Armor");
      }
      this.ai.g = false;
    }
    this.ai.v = true;
  }

  public void showNotify()
  {
    this.ai.t = true;
    this.ai.x = -1;
    if (this.ai.b != 25)
      return;
    this.ai.am.e();
    this.ai.am.ba = 0;
    this.ai.am.a9 = 0;
    this.ai.am.bd = 0;
  }

  public void r(Graphics paramGraphics)
  {
    if ((this.ai.z > 0) && (this.ai.x > 0))
      return;
    c(paramGraphics, this.ai.z, 210);
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
      {
        this.ai.al.a("info");
        this.r = new e();
        this.o = 186;
        this.p = 5;
        this.ai.ak.a("shop");
        for (int i1 = 0; i1 < 3; ++i1)
          this.ai.ak.a(i1, 26 + i1);
        this.ai.ak.d();
        this.ai.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.ai.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
      }
      q(paramGraphics);
      return;
    case 1:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.d = 2;
      this.ai.z = 5;
      break;
    case 10:
      this.r.a("missile");
      this.ai.d = 0;
      a(paramGraphics, 100 + this.ai.aj.d, false, 0);
      this.ai.al.c = true;
      this.ai.al.g = 1;
      break;
    case 20:
      this.r.a("plasma");
      this.ai.d = 1;
      a(paramGraphics, 200 + this.ai.aj.e, false, 1);
      this.ai.al.c = true;
      this.ai.al.g = 2;
      break;
    case 30:
      this.r.a("arm");
      this.ai.d = 2;
      a(paramGraphics, 300 + this.ai.aj.f, false, 2);
      this.ai.al.c = true;
      this.ai.al.g = 3;
      break;
    case 999:
      this.ai.b = 5;
      this.r = null;
      return;
    }
  }

  public void s(Graphics paramGraphics)
  {
    if ((this.ai.z > 0) && (this.ai.x > 0))
      return;
    this.v = false;
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
      {
        this.ai.ak.a("shop");
        for (int i1 = 0; i1 < 3; ++i1)
        {
          this.ai.ak.a(26 + i1);
          this.ai.ak.a(i1, 26 + i1);
        }
        this.ai.ak.d();
        this.ai.ak.a(paramGraphics, 14, 17, 89);
        paramGraphics.setClip(17, 89, 223, 25);
        this.ai.ak.a(paramGraphics, 13, 60, 90 - this.l * 33);
        paramGraphics.setClip(0, 0, 240, 320);
        this.ai.a(paramGraphics);
        this.ai.a(paramGraphics, "BACK", true);
        this.ai.a(paramGraphics, "OK", false);
        this.ai.al.a("shop");
        this.r = new e();
        this.ai.al.g = 1;
      }
      q(paramGraphics);
      return;
    case 2:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.z = 1;
      break;
    case 1:
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
      this.ai.al.c = true;
      this.v = true;
      break;
    case 99:
      this.ai.z += 1;
      this.r.a("missile");
      this.ai.d = 0;
      this.ai.al.g = 1;
      break;
    case 111:
    case 211:
      this.ai.a = 1;
      c(paramGraphics, this.ai.z, 230);
      if (this.t >= this.r.m[2])
        g(paramGraphics, this.s, this.r.m[2]);
      else
        c(paramGraphics, this.r.m[2]);
      this.v = true;
      return;
    case 199:
      this.ai.z += 1;
      this.r.a("plasma");
      this.ai.d = 1;
      this.ai.al.g = 2;
      break;
    case 299:
      this.ai.z += 1;
      this.r.a("arm");
      this.ai.d = 2;
      this.ai.al.g = 3;
      break;
    case 311:
      this.ai.a = 1;
      c(paramGraphics, this.ai.z, 230);
      if (this.t >= this.r.m[2])
        g(paramGraphics, this.s, this.r.m[2]);
      else
        c(paramGraphics, this.r.m[2]);
      this.v = true;
      return;
    case 999:
      this.ai.b = 5;
      this.r = null;
      return;
    default:
      if ((this.ai.z % 100 > 0) && (this.ai.z % 100 < 8) && (this.ai.z > 100))
      {
        b(paramGraphics, this.ai.z);
        this.ai.a(paramGraphics);
        this.ai.a(paramGraphics, "BACK", true);
        this.ai.a(paramGraphics, "OK", false);
        paramGraphics.setClip(0, 0, 178, 75);
        b(paramGraphics, this.ai.z, true, this.ai.d);
        this.s = this.ai.z;
        switch (this.ai.d)
        {
        case 0:
          this.ai.z = 110;
          break;
        case 1:
          this.ai.z = 210;
          break;
        case 2:
          this.ai.z = 310;
        }
        paramGraphics.setColor(0);
        this.ai.s = true;
        paramGraphics.setColor(65280);
        if (this.t - this.ai.aj.a > this.u)
          str = "[+";
        else
          str = "[";
        String str = str + (this.t - this.ai.aj.a - this.u) + "]";
        this.v = true;
        return;
      }
      this.v = true;
    }
    if ((this.ai.z == 100) || (this.ai.z == 200) || (this.ai.z == 300))
    {
      if (this.ai.x == 0)
        this.ai.q = true;
      this.ai.al.c = false;
      b(paramGraphics, this.ai.z);
      e(paramGraphics, this.ai.z, 190);
      this.ai.a(paramGraphics);
      this.ai.a(paramGraphics, "BACK", true);
      this.ai.a(paramGraphics, "OK", false);
    }
    else
    {
      c(paramGraphics, this.ai.z, 150);
    }
  }

  public void b(Graphics paramGraphics, int paramInt)
  {
    if (this.ai.q)
    {
      paramGraphics.setColor(7171414);
      paramGraphics.fillRect(6, 127, 226, 147);
      paramGraphics.setColor(9605802);
      paramGraphics.drawRect(6, 127, 225, 146);
      paramGraphics.setColor(9605717);
      paramGraphics.fillRect(10, 130, 72, 42);
      paramGraphics.setColor(16777130);
      paramGraphics.drawRect(10, 129, 72, 43);
      if (this.ai.r)
      {
        b(paramGraphics, 101, true, this.ai.d);
        this.ai.r = false;
      }
      else if (this.ai.a <= 6)
      {
        b(paramGraphics, this.ai.a + 100, true, this.ai.d);
      }
      else
      {
        b(paramGraphics, this.ai.a - 1 + 100, true, this.ai.d);
      }
    }
    this.ai.q = false;
  }

  public void run()
  {
    while (true)
      try
      {
        super.repaint();
        if ((this.ai.b == 25) && (this.ai.z == 4))
        {
          this.ai.am.g();
          this.ai.am.f();
        }
        super.serviceRepaints();
        Thread.sleep(((this.ai.b == 25) || (this.ai.b == 1)) ? 30 : 30);
      }
      catch (Exception localException)
      {
      }
  }

  public void c(Graphics paramGraphics, int paramInt)
  {
    this.ai.ak.a(paramGraphics, 12, 145, "Lack of " + (paramInt - this.t));
  }

  public void t(Graphics paramGraphics)
  {
    this.z = false;
    this.aa = 0;
    this.ab = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.af = -1;
    this.ag = -1;
    this.ai.ak.a(paramGraphics, 21, 0, 0);
  }

  public void j(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    d(paramGraphics, paramInt1, paramInt2);
  }

  public void u(Graphics paramGraphics)
  {
    switch (this.ai.z)
    {
    case 0:
      if (this.ai.x == 0)
      {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, 240, 320);
        this.ai.ak.a("logo", 0, paramGraphics, 48, 80);
        this.ai.ak.a("logo", 1, paramGraphics, 46, 161);
        this.ai.ak.a("intro");
        this.ai.ak.a(0, 30);
        this.ai.ak.d();
        this.ai.ak.a("select");
        for (int i1 = 0; i1 < 7; ++i1)
          this.ai.ak.a(i1, 6 + i1);
        this.ai.ak.d();
      }
      if (this.ai.x != 8)
        break label211;
      this.ai.z += 1;
      break;
    case 1:
      if (this.ai.x == 0)
      {
        this.ai.a("m_front", 0);
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 320);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 0, 240, 40);
        paramGraphics.drawLine(0, 42, 240, 42);
        paramGraphics.drawLine(0, 45, 240, 45);
        paramGraphics.fillRect(0, 50, 240, 6);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        this.ai.ak.a(paramGraphics, 3, 0, 0);
        this.ai.ak.a(paramGraphics, 3, 0, 280);
        this.ai.ak.a(paramGraphics, 4, 0, 60);
        this.ai.ak.a(paramGraphics, 5, 27, 25);
        this.ai.ak.a("logo", 2, paramGraphics, 0, 300);
      }
      if (this.ai.x % 10 < 5)
      {
        this.ai.ak.a(paramGraphics, 30, 0, 80);
        break label475:
      }
      this.ai.ak.a(paramGraphics, 62, 264, "Press Any Key");
      break;
    case 2:
      label211: label475: this.ai.am.bd = 0;
      if (this.ai.x < 21)
      {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 60, 240, 240);
        paramGraphics.setColor(4802901);
        paramGraphics.fillRect(0, 119, 240, 30);
        paramGraphics.fillRect(0, 171, 240, 10);
        paramGraphics.fillRect(0, 205, 240, 30);
        paramGraphics.setClip(0, 80 + 5 * this.ai.x, 240, 200 - 10 * this.ai.x);
        this.ai.ak.a(paramGraphics, 30, 0, 80);
        paramGraphics.setClip(0, 0, 240, 320);
        this.ai.ak.a(paramGraphics, 4, 0, 60 + 5 * this.ai.x);
        this.ai.ak.a(paramGraphics, 3, 0, 280 - 5 * this.ai.x);
      }
      if (this.ai.x != 20)
        break label708;
      this.ai.ak.a(30);
      this.ai.b = 3;
    }
    label708:
  }

  public void k(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.o = paramInt2;
    this.p = paramInt1;
    a(paramGraphics, paramInt1, paramInt2);
  }

  public void v(Graphics paramGraphics)
  {
    this.ai.aj.b();
    this.ai.aj.b(this.ai.al);
    this.ai.b = 5;
  }
}