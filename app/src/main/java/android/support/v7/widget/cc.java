package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class cc extends b
{
  int b = 0;

  public cc(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }

  public cc(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public cc(b paramb)
  {
    super(paramb);
  }

  public cc(cc paramcc)
  {
    super(paramcc);
    this.b = paramcc.b;
  }

  public cc(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public cc(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    a(paramMarginLayoutParams);
  }

  void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    this.leftMargin = paramMarginLayoutParams.leftMargin;
    this.topMargin = paramMarginLayoutParams.topMargin;
    this.rightMargin = paramMarginLayoutParams.rightMargin;
    this.bottomMargin = paramMarginLayoutParams.bottomMargin;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.cc
 * JD-Core Version:    0.6.0
 */