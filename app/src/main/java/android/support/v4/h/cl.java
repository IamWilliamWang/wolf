package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class cl
{
  static final cn a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new cp();
      return;
    }
    if (i >= 19)
    {
      a = new co();
      return;
    }
    if (i >= 14)
    {
      a = new cm();
      return;
    }
    a = new cq();
  }

  public static void a(ViewParent paramViewParent, View paramView)
  {
    a.a(paramViewParent, paramView);
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a.a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }

  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return a.a(paramViewParent, paramView1, paramView2, paramInt);
  }

  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    a.b(paramViewParent, paramView1, paramView2, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cl
 * JD-Core Version:    0.6.0
 */