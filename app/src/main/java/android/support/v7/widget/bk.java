package android.support.v7.widget;

import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.a.c;
import android.support.v7.b.b;
import android.support.v7.view.a;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public class bk extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator j = new DecelerateInterpolator();
  Runnable a;
  int b;
  int c;
  private bm d;
  private av e;
  private Spinner f;
  private boolean g;
  private int h;
  private int i;

  private bn a(c paramc, boolean paramBoolean)
  {
    paramc = new bn(this, getContext(), paramc, paramBoolean);
    if (paramBoolean)
    {
      paramc.setBackgroundDrawable(null);
      paramc.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
      return paramc;
    }
    paramc.setFocusable(true);
    if (this.d == null)
      this.d = new bm(this, null);
    paramc.setOnClickListener(this.d);
    return paramc;
  }

  private boolean a()
  {
    return (this.f != null) && (this.f.getParent() == this);
  }

  private void b()
  {
    if (a())
      return;
    if (this.f == null)
      this.f = d();
    removeView(this.e);
    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
    if (this.f.getAdapter() == null)
      this.f.setAdapter(new bl(this, null));
    if (this.a != null)
    {
      removeCallbacks(this.a);
      this.a = null;
    }
    this.f.setSelection(this.i);
  }

  private boolean c()
  {
    if (!a())
      return false;
    removeView(this.f);
    addView(this.e, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(this.f.getSelectedItemPosition());
    return false;
  }

  private Spinner d()
  {
    ak localak = new ak(getContext(), null, b.actionDropDownStyle);
    localak.setLayoutParams(new aw(-2, -1));
    localak.setOnItemSelectedListener(this);
    return localak;
  }

  public void a(int paramInt)
  {
    View localView = this.e.getChildAt(paramInt);
    if (this.a != null)
      removeCallbacks(this.a);
    this.a = new Runnable(localView)
    {
      public void run()
      {
        int i = this.a.getLeft();
        int j = (bk.this.getWidth() - this.a.getWidth()) / 2;
        bk.this.smoothScrollTo(i - j, 0);
        bk.this.a = null;
      }
    };
    post(this.a);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.a != null)
      post(this.a);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = a.a(getContext());
    setContentHeight(paramConfiguration.e());
    this.c = paramConfiguration.f();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
      removeCallbacks(this.a);
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((bn)paramView).b().d();
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int k = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (k == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int m = this.e.getChildCount();
      if ((m <= 1) || ((k != 1073741824) && (k != -2147483648)))
        break label190;
      if (m <= 2)
        break label177;
      this.b = (int)(View.MeasureSpec.getSize(paramInt1) * 0.4F);
      label68: this.b = Math.min(this.b, this.c);
      label83: k = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
      if ((bool) || (!this.g))
        break label198;
      label105: if (paramInt2 == 0)
        break label211;
      this.e.measure(0, k);
      if (this.e.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label203;
      b();
    }
    while (true)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, k);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1))
        setTabSelected(this.i);
      return;
      bool = false;
      break;
      label177: this.b = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label190: this.b = -1;
      break label83;
      label198: paramInt2 = 0;
      break label105;
      label203: c();
      continue;
      label211: c();
    }
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }

  public void setAllowCollapse(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void setContentHeight(int paramInt)
  {
    this.h = paramInt;
    requestLayout();
  }

  public void setTabSelected(int paramInt)
  {
    this.i = paramInt;
    int m = this.e.getChildCount();
    int k = 0;
    if (k < m)
    {
      View localView = this.e.getChildAt(k);
      if (k == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
          a(paramInt);
        k += 1;
        break;
      }
    }
    if ((this.f != null) && (paramInt >= 0))
      this.f.setSelection(paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bk
 * JD-Core Version:    0.6.0
 */