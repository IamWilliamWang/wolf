package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout
  implements at
{
  private au a;

  public FitWindowsFrameLayout(Context paramContext)
  {
    super(paramContext);
  }

  public FitWindowsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    if (this.a != null)
      this.a.a(paramRect);
    return super.fitSystemWindows(paramRect);
  }

  public void setOnFitSystemWindowsListener(au paramau)
  {
    this.a = paramau;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.FitWindowsFrameLayout
 * JD-Core Version:    0.6.0
 */