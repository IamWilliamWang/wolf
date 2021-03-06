package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.h.ap;
import android.support.v4.h.bi;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int r = ViewConfiguration.getTapTimeout();
  private final b a = new b();
  private final Interpolator b = new AccelerateInterpolator();
  private final View c;
  private Runnable d;
  private float[] e = { 0.0F, 0.0F };
  private float[] f = { 3.4028235E+38F, 3.4028235E+38F };
  private int g;
  private int h;
  private float[] i = { 0.0F, 0.0F };
  private float[] j = { 0.0F, 0.0F };
  private float[] k = { 3.4028235E+38F, 3.4028235E+38F };
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;

  public a(View paramView)
  {
    this.c = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i1 = (int)(1575.0F * paramView.density + 0.5F);
    int i2 = (int)(paramView.density * 315.0F + 0.5F);
    a(i1, i1);
    b(i2, i2);
    a(1);
    e(3.4028235E+38F, 3.4028235E+38F);
    d(0.2F, 0.2F);
    c(1.0F, 1.0F);
    b(r);
    c(500);
    d(500);
  }

  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = 0.0F;
    paramFloat1 = b(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = f(paramFloat4, paramFloat1);
    paramFloat2 = f(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat2 < 0.0F)
      paramFloat1 = -this.b.getInterpolation(-paramFloat2);
    while (true)
    {
      paramFloat1 = b(paramFloat1, -1.0F, 1.0F);
      do
      {
        return paramFloat1;
        paramFloat1 = f1;
      }
      while (paramFloat2 <= 0.0F);
      paramFloat1 = this.b.getInterpolation(paramFloat2);
    }
  }

  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 = a(this.e[paramInt], paramFloat2, this.f[paramInt], paramFloat1);
    if (paramFloat1 == 0.0F)
      return 0.0F;
    float f2 = this.i[paramInt];
    paramFloat2 = this.j[paramInt];
    float f1 = this.k[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (paramFloat1 > 0.0F)
      return b(paramFloat1 * paramFloat3, paramFloat2, f1);
    return -b(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }

  private boolean a()
  {
    b localb = this.a;
    int i1 = localb.f();
    int i2 = localb.e();
    return ((i1 != 0) && (f(i1))) || ((i2 != 0) && (e(i2)));
  }

  private static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3)
      return paramFloat3;
    if (paramFloat1 < paramFloat2)
      return paramFloat2;
    return paramFloat1;
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3)
      return paramInt3;
    if (paramInt1 < paramInt2)
      return paramInt2;
    return paramInt1;
  }

  private void b()
  {
    if (this.d == null)
      this.d = new c(this, null);
    this.o = true;
    this.m = true;
    if ((!this.l) && (this.h > 0))
      bi.a(this.c, this.d, this.h);
    while (true)
    {
      this.l = true;
      return;
      this.d.run();
    }
  }

  private void c()
  {
    if (this.m)
    {
      this.o = false;
      return;
    }
    this.a.b();
  }

  private void d()
  {
    long l1 = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
    this.c.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }

  private float f(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F);
    do
    {
      do
      {
        do
        {
          return 0.0F;
          switch (this.g)
          {
          default:
            return 0.0F;
          case 0:
          case 1:
          case 2:
          }
        }
        while (paramFloat1 >= paramFloat2);
        if (paramFloat1 >= 0.0F)
          return 1.0F - paramFloat1 / paramFloat2;
      }
      while ((!this.o) || (this.g != 1));
      return 1.0F;
    }
    while (paramFloat1 >= 0.0F);
    return paramFloat1 / -paramFloat2;
  }

  public a a(float paramFloat1, float paramFloat2)
  {
    this.k[0] = (paramFloat1 / 1000.0F);
    this.k[1] = (paramFloat2 / 1000.0F);
    return this;
  }

  public a a(int paramInt)
  {
    this.g = paramInt;
    return this;
  }

  public a a(boolean paramBoolean)
  {
    if ((this.p) && (!paramBoolean))
      c();
    this.p = paramBoolean;
    return this;
  }

  public native abstract void a(int paramInt1, int paramInt2);

  public a b(float paramFloat1, float paramFloat2)
  {
    this.j[0] = (paramFloat1 / 1000.0F);
    this.j[1] = (paramFloat2 / 1000.0F);
    return this;
  }

  public a b(int paramInt)
  {
    this.h = paramInt;
    return this;
  }

  public a c(float paramFloat1, float paramFloat2)
  {
    this.i[0] = (paramFloat1 / 1000.0F);
    this.i[1] = (paramFloat2 / 1000.0F);
    return this;
  }

  public a c(int paramInt)
  {
    this.a.a(paramInt);
    return this;
  }

  public a d(float paramFloat1, float paramFloat2)
  {
    this.e[0] = paramFloat1;
    this.e[1] = paramFloat2;
    return this;
  }

  public a d(int paramInt)
  {
    this.a.b(paramInt);
    return this;
  }

  public a e(float paramFloat1, float paramFloat2)
  {
    this.f[0] = paramFloat1;
    this.f[1] = paramFloat2;
    return this;
  }

  public native abstract boolean e(int paramInt);

  public native abstract boolean f(int paramInt);

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    if (!this.p)
      return false;
    switch (ap.a(paramMotionEvent))
    {
    default:
      if ((!this.q) || (!this.o))
        break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return i1;
      this.n = true;
      this.l = false;
      float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.c.getWidth());
      float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.c.getHeight());
      this.a.a(f1, f2);
      if ((this.o) || (!a()))
        break;
      b();
      break;
      c();
      break;
      i1 = 0;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.a
 * JD-Core Version:    0.6.0
 */