package android.support.v7.widget;

import android.support.v7.view.menu.u;
import android.support.v7.view.menu.z;
import android.view.MenuItem;

class m
  implements u
{
  private m(g paramg)
  {
  }

  public void a(android.support.v7.view.menu.g paramg, boolean paramBoolean)
  {
    if ((paramg instanceof z))
      ((z)paramg).l().a(false);
    u localu = this.a.a();
    if (localu != null)
      localu.a(paramg, paramBoolean);
  }

  public boolean a(android.support.v7.view.menu.g paramg)
  {
    if (paramg == null)
      return false;
    this.a.h = ((z)paramg).getItem().getItemId();
    u localu = this.a.a();
    if (localu != null);
    for (boolean bool = localu.a(paramg); ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.6.0
 */