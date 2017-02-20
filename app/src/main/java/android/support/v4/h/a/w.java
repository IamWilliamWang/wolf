package android.support.v4.h.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class w
{
  public static Object a(x paramx)
  {
    return new AccessibilityNodeProvider(paramx)
    {
      public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
      {
        return (AccessibilityNodeInfo)w.this.a(paramInt);
      }

      public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
      {
        return w.this.a(paramString, paramInt);
      }

      public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
      {
        return w.this.a(paramInt1, paramInt2, paramBundle);
      }
    };
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.w
 * JD-Core Version:    0.6.0
 */