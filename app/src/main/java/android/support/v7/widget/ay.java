package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.h.ap;
import android.support.v4.h.cs;
import android.support.v4.widget.q;
import android.support.v7.b.b;
import android.view.MotionEvent;
import android.view.View;

class ay extends bh
{
  private boolean g;
  private boolean h;
  private boolean i;
  private cs j;
  private q k;

  public ay(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, b.dropDownListViewStyle);
    this.h = paramBoolean;
    setCacheColorHint(0);
  }

  private void a(View paramView, int paramInt)
  {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }

  private void a(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    this.i = true;
    if (Build.VERSION.SDK_INT >= 21)
      drawableHotspotChanged(paramFloat1, paramFloat2);
    if (!isPressed())
      setPressed(true);
    layoutChildren();
    if (this.f != -1)
    {
      View localView = getChildAt(this.f - getFirstVisiblePosition());
      if ((localView != null) && (localView != paramView) && (localView.isPressed()))
        localView.setPressed(false);
    }
    this.f = paramInt;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    if (Build.VERSION.SDK_INT >= 21)
      paramView.drawableHotspotChanged(paramFloat1 - f1, paramFloat2 - f2);
    if (!paramView.isPressed())
      paramView.setPressed(true);
    a(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }

  private void d()
  {
    this.i = false;
    setPressed(false);
    drawableStateChanged();
    View localView = getChildAt(this.f - getFirstVisiblePosition());
    if (localView != null)
      localView.setPressed(false);
    if (this.j != null)
    {
      this.j.a();
      this.j = null;
    }
  }

  protected boolean a()
  {
    return (this.i) || (super.a());
  }

  public boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int m = ap.a(paramMotionEvent);
    switch (m)
    {
    default:
      paramInt = 0;
    case 3:
      for (i2 = 1; ; i2 = 0)
      {
        label37: if ((i2 == 0) || (paramInt != 0))
          d();
        if (i2 == 0)
          break;
        if (this.k == null)
          this.k = new q(this);
        this.k.a(true);
        this.k.onTouch(this, paramMotionEvent);
        label93: return i2;
        paramInt = 0;
      }
    case 1:
    case 2:
    }
    for (int i2 = 0; ; i2 = 1)
    {
      int n = paramMotionEvent.findPointerIndex(paramInt);
      if (n < 0)
      {
        paramInt = 0;
        i2 = 0;
        break label37;
      }
      paramInt = (int)paramMotionEvent.getX(n);
      n = (int)paramMotionEvent.getY(n);
      int i1 = pointToPosition(paramInt, n);
      if (i1 == -1)
      {
        paramInt = 1;
        break label37;
      }
      View localView = getChildAt(i1 - getFirstVisiblePosition());
      a(localView, i1, paramInt, n);
      if (m != 1)
        break;
      a(localView, i1);
      break;
      if (this.k == null)
        break label93;
      this.k.a(false);
      return i2;
    }
  }

  public boolean hasFocus()
  {
    return (this.h) || (super.hasFocus());
  }

  public boolean hasWindowFocus()
  {
    return (this.h) || (super.hasWindowFocus());
  }

  public boolean isFocused()
  {
    return (this.h) || (super.isFocused());
  }

  public boolean isInTouchMode()
  {
    return ((this.h) && (this.g)) || (super.isInTouchMode());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ay
 * JD-Core Version:    0.6.0
 */