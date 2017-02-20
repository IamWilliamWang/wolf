package android.support.v7.widget;

import android.support.v4.h.bi;
import android.widget.PopupWindow;

class bg
  implements Runnable
{
  private bg(ax paramax)
  {
  }

  public void run()
  {
    if ((ax.a(this.a) != null) && (bi.q(ax.a(this.a))) && (ax.a(this.a).getCount() > ax.a(this.a).getChildCount()) && (ax.a(this.a).getChildCount() <= this.a.b))
    {
      ax.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bg
 * JD-Core Version:    0.6.0
 */