package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.x;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class aj extends PopupWindow
{
  private static final boolean a;
  private boolean b;

  static
  {
    if (Build.VERSION.SDK_INT < 21);
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public aj(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ca.a(paramContext, paramAttributeSet, k.PopupWindow, paramInt, 0);
    if (paramContext.f(k.PopupWindow_overlapAnchor))
      a(paramContext.a(k.PopupWindow_overlapAnchor, false));
    setBackgroundDrawable(paramContext.a(k.PopupWindow_android_popupBackground));
    paramContext.a();
    if (Build.VERSION.SDK_INT < 14)
      a(this);
  }

  private static void a(PopupWindow paramPopupWindow)
  {
    try
    {
      Field localField1 = PopupWindow.class.getDeclaredField("mAnchor");
      localField1.setAccessible(true);
      Field localField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
      localField2.setAccessible(true);
      localField2.set(paramPopupWindow, new ViewTreeObserver.OnScrollChangedListener(localField1, paramPopupWindow, (ViewTreeObserver.OnScrollChangedListener)localField2.get(paramPopupWindow))
      {
        public void onScrollChanged()
        {
          try
          {
            WeakReference localWeakReference = (WeakReference)aj.this.get(this.b);
            if (localWeakReference != null)
            {
              if (localWeakReference.get() == null)
                return;
              this.c.onScrollChanged();
              return;
            }
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
          }
        }
      });
      return;
    }
    catch (java.lang.Exception paramPopupWindow)
    {
      Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", paramPopupWindow);
    }
  }

  public void a(boolean paramBoolean)
  {
    if (a)
    {
      this.b = paramBoolean;
      return;
    }
    x.a(this, paramBoolean);
  }

  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight();
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }

  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight();
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }

  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((a) && (this.b))
      paramInt2 -= paramView.getHeight();
    while (true)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.aj
 * JD-Core Version:    0.6.0
 */