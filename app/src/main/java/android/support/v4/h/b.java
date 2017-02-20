package android.support.v4.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class b extends e
{
  public Object a()
  {
    return f.a();
  }

  public Object a(a parama)
  {
    return f.a(new g(parama)
    {
      public void a(View paramView, int paramInt)
      {
        this.a.a(paramView, paramInt);
      }

      public void a(View paramView, Object paramObject)
      {
        this.a.a(paramView, new android.support.v4.h.a.f(paramObject));
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

  public void a(Object paramObject, View paramView, int paramInt)
  {
    f.a(paramObject, paramView, paramInt);
  }

  public void a(Object paramObject, View paramView, android.support.v4.h.a.f paramf)
  {
    f.a(paramObject, paramView, paramf.a());
  }

  public boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return f.a(paramObject, paramView, paramAccessibilityEvent);
  }

  public boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return f.a(paramObject, paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    f.b(paramObject, paramView, paramAccessibilityEvent);
  }

  public void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    f.c(paramObject, paramView, paramAccessibilityEvent);
  }

  public void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    f.d(paramObject, paramView, paramAccessibilityEvent);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.b
 * JD-Core Version:    0.6.0
 */