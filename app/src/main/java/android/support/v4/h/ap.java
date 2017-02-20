package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class ap
{
  static final au a;

  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      a = new at();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new as();
      return;
    }
    if (Build.VERSION.SDK_INT >= 5)
    {
      a = new ar();
      return;
    }
    a = new aq();
  }

  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() & 0xFF;
  }

  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.a(paramMotionEvent, paramInt);
  }

  public static int b(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getAction() & 0xFF00) >> 8;
  }

  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.b(paramMotionEvent, paramInt);
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.c(paramMotionEvent, paramInt);
  }

  public static int c(MotionEvent paramMotionEvent)
  {
    return a.a(paramMotionEvent);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.d(paramMotionEvent, paramInt);
  }

  public static float e(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.e(paramMotionEvent, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ap
 * JD-Core Version:    0.6.0
 */