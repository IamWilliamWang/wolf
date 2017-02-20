package android.support.v4.h;

import android.os.Build.VERSION;
import android.support.v4.d.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class ah
{
  static final al a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new ak();
      return;
    }
    if (i >= 11)
    {
      a = new aj();
      return;
    }
    a = new ai();
  }

  public static MenuItem a(MenuItem paramMenuItem, j paramj)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).a(paramj);
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }

  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramView);
    return a.a(paramMenuItem, paramView);
  }

  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
    {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    a.a(paramMenuItem, paramInt);
  }

  public static boolean a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).expandActionView();
    return a.a(paramMenuItem);
  }

  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramInt);
    return a.b(paramMenuItem, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ah
 * JD-Core Version:    0.6.0
 */