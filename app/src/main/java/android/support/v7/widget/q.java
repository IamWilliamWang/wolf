package android.support.v7.widget;

import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
import android.view.MenuItem;

class q
  implements h
{
  private q(ActionMenuView paramActionMenuView)
  {
  }

  public void a(g paramg)
  {
    if (ActionMenuView.b(this.a) != null)
      ActionMenuView.b(this.a).a(paramg);
  }

  public boolean a(g paramg, MenuItem paramMenuItem)
  {
    return (ActionMenuView.a(this.a) != null) && (ActionMenuView.a(this.a).a(paramMenuItem));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.q
 * JD-Core Version:    0.6.0
 */