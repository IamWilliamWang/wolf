package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

class ag
{
  private static Method a;
  private static boolean b;

  static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    if (!b);
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { Integer.TYPE });
      a.setAccessible(true);
      label33: b = true;
      if (a != null);
      try
      {
        a.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (Exception paramPopupWindow)
      {
        return;
      }
    }
    catch (Exception localException)
    {
      break label33;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.ag
 * JD-Core Version:    0.6.0
 */