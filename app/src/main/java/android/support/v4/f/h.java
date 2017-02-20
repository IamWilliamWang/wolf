package android.support.v4.f;

import android.os.Build.VERSION;
import java.util.Locale;

public final class h
{
  public static final Locale a;
  private static final i b;
  private static String c;
  private static String d;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
      b = new j(null);
    while (true)
    {
      a = new Locale("", "");
      c = "Arab";
      d = "Hebr";
      return;
      b = new i(null);
    }
  }

  public static int a(Locale paramLocale)
  {
    return b.a(paramLocale);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.f.h
 * JD-Core Version:    0.6.0
 */