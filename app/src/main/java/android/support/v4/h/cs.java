package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

public final class cs
{
  static final db a;
  private WeakReference<View> b;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new da();
      return;
    }
    if (i >= 19)
    {
      a = new cz();
      return;
    }
    if (i >= 18)
    {
      a = new cx();
      return;
    }
    if (i >= 16)
    {
      a = new cy();
      return;
    }
    if (i >= 14)
    {
      a = new cv();
      return;
    }
    a = new ct();
  }

  cs(View paramView)
  {
    this.b = new WeakReference(paramView);
  }

  public cs a(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView, paramFloat);
    return this;
  }

  public cs a(de paramde)
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView, paramde);
    return this;
  }

  public void a()
  {
    View localView = (View)this.b.get();
    if (localView != null)
      a.a(this, localView);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cs
 * JD-Core Version:    0.6.0
 */