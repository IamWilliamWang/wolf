package android.support.v4.h;

import android.os.Build.VERSION;

public final class m
{
  static final n a;

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new p();
      return;
    }
    a = new o();
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.m
 * JD-Core Version:    0.6.0
 */