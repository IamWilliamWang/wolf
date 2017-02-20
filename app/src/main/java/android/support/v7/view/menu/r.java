package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.b;
import android.support.v7.b.d;
import android.support.v7.b.h;
import android.support.v7.widget.ax;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class r
  implements t, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int a = h.abc_popup_menu_item_layout;
  boolean b;
  private final Context c;
  private final LayoutInflater d;
  private final g e;
  private final s f;
  private final boolean g;
  private final int h;
  private final int i;
  private final int j;
  private View k;
  private ax l;
  private ViewTreeObserver m;
  private u n;
  private ViewGroup o;
  private boolean p;
  private int q;
  private int r = 0;

  public r(Context paramContext, g paramg, View paramView)
  {
    this(paramContext, paramg, paramView, false, b.popupMenuStyle);
  }

  public r(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramg, paramView, paramBoolean, paramInt, 0);
  }

  public r(Context paramContext, g paramg, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.e = paramg;
    this.f = new s(this, this.e);
    this.g = paramBoolean;
    this.i = paramInt1;
    this.j = paramInt2;
    Resources localResources = paramContext.getResources();
    this.h = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
    this.k = paramView;
    paramg.a(this, paramContext);
  }

  private int g()
  {
    s locals = this.f;
    int i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i7 = locals.getCount();
    int i2 = 0;
    int i3 = 0;
    View localView = null;
    int i1 = 0;
    int i4 = i1;
    if (i2 < i7)
    {
      i4 = locals.getItemViewType(i2);
      if (i4 == i3)
        break label157;
      i3 = i4;
      localView = null;
      label69: if (this.o == null)
        this.o = new FrameLayout(this.c);
      localView = locals.getView(i2, localView, this.o);
      localView.measure(i5, i6);
      i4 = localView.getMeasuredWidth();
      if (i4 >= this.h)
        i4 = this.h;
    }
    else
    {
      return i4;
    }
    if (i4 > i1)
      i1 = i4;
    while (true)
    {
      i2 += 1;
      break;
      label157: break label69;
    }
  }

  public void a()
  {
    if (!d())
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }

  public void a(int paramInt)
  {
    this.r = paramInt;
  }

  public void a(Context paramContext, g paramg)
  {
  }

  public void a(g paramg, boolean paramBoolean)
  {
    if (paramg != this.e);
    do
    {
      return;
      e();
    }
    while (this.n == null);
    this.n.a(paramg, paramBoolean);
  }

  public void a(u paramu)
  {
    this.n = paramu;
  }

  public void a(View paramView)
  {
    this.k = paramView;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public boolean a(g paramg, j paramj)
  {
    return false;
  }

  public boolean a(z paramz)
  {
    r localr;
    int i1;
    if (paramz.hasVisibleItems())
    {
      localr = new r(this.c, paramz, this.k);
      localr.a(this.n);
      int i2 = paramz.size();
      i1 = 0;
      if (i1 >= i2)
        break label120;
      MenuItem localMenuItem = paramz.getItem(i1);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label120: for (boolean bool = true; ; bool = false)
    {
      localr.a(bool);
      if (localr.d())
      {
        if (this.n != null)
          this.n.a(paramz);
        return true;
        i1 += 1;
        break;
      }
      return false;
    }
  }

  public void b(boolean paramBoolean)
  {
    this.p = false;
    if (this.f != null)
      this.f.notifyDataSetChanged();
  }

  public boolean b()
  {
    return false;
  }

  public boolean b(g paramg, j paramj)
  {
    return false;
  }

  public ax c()
  {
    return this.l;
  }

  public boolean d()
  {
    int i1 = 0;
    this.l = new ax(this.c, null, this.i, this.j);
    this.l.a(this);
    this.l.a(this);
    this.l.a(this.f);
    this.l.a(true);
    View localView = this.k;
    if (localView != null)
    {
      if (this.m == null)
        i1 = 1;
      this.m = localView.getViewTreeObserver();
      if (i1 != 0)
        this.m.addOnGlobalLayoutListener(this);
      this.l.a(localView);
      this.l.d(this.r);
      if (!this.p)
      {
        this.q = g();
        this.p = true;
      }
      this.l.f(this.q);
      this.l.g(2);
      this.l.c();
      this.l.m().setOnKeyListener(this);
      return true;
    }
    return false;
  }

  public void e()
  {
    if (f())
      this.l.i();
  }

  public boolean f()
  {
    return (this.l != null) && (this.l.k());
  }

  public void onDismiss()
  {
    this.l = null;
    this.e.close();
    if (this.m != null)
    {
      if (!this.m.isAlive())
        this.m = this.k.getViewTreeObserver();
      this.m.removeGlobalOnLayoutListener(this);
      this.m = null;
    }
  }

  public void onGlobalLayout()
  {
    if (f())
    {
      View localView = this.k;
      if ((localView != null) && (localView.isShown()))
        break label28;
      e();
    }
    label28: 
    do
      return;
    while (!f());
    this.l.c();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.f;
    s.a(paramAdapterView).a(paramAdapterView.a(paramInt), 0);
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      e();
      return true;
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.r
 * JD-Core Version:    0.6.0
 */