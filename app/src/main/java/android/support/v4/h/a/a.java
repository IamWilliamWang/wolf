package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final e a;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new b();
      return;
    }
    a = new d();
  }

  public static aa a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new aa(paramAccessibilityEvent);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.a
 * JD-Core Version:    0.6.0
 */