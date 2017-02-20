package android.support.v4.h;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class f
{
  public static Object a()
  {
    return new View.AccessibilityDelegate();
  }

  public static Object a(g paramg)
  {
    return new View.AccessibilityDelegate(paramg)
    {
      public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return f.this.a(paramView, paramAccessibilityEvent);
      }

      public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        f.this.b(paramView, paramAccessibilityEvent);
      }

      public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
      {
        f.this.a(paramView, paramAccessibilityNodeInfo);
      }

      public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        f.this.c(paramView, paramAccessibilityEvent);
      }

      public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return f.this.a(paramViewGroup, paramView, paramAccessibilityEvent);
      }

      public void sendAccessibilityEvent(View paramView, int paramInt)
      {
        f.this.a(paramView, paramInt);
      }

      public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        f.this.d(paramView, paramAccessibilityEvent);
      }
    };
  }

  public static void a(Object paramObject, View paramView, int paramInt)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt);
  }

  public static void a(Object paramObject1, View paramView, Object paramObject2)
  {
    ((View.AccessibilityDelegate)paramObject1).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)paramObject2);
  }

  public static boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public static boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public static void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public static void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public static void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.f
 * JD-Core Version:    0.6.0
 */