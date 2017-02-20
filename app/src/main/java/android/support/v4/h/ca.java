package android.support.v4.h;

import android.view.View;

class ca
{
  public static void a(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }

  public static int b(View paramView)
  {
    return paramView.getMinimumHeight();
  }

  public static void c(View paramView)
  {
    paramView.requestFitSystemWindows();
  }

  public static boolean d(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ca
 * JD-Core Version:    0.6.0
 */