package android.support.a.a;

import android.graphics.Path;

class n
{
  protected g[] m = null;
  String n;
  int o;

  public n()
  {
  }

  public n(n paramn)
  {
    this.n = paramn.n;
    this.o = paramn.o;
    this.m = e.a(paramn.m);
  }

  public void a(Path paramPath)
  {
    paramPath.reset();
    if (this.m != null)
      g.a(this.m, paramPath);
  }

  public boolean a()
  {
    return false;
  }

  public String b()
  {
    return this.n;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.n
 * JD-Core Version:    0.6.0
 */