package android.support.v7.widget;

import android.support.v7.a.c;
import android.view.View;
import android.view.View.OnClickListener;

class bm
  implements View.OnClickListener
{
  private bm(bk parambk)
  {
  }

  public void onClick(View paramView)
  {
    ((bn)paramView).b().d();
    int j = bk.a(this.a).getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = bk.a(this.a).getChildAt(i);
      if (localView == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        i += 1;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bm
 * JD-Core Version:    0.6.0
 */