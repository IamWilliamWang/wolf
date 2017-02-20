package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class f
{
  private static Method a;

  static
  {
    try
    {
      a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      return;
    }
    catch (Exception localException)
    {
    }
    throw new IllegalStateException(localException);
  }

  public static String a(Locale paramLocale)
  {
    try
    {
      String str = ((Locale)a.invoke(null, new Object[] { paramLocale })).getScript();
      return str;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Log.w("ICUCompatIcs", localInvocationTargetException);
      return paramLocale.getScript();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        Log.w("ICUCompatIcs", localIllegalAccessException);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.f.f
 * JD-Core Version:    0.6.0
 */