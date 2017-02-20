package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.b;
import android.support.v7.b.e;
import android.support.v7.b.i;
import android.support.v7.b.k;
import android.support.v7.view.menu.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class cf
  implements ar
{
  private Toolbar a;
  private int b;
  private View c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private boolean g;
  private CharSequence h;
  private CharSequence i;
  private CharSequence j;
  private Window.Callback k;
  private boolean l;
  private int m = 0;
  private final ac n;
  private int o = 0;
  private Drawable p;

  public cf(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, i.abc_action_bar_up_description, e.abc_ic_ab_back_mtrl_am_alpha);
  }

  public cf(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramToolbar;
    this.h = paramToolbar.getTitle();
    this.i = paramToolbar.getSubtitle();
    boolean bool;
    if (this.h != null)
    {
      bool = true;
      this.g = bool;
      this.f = paramToolbar.getNavigationIcon();
      if (!paramBoolean)
        break label495;
      paramToolbar = ca.a(paramToolbar.getContext(), null, k.ActionBar, b.actionBarStyle, 0);
      Object localObject = paramToolbar.c(k.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject))
        b((CharSequence)localObject);
      localObject = paramToolbar.c(k.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject))
        c((CharSequence)localObject);
      localObject = paramToolbar.a(k.ActionBar_logo);
      if (localObject != null)
        c((Drawable)localObject);
      localObject = paramToolbar.a(k.ActionBar_icon);
      if ((this.f == null) && (localObject != null))
        a((Drawable)localObject);
      localObject = paramToolbar.a(k.ActionBar_homeAsUpIndicator);
      if (localObject != null)
        d((Drawable)localObject);
      d(paramToolbar.a(k.ActionBar_displayOptions, 0));
      int i1 = paramToolbar.g(k.ActionBar_customNavigationLayout, 0);
      if (i1 != 0)
      {
        a(LayoutInflater.from(this.a.getContext()).inflate(i1, this.a, false));
        d(this.b | 0x10);
      }
      i1 = paramToolbar.f(k.ActionBar_height, 0);
      if (i1 > 0)
      {
        localObject = this.a.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = i1;
        this.a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      i1 = paramToolbar.d(k.ActionBar_contentInsetStart, -1);
      int i2 = paramToolbar.d(k.ActionBar_contentInsetEnd, -1);
      if ((i1 >= 0) || (i2 >= 0))
        this.a.a(Math.max(i1, 0), Math.max(i2, 0));
      i1 = paramToolbar.g(k.ActionBar_titleTextStyle, 0);
      if (i1 != 0)
        this.a.a(this.a.getContext(), i1);
      i1 = paramToolbar.g(k.ActionBar_subtitleTextStyle, 0);
      if (i1 != 0)
        this.a.b(this.a.getContext(), i1);
      i1 = paramToolbar.g(k.ActionBar_popupTheme, 0);
      if (i1 != 0)
        this.a.setPopupTheme(i1);
      paramToolbar.a();
    }
    while (true)
    {
      this.n = ac.a();
      c(paramInt1);
      this.j = this.a.getNavigationContentDescription();
      b(this.n.a(b(), paramInt2));
      this.a.setNavigationOnClickListener(new View.OnClickListener()
      {
        final a a = new a(cf.a(cf.this).getContext(), 0, 16908332, 0, 0, cf.b(cf.this));

        public void onClick(View paramView)
        {
          if ((cf.c(cf.this) != null) && (cf.d(cf.this)))
            cf.c(cf.this).onMenuItemSelected(0, this.a);
        }
      });
      return;
      bool = false;
      break;
      label495: this.b = c();
    }
  }

  private int c()
  {
    int i1 = 11;
    if (this.a.getNavigationIcon() != null)
      i1 = 15;
    return i1;
  }

  private void d()
  {
    Drawable localDrawable = null;
    if ((this.b & 0x2) != 0)
    {
      if ((this.b & 0x1) == 0)
        break label49;
      if (this.e == null)
        break label41;
      localDrawable = this.e;
    }
    while (true)
    {
      this.a.setLogo(localDrawable);
      return;
      label41: localDrawable = this.d;
      continue;
      label49: localDrawable = this.d;
    }
  }

  private void e()
  {
    if ((this.b & 0x4) != 0)
    {
      if (TextUtils.isEmpty(this.j))
        this.a.setNavigationContentDescription(this.o);
    }
    else
      return;
    this.a.setNavigationContentDescription(this.j);
  }

  private void e(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setTitle(paramCharSequence);
  }

  private void f()
  {
    Toolbar localToolbar;
    if ((this.b & 0x4) != 0)
    {
      localToolbar = this.a;
      if (this.f == null)
        break label32;
    }
    label32: for (Drawable localDrawable = this.f; ; localDrawable = this.p)
    {
      localToolbar.setNavigationIcon(localDrawable);
      return;
    }
  }

  public CharSequence a()
  {
    return this.a.getTitle();
  }

  public void a(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = this.n.a(b(), paramInt); ; localDrawable = null)
    {
      a(localDrawable);
      return;
    }
  }

  public void a(Drawable paramDrawable)
  {
    this.d = paramDrawable;
    d();
  }

  public void a(View paramView)
  {
    if ((this.c != null) && ((this.b & 0x10) != 0))
      this.a.removeView(this.c);
    this.c = paramView;
    if ((paramView != null) && ((this.b & 0x10) != 0))
      this.a.addView(this.c);
  }

  public void a(Window.Callback paramCallback)
  {
    this.k = paramCallback;
  }

  public void a(CharSequence paramCharSequence)
  {
    if (!this.g)
      e(paramCharSequence);
  }

  public Context b()
  {
    return this.a.getContext();
  }

  public void b(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = this.n.a(b(), paramInt); ; localDrawable = null)
    {
      c(localDrawable);
      return;
    }
  }

  public void b(Drawable paramDrawable)
  {
    if (this.p != paramDrawable)
    {
      this.p = paramDrawable;
      f();
    }
  }

  public void b(CharSequence paramCharSequence)
  {
    this.g = true;
    e(paramCharSequence);
  }

  public void c(int paramInt)
  {
    if (paramInt == this.o);
    do
    {
      return;
      this.o = paramInt;
    }
    while (!TextUtils.isEmpty(this.a.getNavigationContentDescription()));
    e(this.o);
  }

  public void c(Drawable paramDrawable)
  {
    this.e = paramDrawable;
    d();
  }

  public void c(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0)
      this.a.setSubtitle(paramCharSequence);
  }

  public void d(int paramInt)
  {
    int i1 = this.b ^ paramInt;
    this.b = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) == 0)
          break label115;
        f();
        e();
      }
      if ((i1 & 0x3) != 0)
        d();
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0)
          break label126;
        this.a.setTitle(this.h);
        this.a.setSubtitle(this.i);
      }
    }
    while (true)
    {
      if (((i1 & 0x10) != 0) && (this.c != null))
      {
        if ((paramInt & 0x10) == 0)
          break label145;
        this.a.addView(this.c);
      }
      return;
      label115: this.a.setNavigationIcon(null);
      break;
      label126: this.a.setTitle(null);
      this.a.setSubtitle(null);
    }
    label145: this.a.removeView(this.c);
  }

  public void d(Drawable paramDrawable)
  {
    this.f = paramDrawable;
    f();
  }

  public void d(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
    e();
  }

  public void e(int paramInt)
  {
    if (paramInt == 0);
    for (Object localObject = null; ; localObject = b().getString(paramInt))
    {
      d((CharSequence)localObject);
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.cf
 * JD-Core Version:    0.6.0
 */