package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class aw extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;

  public aw(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }

  public aw(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, k.LinearLayoutCompat_Layout);
    this.g = paramContext.getFloat(k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
    this.h = paramContext.getInt(k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
    paramContext.recycle();
  }

  public aw(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.aw
 * JD-Core Version:    0.6.0
 */