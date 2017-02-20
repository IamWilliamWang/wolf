package android.support.v4.h;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

class h
{
  public static Object a(i parami)
  {
    return new View.AccessibilityDelegate(parami)
    {
      public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return h.this.a(paramView, paramAccessibilityEvent);
      }

      public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
      {
        return (AccessibilityNodeProvider)h.this.a(paramView);
      }

      public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        h.this.b(paramView, paramAccessibilityEvent);
      }

      public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
      {
        h.this.a(paramView, paramAccessibilityNodeInfo);
      }

      public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        h.this.c(paramView, paramAccessibilityEvent);
      }

      public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return h.this.a(paramViewGroup, paramView, paramAccessibilityEvent);
      }

      public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
      {
        return h.this.a(paramView, paramInt, paramBundle);
      }

      public void sendAccessibilityEvent(View paramView, int paramInt)
      {
        h.this.a(paramView, paramInt);
      }

      public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        h.this.d(paramView, paramAccessibilityEvent);
      }
    };
  }

  public static Object a(Object paramObject, View paramView)
  {
    return ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
  }

  public static boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.h
 * JD-Core Version:    0.6.0
 */