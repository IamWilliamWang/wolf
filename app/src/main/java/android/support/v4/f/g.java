package android.support.v4.f;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class g
{
  private static Method a;
  private static Method b;

  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        a = localClass.getMethod("getScript", new Class[] { String.class });
        b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
      a = null;
      b = null;
      Log.w("ICUCompatIcs", localException);
    }
  }

  private static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        paramString = (String)a.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (IllegalAccessException paramString)
    {
      Log.w("ICUCompatIcs", paramString);
      return null;
    }
    catch (InvocationTargetException paramString)
    {
      while (true)
        Log.w("ICUCompatIcs", paramString);
    }
  }

  public static String a(Locale paramLocale)
  {
    paramLocale = b(paramLocale);
    if (paramLocale != null)
      return a(paramLocale);
    return null;
  }

  private static String b(Locale paramLocale)
  {
    paramLocale = paramLocale.toString();
    try
    {
      if (b != null)
      {
        String str = (String)b.invoke(null, new Object[] { paramLocale });
        return str;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompatIcs", localIllegalAccessException);
      return paramLocale;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
        Log.w("ICUCompatIcs", localInvocationTargetException);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.f.g
 * JD-Core Version:    0.6.0
 */