package android.support.v4.h;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

class cr
{
  public static void a(ViewParent paramViewParent, View paramView)
  {
    try
    {
      paramViewParent.onStopNestedScroll(paramView);
      return;
    }
    catch (java.lang.AbstractMethodError paramView)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onStopNestedScroll", paramView);
    }
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (java.lang.AbstractMethodError paramView)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onNestedScroll", paramView);
    }
  }

  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    try
    {
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      return;
    }
    catch (java.lang.AbstractMethodError paramView)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onNestedPreScroll", paramView);
    }
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      boolean bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
      return bool;
    }
    catch (java.lang.AbstractMethodError paramView)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onNestedPreFling", paramView);
    }
    return false;
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      return paramBoolean;
    }
    catch (java.lang.AbstractMethodError paramView)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onNestedFling", paramView);
    }
    return false;
  }

  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      boolean bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
      return bool;
    }
    catch (java.lang.AbstractMethodError paramView1)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onStartNestedScroll", paramView1);
    }
    return false;
  }

  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
      return;
    }
    catch (java.lang.AbstractMethodError paramView1)
    {
      Log.e("ViewParentCompat", "ViewParent " + paramViewParent + " does not implement interface " + "method onNestedScrollAccepted", paramView1);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cr
 * JD-Core Version:    0.6.0
 */