package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

class n
{
  private static Method a;
  private static boolean b;

  public static int a(Drawable paramDrawable)
  {
    if (!b);
    try
    {
      a = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
      a.setAccessible(true);
      b = true;
      if (a == null);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      try
      {
        int i = ((Integer)a.invoke(paramDrawable, new Object[0])).intValue();
        return i;
        localNoSuchMethodException = localNoSuchMethodException;
        Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", localNoSuchMethodException);
      }
      catch (java.lang.Exception paramDrawable)
      {
        Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", paramDrawable);
        a = null;
      }
    }
    return -1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.n
 * JD-Core Version:    0.6.0
 */