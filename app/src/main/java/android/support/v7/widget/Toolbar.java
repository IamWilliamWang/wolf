package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.h.ah;
import android.support.v4.h.ap;
import android.support.v4.h.bi;
import android.support.v4.h.m;
import android.support.v7.b.k;
import android.support.v7.view.d;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup
{
  private boolean A;
  private final ArrayList<View> B = new ArrayList();
  private final ArrayList<View> C = new ArrayList();
  private final int[] D = new int[2];
  private cd E;
  private final r F = new r()
  {
    public boolean a(MenuItem paramMenuItem)
    {
      if (Toolbar.a(Toolbar.this) != null)
        return Toolbar.a(Toolbar.this).a(paramMenuItem);
      return false;
    }
  };
  private cf G;
  private cb H;
  private u I;
  private h J;
  private boolean K;
  private final Runnable L = new Runnable()
  {
    public void run()
    {
      Toolbar.this.b();
    }
  };
  private final ac M;
  View a;
  private ActionMenuView b;
  private TextView c;
  private TextView d;
  private ImageButton e;
  private ImageView f;
  private Drawable g;
  private CharSequence h;
  private ImageButton i;
  private Context j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private final bj t = new bj();
  private int u = 8388627;
  private CharSequence v;
  private CharSequence w;
  private int x;
  private int y;
  private boolean z;

  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, android.support.v7.b.b.toolbarStyle);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ca.a(getContext(), paramAttributeSet, k.Toolbar, paramInt, 0);
    this.l = paramContext.g(k.Toolbar_titleTextAppearance, 0);
    this.m = paramContext.g(k.Toolbar_subtitleTextAppearance, 0);
    this.u = paramContext.c(k.Toolbar_android_gravity, this.u);
    this.n = 48;
    paramInt = paramContext.d(k.Toolbar_titleMargins, 0);
    this.s = paramInt;
    this.r = paramInt;
    this.q = paramInt;
    this.p = paramInt;
    paramInt = paramContext.d(k.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0)
      this.p = paramInt;
    paramInt = paramContext.d(k.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0)
      this.q = paramInt;
    paramInt = paramContext.d(k.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0)
      this.r = paramInt;
    paramInt = paramContext.d(k.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0)
      this.s = paramInt;
    this.o = paramContext.e(k.Toolbar_maxButtonHeight, -1);
    paramInt = paramContext.d(k.Toolbar_contentInsetStart, -2147483648);
    int i1 = paramContext.d(k.Toolbar_contentInsetEnd, -2147483648);
    int i2 = paramContext.e(k.Toolbar_contentInsetLeft, 0);
    int i3 = paramContext.e(k.Toolbar_contentInsetRight, 0);
    this.t.b(i2, i3);
    if ((paramInt != -2147483648) || (i1 != -2147483648))
      this.t.a(paramInt, i1);
    this.g = paramContext.a(k.Toolbar_collapseIcon);
    this.h = paramContext.c(k.Toolbar_collapseContentDescription);
    paramAttributeSet = paramContext.c(k.Toolbar_title);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setTitle(paramAttributeSet);
    paramAttributeSet = paramContext.c(k.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setSubtitle(paramAttributeSet);
    this.j = getContext();
    setPopupTheme(paramContext.g(k.Toolbar_popupTheme, 0));
    paramAttributeSet = paramContext.a(k.Toolbar_navigationIcon);
    if (paramAttributeSet != null)
      setNavigationIcon(paramAttributeSet);
    paramAttributeSet = paramContext.c(k.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setNavigationContentDescription(paramAttributeSet);
    paramAttributeSet = paramContext.a(k.Toolbar_logo);
    if (paramAttributeSet != null)
      setLogo(paramAttributeSet);
    paramAttributeSet = paramContext.c(k.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramAttributeSet))
      setLogoDescription(paramAttributeSet);
    if (paramContext.f(k.Toolbar_titleTextColor))
      setTitleTextColor(paramContext.b(k.Toolbar_titleTextColor, -1));
    if (paramContext.f(k.Toolbar_subtitleTextColor))
      setSubtitleTextColor(paramContext.b(k.Toolbar_subtitleTextColor, -1));
    paramContext.a();
    this.M = ac.a();
  }

  private int a(int paramInt)
  {
    int i1 = paramInt & 0x70;
    paramInt = i1;
    switch (i1)
    {
    default:
      paramInt = this.u & 0x70;
    case 16:
    case 48:
    case 80:
    }
    return paramInt;
  }

  private int a(View paramView, int paramInt)
  {
    cc localcc = (cc)paramView.getLayoutParams();
    int i2 = paramView.getMeasuredHeight();
    int i1;
    int i3;
    int i4;
    if (paramInt > 0)
    {
      paramInt = (i2 - paramInt) / 2;
      switch (a(localcc.a))
      {
      default:
        i1 = getPaddingTop();
        i3 = getPaddingBottom();
        i4 = getHeight();
        paramInt = (i4 - i1 - i3 - i2) / 2;
        if (paramInt >= localcc.topMargin)
          break;
        paramInt = localcc.topMargin;
      case 48:
      case 80:
      }
    }
    while (true)
    {
      return paramInt + i1;
      paramInt = 0;
      break;
      return getPaddingTop() - paramInt;
      return getHeight() - getPaddingBottom() - i2 - localcc.bottomMargin - paramInt;
      i2 = i4 - i3 - i2 - paramInt - i1;
      if (i2 < localcc.bottomMargin)
      {
        paramInt = Math.max(0, paramInt - (localcc.bottomMargin - i2));
        continue;
      }
    }
  }

  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + i3 + paramInt2, localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + i3;
  }

  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    cc localcc = (cc)paramView.getLayoutParams();
    int i1 = localcc.leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i1) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i1, paramView.getMeasuredHeight() + paramInt2);
    return localcc.rightMargin + i1 + paramInt1;
  }

  private int a(List<View> paramList, int[] paramArrayOfInt)
  {
    int i4 = paramArrayOfInt[0];
    int i3 = paramArrayOfInt[1];
    int i5 = paramList.size();
    int i2 = 0;
    int i1 = 0;
    while (i2 < i5)
    {
      paramArrayOfInt = (View)paramList.get(i2);
      cc localcc = (cc)paramArrayOfInt.getLayoutParams();
      i4 = localcc.leftMargin - i4;
      i3 = localcc.rightMargin - i3;
      int i6 = Math.max(0, i4);
      int i7 = Math.max(0, i3);
      i4 = Math.max(0, -i4);
      i3 = Math.max(0, -i3);
      int i8 = paramArrayOfInt.getMeasuredWidth();
      i2 += 1;
      i1 += i8 + i6 + i7;
    }
    return i1;
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0)
      {
        paramInt1 = paramInt5;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i1, paramInt1);
  }

  private void a(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null)
      localObject = d();
    while (true)
    {
      ((cc)localObject).b = 1;
      if ((!paramBoolean) || (this.a == null))
        break;
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.C.add(paramView);
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject))
      {
        localObject = a((ViewGroup.LayoutParams)localObject);
        continue;
      }
      localObject = (cc)localObject;
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject);
  }

  private void a(List<View> paramList, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    if (bi.d(this) == 1);
    while (true)
    {
      int i4 = getChildCount();
      int i3 = m.a(paramInt, bi.d(this));
      paramList.clear();
      paramInt = i2;
      View localView;
      cc localcc;
      if (i1 != 0)
      {
        paramInt = i4 - 1;
        while (paramInt >= 0)
        {
          localView = getChildAt(paramInt);
          localcc = (cc)localView.getLayoutParams();
          if ((localcc.b == 0) && (a(localView)) && (b(localcc.a) == i3))
            paramList.add(localView);
          paramInt -= 1;
        }
        i1 = 0;
        continue;
      }
      while (paramInt < i4)
      {
        localView = getChildAt(paramInt);
        localcc = (cc)localView.getLayoutParams();
        if ((localcc.b == 0) && (a(localView)) && (b(localcc.a) == i3))
          paramList.add(localView);
        paramInt += 1;
      }
    }
  }

  private boolean a(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }

  private int b(int paramInt)
  {
    int i2 = bi.d(this);
    int i1 = m.a(paramInt, i2) & 0x7;
    paramInt = i1;
    switch (i1)
    {
    case 2:
    case 4:
    default:
      if (i2 != 1)
        break;
      paramInt = 5;
    case 1:
    case 3:
    case 5:
      return paramInt;
    }
    return 3;
  }

  private int b(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = android.support.v4.h.ac.a(paramView);
    return android.support.v4.h.ac.b(paramView) + i1;
  }

  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    cc localcc = (cc)paramView.getLayoutParams();
    int i1 = localcc.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i1, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (localcc.leftMargin + i1);
  }

  private int c(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = paramView.topMargin;
    return paramView.bottomMargin + i1;
  }

  private boolean d(View paramView)
  {
    return (paramView.getParent() == this) || (this.C.contains(paramView));
  }

  private void g()
  {
    if (this.f == null)
      this.f = new ImageView(getContext());
  }

  private MenuInflater getMenuInflater()
  {
    return new d(getContext());
  }

  private void h()
  {
    i();
    if (this.b.c() == null)
    {
      g localg = (g)this.b.getMenu();
      if (this.H == null)
        this.H = new cb(this, null);
      this.b.setExpandedActionViewsExclusive(true);
      localg.a(this.H, this.j);
    }
  }

  private void i()
  {
    if (this.b == null)
    {
      this.b = new ActionMenuView(getContext());
      this.b.setPopupTheme(this.k);
      this.b.setOnMenuItemClickListener(this.F);
      this.b.a(this.I, this.J);
      cc localcc = d();
      localcc.a = (0x800005 | this.n & 0x70);
      this.b.setLayoutParams(localcc);
      a(this.b, false);
    }
  }

  private void j()
  {
    if (this.e == null)
    {
      this.e = new ImageButton(getContext(), null, android.support.v7.b.b.toolbarNavigationButtonStyle);
      cc localcc = d();
      localcc.a = (0x800003 | this.n & 0x70);
      this.e.setLayoutParams(localcc);
    }
  }

  private void k()
  {
    if (this.i == null)
    {
      this.i = new ImageButton(getContext(), null, android.support.v7.b.b.toolbarNavigationButtonStyle);
      this.i.setImageDrawable(this.g);
      this.i.setContentDescription(this.h);
      cc localcc = d();
      localcc.a = (0x800003 | this.n & 0x70);
      localcc.b = 2;
      this.i.setLayoutParams(localcc);
      this.i.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramView)
        {
          Toolbar.this.c();
        }
      });
    }
  }

  private void l()
  {
    removeCallbacks(this.L);
    post(this.L);
  }

  private boolean m()
  {
    if (!this.K)
      return false;
    int i2 = getChildCount();
    int i1 = 0;
    while (true)
    {
      if (i1 >= i2)
        break label56;
      View localView = getChildAt(i1);
      if ((a(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0))
        break;
      i1 += 1;
    }
    label56: return true;
  }

  public cc a(AttributeSet paramAttributeSet)
  {
    return new cc(getContext(), paramAttributeSet);
  }

  protected cc a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof cc))
      return new cc((cc)paramLayoutParams);
    if ((paramLayoutParams instanceof android.support.v7.a.b))
      return new cc((android.support.v7.a.b)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new cc((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new cc(paramLayoutParams);
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.t.a(paramInt1, paramInt2);
  }

  public void a(Context paramContext, int paramInt)
  {
    this.l = paramInt;
    if (this.c != null)
      this.c.setTextAppearance(paramContext, paramInt);
  }

  public boolean a()
  {
    return (this.b != null) && (this.b.e());
  }

  public void b(Context paramContext, int paramInt)
  {
    this.m = paramInt;
    if (this.d != null)
      this.d.setTextAppearance(paramContext, paramInt);
  }

  public boolean b()
  {
    return (this.b != null) && (this.b.d());
  }

  public void c()
  {
    if (this.H == null);
    for (j localj = null; ; localj = this.H.b)
    {
      if (localj != null)
        localj.collapseActionView();
      return;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof cc));
  }

  protected cc d()
  {
    return new cc(-2, -2);
  }

  void e()
  {
    int i1 = getChildCount() - 1;
    while (i1 >= 0)
    {
      View localView = getChildAt(i1);
      if ((((cc)localView.getLayoutParams()).b != 2) && (localView != this.b))
      {
        removeViewAt(i1);
        this.C.add(localView);
      }
      i1 -= 1;
    }
  }

  void f()
  {
    int i1 = this.C.size() - 1;
    while (i1 >= 0)
    {
      addView((View)this.C.get(i1));
      i1 -= 1;
    }
    this.C.clear();
  }

  public int getContentInsetEnd()
  {
    return this.t.d();
  }

  public int getContentInsetLeft()
  {
    return this.t.a();
  }

  public int getContentInsetRight()
  {
    return this.t.b();
  }

  public int getContentInsetStart()
  {
    return this.t.c();
  }

  public Drawable getLogo()
  {
    if (this.f != null)
      return this.f.getDrawable();
    return null;
  }

  public CharSequence getLogoDescription()
  {
    if (this.f != null)
      return this.f.getContentDescription();
    return null;
  }

  public Menu getMenu()
  {
    h();
    return this.b.getMenu();
  }

  public CharSequence getNavigationContentDescription()
  {
    if (this.e != null)
      return this.e.getContentDescription();
    return null;
  }

  public Drawable getNavigationIcon()
  {
    if (this.e != null)
      return this.e.getDrawable();
    return null;
  }

  public Drawable getOverflowIcon()
  {
    h();
    return this.b.getOverflowIcon();
  }

  public int getPopupTheme()
  {
    return this.k;
  }

  public CharSequence getSubtitle()
  {
    return this.w;
  }

  public CharSequence getTitle()
  {
    return this.v;
  }

  public ar getWrapper()
  {
    if (this.G == null)
      this.G = new cf(this, true);
    return this.G;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.L);
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ap.a(paramMotionEvent);
    if (i1 == 9)
      this.A = false;
    if (!this.A)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i1 == 9) && (!bool))
        this.A = true;
    }
    if ((i1 == 10) || (i1 == 3))
      this.A = false;
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3;
    int i6;
    int i9;
    int i1;
    int i7;
    int i8;
    int i10;
    int[] arrayOfInt;
    int i5;
    if (bi.d(this) == 1)
    {
      i3 = 1;
      i6 = getWidth();
      i9 = getHeight();
      i1 = getPaddingLeft();
      i7 = getPaddingRight();
      i8 = getPaddingTop();
      i10 = getPaddingBottom();
      paramInt4 = i6 - i7;
      arrayOfInt = this.D;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      i5 = bi.h(this);
      if (!a(this.e))
        break label1565;
      if (i3 == 0)
        break label876;
      paramInt4 = b(this.e, paramInt4, arrayOfInt, i5);
      paramInt1 = i1;
    }
    while (true)
    {
      label111: paramInt2 = paramInt4;
      paramInt3 = paramInt1;
      if (a(this.i))
      {
        if (i3 != 0)
        {
          paramInt2 = b(this.i, paramInt4, arrayOfInt, i5);
          paramInt3 = paramInt1;
        }
      }
      else
      {
        label151: paramInt1 = paramInt2;
        paramInt4 = paramInt3;
        if (a(this.b))
        {
          if (i3 == 0)
            break label915;
          paramInt4 = a(this.b, paramInt3, arrayOfInt, i5);
          paramInt1 = paramInt2;
        }
        label191: arrayOfInt[0] = Math.max(0, getContentInsetLeft() - paramInt4);
        arrayOfInt[1] = Math.max(0, getContentInsetRight() - (i6 - i7 - paramInt1));
        paramInt3 = Math.max(paramInt4, getContentInsetLeft());
        paramInt4 = Math.min(paramInt1, i6 - i7 - getContentInsetRight());
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (a(this.a))
        {
          if (i3 == 0)
            break label936;
          paramInt2 = b(this.a, paramInt4, arrayOfInt, i5);
          paramInt1 = paramInt3;
        }
        label293: if (!a(this.f))
          break label1559;
        if (i3 == 0)
          break label957;
        paramInt2 = b(this.f, paramInt2, arrayOfInt, i5);
        paramInt3 = paramInt1;
      }
      while (true)
      {
        label326: paramBoolean = a(this.c);
        boolean bool = a(this.d);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (cc)this.c.getLayoutParams();
          paramInt1 = ((cc)localObject1).topMargin;
          paramInt4 = this.c.getMeasuredHeight();
          paramInt1 = 0 + (((cc)localObject1).bottomMargin + (paramInt1 + paramInt4));
        }
        int i2;
        if (bool)
        {
          localObject1 = (cc)this.d.getLayoutParams();
          paramInt4 = ((cc)localObject1).topMargin;
          i2 = this.d.getMeasuredHeight();
        }
        for (int i4 = ((cc)localObject1).bottomMargin + (paramInt4 + i2) + paramInt1; ; i4 = paramInt1)
        {
          label464: Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt2;
            paramInt1 = paramInt3;
            if (!bool);
          }
          else
          {
            if (!paramBoolean)
              break label975;
            localObject1 = this.c;
            if (!bool)
              break label984;
            localObject2 = this.d;
            label475: localObject1 = (cc)((View)localObject1).getLayoutParams();
            localObject2 = (cc)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (this.c.getMeasuredWidth() <= 0)) && ((!bool) || (this.d.getMeasuredWidth() <= 0)))
              break label993;
            i2 = 1;
            label527: switch (this.u & 0x70)
            {
            default:
              paramInt1 = (i9 - i8 - i10 - i4) / 2;
              if (paramInt1 >= ((cc)localObject1).topMargin + this.r)
                break;
              paramInt1 = ((cc)localObject1).topMargin + this.r;
            case 48:
            case 80:
            }
          }
          label1544: label1550: 
          while (true)
          {
            label599: paramInt1 = i8 + paramInt1;
            label604: if (i3 != 0)
              if (i2 != 0)
              {
                paramInt4 = this.p;
                label620: paramInt4 -= arrayOfInt[1];
                paramInt2 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean)
                  break label1544;
                localObject1 = (cc)this.c.getLayoutParams();
                paramInt4 = paramInt2 - this.c.getMeasuredWidth();
                i3 = this.c.getMeasuredHeight() + paramInt1;
                this.c.layout(paramInt4, paramInt1, paramInt2, i3);
                i4 = this.q;
                paramInt1 = i3 + ((cc)localObject1).bottomMargin;
                paramInt4 -= i4;
              }
            while (true)
            {
              if (bool)
              {
                localObject1 = (cc)this.d.getLayoutParams();
                paramInt1 = ((cc)localObject1).topMargin + paramInt1;
                i3 = this.d.getMeasuredWidth();
                i4 = this.d.getMeasuredHeight() + paramInt1;
                this.d.layout(paramInt2 - i3, paramInt1, paramInt2, i4);
                paramInt1 = this.q;
                i3 = ((cc)localObject1).bottomMargin;
              }
              for (paramInt1 = paramInt2 - paramInt1; ; paramInt1 = paramInt2)
              {
                if (i2 != 0);
                for (paramInt1 = Math.min(paramInt4, paramInt1); ; paramInt1 = paramInt2)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt3;
                  a(this.B, 3);
                  paramInt3 = this.B.size();
                  paramInt2 = 0;
                  while (true)
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)this.B.get(paramInt2), paramInt1, arrayOfInt, i5);
                      paramInt2 += 1;
                      continue;
                      i3 = 0;
                      break;
                      label876: paramInt1 = a(this.e, i1, arrayOfInt, i5);
                      break label111;
                      paramInt3 = a(this.i, paramInt1, arrayOfInt, i5);
                      paramInt2 = paramInt4;
                      break label151;
                      label915: paramInt1 = b(this.b, paramInt2, arrayOfInt, i5);
                      paramInt4 = paramInt3;
                      break label191;
                      label936: paramInt1 = a(this.a, paramInt3, arrayOfInt, i5);
                      paramInt2 = paramInt4;
                      break label293;
                      label957: paramInt3 = a(this.f, paramInt1, arrayOfInt, i5);
                      break label326;
                      label975: localObject1 = this.d;
                      break label464;
                      label984: localObject2 = this.c;
                      break label475;
                      label993: i2 = 0;
                      break label527;
                      paramInt1 = getPaddingTop();
                      paramInt1 = ((cc)localObject1).topMargin + paramInt1 + this.r;
                      break label604;
                      paramInt4 = i9 - i10 - i4 - paramInt1 - i8;
                      if (paramInt4 >= ((cc)localObject1).bottomMargin + this.s)
                        break label1550;
                      paramInt1 = Math.max(0, paramInt1 - (((cc)localObject2).bottomMargin + this.s - paramInt4));
                      break label599;
                      paramInt1 = i9 - i10 - ((cc)localObject2).bottomMargin - this.s - i4;
                      break label604;
                      paramInt4 = 0;
                      break label620;
                      if (i2 != 0)
                      {
                        paramInt4 = this.p;
                        label1113: paramInt4 -= arrayOfInt[0];
                        paramInt3 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean)
                          break label1527;
                        localObject1 = (cc)this.c.getLayoutParams();
                        i3 = this.c.getMeasuredWidth() + paramInt3;
                        paramInt4 = this.c.getMeasuredHeight() + paramInt1;
                        this.c.layout(paramInt3, paramInt1, i3, paramInt4);
                        i4 = this.q;
                        paramInt1 = ((cc)localObject1).bottomMargin;
                        i3 += i4;
                        paramInt1 += paramInt4;
                      }
                    }
                  while (true)
                  {
                    if (bool)
                    {
                      localObject1 = (cc)this.d.getLayoutParams();
                      paramInt4 = paramInt1 + ((cc)localObject1).topMargin;
                      paramInt1 = this.d.getMeasuredWidth() + paramInt3;
                      i4 = this.d.getMeasuredHeight() + paramInt4;
                      this.d.layout(paramInt3, paramInt4, paramInt1, i4);
                      paramInt4 = this.q;
                      i4 = ((cc)localObject1).bottomMargin;
                    }
                    for (i4 = paramInt4 + paramInt1; ; i4 = paramInt3)
                    {
                      paramInt4 = paramInt2;
                      paramInt1 = paramInt3;
                      if (i2 == 0)
                        break;
                      paramInt1 = Math.max(i3, i4);
                      paramInt4 = paramInt2;
                      break;
                      paramInt4 = 0;
                      break label1113;
                      a(this.B, 5);
                      paramInt3 = this.B.size();
                      paramInt2 = 0;
                      while (paramInt2 < paramInt3)
                      {
                        paramInt4 = b((View)this.B.get(paramInt2), paramInt4, arrayOfInt, i5);
                        paramInt2 += 1;
                      }
                      a(this.B, 1);
                      paramInt3 = a(this.B, arrayOfInt);
                      paramInt2 = (i6 - i1 - i7) / 2 + i1 - paramInt3 / 2;
                      paramInt3 += paramInt2;
                      if (paramInt2 < paramInt1);
                      while (true)
                      {
                        paramInt4 = this.B.size();
                        paramInt3 = 0;
                        paramInt2 = paramInt1;
                        paramInt1 = paramInt3;
                        while (paramInt1 < paramInt4)
                        {
                          paramInt2 = a((View)this.B.get(paramInt1), paramInt2, arrayOfInt, i5);
                          paramInt1 += 1;
                        }
                        paramInt1 = paramInt2;
                        if (paramInt3 <= paramInt4)
                          continue;
                        paramInt1 = paramInt2 - (paramInt3 - paramInt4);
                      }
                      this.B.clear();
                      return;
                    }
                    label1527: i3 = paramInt3;
                  }
                }
              }
              paramInt4 = paramInt2;
            }
          }
        }
        label1559: paramInt3 = paramInt1;
      }
      label1565: paramInt1 = i1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i4 = 0;
    int i3 = 0;
    int[] arrayOfInt = this.D;
    int i5;
    int i6;
    int i1;
    int i7;
    int i2;
    int i8;
    label529: View localView;
    if (ch.a(this))
    {
      i5 = 0;
      i6 = 1;
      i1 = 0;
      if (a(this.e))
      {
        a(this.e, paramInt1, 0, paramInt2, 0, this.o);
        i1 = this.e.getMeasuredWidth() + b(this.e);
        i4 = Math.max(0, this.e.getMeasuredHeight() + c(this.e));
        i3 = ch.a(0, bi.f(this.e));
      }
      i7 = i1;
      i1 = i3;
      i2 = i4;
      if (a(this.i))
      {
        a(this.i, paramInt1, 0, paramInt2, 0, this.o);
        i7 = this.i.getMeasuredWidth() + b(this.i);
        i2 = Math.max(i4, this.i.getMeasuredHeight() + c(this.i));
        i1 = ch.a(i3, bi.f(this.i));
      }
      i3 = getContentInsetStart();
      i8 = 0 + Math.max(i3, i7);
      arrayOfInt[i6] = Math.max(0, i3 - i7);
      i6 = 0;
      i3 = i1;
      i4 = i2;
      if (a(this.b))
      {
        a(this.b, paramInt1, i8, paramInt2, 0, this.o);
        i6 = this.b.getMeasuredWidth() + b(this.b);
        i4 = Math.max(i2, this.b.getMeasuredHeight() + c(this.b));
        i3 = ch.a(i1, bi.f(this.b));
      }
      i1 = getContentInsetEnd();
      i7 = i8 + Math.max(i1, i6);
      arrayOfInt[i5] = Math.max(0, i1 - i6);
      i6 = i7;
      i1 = i3;
      i2 = i4;
      if (a(this.a))
      {
        i6 = i7 + a(this.a, paramInt1, i7, paramInt2, 0, arrayOfInt);
        i2 = Math.max(i4, this.a.getMeasuredHeight() + c(this.a));
        i1 = ch.a(i3, bi.f(this.a));
      }
      i3 = i6;
      i4 = i1;
      i5 = i2;
      if (a(this.f))
      {
        i3 = i6 + a(this.f, paramInt1, i6, paramInt2, 0, arrayOfInt);
        i5 = Math.max(i2, this.f.getMeasuredHeight() + c(this.f));
        i4 = ch.a(i1, bi.f(this.f));
      }
      i7 = getChildCount();
      i6 = 0;
      i2 = i5;
      i1 = i4;
      i4 = i6;
      i6 = i3;
      if (i4 >= i7)
        break label635;
      localView = getChildAt(i4);
      if (((cc)localView.getLayoutParams()).b != 0)
        break label938;
      if (a(localView))
        break label585;
    }
    label938: 
    while (true)
    {
      i4 += 1;
      break label529;
      i5 = 1;
      i6 = 0;
      break;
      label585: i6 += a(localView, paramInt1, i6, paramInt2, 0, arrayOfInt);
      i2 = Math.max(i2, localView.getMeasuredHeight() + c(localView));
      i1 = ch.a(i1, bi.f(localView));
      continue;
      label635: i5 = 0;
      i4 = 0;
      int i9 = this.r + this.s;
      int i10 = this.p + this.q;
      i3 = i1;
      if (a(this.c))
      {
        a(this.c, paramInt1, i6 + i10, paramInt2, i9, arrayOfInt);
        i3 = this.c.getMeasuredWidth();
        i5 = b(this.c) + i3;
        i4 = this.c.getMeasuredHeight() + c(this.c);
        i3 = ch.a(i1, bi.f(this.c));
      }
      i8 = i4;
      i7 = i5;
      i1 = i3;
      if (a(this.d))
      {
        i7 = Math.max(i5, a(this.d, paramInt1, i6 + i10, paramInt2, i9 + i4, arrayOfInt));
        i8 = i4 + (this.d.getMeasuredHeight() + c(this.d));
        i1 = ch.a(i3, bi.f(this.d));
      }
      i2 = Math.max(i2, i8);
      i5 = getPaddingLeft();
      i8 = getPaddingRight();
      i3 = getPaddingTop();
      i4 = getPaddingBottom();
      i5 = bi.a(Math.max(i7 + i6 + (i5 + i8), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i1);
      paramInt1 = bi.a(Math.max(i2 + (i3 + i4), getSuggestedMinimumHeight()), paramInt2, i1 << 16);
      if (m())
        paramInt1 = 0;
      setMeasuredDimension(i5, paramInt1);
      return;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ce localce = (ce)paramParcelable;
    super.onRestoreInstanceState(localce.getSuperState());
    if (this.b != null);
    for (paramParcelable = this.b.c(); ; paramParcelable = null)
    {
      if ((localce.a != 0) && (this.H != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(localce.a);
        if (paramParcelable != null)
          ah.a(paramParcelable);
      }
      if (localce.b)
        l();
      return;
    }
  }

  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt);
    bj localbj = this.t;
    if (paramInt == 1);
    while (true)
    {
      localbj.a(bool);
      return;
      bool = false;
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    ce localce = new ce(super.onSaveInstanceState());
    if ((this.H != null) && (this.H.b != null))
      localce.a = this.H.b.getItemId();
    localce.b = a();
    return localce;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ap.a(paramMotionEvent);
    if (i1 == 0)
      this.z = false;
    if (!this.z)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool))
        this.z = true;
    }
    if ((i1 == 1) || (i1 == 3))
      this.z = false;
    return true;
  }

  public void setCollapsible(boolean paramBoolean)
  {
    this.K = paramBoolean;
    requestLayout();
  }

  public void setLogo(int paramInt)
  {
    setLogo(this.M.a(getContext(), paramInt));
  }

  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      g();
      if (!d(this.f))
        a(this.f, true);
    }
    while (true)
    {
      if (this.f != null)
        this.f.setImageDrawable(paramDrawable);
      return;
      if ((this.f == null) || (!d(this.f)))
        continue;
      removeView(this.f);
      this.C.remove(this.f);
    }
  }

  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }

  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      g();
    if (this.f != null)
      this.f.setContentDescription(paramCharSequence);
  }

  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0);
    for (CharSequence localCharSequence = getContext().getText(paramInt); ; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }

  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      j();
    if (this.e != null)
      this.e.setContentDescription(paramCharSequence);
  }

  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(this.M.a(getContext(), paramInt));
  }

  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      j();
      if (!d(this.e))
        a(this.e, true);
    }
    while (true)
    {
      if (this.e != null)
        this.e.setImageDrawable(paramDrawable);
      return;
      if ((this.e == null) || (!d(this.e)))
        continue;
      removeView(this.e);
      this.C.remove(this.e);
    }
  }

  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    j();
    this.e.setOnClickListener(paramOnClickListener);
  }

  public void setOnMenuItemClickListener(cd paramcd)
  {
    this.E = paramcd;
  }

  public void setOverflowIcon(Drawable paramDrawable)
  {
    h();
    this.b.setOverflowIcon(paramDrawable);
  }

  public void setPopupTheme(int paramInt)
  {
    if (this.k != paramInt)
    {
      this.k = paramInt;
      if (paramInt == 0)
        this.j = getContext();
    }
    else
    {
      return;
    }
    this.j = new ContextThemeWrapper(getContext(), paramInt);
  }

  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.d == null)
      {
        Context localContext = getContext();
        this.d = new TextView(localContext);
        this.d.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        if (this.m != 0)
          this.d.setTextAppearance(localContext, this.m);
        if (this.y != 0)
          this.d.setTextColor(this.y);
      }
      if (!d(this.d))
        a(this.d, true);
    }
    while (true)
    {
      if (this.d != null)
        this.d.setText(paramCharSequence);
      this.w = paramCharSequence;
      return;
      if ((this.d == null) || (!d(this.d)))
        continue;
      removeView(this.d);
      this.C.remove(this.d);
    }
  }

  public void setSubtitleTextColor(int paramInt)
  {
    this.y = paramInt;
    if (this.d != null)
      this.d.setTextColor(paramInt);
  }

  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.c == null)
      {
        Context localContext = getContext();
        this.c = new TextView(localContext);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.l != 0)
          this.c.setTextAppearance(localContext, this.l);
        if (this.x != 0)
          this.c.setTextColor(this.x);
      }
      if (!d(this.c))
        a(this.c, true);
    }
    while (true)
    {
      if (this.c != null)
        this.c.setText(paramCharSequence);
      this.v = paramCharSequence;
      return;
      if ((this.c == null) || (!d(this.c)))
        continue;
      removeView(this.c);
      this.C.remove(this.c);
    }
  }

  public void setTitleTextColor(int paramInt)
  {
    this.x = paramInt;
    if (this.c != null)
      this.c.setTextColor(paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.Toolbar
 * JD-Core Version:    0.6.0
 */