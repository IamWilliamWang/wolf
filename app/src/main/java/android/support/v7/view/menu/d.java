package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.bi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class d
  implements t
{
  protected Context a;
  protected Context b;
  protected g c;
  protected LayoutInflater d;
  protected LayoutInflater e;
  protected v f;
  private u g;
  private int h;
  private int i;

  public d(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }

  public u a()
  {
    return this.g;
  }

  public w a(ViewGroup paramViewGroup)
  {
    return (w)this.d.inflate(this.i, paramViewGroup, false);
  }

  public View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof w));
    for (paramView = (w)paramView; ; paramView = a(paramViewGroup))
    {
      a(paramj, paramView);
      return (View)paramView;
    }
  }

  public void a(Context paramContext, g paramg)
  {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = paramg;
  }

  public void a(g paramg, boolean paramBoolean)
  {
    if (this.g != null)
      this.g.a(paramg, paramBoolean);
  }

  public native abstract void a(j paramj, w paramw);

  public void a(u paramu)
  {
    this.g = paramu;
  }

  protected void a(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null)
      localViewGroup.removeView(paramView);
    ((ViewGroup)this.f).addView(paramView, paramInt);
  }

  public boolean a(int paramInt, j paramj)
  {
    return true;
  }

  public boolean a(g paramg, j paramj)
  {
    return false;
  }

  public boolean a(z paramz)
  {
    if (this.g != null)
      return this.g.a(paramz);
    return false;
  }

  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public void b(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.f;
    if (localViewGroup == null);
    label198: label204: 
    while (true)
    {
      return;
      int k;
      if (this.c != null)
      {
        this.c.i();
        ArrayList localArrayList = this.c.h();
        int n = localArrayList.size();
        int m = 0;
        int j = 0;
        k = j;
        if (m < n)
        {
          j localj2 = (j)localArrayList.get(m);
          if (!a(j, localj2))
            break label198;
          View localView1 = localViewGroup.getChildAt(j);
          if ((localView1 instanceof w));
          for (j localj1 = ((w)localView1).getItemData(); ; localj1 = null)
          {
            View localView2 = a(localj2, localView1, localViewGroup);
            if (localj2 != localj1)
            {
              localView2.setPressed(false);
              bi.l(localView2);
            }
            if (localView2 != localView1)
              a(localView2, j);
            j += 1;
            m += 1;
            break;
          }
        }
      }
      while (true)
      {
        if (k >= localViewGroup.getChildCount())
          break label204;
        if (a(localViewGroup, k))
          continue;
        k += 1;
        continue;
        break;
        k = 0;
      }
    }
  }

  public boolean b()
  {
    return false;
  }

  public boolean b(g paramg, j paramj)
  {
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.d
 * JD-Core Version:    0.6.0
 */