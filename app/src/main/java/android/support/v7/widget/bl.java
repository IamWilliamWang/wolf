package android.support.v7.widget;

import android.support.v7.a.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class bl extends BaseAdapter
{
  private bl(bk parambk)
  {
  }

  public int getCount()
  {
    return bk.a(this.a).getChildCount();
  }

  public Object getItem(int paramInt)
  {
    return ((bn)bk.a(this.a).getChildAt(paramInt)).b();
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      return bk.a(this.a, (c)getItem(paramInt), true);
    ((bn)paramView).a((c)getItem(paramInt));
    return paramView;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bl
 * JD-Core Version:    0.6.0
 */