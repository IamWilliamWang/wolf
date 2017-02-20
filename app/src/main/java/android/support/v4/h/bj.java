package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import java.util.WeakHashMap;

class bj
  implements bv
{
  WeakHashMap<View, cs> a = null;

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }

  public int a(View paramView)
  {
    return 2;
  }

  long a()
  {
    return 10L;
  }

  public void a(View paramView, float paramFloat)
  {
  }

  public void a(View paramView, int paramInt, Paint paramPaint)
  {
  }

  public void a(View paramView, ColorStateList paramColorStateList)
  {
    bw.a(paramView, paramColorStateList);
  }

  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    bw.a(paramView, paramMode);
  }

  public void a(View paramView, a parama)
  {
  }

  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }

  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, a() + paramLong);
  }

  public void a(View paramView, boolean paramBoolean)
  {
  }

  public void b(View paramView)
  {
    paramView.invalidate();
  }

  public void b(View paramView, float paramFloat)
  {
  }

  public void b(View paramView, boolean paramBoolean)
  {
  }

  public int c(View paramView)
  {
    return 0;
  }

  public int d(View paramView)
  {
    return 0;
  }

  public int e(View paramView)
  {
    return paramView.getMeasuredWidth();
  }

  public int f(View paramView)
  {
    return 0;
  }

  public boolean g(View paramView)
  {
    return true;
  }

  public float h(View paramView)
  {
    return 0.0F;
  }

  public int i(View paramView)
  {
    return bw.c(paramView);
  }

  public cs j(View paramView)
  {
    return new cs(paramView);
  }

  public int k(View paramView)
  {
    return 0;
  }

  public void l(View paramView)
  {
  }

  public void m(View paramView)
  {
  }

  public ColorStateList n(View paramView)
  {
    return bw.a(paramView);
  }

  public PorterDuff.Mode o(View paramView)
  {
    return bw.b(paramView);
  }

  public void p(View paramView)
  {
    if ((paramView instanceof ay))
      ((ay)paramView).stopNestedScroll();
  }

  public boolean q(View paramView)
  {
    return bw.d(paramView);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.bj
 * JD-Core Version:    0.6.0
 */