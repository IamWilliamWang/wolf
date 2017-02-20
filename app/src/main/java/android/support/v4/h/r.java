package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class r
{
  static final s a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new v();
      return;
    }
    if (i >= 11)
    {
      a = new u();
      return;
    }
    a = new t();
  }

  public static void a(LayoutInflater paramLayoutInflater, ab paramab)
  {
    a.a(paramLayoutInflater, paramab);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.r
 * JD-Core Version:    0.6.0
 */