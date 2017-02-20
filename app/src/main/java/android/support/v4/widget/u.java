package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.h.a.aa;
import android.support.v4.h.a.f;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

class u extends android.support.v4.h.a
{
  public void a(View paramView, f paramf)
  {
    super.a(paramView, paramf);
    paramView = (NestedScrollView)paramView;
    paramf.a(ScrollView.class.getName());
    if (paramView.isEnabled())
    {
      int i = NestedScrollView.a(paramView);
      if (i > 0)
      {
        paramf.a(true);
        if (paramView.getScrollY() > 0)
          paramf.a(8192);
        if (paramView.getScrollY() < i)
          paramf.a(4096);
      }
    }
  }

  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    paramView = (NestedScrollView)paramView;
    if (!paramView.isEnabled())
      return false;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      paramInt = Math.min(paramView.getHeight() - paramView.getPaddingBottom() - paramView.getPaddingTop() + paramView.getScrollY(), NestedScrollView.a(paramView));
      if (paramInt != paramView.getScrollY())
      {
        paramView.b(0, paramInt);
        return true;
      }
      return false;
    case 8192:
    }
    paramInt = paramView.getHeight();
    int i = paramView.getPaddingBottom();
    int j = paramView.getPaddingTop();
    paramInt = Math.max(paramView.getScrollY() - (paramInt - i - j), 0);
    if (paramInt != paramView.getScrollY())
    {
      paramView.b(0, paramInt);
      return true;
    }
    return false;
  }

  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    paramAccessibilityEvent.setClassName(ScrollView.class.getName());
    paramAccessibilityEvent = android.support.v4.h.a.a.a(paramAccessibilityEvent);
    if (NestedScrollView.a(paramView) > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramAccessibilityEvent.a(bool);
      paramAccessibilityEvent.a(paramView.getScrollX());
      paramAccessibilityEvent.b(paramView.getScrollY());
      paramAccessibilityEvent.c(paramView.getScrollX());
      paramAccessibilityEvent.d(NestedScrollView.a(paramView));
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.u
 * JD-Core Version:    0.6.0
 */