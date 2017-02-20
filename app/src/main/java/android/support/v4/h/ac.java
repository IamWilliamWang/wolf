package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class ac
{
  static final ad a;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new af();
      return;
    }
    a = new ae();
  }

  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }

  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ac
 * JD-Core Version:    0.6.0
 */