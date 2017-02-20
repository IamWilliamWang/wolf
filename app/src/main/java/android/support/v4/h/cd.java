package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.View;

class cd
{
  public static void a(View paramView)
  {
    paramView.requestApplyInsets();
  }

  public static void a(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }

  static void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }

  static void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }

  static ColorStateList b(View paramView)
  {
    return paramView.getBackgroundTintList();
  }

  static PorterDuff.Mode c(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }

  public static void d(View paramView)
  {
    paramView.stopNestedScroll();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cd
 * JD-Core Version:    0.6.0
 */