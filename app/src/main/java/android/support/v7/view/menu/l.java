package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.j;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class l extends j
{
  final ActionProvider a;

  public l(k paramk, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramContext);
    this.a = paramActionProvider;
  }

  public View a()
  {
    return this.a.onCreateActionView();
  }

  public void a(SubMenu paramSubMenu)
  {
    this.a.onPrepareSubMenu(this.b.a(paramSubMenu));
  }

  public boolean d()
  {
    return this.a.onPerformDefaultAction();
  }

  public boolean e()
  {
    return this.a.hasSubMenu();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.l
 * JD-Core Version:    0.6.0
 */