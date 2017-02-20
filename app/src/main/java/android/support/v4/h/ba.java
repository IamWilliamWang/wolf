package android.support.v4.h;

import android.view.View;

public abstract interface ba
{
  public native abstract boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);

  public native abstract boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2);

  public native abstract void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt);

  public native abstract void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public native abstract void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt);

  public native abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt);

  public native abstract void onStopNestedScroll(View paramView);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ba
 * JD-Core Version:    0.6.0
 */