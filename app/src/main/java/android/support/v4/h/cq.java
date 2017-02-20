package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

class cq
  implements cn
{
  public void a(ViewParent paramViewParent, View paramView)
  {
    if ((paramViewParent instanceof ba))
      ((ba)paramViewParent).onStopNestedScroll(paramView);
  }

  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramViewParent instanceof ba))
      ((ba)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramViewParent instanceof ba))
      ((ba)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
  }

  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    if ((paramViewParent instanceof ba))
      return ((ba)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2);
    return false;
  }

  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((paramViewParent instanceof ba))
      return ((ba)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    return false;
  }

  public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof ba))
      return ((ba)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt);
    return false;
  }

  public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof ba))
      ((ba)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cq
 * JD-Core Version:    0.6.0
 */