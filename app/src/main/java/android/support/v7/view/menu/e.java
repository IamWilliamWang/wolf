package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.support.v4.g.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class e<T> extends f<T>
{
  final Context a;
  private Map<b, MenuItem> c;
  private Map<c, SubMenu> d;

  e(Context paramContext, T paramT)
  {
    super(paramT);
    this.a = paramContext;
  }

  final MenuItem a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
    {
      b localb = (b)paramMenuItem;
      if (this.c == null)
        this.c = new a();
      MenuItem localMenuItem = (MenuItem)this.c.get(paramMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = x.a(this.a, localb);
        this.c.put(localb, paramMenuItem);
      }
      return paramMenuItem;
    }
    return paramMenuItem;
  }

  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof c))
    {
      c localc = (c)paramSubMenu;
      if (this.d == null)
        this.d = new a();
      SubMenu localSubMenu = (SubMenu)this.d.get(localc);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = x.a(this.a, localc);
        this.d.put(localc, paramSubMenu);
      }
      return paramSubMenu;
    }
    return paramSubMenu;
  }

  final void a()
  {
    if (this.c != null)
      this.c.clear();
    if (this.d != null)
      this.d.clear();
  }

  final void a(int paramInt)
  {
    if (this.c == null);
    while (true)
    {
      return;
      Iterator localIterator = this.c.keySet().iterator();
      while (localIterator.hasNext())
      {
        if (paramInt != ((MenuItem)localIterator.next()).getGroupId())
          continue;
        localIterator.remove();
      }
    }
  }

  final void b(int paramInt)
  {
    if (this.c == null);
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext())
        localIterator = this.c.keySet().iterator();
    }
    while (paramInt != ((MenuItem)localIterator.next()).getItemId());
    localIterator.remove();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.e
 * JD-Core Version:    0.6.0
 */