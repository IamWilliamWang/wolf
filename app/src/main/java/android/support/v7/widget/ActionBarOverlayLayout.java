package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.ba;
import android.support.v4.h.bb;
import android.support.v4.h.bi;
import android.support.v4.h.cs;
import android.support.v4.h.de;
import android.support.v4.h.df;
import android.support.v4.widget.aj;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout extends ViewGroup
  implements ba
{
  static final int[] a = { b.actionBarSize, 16842841 };
  private final Runnable A = new Runnable()
  {
    public void run()
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, bi.i(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)).a(-ActionBarOverlayLayout.c(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.b(ActionBarOverlayLayout.this)));
    }
  };
  private final bb B;
  private int b;
  private int c = 0;
  private ContentFrameLayout d;
  private ActionBarContainer e;
  private ar f;
  private Drawable g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private int m;
  private int n;
  private final Rect o = new Rect();
  private final Rect p = new Rect();
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private e u;
  private final int v = 600;
  private aj w;
  private cs x;
  private final de y = new df()
  {
    public void b(View paramView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }

    public void c(View paramView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, false);
    }
  };
  private final Runnable z = new Runnable()
  {
    public void run()
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, bi.i(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)).a(0.0F).a(ActionBarOverlayLayout.b(ActionBarOverlayLayout.this)));
    }
  };

  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.B = new bb(this);
  }

  private ar a(View paramView)
  {
    if ((paramView instanceof ar))
      return (ar)paramView;
    if ((paramView instanceof Toolbar))
      return ((Toolbar)paramView).getWrapper();
    throw new IllegalStateException("Can't make a decor toolbar out of " + paramView.getClass().getSimpleName());
  }

  private void a(Context paramContext)
  {
    boolean bool2 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(a);
    this.b = localTypedArray.getDimensionPixelSize(0, 0);
    this.g = localTypedArray.getDrawable(1);
    if (this.g == null)
    {
      bool1 = true;
      setWillNotDraw(bool1);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19)
        break label90;
    }
    label90: for (boolean bool1 = bool2; ; bool1 = false)
    {
      this.h = bool1;
      this.w = aj.a(paramContext);
      return;
      bool1 = false;
      break;
    }
  }

  private boolean a(float paramFloat1, float paramFloat2)
  {
    int i1 = 0;
    this.w.a(0, 0, 0, (int)paramFloat2, 0, 0, -2147483648, 2147483647);
    if (this.w.d() > this.e.getHeight())
      i1 = 1;
    return i1;
  }

  private boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    boolean bool2 = false;
    paramView = (f)paramView.getLayoutParams();
    boolean bool1 = bool2;
    if (paramBoolean1)
    {
      bool1 = bool2;
      if (paramView.leftMargin != paramRect.left)
      {
        paramView.leftMargin = paramRect.left;
        bool1 = true;
      }
    }
    paramBoolean1 = bool1;
    if (paramBoolean2)
    {
      paramBoolean1 = bool1;
      if (paramView.topMargin != paramRect.top)
      {
        paramView.topMargin = paramRect.top;
        paramBoolean1 = true;
      }
    }
    paramBoolean2 = paramBoolean1;
    if (paramBoolean4)
    {
      paramBoolean2 = paramBoolean1;
      if (paramView.rightMargin != paramRect.right)
      {
        paramView.rightMargin = paramRect.right;
        paramBoolean2 = true;
      }
    }
    if ((paramBoolean3) && (paramView.bottomMargin != paramRect.bottom))
    {
      paramView.bottomMargin = paramRect.bottom;
      return true;
    }
    return paramBoolean2;
  }

  private void c()
  {
    removeCallbacks(this.z);
    removeCallbacks(this.A);
    if (this.x != null)
      this.x.a();
  }

  private void d()
  {
    c();
    postDelayed(this.z, 600L);
  }

  private void e()
  {
    c();
    postDelayed(this.A, 600L);
  }

  private void f()
  {
    c();
    this.z.run();
  }

  private void g()
  {
    c();
    this.A.run();
  }

  protected f a()
  {
    return new f(-1, -1);
  }

  public f a(AttributeSet paramAttributeSet)
  {
    return new f(getContext(), paramAttributeSet);
  }

  void b()
  {
    if (this.d == null)
    {
      this.d = ((ContentFrameLayout)findViewById(android.support.v7.b.f.action_bar_activity_content));
      this.e = ((ActionBarContainer)findViewById(android.support.v7.b.f.action_bar_container));
      this.f = a(findViewById(android.support.v7.b.f.action_bar));
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof f;
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.g != null) && (!this.h))
      if (this.e.getVisibility() != 0)
        break label82;
    label82: for (int i1 = (int)(this.e.getBottom() + bi.g(this.e) + 0.5F); ; i1 = 0)
    {
      this.g.setBounds(0, i1, getWidth(), this.g.getIntrinsicHeight() + i1);
      this.g.draw(paramCanvas);
      return;
    }
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    b();
    if ((bi.j(this) & 0x100) != 0);
    boolean bool = a(this.e, paramRect, true, true, false, true);
    this.r.set(paramRect);
    ch.a(this, this.r, this.o);
    if (!this.p.equals(this.o))
    {
      this.p.set(this.o);
      bool = true;
    }
    if (bool)
      requestLayout();
    return true;
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new f(paramLayoutParams);
  }

  public int getActionBarHideOffset()
  {
    if (this.e != null)
      return -(int)bi.g(this.e);
    return 0;
  }

  public int getNestedScrollAxes()
  {
    return this.B.a();
  }

  public CharSequence getTitle()
  {
    b();
    return this.f.a();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    bi.k(this);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    c();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        f localf = (f)localView.getLayoutParams();
        int i1 = localView.getMeasuredWidth();
        int i2 = localView.getMeasuredHeight();
        int i3 = localf.leftMargin + paramInt3;
        int i4 = localf.topMargin + paramInt4;
        localView.layout(i3, i4, i1 + i3, i2 + i4);
      }
      paramInt1 += 1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    b();
    measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
    Object localObject = (f)this.e.getLayoutParams();
    int i6 = Math.max(0, this.e.getMeasuredWidth() + ((f)localObject).leftMargin + ((f)localObject).rightMargin);
    int i1 = this.e.getMeasuredHeight();
    int i2 = ((f)localObject).topMargin;
    int i5 = Math.max(0, ((f)localObject).bottomMargin + (i1 + i2));
    int i4 = ch.a(0, bi.f(this.e));
    int i3;
    if ((bi.j(this) & 0x100) != 0)
    {
      i2 = 1;
      if (i2 == 0)
        break label448;
      i3 = this.b;
      i1 = i3;
      if (this.j)
      {
        i1 = i3;
        if (this.e.getTabContainer() != null)
          i1 = i3 + this.b;
      }
    }
    while (true)
    {
      label153: this.q.set(this.o);
      this.s.set(this.r);
      if ((!this.i) && (i2 == 0))
      {
        localObject = this.q;
        ((Rect)localObject).top = (i1 + ((Rect)localObject).top);
        localObject = this.q;
        ((Rect)localObject).bottom += 0;
      }
      while (true)
      {
        a(this.d, this.q, true, true, true, true);
        if (!this.t.equals(this.s))
        {
          this.t.set(this.s);
          this.d.a(this.s);
        }
        measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
        localObject = (f)this.d.getLayoutParams();
        i1 = Math.max(i6, this.d.getMeasuredWidth() + ((f)localObject).leftMargin + ((f)localObject).rightMargin);
        i2 = this.d.getMeasuredHeight();
        i3 = ((f)localObject).topMargin;
        i2 = Math.max(i5, ((f)localObject).bottomMargin + (i2 + i3));
        i3 = ch.a(i4, bi.f(this.d));
        i4 = getPaddingLeft();
        i5 = getPaddingRight();
        i2 = Math.max(i2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(bi.a(Math.max(i1 + (i4 + i5), getSuggestedMinimumWidth()), paramInt1, i3), bi.a(i2, paramInt2, i3 << 16));
        return;
        i2 = 0;
        break;
        label448: if (this.e.getVisibility() == 8)
          break label510;
        i1 = this.e.getMeasuredHeight();
        break label153;
        localObject = this.s;
        ((Rect)localObject).top = (i1 + ((Rect)localObject).top);
        localObject = this.s;
        ((Rect)localObject).bottom += 0;
      }
      label510: i1 = 0;
    }
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((!this.k) || (!paramBoolean))
      return false;
    if (a(paramFloat1, paramFloat2))
      g();
    while (true)
    {
      this.l = true;
      return true;
      f();
    }
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m += paramInt2;
    setActionBarHideOffset(this.m);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.B.a(paramView1, paramView2, paramInt);
    this.m = getActionBarHideOffset();
    c();
    if (this.u != null)
      this.u.c();
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.e.getVisibility() != 0))
      return false;
    return this.k;
  }

  public void onStopNestedScroll(View paramView)
  {
    if ((this.k) && (!this.l))
    {
      if (this.m > this.e.getHeight())
        break label49;
      d();
    }
    while (true)
    {
      if (this.u != null)
        this.u.d();
      return;
      label49: e();
    }
  }

  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16)
      super.onWindowSystemUiVisibilityChanged(paramInt);
    b();
    int i3 = this.n;
    this.n = paramInt;
    int i1;
    int i2;
    if ((paramInt & 0x4) == 0)
    {
      i1 = 1;
      if ((paramInt & 0x100) == 0)
        break label120;
      i2 = 1;
      label49: if (this.u != null)
      {
        e locale = this.u;
        if (i2 != 0)
          break label125;
        label66: locale.a(bool);
        if ((i1 == 0) && (i2 != 0))
          break label131;
        this.u.a();
      }
    }
    while (true)
    {
      if ((((i3 ^ paramInt) & 0x100) != 0) && (this.u != null))
        bi.k(this);
      return;
      i1 = 0;
      break;
      label120: i2 = 0;
      break label49;
      label125: bool = false;
      break label66;
      label131: this.u.b();
    }
  }

  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    if (this.u != null)
      this.u.a(paramInt);
  }

  public void setActionBarHideOffset(int paramInt)
  {
    c();
    paramInt = Math.max(0, Math.min(paramInt, this.e.getHeight()));
    bi.a(this.e, -paramInt);
  }

  public void setActionBarVisibilityCallback(e parame)
  {
    this.u = parame;
    if (getWindowToken() != null)
    {
      this.u.a(this.c);
      if (this.n != 0)
      {
        onWindowSystemUiVisibilityChanged(this.n);
        bi.k(this);
      }
    }
  }

  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.k)
    {
      this.k = paramBoolean;
      if (!paramBoolean)
      {
        c();
        setActionBarHideOffset(0);
      }
    }
  }

  public void setIcon(int paramInt)
  {
    b();
    this.f.a(paramInt);
  }

  public void setIcon(Drawable paramDrawable)
  {
    b();
    this.f.a(paramDrawable);
  }

  public void setLogo(int paramInt)
  {
    b();
    this.f.b(paramInt);
  }

  public void setOverlayMode(boolean paramBoolean)
  {
    this.i = paramBoolean;
    if ((paramBoolean) && (getContext().getApplicationInfo().targetSdkVersion < 19));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.h = paramBoolean;
      return;
    }
  }

  public void setShowingForActionMode(boolean paramBoolean)
  {
  }

  public void setUiOptions(int paramInt)
  {
  }

  public void setWindowCallback(Window.Callback paramCallback)
  {
    b();
    this.f.a(paramCallback);
  }

  public void setWindowTitle(CharSequence paramCharSequence)
  {
    b();
    this.f.a(paramCharSequence);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.0
 */