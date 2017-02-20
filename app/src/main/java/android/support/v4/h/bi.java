package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.View;

public final class bi
{
  static final bv a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new bu();
      return;
    }
    if (i >= 21)
    {
      a = new bt();
      return;
    }
    if (i >= 19)
    {
      a = new bs();
      return;
    }
    if (i >= 17)
    {
      a = new bq();
      return;
    }
    if (i >= 16)
    {
      a = new bp();
      return;
    }
    if (i >= 15)
    {
      a = new bn();
      return;
    }
    if (i >= 14)
    {
      a = new bo();
      return;
    }
    if (i >= 11)
    {
      a = new bm();
      return;
    }
    if (i >= 9)
    {
      a = new bl();
      return;
    }
    if (i >= 7)
    {
      a = new bk();
      return;
    }
    a = new bj();
  }

  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }

  public static int a(View paramView)
  {
    return a.a(paramView);
  }

  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }

  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }

  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }

  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }

  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }

  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }

  public static void b(View paramView)
  {
    a.b(paramView);
  }

  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }

  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }

  public static int c(View paramView)
  {
    return a.c(paramView);
  }

  public static int d(View paramView)
  {
    return a.d(paramView);
  }

  public static int e(View paramView)
  {
    return a.e(paramView);
  }

  public static int f(View paramView)
  {
    return a.f(paramView);
  }

  public static float g(View paramView)
  {
    return a.h(paramView);
  }

  public static int h(View paramView)
  {
    return a.i(paramView);
  }

  public static cs i(View paramView)
  {
    return a.j(paramView);
  }

  public static int j(View paramView)
  {
    return a.k(paramView);
  }

  public static void k(View paramView)
  {
    a.l(paramView);
  }

  public static void l(View paramView)
  {
    a.m(paramView);
  }

  public static boolean m(View paramView)
  {
    return a.g(paramView);
  }

  public static ColorStateList n(View paramView)
  {
    return a.n(paramView);
  }

  public static PorterDuff.Mode o(View paramView)
  {
    return a.o(paramView);
  }

  public static void p(View paramView)
  {
    a.p(paramView);
  }

  public static boolean q(View paramView)
  {
    return a.q(paramView);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.bi
 * JD-Core Version:    0.6.0
 */