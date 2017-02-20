package android.support.v4.h.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class y
{
  public static Object a(z paramz)
  {
    return new AccessibilityNodeProvider(paramz)
    {
      public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
      {
        return (AccessibilityNodeInfo)y.this.a(paramInt);
      }

      public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
      {
        return y.this.a(paramString, paramInt);
      }

      public AccessibilityNodeInfo findFocus(int paramInt)
      {
        return (AccessibilityNodeInfo)y.this.b(paramInt);
      }

      public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
      {
        return y.this.a(paramInt1, paramInt2, paramBundle);
      }
    };
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.y
 * JD-Core Version:    0.6.0
 */