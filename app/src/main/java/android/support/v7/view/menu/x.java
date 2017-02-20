package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.d.a.b;
import android.support.v4.d.a.c;
import android.view.MenuItem;
import android.view.SubMenu;

public final class x
{
  public static MenuItem a(Context paramContext, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 16)
      return new p(paramContext, paramb);
    if (Build.VERSION.SDK_INT >= 14)
      return new k(paramContext, paramb);
    throw new UnsupportedOperationException();
  }

  public static SubMenu a(Context paramContext, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 14)
      return new aa(paramContext, paramc);
    throw new UnsupportedOperationException();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.x
 * JD-Core Version:    0.6.0
 */