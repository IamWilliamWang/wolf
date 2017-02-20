package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class s extends BaseAdapter
{
  private g b;
  private int c = -1;

  public s(r paramr, g paramg)
  {
    this.b = paramg;
    a();
  }

  public j a(int paramInt)
  {
    if (r.a(this.a));
    for (ArrayList localArrayList = this.b.k(); ; localArrayList = this.b.h())
    {
      int i = paramInt;
      if (this.c >= 0)
      {
        i = paramInt;
        if (paramInt >= this.c)
          i = paramInt + 1;
      }
      return (j)localArrayList.get(i);
    }
  }

  void a()
  {
    j localj = r.c(this.a).n();
    if (localj != null)
    {
      ArrayList localArrayList = r.c(this.a).k();
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        if ((j)localArrayList.get(i) == localj)
        {
          this.c = i;
          return;
        }
        i += 1;
      }
    }
    this.c = -1;
  }

  public int getCount()
  {
    if (r.a(this.a));
    for (ArrayList localArrayList = this.b.k(); this.c < 0; localArrayList = this.b.h())
      return localArrayList.size();
    return localArrayList.size() - 1;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = r.b(this.a).inflate(r.a, paramViewGroup, false);
    while (true)
    {
      paramViewGroup = (w)paramView;
      if (this.a.b)
        ((ListMenuItemView)paramView).setForceShowIcon(true);
      paramViewGroup.a(a(paramInt), 0);
      return paramView;
    }
  }

  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.s
 * JD-Core Version:    0.6.0
 */