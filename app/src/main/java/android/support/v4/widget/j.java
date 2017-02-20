package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class j
{
  private static final m b;
  private Object a;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new l();
      return;
    }
    b = new k();
  }

  public j(Context paramContext)
  {
    this.a = b.a(paramContext);
  }

  public void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }

  public boolean a()
  {
    return b.a(this.a);
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return b.a(this.a, paramFloat1, paramFloat2);
  }

  public boolean a(int paramInt)
  {
    return b.a(this.a, paramInt);
  }

  public boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }

  public boolean b()
  {
    return b.b(this.a);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.j
 * JD-Core Version:    0.6.0
 */