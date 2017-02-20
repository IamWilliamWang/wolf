package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.b;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.t;
import android.support.v7.view.menu.z;
import android.view.View;
import android.widget.ImageButton;

class cb
  implements t
{
  g a;
  j b;

  private cb(Toolbar paramToolbar)
  {
  }

  public void a(Context paramContext, g paramg)
  {
    if ((this.a != null) && (this.b != null))
      this.a.d(this.b);
    this.a = paramg;
  }

  public void a(g paramg, boolean paramBoolean)
  {
  }

  public boolean a(g paramg, j paramj)
  {
    Toolbar.b(this.c);
    if (Toolbar.c(this.c).getParent() != this.c)
      this.c.addView(Toolbar.c(this.c));
    this.c.a = paramj.getActionView();
    this.b = paramj;
    if (this.c.a.getParent() != this.c)
    {
      paramg = this.c.d();
      paramg.a = (0x800003 | Toolbar.d(this.c) & 0x70);
      paramg.b = 2;
      this.c.a.setLayoutParams(paramg);
      this.c.addView(this.c.a);
    }
    this.c.e();
    this.c.requestLayout();
    paramj.e(true);
    if ((this.c.a instanceof b))
      ((b)this.c.a).a();
    return true;
  }

  public boolean a(z paramz)
  {
    return false;
  }

  public void b(boolean paramBoolean)
  {
    int k = 0;
    int j;
    int m;
    int i;
    if (this.b != null)
    {
      j = k;
      if (this.a != null)
      {
        m = this.a.size();
        i = 0;
      }
    }
    while (true)
    {
      j = k;
      if (i < m)
      {
        if (this.a.getItem(i) == this.b)
          j = 1;
      }
      else
      {
        if (j == 0)
          b(this.a, this.b);
        return;
      }
      i += 1;
    }
  }

  public boolean b()
  {
    return false;
  }

  public boolean b(g paramg, j paramj)
  {
    if ((this.c.a instanceof b))
      ((b)this.c.a).b();
    this.c.removeView(this.c.a);
    this.c.removeView(Toolbar.c(this.c));
    this.c.a = null;
    this.c.f();
    this.b = null;
    this.c.requestLayout();
    paramj.e(false);
    return true;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.cb
 * JD-Core Version:    0.6.0
 */