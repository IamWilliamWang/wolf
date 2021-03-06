package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.d;
import android.support.v7.view.menu.r;
import android.support.v7.view.menu.w;
import android.support.v7.view.menu.z;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import java.util.ArrayList;

class g extends d
  implements android.support.v4.h.k
{
  private i A;
  final m g = new m(this, null);
  int h;
  private k i;
  private Drawable j;
  private boolean k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private final SparseBooleanArray v = new SparseBooleanArray();
  private View w;
  private l x;
  private h y;
  private j z;

  public g(Context paramContext)
  {
    super(paramContext, android.support.v7.b.h.abc_action_menu_layout, android.support.v7.b.h.abc_action_menu_item_layout);
  }

  private View a(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)this.f;
    Object localObject;
    if (localViewGroup == null)
    {
      localObject = null;
      return localObject;
    }
    int i2 = localViewGroup.getChildCount();
    int i1 = 0;
    while (true)
    {
      if (i1 >= i2)
        break label74;
      View localView = localViewGroup.getChildAt(i1);
      if ((localView instanceof w))
      {
        localObject = localView;
        if (((w)localView).getItemData() == paramMenuItem)
          break;
      }
      i1 += 1;
    }
    label74: return null;
  }

  public View a(android.support.v7.view.menu.j paramj, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramj.getActionView();
    if ((localView == null) || (paramj.n()))
      localView = super.a(paramj, paramView, paramViewGroup);
    if (paramj.isActionViewExpanded());
    for (int i1 = 8; ; i1 = 0)
    {
      localView.setVisibility(i1);
      paramj = (ActionMenuView)paramViewGroup;
      paramView = localView.getLayoutParams();
      if (!paramj.checkLayoutParams(paramView))
        localView.setLayoutParams(paramj.a(paramView));
      return localView;
    }
  }

  public void a(Context paramContext, android.support.v7.view.menu.g paramg)
  {
    super.a(paramContext, paramg);
    paramg = paramContext.getResources();
    paramContext = android.support.v7.view.a.a(paramContext);
    if (!this.m)
      this.l = paramContext.b();
    if (!this.s)
      this.n = paramContext.c();
    if (!this.q)
      this.p = paramContext.a();
    int i1 = this.n;
    if (this.l)
    {
      if (this.i == null)
      {
        this.i = new k(this, this.a);
        if (this.k)
        {
          this.i.setImageDrawable(this.j);
          this.j = null;
          this.k = false;
        }
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.i.measure(i2, i2);
      }
      i1 -= this.i.getMeasuredWidth();
    }
    while (true)
    {
      this.o = i1;
      this.u = (int)(56.0F * paramg.getDisplayMetrics().density);
      this.w = null;
      return;
      this.i = null;
    }
  }

  public void a(Configuration paramConfiguration)
  {
    if (!this.q)
      this.p = this.b.getResources().getInteger(android.support.v7.b.g.abc_max_action_buttons);
    if (this.c != null)
      this.c.b(true);
  }

  public void a(Drawable paramDrawable)
  {
    if (this.i != null)
    {
      this.i.setImageDrawable(paramDrawable);
      return;
    }
    this.k = true;
    this.j = paramDrawable;
  }

  public void a(android.support.v7.view.menu.g paramg, boolean paramBoolean)
  {
    f();
    super.a(paramg, paramBoolean);
  }

  public void a(android.support.v7.view.menu.j paramj, w paramw)
  {
    paramw.a(paramj, 0);
    paramj = (ActionMenuView)this.f;
    paramw = (ActionMenuItemView)paramw;
    paramw.setItemInvoker(paramj);
    if (this.A == null)
      this.A = new i(this, null);
    paramw.setPopupCallback(this.A);
  }

  public void a(ActionMenuView paramActionMenuView)
  {
    this.f = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.c.a(false);
  }

  public boolean a(int paramInt, android.support.v7.view.menu.j paramj)
  {
    return paramj.j();
  }

  public boolean a(z paramz)
  {
    if (!paramz.hasVisibleItems())
      return false;
    for (Object localObject = paramz; ((z)localObject).o() != this.c; localObject = (z)((z)localObject).o());
    View localView = a(((z)localObject).getItem());
    localObject = localView;
    if (localView == null)
    {
      if (this.i == null)
        return false;
      localObject = this.i;
    }
    this.h = paramz.getItem().getItemId();
    this.y = new h(this, this.b, paramz);
    this.y.a((View)localObject);
    this.y.a();
    super.a(paramz);
    return true;
  }

  public boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.i)
      return false;
    return super.a(paramViewGroup, paramInt);
  }

  public void b(boolean paramBoolean)
  {
    int i2 = 1;
    int i3 = 0;
    Object localObject = (ViewGroup)((View)this.f).getParent();
    if (localObject != null)
      android.support.v7.e.a.a((ViewGroup)localObject);
    super.b(paramBoolean);
    ((View)this.f).requestLayout();
    int i1;
    if (this.c != null)
    {
      localObject = this.c.j();
      int i4 = ((ArrayList)localObject).size();
      i1 = 0;
      while (i1 < i4)
      {
        android.support.v4.h.j localj = ((android.support.v7.view.menu.j)((ArrayList)localObject).get(i1)).a();
        if (localj != null)
          localj.a(this);
        i1 += 1;
      }
    }
    if (this.c != null)
    {
      localObject = this.c.k();
      i1 = i3;
      if (this.l)
      {
        i1 = i3;
        if (localObject != null)
        {
          i1 = ((ArrayList)localObject).size();
          if (i1 != 1)
            break label281;
          if (((android.support.v7.view.menu.j)((ArrayList)localObject).get(0)).isActionViewExpanded())
            break label276;
          i1 = 1;
        }
      }
      label170: if (i1 == 0)
        break label295;
      if (this.i == null)
        this.i = new k(this, this.a);
      localObject = (ViewGroup)this.i.getParent();
      if (localObject != this.f)
      {
        if (localObject != null)
          ((ViewGroup)localObject).removeView(this.i);
        localObject = (ActionMenuView)this.f;
        ((ActionMenuView)localObject).addView(this.i, ((ActionMenuView)localObject).b());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.f).setOverflowReserved(this.l);
      return;
      localObject = null;
      break;
      label276: i1 = 0;
      break label170;
      label281: if (i1 > 0);
      for (i1 = i2; ; i1 = 0)
        break;
      label295: if ((this.i == null) || (this.i.getParent() != this.f))
        continue;
      ((ViewGroup)this.f).removeView(this.i);
    }
  }

  public boolean b()
  {
    ArrayList localArrayList = this.c.h();
    int i9 = localArrayList.size();
    int i1 = this.p;
    int i8 = this.o;
    int i10 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.f;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i2 = 0;
    Object localObject1;
    if (i2 < i9)
    {
      localObject1 = (android.support.v7.view.menu.j)localArrayList.get(i2);
      if (((android.support.v7.view.menu.j)localObject1).l())
      {
        i3 += 1;
        label82: if ((!this.t) || (!((android.support.v7.view.menu.j)localObject1).isActionViewExpanded()))
          break label820;
        i1 = 0;
      }
    }
    label304: label820: 
    while (true)
    {
      i2 += 1;
      break;
      if (((android.support.v7.view.menu.j)localObject1).k())
      {
        i4 += 1;
        break label82;
      }
      i5 = 1;
      break label82;
      i2 = i1;
      if (this.l)
        if (i5 == 0)
        {
          i2 = i1;
          if (i3 + i4 <= i1);
        }
        else
        {
          i2 = i1 - 1;
        }
      i2 -= i3;
      localObject1 = this.v;
      ((SparseBooleanArray)localObject1).clear();
      i1 = 0;
      if (this.r)
      {
        i1 = i8 / this.u;
        i3 = this.u;
        i4 = this.u;
      }
      for (int i6 = i8 % i3 / i1 + i4; ; i6 = 0)
      {
        int i7 = 0;
        i5 = 0;
        i3 = i1;
        i1 = i2;
        i4 = i8;
        i2 = i5;
        android.support.v7.view.menu.j localj;
        Object localObject2;
        if (i7 < i9)
        {
          localj = (android.support.v7.view.menu.j)localArrayList.get(i7);
          if (localj.l())
          {
            localObject2 = a(localj, this.w, localViewGroup);
            if (this.w == null)
              this.w = ((View)localObject2);
            if (this.r)
            {
              i5 = i3 - ActionMenuView.a((View)localObject2, i6, i3, i10, 0);
              i3 = ((View)localObject2).getMeasuredWidth();
              if (i2 != 0)
                break label811;
              i2 = i3;
            }
          }
        }
        while (true)
        {
          i8 = localj.getGroupId();
          if (i8 != 0)
            ((SparseBooleanArray)localObject1).put(i8, true);
          localj.d(true);
          i4 -= i3;
          i3 = i1;
          i1 = i4;
          i8 = i7 + 1;
          i7 = i3;
          i3 = i5;
          i4 = i1;
          i1 = i7;
          i7 = i8;
          break;
          ((View)localObject2).measure(i10, i10);
          i5 = i3;
          break label304;
          int i11;
          boolean bool;
          int i12;
          if (localj.k())
          {
            i11 = localj.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i11);
            if (((i1 > 0) || (bool)) && (i4 > 0) && ((!this.r) || (i3 > 0)))
            {
              i12 = 1;
              label445: if (i12 == 0)
                break label800;
              localObject2 = a(localj, this.w, localViewGroup);
              if (this.w == null)
                this.w = ((View)localObject2);
              if (!this.r)
                break label632;
              i5 = ActionMenuView.a((View)localObject2, i6, i3, i10, 0);
              if (i5 != 0)
                break label797;
              i12 = 0;
              label505: i3 -= i5;
              label510: i5 = ((View)localObject2).getMeasuredWidth();
              i8 = i4 - i5;
              i4 = i2;
              if (i2 == 0)
                i4 = i5;
              if (!this.r)
                break label649;
              if (i8 < 0)
                break label644;
              i2 = 1;
              i12 &= i2;
              i2 = i4;
              i5 = i3;
              i4 = i8;
              i3 = i2;
              i2 = i5;
            }
          }
          while (true)
          {
            if ((i12 != 0) && (i11 != 0))
              ((SparseBooleanArray)localObject1).put(i11, true);
            while (true)
            {
              i5 = i1;
              if (i12 != 0)
                i5 = i1 - 1;
              localj.d(i12);
              i1 = i4;
              i4 = i5;
              i5 = i2;
              i2 = i3;
              i3 = i4;
              break;
              int i13 = 0;
              break label445;
              label632: ((View)localObject2).measure(i10, i10);
              break label510;
              i2 = 0;
              break label549;
              if (i8 + i4 > 0);
              for (i2 = 1; ; i2 = 0)
              {
                i13 &= i2;
                i2 = i3;
                i3 = i4;
                i4 = i8;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i11, false);
                i8 = 0;
                while (true)
                  if (i8 < i7)
                  {
                    localObject2 = (android.support.v7.view.menu.j)localArrayList.get(i8);
                    i5 = i1;
                    if (((android.support.v7.view.menu.j)localObject2).getGroupId() == i11)
                    {
                      i5 = i1;
                      if (((android.support.v7.view.menu.j)localObject2).j())
                        i5 = i1 + 1;
                      ((android.support.v7.view.menu.j)localObject2).d(false);
                    }
                    i8 += 1;
                    i1 = i5;
                    continue;
                    localj.d(false);
                    i5 = i4;
                    i4 = i1;
                    i1 = i5;
                    i5 = i3;
                    i3 = i4;
                    break;
                    return true;
                  }
                continue;
              }
            }
            break label505;
            i5 = i2;
            i2 = i3;
            i3 = i5;
          }
        }
      }
    }
  }

  public Drawable c()
  {
    if (this.i != null)
      return this.i.getDrawable();
    if (this.k)
      return this.j;
    return null;
  }

  public void c(boolean paramBoolean)
  {
    this.l = paramBoolean;
    this.m = true;
  }

  public void d(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public boolean d()
  {
    if ((this.l) && (!h()) && (this.c != null) && (this.f != null) && (this.z == null) && (!this.c.k().isEmpty()))
    {
      this.z = new j(this, new l(this, this.b, this.c, this.i, true));
      ((View)this.f).post(this.z);
      super.a(null);
      return true;
    }
    return false;
  }

  public boolean e()
  {
    if ((this.z != null) && (this.f != null))
    {
      ((View)this.f).removeCallbacks(this.z);
      this.z = null;
      return true;
    }
    l locall = this.x;
    if (locall != null)
    {
      locall.e();
      return true;
    }
    return false;
  }

  public boolean f()
  {
    return e() | g();
  }

  public boolean g()
  {
    if (this.y != null)
    {
      this.y.e();
      return true;
    }
    return false;
  }

  public boolean h()
  {
    return (this.x != null) && (this.x.f());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.g
 * JD-Core Version:    0.6.0
 */