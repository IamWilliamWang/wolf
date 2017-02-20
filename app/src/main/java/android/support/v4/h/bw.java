package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import java.lang.reflect.Field;

class bw
{
  private static Field a;
  private static boolean b;

  static ColorStateList a(View paramView)
  {
    if ((paramView instanceof bc))
      return ((bc)paramView).getSupportBackgroundTintList();
    return null;
  }

  static void a(View paramView, ColorStateList paramColorStateList)
  {
    if ((paramView instanceof bc))
      ((bc)paramView).setSupportBackgroundTintList(paramColorStateList);
  }

  static void a(View paramView, PorterDuff.Mode paramMode)
  {
    if ((paramView instanceof bc))
      ((bc)paramView).setSupportBackgroundTintMode(paramMode);
  }

  static PorterDuff.Mode b(View paramView)
  {
    if ((paramView instanceof bc))
      return ((bc)paramView).getSupportBackgroundTintMode();
    return null;
  }

  static int c(View paramView)
  {
    if (!b);
    try
    {
      a = View.class.getDeclaredField("mMinHeight");
      a.setAccessible(true);
      label23: b = true;
      if (a != null)
        try
        {
          int i = ((Integer)a.get(paramView)).intValue();
          return i;
        }
        catch (java.lang.Exception paramView)
        {
        }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label23;
    }
  }

  static boolean d(View paramView)
  {
    return paramView.getWindowToken() != null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.bw
 * JD-Core Version:    0.6.0
 */