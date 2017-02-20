package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.h.bi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.SpinnerAdapter;

class am extends ax
{
  private CharSequence c;
  private ListAdapter d;
  private final Rect e = new Rect();

  public am(ak paramak, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramak);
    a(true);
    a(0);
    a(new AdapterView.OnItemClickListener(paramak)
    {
      public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
      {
        am.this.a.setSelection(paramInt);
        if (am.this.a.getOnItemClickListener() != null)
          am.this.a.performItemClick(paramView, paramInt, am.a(am.this).getItemId(paramInt));
        am.this.i();
      }
    });
  }

  private boolean b(View paramView)
  {
    return (bi.q(paramView)) && (paramView.getGlobalVisibleRect(this.e));
  }

  public CharSequence a()
  {
    return this.c;
  }

  public void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.d = paramListAdapter;
  }

  public void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }

  void b()
  {
    Object localObject = d();
    int i;
    int m;
    int n;
    int i1;
    int j;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(ak.b(this.a));
      if (ch.a(this.a))
      {
        i = ak.b(this.a).right;
        m = this.a.getPaddingLeft();
        n = this.a.getPaddingRight();
        i1 = this.a.getWidth();
        if (ak.c(this.a) != -2)
          break label240;
        j = ak.a(this.a, (SpinnerAdapter)this.d, d());
        int k = this.a.getContext().getResources().getDisplayMetrics().widthPixels - ak.b(this.a).left - ak.b(this.a).right;
        if (j <= k)
          break label288;
        j = k;
      }
    }
    label288: 
    while (true)
    {
      f(Math.max(j, i1 - m - n));
      label165: if (ch.a(this.a))
        i = i1 - n - h() + i;
      while (true)
      {
        b(i);
        return;
        i = -ak.b(this.a).left;
        break;
        localObject = ak.b(this.a);
        ak.b(this.a).right = 0;
        ((Rect)localObject).left = 0;
        i = 0;
        break;
        label240: if (ak.c(this.a) == -1)
        {
          f(i1 - m - n);
          break label165;
        }
        f(ak.c(this.a));
        break label165;
        i += m;
      }
    }
  }

  public void c()
  {
    boolean bool = k();
    b();
    g(2);
    super.c();
    m().setChoiceMode(1);
    h(this.a.getSelectedItemPosition());
    if (bool);
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = this.a.getViewTreeObserver();
    }
    while (localViewTreeObserver == null);
    2 local2 = new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        if (!am.a(am.this, am.this.a))
        {
          am.this.i();
          return;
        }
        am.this.b();
        am.b(am.this);
      }
    };
    localViewTreeObserver.addOnGlobalLayoutListener(local2);
    a(new PopupWindow.OnDismissListener(local2)
    {
      public void onDismiss()
      {
        ViewTreeObserver localViewTreeObserver = am.this.a.getViewTreeObserver();
        if (localViewTreeObserver != null)
          localViewTreeObserver.removeGlobalOnLayoutListener(this.a);
      }
    });
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.am
 * JD-Core Version:    0.6.0
 */