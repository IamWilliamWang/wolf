package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class o extends f<MenuItem.OnMenuItemClickListener>
  implements MenuItem.OnMenuItemClickListener
{
  o(k paramk, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }

  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.b).onMenuItemClick(this.a.a(paramMenuItem));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.o
 * JD-Core Version:    0.6.0
 */