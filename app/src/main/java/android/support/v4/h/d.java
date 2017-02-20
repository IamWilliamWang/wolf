package android.support.v4.h;

import android.os.Bundle;
import android.support.v4.h.a.f;
import android.support.v4.h.a.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class d extends b
{
  public r a(Object paramObject, View paramView)
  {
    paramObject = h.a(paramObject, paramView);
    if (paramObject != null)
      return new r(paramObject);
    return null;
  }

  public Object a(a parama)
  {
    return h.a(new i(parama)
    {
      public Object a(View paramView)
      {
        paramView = this.a.a(paramView);
        if (paramView != null)
          return paramView.a();
        return null;
      }

      public void a(View paramView, int paramInt)
      {
        this.a.a(paramView, paramInt);
      }

      public void a(View paramView, Object paramObject)
      {
        this.a.a(paramView, new f(paramObject));
      }

      public boolean a(View paramView, int paramInt, Bundle paramBundle)
      {
        return this.a.a(paramView, paramInt, paramBundle);
      }

      public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return this.a.b(paramView, paramAccessibilityEvent);
      }

      public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
      }

      public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        this.a.d(paramView, paramAccessibilityEvent);
      }

      public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        this.a.c(paramView, paramAccessibilityEvent);
      }

      public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
      {
        this.a.a(paramView, paramAccessibilityEvent);
      }
    });
  }

  public boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return h.a(paramObject, paramView, paramInt, paramBundle);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.d
 * JD-Core Version:    0.6.0
 */