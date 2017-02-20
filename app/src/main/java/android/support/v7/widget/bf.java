package android.support.v7.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class bf
  implements View.OnTouchListener
{
  private bf(ax paramax)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (ax.b(this.a) != null) && (ax.b(this.a).isShowing()) && (j >= 0) && (j < ax.b(this.a).getWidth()) && (k >= 0) && (k < ax.b(this.a).getHeight()))
      ax.d(this.a).postDelayed(ax.c(this.a), 250L);
    while (true)
    {
      return false;
      if (i != 1)
        continue;
      ax.d(this.a).removeCallbacks(ax.c(this.a));
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bf
 * JD-Core Version:    0.6.0
 */