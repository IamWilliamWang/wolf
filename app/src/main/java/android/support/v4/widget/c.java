package android.support.v4.widget;

import android.support.v4.h.bi;

class c
  implements Runnable
{
  private c(a parama)
  {
  }

  public void run()
  {
    if (!a.a(this.a))
      return;
    if (a.b(this.a))
    {
      a.a(this.a, false);
      a.c(this.a).a();
    }
    b localb = a.c(this.a);
    if ((localb.c()) || (!a.d(this.a)))
    {
      a.b(this.a, false);
      return;
    }
    if (a.e(this.a))
    {
      a.c(this.a, false);
      a.f(this.a);
    }
    localb.d();
    int i = localb.g();
    int j = localb.h();
    this.a.a(i, j);
    bi.a(a.g(this.a), this);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.6.0
 */