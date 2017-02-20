package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class ce
{
  static final cj a;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new ci();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ch();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new cg();
      return;
    }
    a = new cf();
  }

  public static boolean a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ce
 * JD-Core Version:    0.6.0
 */