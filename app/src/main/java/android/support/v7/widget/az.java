package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.h.ap;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class az
  implements View.OnTouchListener
{
  private final float a;
  private final int b;
  private final int c;
  private final View d;
  private Runnable e;
  private Runnable f;
  private boolean g;
  private boolean h;
  private int i;
  private final int[] j = new int[2];

  public az(View paramView)
  {
    this.d = paramView;
    this.a = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.b = ViewConfiguration.getTapTimeout();
    this.c = ((this.b + ViewConfiguration.getLongPressTimeout()) / 2);
  }

  private boolean a(MotionEvent paramMotionEvent)
  {
    View localView = this.d;
    if (!localView.isEnabled());
    int k;
    do
    {
      return false;
      switch (ap.a(paramMotionEvent))
      {
      default:
        return false;
      case 0:
        this.i = paramMotionEvent.getPointerId(0);
        this.h = false;
        if (this.e == null)
          this.e = new ba(this, null);
        localView.postDelayed(this.e, this.b);
        if (this.f == null)
          this.f = new bb(this, null);
        localView.postDelayed(this.f, this.c);
        return false;
      case 2:
        k = paramMotionEvent.findPointerIndex(this.i);
      case 1:
      case 3:
      }
    }
    while ((k < 0) || (a(localView, paramMotionEvent.getX(k), paramMotionEvent.getY(k), this.a)));
    d();
    localView.getParent().requestDisallowInterceptTouchEvent(true);
    return true;
    d();
    return false;
  }

  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat1 >= -paramFloat3) && (paramFloat2 >= -paramFloat3) && (paramFloat1 < paramView.getRight() - paramView.getLeft() + paramFloat3) && (paramFloat2 < paramView.getBottom() - paramView.getTop() + paramFloat3);
  }

  private boolean a(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(-arrayOfInt[0], -arrayOfInt[1]);
    return true;
  }

  private boolean b(MotionEvent paramMotionEvent)
  {
    int m = 1;
    View localView = this.d;
    Object localObject = a();
    if ((localObject == null) || (!((ax)localObject).k()));
    do
    {
      return false;
      localObject = ax.a((ax)localObject);
    }
    while ((localObject == null) || (!((ay)localObject).isShown()));
    MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
    b(localView, localMotionEvent);
    a((View)localObject, localMotionEvent);
    boolean bool = ((ay)localObject).a(localMotionEvent, this.i);
    localMotionEvent.recycle();
    int k = ap.a(paramMotionEvent);
    if ((k != 1) && (k != 3))
    {
      k = 1;
      if ((!bool) || (k == 0))
        break label124;
    }
    while (true)
    {
      return m;
      k = 0;
      break;
      label124: m = 0;
    }
  }

  private boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = this.j;
    paramView.getLocationOnScreen(arrayOfInt);
    paramMotionEvent.offsetLocation(arrayOfInt[0], arrayOfInt[1]);
    return true;
  }

  private void d()
  {
    if (this.f != null)
      this.d.removeCallbacks(this.f);
    if (this.e != null)
      this.d.removeCallbacks(this.e);
  }

  private void e()
  {
    d();
    View localView = this.d;
    if ((!localView.isEnabled()) || (localView.isLongClickable()));
    do
      return;
    while (!b());
    localView.getParent().requestDisallowInterceptTouchEvent(true);
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    localView.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
    this.g = true;
    this.h = true;
  }

  public native abstract ax a();

  protected boolean b()
  {
    ax localax = a();
    if ((localax != null) && (!localax.k()))
      localax.c();
    return true;
  }

  protected boolean c()
  {
    ax localax = a();
    if ((localax != null) && (localax.k()))
      localax.i();
    return true;
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool3 = this.g;
    if (bool3)
    {
      if (this.h)
        bool1 = b(paramMotionEvent);
      while (true)
      {
        this.g = bool1;
        if (!bool1)
        {
          bool1 = bool2;
          if (!bool3);
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        if ((b(paramMotionEvent)) || (!c()))
        {
          bool1 = true;
          continue;
        }
        bool1 = false;
      }
    }
    if ((a(paramMotionEvent)) && (b()));
    for (boolean bool1 = true; ; bool1 = false)
    {
      if (bool1)
      {
        long l = SystemClock.uptimeMillis();
        paramView = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.d.onTouchEvent(paramView);
        paramView.recycle();
      }
      break;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.az
 * JD-Core Version:    0.6.0
 */