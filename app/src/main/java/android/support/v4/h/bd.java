package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class bd
{
  static final bg a;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bf();
      return;
    }
    a = new be();
  }

  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.bd
 * JD-Core Version:    0.6.0
 */