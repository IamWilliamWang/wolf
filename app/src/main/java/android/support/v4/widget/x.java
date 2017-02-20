package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class x
{
  static final ad a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new z();
      return;
    }
    if (i >= 21)
    {
      a = new y();
      return;
    }
    if (i >= 19)
    {
      a = new ac();
      return;
    }
    if (i >= 9)
    {
      a = new ab();
      return;
    }
    a = new aa();
  }

  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    a.a(paramPopupWindow, paramInt);
  }

  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }

  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    a.a(paramPopupWindow, paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.x
 * JD-Core Version:    0.6.0
 */