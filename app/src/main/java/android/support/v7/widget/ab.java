package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.v4.h.bi;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.view.View;

class ab
{
  private final View a;
  private final ac b;
  private by c;
  private by d;
  private by e;

  ab(View paramView, ac paramac)
  {
    this.a = paramView;
    this.b = paramac;
  }

  private boolean b(Drawable paramDrawable)
  {
    return (Build.VERSION.SDK_INT == 21) && ((paramDrawable instanceof GradientDrawable));
  }

  private void c(Drawable paramDrawable)
  {
    if (this.e == null)
      this.e = new by();
    by localby = this.e;
    localby.a();
    Object localObject = bi.n(this.a);
    if (localObject != null)
    {
      localby.d = true;
      localby.a = ((ColorStateList)localObject);
    }
    localObject = bi.o(this.a);
    if (localObject != null)
    {
      localby.c = true;
      localby.b = ((PorterDuff.Mode)localObject);
    }
    if ((localby.d) || (localby.c))
      ac.a(paramDrawable, localby, this.a.getDrawableState());
  }

  ColorStateList a()
  {
    if (this.d != null)
      return this.d.a;
    return null;
  }

  void a(int paramInt)
  {
    if (this.b != null);
    for (ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramInt); ; localColorStateList = null)
    {
      b(localColorStateList);
      return;
    }
  }

  void a(ColorStateList paramColorStateList)
  {
    if (this.d == null)
      this.d = new by();
    this.d.a = paramColorStateList;
    this.d.d = true;
    c();
  }

  void a(PorterDuff.Mode paramMode)
  {
    if (this.d == null)
      this.d = new by();
    this.d.b = paramMode;
    this.d.c = true;
    c();
  }

  void a(Drawable paramDrawable)
  {
    b(null);
  }

  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.a.getContext().obtainStyledAttributes(paramAttributeSet, k.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(k.ViewBackgroundHelper_android_background))
      {
        ColorStateList localColorStateList = this.b.b(this.a.getContext(), paramAttributeSet.getResourceId(k.ViewBackgroundHelper_android_background, -1));
        if (localColorStateList != null)
          b(localColorStateList);
      }
      if (paramAttributeSet.hasValue(k.ViewBackgroundHelper_backgroundTint))
        bi.a(this.a, paramAttributeSet.getColorStateList(k.ViewBackgroundHelper_backgroundTint));
      if (paramAttributeSet.hasValue(k.ViewBackgroundHelper_backgroundTintMode))
        bi.a(this.a, as.a(paramAttributeSet.getInt(k.ViewBackgroundHelper_backgroundTintMode, -1), null));
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
    throw localObject;
  }

  PorterDuff.Mode b()
  {
    if (this.d != null)
      return this.d.b;
    return null;
  }

  void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.c == null)
        this.c = new by();
      this.c.a = paramColorStateList;
      this.c.d = true;
    }
    while (true)
    {
      c();
      return;
      this.c = null;
    }
  }

  void c()
  {
    Drawable localDrawable = this.a.getBackground();
    if (localDrawable != null)
    {
      if (this.d == null)
        break label35;
      ac.a(localDrawable, this.d, this.a.getDrawableState());
    }
    label35: 
    do
    {
      return;
      if (this.c == null)
        continue;
      ac.a(localDrawable, this.c, this.a.getDrawableState());
      return;
    }
    while (!b(localDrawable));
    c(localDrawable);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ab
 * JD-Core Version:    0.6.0
 */