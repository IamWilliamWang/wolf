package android.support.v7.view.menu;

import android.support.v4.h.am;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class n extends f<MenuItem.OnActionExpandListener>
  implements am
{
  n(k paramk, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }

  public boolean a(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionExpand(this.a.a(paramMenuItem));
  }

  public boolean b(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionCollapse(this.a.a(paramMenuItem));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.n
 * JD-Core Version:    0.6.0
 */