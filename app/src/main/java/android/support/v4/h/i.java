package android.support.v4.h;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public abstract interface i
{
  public native abstract Object a(View paramView);

  public native abstract void a(View paramView, int paramInt);

  public native abstract void a(View paramView, Object paramObject);

  public native abstract boolean a(View paramView, int paramInt, Bundle paramBundle);

  public native abstract boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public native abstract boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public native abstract void b(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public native abstract void c(View paramView, AccessibilityEvent paramAccessibilityEvent);

  public native abstract void d(View paramView, AccessibilityEvent paramAccessibilityEvent);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.i
 * JD-Core Version:    0.6.0
 */