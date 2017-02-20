package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v7.b.b;
import android.view.View;

class k extends ai
  implements n
{
  private final float[] b = new float[2];

  public k(g paramg, Context paramContext)
  {
    super(paramContext, null, b.actionOverflowButtonStyle);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    setOnTouchListener(new az(this, paramg)
    {
      public ax a()
      {
        if (g.a(k.this.a) == null)
          return null;
        return g.a(k.this.a).c();
      }

      public boolean b()
      {
        k.this.a.d();
        return true;
      }

      public boolean c()
      {
        if (g.b(k.this.a) != null)
          return false;
        k.this.a.e();
        return true;
      }
    });
  }

  public boolean c()
  {
    return false;
  }

  public boolean d()
  {
    return false;
  }

  public boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.a.d();
    return true;
  }

  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      paramInt2 = getHeight();
      paramInt1 = Math.max(i, paramInt2) / 2;
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt3 = getPaddingTop();
      paramInt4 = getPaddingBottom();
      i = (i + (j - k)) / 2;
      paramInt2 = (paramInt2 + (paramInt3 - paramInt4)) / 2;
      a.a(localDrawable2, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    }
    return bool;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.6.0
 */