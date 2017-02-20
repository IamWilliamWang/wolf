package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.support.v7.view.menu.r;
import android.view.View;

class l extends r
{
  public l(g paramg, Context paramContext, android.support.v7.view.menu.g paramg1, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramg1, paramView, paramBoolean, b.actionOverflowMenuStyle);
    a(8388613);
    a(paramg.g);
  }

  public void onDismiss()
  {
    super.onDismiss();
    if (g.c(this.c) != null)
      g.d(this.c).close();
    g.a(this.c, null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.l
 * JD-Core Version:    0.6.0
 */