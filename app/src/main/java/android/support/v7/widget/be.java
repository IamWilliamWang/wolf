package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

class be
  implements AbsListView.OnScrollListener
{
  private be(ax paramax)
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.l()) && (ax.b(this.a).getContentView() != null))
    {
      ax.d(this.a).removeCallbacks(ax.c(this.a));
      ax.c(this.a).run();
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.be
 * JD-Core Version:    0.6.0
 */