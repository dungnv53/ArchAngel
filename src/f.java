import java.util.Random;
import javax.microedition.lcdui.Graphics;

/**
 * 
 * @author dung
 *
 */
public class f
{
  public ArchAngel a;
  public d b;
  public c c;
  public Random d = new Random();
  public String e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public int l = 0;
  public String m;
  public int n;
  public int o;
  public int p = 0;
  public String q;
  public int r;
  public int s;
  public int t;
  public int u;
  public int v;
  public int w;
  public int x;
  public int y;
  public int z;
  public int aa;
  public final byte ab = 0;
  public final byte ac = 1;
  public final byte ad = 2;
  public static g[] ae = new g[18];
  public int af = 0;
  public int ag = 0;
  public int ah = 0;
  public int ai;
  public int aj = -1;
  public int ak = 0;
  public int al = 0;
  public int am = 0;
  public int an = 0;
  public int ao = 0;
  public int ap = 0;
  public int aq = 0;
  public int ar = 0;
  public int as = 0;
  public int at;
  public int au = 0;
  public int av = 90;
  public int aw = 20;
  public int ax = 0;
  public boolean ay = false;
  public boolean az = false;
  public boolean a0 = false;
  public boolean a1 = false;
  public boolean a2 = false;
  public int a3 = 0;
  public int a4 = 0;
  public int[] a5 = new int[5];
  public int[] a6 = { 187, 232, 304 };
  public boolean[] a7 = new boolean[4];
  public int a8;
  public int a9;
  public int ba;
  public int bb = 90;
  public int bc = 169;
  public int bd;
  public int be;
  public int bf;
  public boolean bg;
  public boolean bh;
  public int bi;
  public int bj;
  public int bk;
  public boolean bl = false;
  public int bm = -1;
  public int bn = 0;
  public int bo = 0;
  public int bp = 64;
  public int bq = 0;
  public int br = 0;
  public static byte[] bs = { 64, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 62, 62, 62, 62, 61, 61, 61, 60, 60, 60, 59, 59, 58, 58, 58, 57, 57, 56, 55, 55, 54, 54, 53, 53, 52, 51, 51, 50, 49, 49, 48, 47, 46, 46, 45, 44, 43, 42, 41, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 31, 30, 29, 28, 27, 26, 25, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 8, 7, 6, 5, 4, 3, 2, 1 };
  public static byte[] bt = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 17, 18, 19, 20, 22, 23, 24, 25, 27, 28, 29, 31, 32, 34, 35, 36, 38, 39, 41, 43, 44, 46, 48, 50, 51, 53, 55, 57, 59, 61, 64 };
  public int[][] bu = new int[3][2];
  public int bv;
  public int bw;
  public int bx;
  public int by;
  public int bz;
  public int b0;
  public int b1;
  public int b2;
  public int b3;
  public int b4;
  public int b5;
  public int b6;
  public int b7;
  public int b8;
  public int b9;
  public int ca;
  public int cb = 0;
  public int cc = 0;

  /**
   * 
   * @param paramg
   * @param paramInt
   */
  public void a(g paramg, int paramInt)
  {
    int i2;
    if ((i2 = paramg.c) == 0)
      return;
    paramg.l += -1;
    if ((i2 <= 6) && (paramg.l <= 0))
    {
      paramg.c = 0;
      return;
    }
    paramg.a += paramg.h;
    paramg.b += paramg.i;
    int i3;
    int i1;
    switch (i2)
    {
    case 9:
      if (this.aa == 1)
      {
        if (this.a1 == true)
        {
          paramg.a = this.r;
          paramg.b = this.s;
          paramg.e = 99999;
          paramg.h = 0;
          paramg.i = 0;
          this.a1 = false;
        }
        this.f = a(b(paramg.a, paramg.b), this.av);
        this.ca = (Math.abs(paramg.a) + Math.abs(paramg.b) - 200);
      }
      if ((this.ca <= 0) && (this.aa == 1))
      {
        this.ca = 0;
        paramg.c = 0;
        this.b.a("etc");
        this.b.a(1, 112);
        this.b.d();
        this.b.a("aa");
        for (i3 = 11; i3 < 19; i3++)
          this.b.a(i3, 24 + i3);
        this.b.d();
        this.bi = 2;
        this.aa = 2;
        this.ap = 0;
      }
      break;
    case 10:
      if (paramg.d == 8)
      {
        paramg.c = 0;
        this.ah += -1;
        return;
      }
      if ((paramg.d >= 7) && (paramg.f > -20) && (paramg.f < 20))
      {
        this.au += 2;
        paramg.c = 0;
        this.ah += -1;
        this.c.j -= 50;
        b(false);
        if (this.c.j <= 0)
          d();
      }
      if (this.bi == 2)
      {
        paramg.c = 0;
        this.ah = 2;
      }
      break;
    case 14:
      if (paramg.l <= 0)
        paramg.l = c(paramg, paramInt);
      break;
    case 13:
      if (paramg.l <= 0)
        paramg.l = b(paramg, paramInt);
      if (this.bi == 2)
      {
        this.ag = 2;
        paramg.c = 0;
      }
      break;
    case 12:
      if (paramg.l <= 0)
      {
        paramg.c = 0;
        this.af += -1;
        return;
      }
      if ((this.bi == 3) && (this.a.n == true))
      {
        if (paramg.n == true)
        {
          paramg.n = false;
          paramg.c = 0;
          this.af += -1;
          this.au += 3;
          this.c.a(paramg.m);
          if (this.c.j <= 0)
            d();
        }
      }
      else if (paramg.e < 150)
      {
        paramg.c = 0;
        this.af += -1;
        this.au += 3;
        this.c.a(paramg.m);
        b(false);
        if (this.c.j <= 0)
          d();
      }
      break;
    case 11:
      if (paramg.l <= 0)
      {
        paramg.c = 0;
        return;
      }
      if ((i1 = paramg.k) == -1)
        return;
      if (ae[i1].c == 0)
      {
        paramg.c = 0;
        return;
      }
      if (((paramg.l & 0x1) == 0) && (Math.abs(paramg.a - ae[i1].a) + Math.abs(paramg.b - ae[i1].b) < 300))
      {
        paramg.c = 4;
        paramg.l = 2;
        ae[i1].m -= this.c.s;
        this.a.ae = (40 * ae[i1].m / this.n);
        if (ae[i1].m <= 0)
        {
          ae[i1].c = 7;
          ae[i1].l = 4;
        }
      }
      break;
    case 1:
      if (paramg.l <= 0)
      {
        paramg.c = 0;
        return;
      }
      if ((i1 = paramg.k) == -1)
        return;
      if (ae[i1].c == 0)
      {
        paramg.c = 0;
        return;
      }
      if (this.c.o > 0)
        a(paramg, ae[i1].a, ae[i1].b);
      if (Math.abs(paramg.a - ae[i1].a) + Math.abs(paramg.b - ae[i1].b) < 300)
      {
        paramg.c = 4;
        paramg.l = 2;
        ae[i1].m -= this.c.n;
        if (ae[i1].m <= 0)
        {
          ae[i1].c = 8;
          ae[i1].l = 4;
        }
      }
      break;
    case 6:
      for (i3 = 0; i3 < 18; i3++)
      {
        if ((ae[i3].c < 13) || (!a(paramg, ae[i3])))
          continue;
        paramg.c = 5;
        paramg.l = 2;
        return;
      }
      break;
    case 8:
      if (paramg.l <= 0)
      {
        this.ag += -1;
        paramg.c = 0;
        this.u += 1;
      }
      break;
    case 7:
      if (paramg.l <= 0)
      {
        this.ag += -1;
        paramg.c = 0;
        this.t += 1;
        this.a.ab = 6;
        this.g = (this.t * this.i + this.u * this.h);
      }
      break;
    case 2:
    case 3:
    case 4:
    case 5:
    }
  }

  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @return
   */
  public int a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 - paramInt1;
    if (i1 > 180)
      i1 -= 360;
    if (i1 < -180)
      i1 = 360 + i1;
    return i1;
  }

  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(this.bj);
    switch (paramInt4 & 0x3)
    {
    case 0:
      paramGraphics.fillRect(paramInt1, paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2, paramInt3, paramInt3);
      break;
    case 1:
      paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2, paramInt3, paramInt3);
      break;
    case 2:
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2 - paramInt3, paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt3);
      break;
    case 3:
      paramGraphics.fillRect(paramInt1 - paramInt3, paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
      paramGraphics.fillRect(paramInt1, paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
      break;
    }
    paramGraphics.setColor(this.bk);
    paramGraphics.fillRect(paramInt1 - (paramInt3 >> 1), paramInt2 - (paramInt3 >> 1), paramInt3, paramInt3);
  }
  /**
   * 
   * @param paramBoolean
   */
  public void a(boolean paramBoolean)
  {
    if (!this.bg)
      this.aq = (paramBoolean ? -4 : 4);
  }
  /**
   * 
   */
  public void a()
  {
    this.bb = 90;
    this.bc = 169;
    this.a5[1] = -82;
    this.a.ae = 40;
    this.f = (this.ax = this.al = this.am = this.as = this.aq = this.ar = this.an = this.ao = 0);
    this.aw = 20;
    this.av = 90;
    this.ap = 0;
    this.au = 0;
    this.ba = 0;
    this.a8 = 0;
    this.bd = 0;
    this.aa = 0;
    this.az = (this.ay = this.a0 = this.a2 = 0);
    this.a3 = 20;
    this.a4 = 0;
    this.t = 0;
    this.u = 0;
    this.v = (this.w = 0);
    this.at = 262143;
    this.af = (this.ag = this.ah = 0);
    this.a.ab = 25;
    this.bl = false;
    this.bm = -1;
    this.bn = 0;
    for (int i1 = 0; i1 < 18; i1++)
      ae[i1].c = 0;
    b();
    this.bi = 1;
    this.bg = false;
    this.bh = false;
    d(9, 0);
  }
  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @return
   */
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return b(paramInt1) * paramInt2 - c(paramInt1) * paramInt3 >> 6;
  }
  /**
   * 
   */
  public void b()
  {
    for (int i1 = 0; i1 < 2; i1++)
    {
      this.bu[i1][0] = (600 * i1 * 2);
      this.bu[i1][1] = (600 * (i1 * 2 + 1));
    }
  }
  /**
   * 
   * @param paramGraphics
   */
  public void a(Graphics paramGraphics)
  {
    this.a.l = true;
    c(paramGraphics);
    d(paramGraphics);
    g(paramGraphics);
    b(paramGraphics);
    f(paramGraphics);
  }
  /**
   * 
   * @param paramGraphics
   * @param paramg
   */
  public void a(Graphics paramGraphics, g paramg)
  {
    int[] arrayOfInt = { 255, 16711680, 16776960, 16776960 };
    int i5 = paramg.c;
    int i3 = paramg.a;
    int i4 = paramg.b;
    int i1 = a(450 - this.av, i3, i4);
    int i2 = b(450 - this.av, i3, i4);
    if ((i5 >= 11) && ((paramg.e = c(i3, i4)) < 4284))
    {
      i3 = i1 >> 8;
      i4 = i2 >> 8;
      paramGraphics.setColor(arrayOfInt[(i5 - 11)]);
      paramGraphics.fillRect(28 + i3, 21 - i4, 3, 3);
    }
    i2 += 300;
    int i6 = i2 + 151;
    if (i6 > 0)
    {
      paramg.g = (20000 / i6);
      paramg.f = (i1 * 151 / i6);
      paramg.d = (7 - (i2 >> 9));
    }
    else
    {
      paramg.d = 8;
    }
    paramg.a -= this.al;
    paramg.b -= this.am;
  }
  /**
   * 
   * @param paramGraphics
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @param paramInt4
   * @param paramBoolean
   */
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (paramInt3 > 20)
      paramInt3 = 20;
    int i1 = paramInt1 - (paramInt3 >> 1);
    int i2 = paramInt2 - (paramInt3 >> 1);
    if (paramBoolean)
    {
      this.b.a(paramGraphics, 93 + paramInt4, i1, i2);
      this.be = i1;
      this.bf = i2;
    }
    else
    {
      this.b.a(paramGraphics, 84 + (29 - paramInt4), i1, i2);
    }
  }
  /**
   * 
   * @param paramGraphics
   */
  public void b(Graphics paramGraphics)
  {
    int i6 = 0;
    paramGraphics.setColor(65280);
    this.ai = (85 + this.as * 7);
    if ((this.aj >= 0) && (ae[this.aj].c == 0))
      this.aj = -1;
    int i1;
    int i2;
    for (int i7 = 0; i7 < 18; i7++)
    {
      int i4 = ae[i7].c;
      int i5 = ae[i7].d;
      if ((i4 < 13) || (i5 < 1) || (i5 >= 6))
        continue;
      i1 = ae[i7].f + 88 + 32;
      i2 = 158 - ae[i7].g;
      this.bw = i1;
      this.bx = i2;
      if ((i1 <= this.ai) || (i1 >= this.ai + 88) || (i2 <= 87) || (i2 >= 188))
        continue;
      if (this.aj == -1)
      {
        i6 = 1;
        this.aj = i7;
        this.ak = 5;
      }
      else
      {
        if (this.aj != i7)
          continue;
        i6 = 1;
        if (this.ak <= 0)
          continue;
        this.ak += -1;
      }
    }
    if (i6 != 0)
    {
      if (this.aj >= 0)
      {
        i1 = ae[this.aj].f + 88 + 32;
        i2 = 155 - ae[this.aj].g;
        int i3 = ae[this.aj].d * 8 + 4;
        if (this.bi == 1)
          if (ae[this.aj].d < 4)
            this.b.a(paramGraphics, 82, i1 - 10, i2 - 6);
          else
            this.b.a(paramGraphics, 81, i1 - 17, i2 - 12);
      }
    }
    else
    {
      this.aj = -1;
      if (this.bi == 1)
        this.b.a(paramGraphics, 83, this.ai, 136);
    }
  }
  /**
   * 
   * @param paramGraphics
   */
  public void c(Graphics paramGraphics)
  {
    int i1 = -this.av * 4 + 360;
    int i2 = this.at >> 14;
    if (i2 < 0)
      i2 = 0;
    this.b.a(paramGraphics, 7, this.a5[0], 27);
    this.b.a(paramGraphics, 7, this.a5[0] + (this.a7[0] != 0 ? -240 : 240), 27);
    this.b.b(paramGraphics, 8, this.a5[1], 166);
  }
  /**
   * 
   * @param paramg1
   * @param paramg2
   * @return
   */
  public boolean a(g paramg1, g paramg2)
  {
    if (Math.abs(paramg1.a - paramg2.a) + Math.abs(paramg1.b - paramg2.b) < 200)
    {
      paramg2.m -= paramg1.m;
      paramg2.l += 5;
      if (paramg2.m <= 0)
        if (paramg2.c == 14)
        {
          paramg2.c = 7;
          paramg2.l = 4;
        }
        else
        {
          paramg2.c = 8;
          paramg2.l = 2;
        }
      return true;
    }
    return false;
  }
  /**
   * 
   * @param paramGraphics
   */
  public void d(Graphics paramGraphics)
  {
    this.bv += 1;
    int i2 = this.bv / (5 - this.a8) % 3;
    int[][] arrayOfInt = { new int[3], { 1, 2, 3 }, { 2, 3, 4 } };
    for (int i1 = 0; i1 < 3; i1++)
    {
      this.b.b(paramGraphics, 9 + i1 * 3 + i2, this.a5[(i1 + 2)], this.a6[i1] - arrayOfInt[i1][i2]);
      this.b.b(paramGraphics, 9 + i1 * 3 + i2, this.a5[(i1 + 2)] + (this.a7[(i1 + 1)] != 0 ? -240 : 240), this.a6[i1] - arrayOfInt[i1][i2]);
    }
    if ((this.a.ad == 2) || (this.a.b == 0))
      this.b.a(paramGraphics, 18 + i2, 0, 166);
  }
  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @return
   */
  public int b(int paramInt1, int paramInt2)
  {
    int i4 = 90;
    if (paramInt1 == 0)
    {
      if (paramInt2 > 0)
        return 90;
      return 270;
    }
    if (paramInt2 == 0)
    {
      if (paramInt1 > 0)
        return 0;
      return 180;
    }
    int i1 = Math.abs(paramInt1);
    int i2 = Math.abs(paramInt2);
    int i3;
    if (i1 > i2)
      i3 = (i2 << 6) / i1;
    else
      i3 = (i1 << 6) / i2;
    int i5 = 0;
    int i6 = 45;
    if (i3 >= 64)
      i4 = 45;
    else
      for (int i7 = 0; i7 < 5; i7++)
      {
        i4 = i5 + i6 >> 1;
        if (i3 > bt[i4])
          i5 = i4;
        else
          i6 = i4;
      }
    if (i2 > i1)
      i4 = 90 - i4;
    if (paramInt1 < 0)
      i4 = 180 - i4;
    if (paramInt2 < 0)
      i4 = 360 - i4;
    return i4;
  }
  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @return
   */
  public int c(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (paramInt1 < 0)
      paramInt1 = -paramInt1;
    if (paramInt2 < 0)
      paramInt2 = -paramInt2;
    if (paramInt1 + paramInt2 == 0)
      return 0;
    if (paramInt1 > paramInt2)
      i1 = (18 - (paramInt1 << 3) / (paramInt1 + paramInt2)) * paramInt1;
    else
      i1 = (18 - (paramInt2 << 3) / (paramInt1 + paramInt2)) * paramInt2;
    return i1 / 10;
  }
  /**
   * 
   * @param paramGraphics
   * @param paramBoolean
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @param paramInt4
   * @param paramInt5
   */
  public void a(Graphics paramGraphics, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i4;
    int i3;
    int i1;
    int i2;
    if (paramBoolean)
    {
      this.b.c(paramGraphics, 71 + paramInt4, paramInt1, paramInt2);
      for (i4 = 0; i4 < paramInt5; i4++)
      {
        i3 = Math.abs(this.d.nextInt() % 7);
        i1 = Math.abs(this.d.nextInt() % paramInt3) - (paramInt3 >> 1);
        i2 = Math.abs(this.d.nextInt() % paramInt3) - (paramInt3 >> 1);
        if ((i4 & 0x1) == 1)
          this.b.c(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
        else
          this.b.c(paramGraphics, 71 + i3, paramInt1 + i1, paramInt2 + i2);
      }
    }
    else
    {
      this.b.c(paramGraphics, 71 + paramInt4, paramInt1 + 5, paramInt2 - 25);
      for (i4 = 0; i4 < paramInt5; i4++)
      {
        i3 = Math.abs(this.d.nextInt() % 7);
        i1 = Math.abs(this.d.nextInt() % paramInt3) - (paramInt3 >> 1);
        i2 = Math.abs(this.d.nextInt() % paramInt3) - (paramInt3 >> 1);
        if ((i4 & 0x1) == 1)
          this.b.c(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
        else
          this.b.c(paramGraphics, 71 + i3, paramInt1 + i1 + 5, paramInt2 + i2 - 25);
      }
    }
  }
  /**
   * 
   * @param paramInt
   * @return
   */
  public int a(int paramInt)
  {
    if (paramInt < 0)
      paramInt += 360;
    if (paramInt >= 360)
      paramInt -= 360;
    if (paramInt < 0)
      paramInt += 360;
    if (paramInt >= 360)
      paramInt -= 360;
    if ((paramInt >= 0) && (paramInt < 90))
      return bs[paramInt];
    if ((paramInt >= 90) && (paramInt < 180))
      return -bs[(180 - paramInt)];
    if ((paramInt >= 180) && (paramInt < 270))
      return -bs[(paramInt - 180)];
    return bs[(360 - paramInt)];
  }
  /**
   * 
   * @param paramGraphics
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @param paramInt4
   */
  public void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt1 - (paramInt3 >> 1);
    int i2 = paramInt2 - (paramInt3 >> 1);
    if (paramInt4 < 6)
      this.b.c(paramGraphics, 102 + paramInt4, i1 - 5, i2);
  }
  /**
   * 
   * @param paramGraphics
   */
  public void e(Graphics paramGraphics)
  {
    byte[][] arrayOfByte1 = { { 5, -8 }, { 2, -18 }, { 6, -22 }, { 3, -25 } };
    byte[][] arrayOfByte2 = { new byte[2], { 1, 6 }, { -2, -10 }, { 4, 8 }, { 1, -12 }, { -1, -4 }, { 0, 4 }, { 0, -6 }, { 1, 5 } };
    int i1 = this.ap / 3;
    int i2 = this.ap / 4 % 8;
    if (this.ba < 3)
    {
      if (this.bd < 5)
        this.z = this.ba;
      else
        this.z = (this.ba + 2);
    }
    else if (this.bd < 5)
      this.z = (this.ba + 2);
    else
      this.z = (this.ba + 4);
    switch (this.bi)
    {
    case 1:
      this.b.c(paramGraphics, 24 + this.z, this.bb + 30, this.bc + 11);
      if ((this.ay == true) && (this.ap % 2 == 0))
        this.b.c(paramGraphics, 80, 120, 165);
      if (this.a.z != 3)
      {
        paramGraphics.setClip(this.bb + 10 + arrayOfByte2[this.z][0], this.bc + 11 + arrayOfByte2[this.z][1], 12, 11);
        this.b.a(paramGraphics, 33, this.bb + 10 + arrayOfByte2[this.z][0], this.bc + 11 + arrayOfByte2[this.z][1] - 11 * (this.ap % 2));
        paramGraphics.setClip(this.bb + 38 - arrayOfByte2[this.z][0], this.bc + 11 - arrayOfByte2[this.z][1], 12, 11);
        this.b.a(paramGraphics, 34, this.bb + 38 - arrayOfByte2[this.z][0], this.bc + 11 - arrayOfByte2[this.z][1] - 11 * (this.ap % 2));
        paramGraphics.setClip(0, 0, 240, 300);
      }
      this.a.m = true;
      break;
    case 2:
      this.a.c();
      paramGraphics.setClip(0, 0, 240, 300);
      if (i1 / 2 % 2 == 0)
        this.b.a(paramGraphics, 112, 66, 103);
      this.aw = 10;
      this.a8 = 0;
      this.ay = false;
      this.bg = true;
      if (i1 < 5)
        if (i1 == 0)
          this.b.a(paramGraphics, 24, this.bb, this.bc);
        else
          this.b.a(paramGraphics, 24 + i1 + 10, this.bb + arrayOfByte1[(i1 - 1)][0], this.bc + arrayOfByte1[(i1 - 1)][1]);
      if (i1 == 5)
      {
        this.b.a(112);
        for (int i3 = 0; i3 < 11; i3++)
          this.b.a(24 + i3);
        for (i3 = 0; i3 < 9; i3++)
        {
          this.b.a(53 + i3);
          this.b.a(44 + i3);
        }
        for (i3 = 10; i3 < 13; i3++)
          this.b.a(71 + i3);
        for (i3 = 18; i3 < 24; i3++)
          this.b.a(84 + i3);
        this.b.a(paramGraphics, 38, this.bb + arrayOfByte1[3][0], this.bc + arrayOfByte1[3][1]);
        this.bb = 93;
        this.bc = 144;
        System.gc();
        this.b.a("boss" + this.a.ac);
        for (i3 = 0; i3 < 7; i3++)
          this.b.a(i3, 62 + i3);
        this.b.d();
        this.b.a("plasma");
        for (i3 = 0; i3 < 18; i3++)
          this.b.a(i3, 84 + i3);
        this.b.d();
        this.bi = 3;
      }
      break;
    case 3:
      switch (this.ba)
      {
      case 1:
        this.bb -= 10;
        if (this.bb < 33)
          this.bb = 33;
        break;
      case 2:
        this.bb += 10;
        if (this.bb > 153)
          this.bb = 153;
        break;
      case 3:
      case 4:
        this.ba = 0;
        break;
      }
      switch (this.a9)
      {
      case 1:
        this.bc -= 10;
        if (this.bc < 104)
          this.bc = 104;
        break;
      case 2:
        this.bc += 10;
        if (this.bc > 174)
          this.bc = 174;
        break;
      }
      this.b.a(paramGraphics, 38 + this.ba, this.bb, this.bc);
      if (this.ba == 1)
      {
        paramGraphics.setClip(this.bb + 14, this.bc + 21, 19, 14);
        this.b.a(paramGraphics, 42, this.bb + 14, this.bc + 7);
      }
      else if (this.ba == 2)
      {
        paramGraphics.setClip(this.bb + 20, this.bc + 21, 19, 14);
        this.b.a(paramGraphics, 42, this.bb + 20, this.bc + 21);
      }
      else
      {
        paramGraphics.setClip(this.bb + 16, this.bc + 21, 22, 14);
        this.b.a(paramGraphics, 41, this.bb + 16, this.bc + 21 - 15 * (i1 / 3 % 2));
      }
      paramGraphics.setClip(0, 0, 240, 300);
      break;
    }
  }
  /**
   * 
   * @param paramInt
   * @return
   */
  public int b(int paramInt)
  {
    if (paramInt == this.bo)
      return this.bp;
    this.bo = paramInt;
    return this.bp = a(paramInt);
  }
  /**
   * 
   * @param paramGraphics
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @param paramInt4
   * @param paramInt5
   */
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramGraphics.setColor(paramInt5);
    int i1 = paramInt1 - paramInt3;
    int i2 = paramInt2 - (paramInt3 >> 1);
    paramGraphics.fillRect(i1, i2, paramInt3 << 1, paramInt3);
    i1 = paramInt1 - (paramInt3 >> 1);
    i2 = paramInt2 - paramInt3;
    paramGraphics.fillRect(i1, i2, paramInt3, paramInt3 << 1);
    paramGraphics.setColor(paramInt4);
    i1 = paramInt1 - (paramInt3 >> 1);
    i2 = paramInt2 - (paramInt3 >> 1);
    paramGraphics.fillRect(i1, i2, paramInt3, paramInt3);
  }
  /**
   * 
   * @param paramGraphics
   */
  public void f(Graphics paramGraphics)
  {
    e(paramGraphics);
    if (this.au > 0)
    {
      this.b8 = (61 - this.bb);
      this.b9 = (94 - this.bc);
      a(paramGraphics, false, 88 - this.b8, 133 - this.b9, 30, 8, 4);
      if ((this.bi == 1) && (!this.ay))
        this.a.a("s_explo", 1);
      if ((this.bi == 3) && (!this.az))
        this.a.a("s_explo", 1);
      this.au += -1;
      if ((this.a.n == true) && (this.au == 2) && (this.az == true))
        d(false);
    }
  }
  /**
   * 
   */
  public void c()
  {
    if (this.c.o <= 0)
    {
      this.a.x = 1;
      this.a.j = true;
    }
    else
    {
      this.a.a("s_missile", 1);
    }
    this.a0 = true;
  }
  /**
   * 
   * @param paramg
   * @param paramInt
   * @return
   */
  public int b(g paramg, int paramInt)
  {
    int i3 = 8;
    int i4;
    int i1;
    if (paramg.e > 4000)
    {
      i4 = b(-paramg.a, -paramg.b);
      i1 = 20;
    }
    else
    {
      i1 = (Math.abs(this.d.nextInt()) & 0x7) + 5;
      int i2 = Math.abs(this.d.nextInt() & 0x7);
      i3 = Math.abs(paramg.e - 3500) >> 8;
      if (i2 >= i3)
      {
        if (this.af < 1)
          d(12, paramInt);
        i1 = 10;
      }
      i4 = paramg.j;
      i4 += (i2 << 2) - 14;
      if (i4 < 0)
        i4 += 360;
      if (i4 >= 360)
        i4 -= 360;
    }
    paramg.h = (this.al - this.an + b(i4));
    paramg.i = (this.am - this.ao + c(i4));
    paramg.j = i4;
    return i1;
  }
  /**
   * 
   * @param paramBoolean
   */
  public void b(boolean paramBoolean)
  {
    this.ay = paramBoolean;
    if (this.ay == true)
      this.a.a("s_gun", 0);
    else
      this.a.c();
  }
  /**
   * 
   * @param paramInt
   * @return
   */
  public int c(int paramInt)
  {
    if (paramInt == this.bq)
      return this.br;
    this.bq = paramInt;
    return this.br = a(90 - paramInt);
  }
  /**
   * 
   * @param paramBoolean
   */
  public void c(boolean paramBoolean)
  {
    if (!this.bg)
      this.ar = (paramBoolean ? 20 : -20);
  }
  /**
   * 
   * @param paramInt
   */
  public void d(int paramInt)
  {
    if (!this.bg)
      if (paramInt == 1)
      {
        this.a8 += 1;
        if (this.a8 > 4)
          this.a8 = 4;
      }
      else if (paramInt == 2)
      {
        this.a8 += -1;
        if (this.a8 < 0)
          this.a8 = 0;
      }
  }
  /**
   * 
   * @param paramArchAngel
   * @param paramd
   */
  public f(ArchAngel paramArchAngel, d paramd)
  {
    this.a = paramArchAngel;
    this.b = paramd;
    this.c = paramArchAngel.aj;
    for (int i1 = 0; i1 < 18; i1++)
      ae[i1] = new g();
  }
  /**
   * 
   * @param paramg
   * @param paramInt1
   * @param paramInt2
   */
  public void a(g paramg, int paramInt1, int paramInt2)
  {
    int i1 = paramg.a;
    int i2 = paramg.b;
    int i3 = paramg.h;
    int i4 = paramg.i;
    int i5 = paramg.j;
    int i6 = 10;
    int i7 = i3 * (paramInt2 - i2) - i4 * (paramInt1 - i1);
    if (i7 < 0)
      i6 = -i6;
    i5 += i6;
    paramg.h = (6 * b(i5));
    paramg.i = (6 * c(i5));
    paramg.j = i5;
  }
  /**
   * 
   */
  public void d()
  {
    this.au = 1000;
    this.c.j = 0;
    this.ay = false;
    this.az = false;
    this.a0 = false;
    this.a.ab = 7;
    e();
    this.ar = -20;
  }
  /**
   * 
   * @param paramInt
   */
  public void e(int paramInt)
  {
    int i1;
    if (!this.bg)
    {
      if (paramInt == 2)
      {
        this.bd += 1;
        this.a5[0] -= 4;
        if (this.a5[0] < -240)
          this.a5[0] = 0;
        if (this.a5[0] < 0)
          this.a7[0] = false;
        this.a5[1] -= 6;
        if (this.a5[1] < -340)
          this.a5[1] = 240;
        for (i1 = 0; i1 < 3; i1++)
        {
          this.a5[(i1 + 2)] -= 6 - 2 * i1;
          if (this.a5[(i1 + 2)] < -240)
            this.a5[(i1 + 2)] = 0;
          if (this.a5[(i1 + 2)] >= 0)
            continue;
          this.a7[(i1 + 1)] = false;
        }
      }
      else if (paramInt == 1)
      {
        this.bd += 1;
        this.a5[0] += 4;
        if (this.a5[0] > 240)
          this.a5[0] = 0;
        if (this.a5[0] > 0)
          this.a7[0] = true;
        this.a5[1] += 6;
        if (this.a5[1] > 240)
          this.a5[1] = -340;
        for (i1 = 0; i1 < 3; i1++)
        {
          this.a5[(i1 + 2)] += 6 - 2 * i1;
          if (this.a5[(i1 + 2)] > 240)
            this.a5[(i1 + 2)] = 0;
          if (this.a5[(i1 + 2)] <= 0)
            continue;
          this.a7[(i1 + 1)] = true;
        }
      }
      if (paramInt == 4)
      {
        this.bd += 1;
        this.a5[0] -= 4;
        if (this.a5[0] < -240)
          this.a5[0] = 0;
        if (this.a5[0] < 0)
          this.a7[0] = false;
        this.a5[1] -= 2;
        if (this.a5[1] < -340)
          this.a5[1] = 240;
        for (i1 = 0; i1 < 3; i1++)
        {
          this.a5[(i1 + 2)] -= 2 + 2 * i1;
          if (this.a5[(i1 + 2)] < -240)
            this.a5[(i1 + 2)] = 0;
          if (this.a5[(i1 + 2)] >= 0)
            continue;
          this.a7[(i1 + 1)] = false;
        }
      }
      else if (paramInt == 3)
      {
        this.bd += 1;
        this.a5[0] += 4;
        if (this.a5[0] > 240)
          this.a5[0] = 0;
        if (this.a5[0] > 0)
          this.a7[0] = true;
        this.a5[1] += 2;
        if (this.a5[1] > 240)
          this.a5[1] = -340;
        for (i1 = 0; i1 < 3; i1++)
        {
          this.a5[(i1 + 2)] += 2 + 2 * i1;
          if (this.a5[(i1 + 2)] > 240)
            this.a5[(i1 + 2)] = 0;
          if (this.a5[(i1 + 2)] <= 0)
            continue;
          this.a7[(i1 + 1)] = true;
        }
      }
      else if (paramInt > 0)
      {
        this.bd += 1;
      }
    }
    else if (paramInt == 2)
    {
      if (this.bb >= 133)
      {
        this.x -= 2;
        if (this.x < -10)
          this.x = -10;
        this.a5[0] -= 2;
        if (this.a5[0] < -240)
          this.a5[0] = 0;
        if (this.a5[0] < 0)
          this.a7[0] = false;
        this.a5[1] -= 1;
        if (this.a5[1] < -340)
          this.a5[1] = 240;
        for (i1 = 0; i1 < 3; i1++)
        {
          this.a5[(i1 + 2)] -= 2 + 1 * i1;
          if (this.a5[(i1 + 2)] < -240)
            this.a5[(i1 + 2)] = 0;
          if (this.a5[(i1 + 2)] >= 0)
            continue;
          this.a7[(i1 + 1)] = false;
        }
      }
    }
    else if ((paramInt == 1) && (this.bb <= 53))
    {
      this.x += 2;
      if (this.x > 10)
        this.x = 10;
      this.a5[0] += 2;
      if (this.a5[0] > 240)
        this.a5[0] = 0;
      if (this.a5[0] > 0)
        this.a7[0] = true;
      this.a5[1] += 1;
      if (this.a5[1] > 240)
        this.a5[1] = -340;
      for (i1 = 0; i1 < 3; i1++)
      {
        this.a5[(i1 + 2)] += 2 + 1 * i1;
        if (this.a5[(i1 + 2)] > 240)
          this.a5[(i1 + 2)] = 0;
        if (this.a5[(i1 + 2)] <= 0)
          continue;
        this.a7[(i1 + 1)] = true;
      }
    }
  }
  /**
   * 
   * @param paramGraphics
   */
  public void g(Graphics paramGraphics)
  {
    this.b.a(paramGraphics, 21, 0, 0);
    for (int i1 = 0; i1 < 18; i1++)
    {
      if (ae[i1].c == 0)
        continue;
      a(paramGraphics, ae[i1]);
    }
    paramGraphics.setClip(0, 50, 240, 250);
    for (i1 = 0; i1 < 9; i1++)
      for (int i2 = 0; i2 < 18; i2++)
      {
        if ((ae[i2].c == 0) || (ae[i2].d != i1))
          continue;
        b(paramGraphics, ae[i2]);
      }
  }
  /**
   * 
   */
  public void e()
  {
    this.aq = 0;
    this.ar = 0;
    this.an = (this.ao = 0);
  }
  /**
   * 
   */
  public void f()
  {
    int i2 = 0;
    this.ap += 1;
    this.bn += -1;
    for (int i3 = 0; i3 < 18; i3++)
      a(ae[i3], i3);
    if ((this.ap & 0x3) == 0)
    {
      if ((this.bi == 3) && (this.v == 0))
      {
        i2 = 14;
        if (i2 > 0)
          d(i2, 0);
      }
      if ((this.ag < 2) && (this.bi == 1))
      {
        i2 = 13;
        if (i2 > 0)
          d(i2, 0);
      }
    }
    int i1 = this.at >> 10;
    if (i1 != this.cb)
    {
      if ((this.ah < 2) && (i2 != 14) && (this.bi == 1))
        d(10, 0);
      this.cb = i1;
    }
  }
  /**
   * 
   */
  public void g()
  {
    d(this.a9);
    if ((this.x <= 10) && (this.x >= -10))
      e(this.ba);
    this.as += this.aq;
    if (this.aq == 0)
    {
      if (this.as > 0)
        this.as += -1;
      if (this.as < 0)
        this.as += 1;
    }
    if (this.as > 4)
      this.as = 4;
    if (this.as < -4)
      this.as = -4;
    this.av -= this.as;
    if (this.av < 0)
      this.av += 360;
    if (this.av >= 360)
      this.av -= 360;
    this.al = ((b(this.av) * this.aw >> 6) + this.an);
    this.am = ((c(this.av) * this.aw >> 6) + this.ao);
    this.at -= this.am;
    this.aw += this.ar;
    if (this.aw > 140)
      this.aw = 140;
    if (this.aw < 20)
      this.aw = 20;
    this.a3 += -1;
    this.a4 += -1;
    if ((this.ay) && (this.a4 <= 0) && (d(6, 0)) && (this.bn <= 0))
      this.bn = 12;
    int i1;
    if ((this.az) && (this.a.x % 5 == 0) && (this.a.n == true) && (this.c.t > 0))
    {
      i1 = this.aj;
      if ((this.aj < 0) || (this.ak > 0))
        i1 = -1;
      if (d(11, i1))
      {
        this.c.t += -1;
        if (this.c.t <= 0)
        {
          this.a.c();
          this.az = false;
        }
      }
    }
    if (this.a0)
    {
      if (this.c.o > 0)
      {
        i1 = this.aj;
        if ((this.aj < 0) || (this.ak > 0))
          i1 = -1;
        if (d(1, i1))
        {
          this.c.o += -1;
          if (this.c.o <= 0)
            this.a0 = false;
          this.a3 = 20;
        }
      }
      this.a0 = false;
    }
  }
  /**
   * 
   * @param paramBoolean
   */
  public void d(boolean paramBoolean)
  {
    if (this.a.ag == 1)
      this.az = (!this.az);
    else
      this.az = paramBoolean;
    if ((this.c.t > 0) && (this.a.n == true))
      if (this.az == true)
        this.a.a("s_plasma", 0);
      else
        this.a.c();
  }
  /**
   * 
   * @param paramg
   * @param paramInt
   * @return
   */
  public int c(g paramg, int paramInt)
  {
    int i3 = 8;
    int i5;
    if (this.a.ac < 4)
      i5 = 1;
    else
      i5 = 2;
    int i4;
    int i1;
    if (paramg.e > 4000)
    {
      i4 = b(-paramg.a, -paramg.b);
      i1 = 20;
    }
    else
    {
      i4 = paramg.j;
      i1 = (Math.abs(this.d.nextInt()) & 0x7) + 5;
      int i2 = Math.abs(this.d.nextInt() & 0x7);
      i3 = Math.abs(paramg.e - 3500) >> 9;
      if (i2 >= i3)
      {
        if (this.af < i5)
          d(12, paramInt);
        i1 = 4;
      }
      i4 = Math.abs(this.d.nextInt() % 18) * 10;
      if (i4 < 80)
        i4 = 80;
      if (i4 > 100)
        i4 = 100;
    }
    paramg.h = (this.al - this.an + b(i4) * 2);
    paramg.i = (this.am - this.ao + c(i4) * 2);
    paramg.j = i4;
    return i1;
  }
  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @return
   */
  public boolean d(int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < 18; i1++)
      if (ae[i1].c == 0)
        break;
    if (i1 == 18)
      return false;
    b(ae[i1], paramInt1, paramInt2);
    return true;
  }
  /**
   * 
   * @param paramg
   * @param paramInt1
   * @param paramInt2
   */
  public void b(g paramg, int paramInt1, int paramInt2)
  {
    paramg.m = 0;
    int i1;
    switch (paramInt1)
    {
    case 9:
      paramg.a = this.r;
      paramg.b = this.s;
      paramg.e = 99999;
      paramg.h = 0;
      paramg.i = 0;
      break;
    case 10:
      paramg.m = 50;
      i1 = (this.d.nextInt() & 0x1F) - 15;
      int i2 = (this.d.nextInt() & 0x7) + 63;
      paramg.a = (i2 * b(i1 + this.av));
      paramg.b = (i2 * c(i1 + this.av));
      paramg.h = (paramg.i = 0);
      paramg.e = i1;
      this.ah += 1;
      break;
    case 14:
      paramg.m = this.n;
      this.av = 90;
      i1 = 0;
      paramg.a = (60 * b(i1 + this.av));
      paramg.b = (60 * c(i1 + this.av));
      paramg.e = i1;
      paramg.h = (paramg.i = 0);
      paramg.j = this.av;
      paramg.l = 2;
      this.v += 1;
      paramg.d = 0;
      this.a.n = true;
      break;
    case 13:
      paramg.m = this.j;
      i1 = (this.d.nextInt() & 0x7F) - 63;
      paramg.a = (60 * b(i1 + this.av));
      paramg.b = (60 * c(i1 + this.av));
      paramg.e = i1;
      paramg.h = (paramg.i = 0);
      paramg.j = ((this.av + 180) % 360);
      paramg.l = 2;
      this.w += 1;
      this.ag += 1;
      break;
    case 12:
      paramg.a = ae[paramInt2].a;
      paramg.b = ae[paramInt2].b;
      paramg.e = c(paramg.a, paramg.b);
      i1 = paramg.j = b(-paramg.a + this.al, -paramg.b + this.am);
      paramg.h = (3 * b(i1) + this.al);
      paramg.i = (3 * c(i1) + this.am);
      paramg.l = 30;
      paramg.m = (ae[paramInt2].c == 14 ? this.o : this.k);
      this.af += 1;
      break;
    case 11:
      i1 = paramg.j = this.av;
      paramg.h = (6 * b(i1));
      paramg.i = (6 * c(i1));
      paramg.a = (b(this.av - 90) + paramg.h);
      paramg.b = (c(this.av - 90) + paramg.i);
      paramg.e = 64;
      paramg.k = paramInt2;
      paramg.l = 30;
      paramg.m = this.c.s;
      break;
    case 1:
      i1 = paramg.j = this.av;
      paramg.h = (6 * b(i1));
      paramg.i = (6 * c(i1));
      paramg.a = (b(this.av - 90) + paramg.h);
      paramg.b = (c(this.av - 90) + paramg.i);
      paramg.e = 64;
      paramg.k = paramInt2;
      paramg.l = 30;
      paramg.m = this.c.n;
      break;
    case 6:
      i1 = paramg.j = this.av;
      paramg.h = (6 * b(i1));
      paramg.i = (6 * c(i1));
      paramg.a = (b(this.av + 90) + paramg.h);
      paramg.b = (c(this.av + 90) + paramg.i);
      paramg.e = 64;
      paramg.l = (10 + this.cc);
      this.cc = (1 - this.cc);
      paramg.m = (this.c.n / 10);
      break;
    }
    paramg.c = paramInt1;
  }
  /**
   * 
   * @param paramInt1
   * @param paramInt2
   * @param paramInt3
   * @return
   */
  public int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return c(paramInt1) * paramInt2 + b(paramInt1) * paramInt3 >> 6;
  }
  /**
   * 
   * @param paramBoolean
   */
  public void e(boolean paramBoolean)
  {
    if (!this.bg)
    {
      int i1 = paramBoolean ? 90 : -90;
      this.an = (2 * b(this.av + i1));
      this.ao = (2 * c(this.av + i1));
    }
  }
  /**
   * 
   * @param paramGraphics
   * @param paramg
   */
  public void b(Graphics paramGraphics, g paramg)
  {
    int i1 = paramg.c;
    int i2 = paramg.f;
    int i3 = paramg.g;
    int i4 = paramg.d;
    paramGraphics.setClip(0, 50, 240, 250);
    switch (i1)
    {
    case 9:
      break;
    case 10:
      if (i4 < 8)
        this.b.c(paramGraphics, 44 + i4, i2 + 88 + 32, 163 + i3);
      break;
    case 13:
      if (i4 < 8)
        this.b.c(paramGraphics, 53 + i4, i2 + 88 + 32, 158 - i3);
      break;
    case 14:
      this.b.c(paramGraphics, 63 + i4, i2 + 88 + 32, 158 - i3);
      break;
    case 12:
      if (this.bi == 3)
      {
        if (paramg.l == 29)
        {
          this.b0 = (i2 + 88 + 32);
          this.b1 = (i3 + 98 + 50);
          this.b2 = (this.bb + 27);
          this.b3 = (this.bc + 30);
          a(paramGraphics, this.b0, this.b1, i3 >> 2, paramg.d, true);
        }
        else
        {
          this.b6 = (this.b0 + paramg.d * ((this.b2 - this.b0) / 10));
          this.b7 = (this.b1 + paramg.d * ((this.b3 - this.b1) / 10));
          a(paramGraphics, this.b6, this.b7, i3 >> 2, paramg.d, true);
        }
        if (paramg.d == 8)
          if ((this.bb - this.be > -50) && (this.bb - this.be < 27) && (this.bc - this.bf > -50) && (this.bc - this.bf < 30))
          {
            paramg.n = true;
          }
          else
          {
            paramg.c = 0;
            this.af += -1;
          }
      }
      else if (paramg.d < 8)
      {
        a(paramGraphics, i2 + 88 + 32, i3 + 98 + 50, i3 >> 2, 16776960, 8388608);
      }
      break;
    case 11:
      if (this.a.n == true)
      {
        if (paramg.l == 29)
        {
          this.by = (93 - this.bb);
          this.bz = (144 - this.bc);
        }
        this.b4 = (i2 + 88 + 32 - this.by + (7 - paramg.d) * (this.by / 10));
        this.b5 = (i3 + 100 + 50 - this.bz + (7 - paramg.d) * (this.bz / 10));
        a(paramGraphics, this.b4, this.b5, i3 >> 1, paramg.l, false);
      }
      break;
    case 1:
      b(paramGraphics, i2 + 88 + 32, i3 + 100 + 50, i3 >> 1, paramg.d);
      break;
    case 6:
      a(paramGraphics, i2 + 93 + 2 + 32, i3 + 94 + 50, i3 >> 2, paramg.l);
      break;
    case 4:
    case 7:
    case 8:
      a(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1);
      break;
    case 5:
      a(paramGraphics, true, i2 + 88 + 32, 158 - i3, i4 * 4 + 2, i4 + 1, i4 + 1);
      break;
    case 2:
    case 3:
    }
  }
}