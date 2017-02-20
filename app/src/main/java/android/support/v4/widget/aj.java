package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class aj
{
  Object a;
  ak b;

  private aj(int paramInt, Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInt >= 14)
      this.b = new an();
    while (true)
    {
      this.a = this.b.a(paramContext, paramInterpolator);
      return;
      if (paramInt >= 9)
      {
        this.b = new am();
        continue;
      }
      this.b = new al();
    }
  }

  public static aj a(Context paramContext)
  {
    return a(paramContext, null);
  }

  public static aj a(Context paramContext, Interpolator paramInterpolator)
  {
    return new aj(Build.VERSION.SDK_INT, paramContext, paramInterpolator);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
  }

  public boolean a()
  {
    return this.b.a(this.a);
  }

  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return this.b.a(this.a, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }

  public int b()
  {
    return this.b.b(this.a);
  }

  public int c()
  {
    return this.b.c(this.a);
  }

  public int d()
  {
    return this.b.g(this.a);
  }

  public float e()
  {
    return this.b.d(this.a);
  }

  public boolean f()
  {
    return this.b.e(this.a);
  }

  public void g()
  {
    this.b.f(this.a);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.aj
 * JD-Core Version:    0.6.0
 */