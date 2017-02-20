package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.r;
import android.support.v7.view.menu.z;
import android.view.MenuItem;
import android.view.View;

class h extends r
{
  private z d;

  public h(g paramg, Context paramContext, z paramz)
  {
    super(paramContext, paramz, null, false, b.actionOverflowMenuStyle);
    this.d = paramz;
    int j;
    int i;
    if (!((j)paramz.getItem()).j())
    {
      if (g.e(paramg) == null)
      {
        paramContext = (View)g.f(paramg);
        a(paramContext);
      }
    }
    else
    {
      a(paramg.g);
      j = paramz.size();
      i = 0;
    }
    while (true)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        paramg = paramz.getItem(i);
        if ((paramg.isVisible()) && (paramg.getIcon() != null))
          bool1 = true;
      }
      else
      {
        a(bool1);
        return;
        paramContext = g.e(paramg);
        break;
      }
      i += 1;
    }
  }

  public void onDismiss()
  {
    super.onDismiss();
    g.a(this.c, null);
    this.c.h = 0;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.h
 * JD-Core Version:    0.6.0
 */