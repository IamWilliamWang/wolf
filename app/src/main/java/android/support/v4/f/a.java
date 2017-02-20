package android.support.v4.f;

import android.os.Build.VERSION;
import java.util.Locale;

public final class a
{
  private static final b a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new e();
      return;
    }
    if (i >= 14)
    {
      a = new d();
      return;
    }
    a = new c();
  }

  public static String a(Locale paramLocale)
  {
    return a.a(paramLocale);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.f.a
 * JD-Core Version:    0.6.0
 */