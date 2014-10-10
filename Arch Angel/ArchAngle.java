import com.samsung.util.AudioClip;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public class ArchAngel extends MIDlet
{
  public int a = 1;
  public int b = 0;
  public int c;
  public int d = 0;
  public boolean e = false;
  public boolean f = true;
  public boolean g = false;
  public boolean h = false;
  public boolean i;
  public boolean j = false;
  public boolean k = false;
  public boolean l = false;
  public boolean m = false;
  public boolean n = false;
  public Random o = new Random();
  public int p = 0;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u = false;
  public boolean v = true;
  public boolean w = true;
  public int x = 0;
  public int y = -1;
  public int z = 0;
  public int aa = -1;
  public int ab;
  public int ac;
  public int ad;
  public int ae = 40;
  public int af = 1;
  public int ag = 0;
  public int ah = 0;
  public b ai = null;
  public c aj = new c();
  public d ak = new d();
  public e al = new e();
  public f am = new f(this, this.ak);
  public String[] an = { "ON", "OFF" };
  public String[] ao = { "AUTOMATIC", "MANUAL" };
  public String[] ap = { "Easy", "Hard" };
  public AudioClip aq = null;
  public Thread ar = null;
  private boolean as = true;

  public void a()
  {
    h localh = new h();
    if (!localh.a("Angel1", false))
      return;
    this.af = localh.b();
    this.ag = localh.b();
    localh.a();
  }

  public void b()
  {
    h localh = new h();
    if (!localh.a("Angel", true))
      return;
    this.aj.b(localh);
    localh.a(this.ah);
    localh.a();
  }

  public ArchAngel()
  {
    a();
  }

  public void pauseApp()
  {
    this.ai.a();
  }

  public void c()
  {
    if (this.aq == null)
      return;
    this.aq.stop();
    this.aq = null;
  }

  public void a(Graphics paramGraphics, String paramString, boolean paramBoolean)
  {
    int i1 = paramString.length() * 9;
    if (paramBoolean)
      this.ak.a(paramGraphics, 5, 305, paramString);
    else
      this.ak.a(paramGraphics, 235 - i1, 305, paramString);
  }

  public boolean d()
  {
    h localh = new h();
    if (localh.a("Angel", false))
    {
      this.aj.a(localh);
      this.aj.b(this.al);
      this.ah = localh.b();
      localh.a();
      return true;
    }
    return false;
  }

  public void a(String paramString, int paramInt)
  {
    if (this.af == 0)
      return;
    if (this.aq != null)
    {
      this.aq.stop();
      this.aq = null;
    }
    try
    {
      String str = new String("/mmf/" + paramString + ".mid");
      this.aq = null;
      this.aq = new AudioClip(3, str);
      this.aq.play(paramInt, 3);
      System.out.println("play--->" + paramString);
    }
    catch (Exception localException)
    {
      System.out.println("Error play sound");
    }
  }

  public void a(int paramInt)
  {
    this.al.a("ms" + paramInt);
    this.al.a(1);
    this.am.r = this.al.m[0];
    this.am.s = this.al.m[1];
    this.am.y = this.al.m[2];
    this.al.a(2);
    this.am.m = this.al.a();
    if (this.ah == 0)
      this.am.j = (this.al.m[0] / 2);
    else
      this.am.j = this.al.m[0];
    this.am.k = this.al.m[1];
    this.am.l = this.al.m[2];
    this.am.h = this.al.m[3];
    this.al.a(3);
    this.am.q = this.al.a();
    if (this.ah == 0)
      this.am.n = (this.al.m[0] / 2);
    else
      this.am.n = this.al.m[0];
    this.am.o = this.al.m[1];
    this.am.p = this.al.m[2];
    this.am.i = this.al.m[3];
    this.al.a(10);
    this.am.e = this.al.a();
    this.al.a(4);
  }

  public boolean e()
  {
    h localh = new h();
    if (localh.a("Angel", false))
    {
      localh.a();
      return true;
    }
    return false;
  }

  public void destroyApp(boolean paramBoolean)
  {
    this.ai.b();
  }

  public void a(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, 240, 320);
    this.ak.a(paramGraphics, 3, 0, 300);
  }

  public void startApp()
  {
    if (!this.as)
      return;
    this.ai = new b(this);
    this.ai.setFullScreenMode(true);
    Display.getDisplay(this).setCurrent(this.ai);
    this.ar = new Thread(this.ai);
    this.ar.start();
    this.ac = 0;
    this.as = false;
  }

  public void f()
  {
    h localh = new h();
    if (!localh.a("Angel1", true))
      return;
    localh.a(this.af);
    localh.a(this.ag);
    localh.a();
  }
}