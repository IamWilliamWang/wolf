package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

class al
  implements ak
{
  public Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new Scroller(paramContext, paramInterpolator);
    return new Scroller(paramContext);
  }

  public void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    ((Scroller)paramObject).fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }

  public void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    ((Scroller)paramObject).fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }

  public boolean a(Object paramObject)
  {
    return ((Scroller)paramObject).isFinished();
  }

  public boolean a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return false;
  }

  public int b(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrX();
  }

  public int c(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrY();
  }

  public float d(Object paramObject)
  {
    return 0.0F;
  }

  public boolean e(Object paramObject)
  {
    return ((Scroller)paramObject).computeScrollOffset();
  }

  public void f(Object paramObject)
  {
    ((Scroller)paramObject).abortAnimation();
  }

  public int g(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalY();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.al
 * JD-Core Version:    0.6.0
 */