/**
Goi e va h cls nhug chu yeu la cls e
h.b()
h.a( int or strig);

e.a()
e.m[]
e.a("string here");

*/
public class c
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public String k;
  public int l;
  public int m;
  public int n;
  public int o;
  public String p;
  public int q;
  public int r;
  public int s;
  public int t;
  public String u;
  public int v;

  /**
   * 
   */
  public void a()
  {
    this.j = this.g;
    this.o = this.m;
    this.t = this.r;
  }

  /**
   * 
   * @param paramh
   */
  public void a(h paramh)   // h class
  {
    this.a = paramh.b();	// goi ham b() trong clss h
    this.b = paramh.b();
    this.d = paramh.b();
    this.e = paramh.b();
    this.f = paramh.b();
  }

  /**
   * 
   * @param parame
   */
  public void a(e parame)	// goi cls e
  {
    parame.a(this.d);
    this.n = parame.m[0];			// e co mang m[] va method a() dc goi o day
    this.m = parame.m[1];
    this.q = parame.m[2];
    this.p = parame.a();
  }

  /**
   * 
   * @param parame
   */
  public void b(e parame)
  {
    parame.a("arm");
    d(parame);
    parame.a("plasma");
    c(parame);
    parame.a("missile");
    a(parame);
  }

  /**
   * 
   * @param paramInt
   */
  public void a(int paramInt)
  {
    this.j -= (paramInt - this.h < 1 ? 1 : paramInt - this.h);
  }

  /**
   * 
   * @param parame
   */
  public void c(e parame)
  {
    parame.a(this.e);
    this.s = parame.m[0];
    this.r = parame.m[1];
    this.v = parame.m[2];
    this.u = parame.a();
  }

  /**
   * 
   * @param parame
   */
  public void d(e parame)
  {
    parame.a(this.f);
    this.g = 1000;
    this.h = parame.m[0];
    this.i = parame.m[1];
    this.l = parame.m[2];
    this.k = parame.a();
  }

  /**
   * 
   */
  public void b()
  {
    this.a = 0;
    this.c = -1;
    this.b = 0;
    this.d = (this.e = this.f = 1);
  }

  /**
   * 
   * @param paramh
   */
  public void b(h paramh)
  {
    paramh.a(this.a);
    paramh.a(this.b);
    paramh.a(this.d);
    paramh.a(this.e);
    paramh.a(this.f);
  }
}