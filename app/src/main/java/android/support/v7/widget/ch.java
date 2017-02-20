package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.bi;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public class ch
{
  private static Method a;

  static
  {
    if (Build.VERSION.SDK_INT >= 18);
    try
    {
      a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      if (!a.isAccessible())
        a.setAccessible(true);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
    }
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }

  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    if (a != null);
    try
    {
      a.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      return;
    }
    catch (java.lang.Exception paramView)
    {
      Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", paramView);
    }
  }

  public static boolean a(View paramView)
  {
    return bi.d(paramView) == 1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ch
 * JD-Core Version:    0.6.0
 */