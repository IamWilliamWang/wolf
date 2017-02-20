package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class b extends ViewGroup.MarginLayoutParams
{
  public int a = 0;

  public b(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }

  public b(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, k.ActionBarLayout);
    this.a = paramContext.getInt(k.ActionBarLayout_android_layout_gravity, 0);
    paramContext.recycle();
  }

  public b(b paramb)
  {
    super(paramb);
    this.a = paramb.a;
  }

  public b(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.a.b
 * JD-Core Version:    0.6.0
 */