package android.support.v4.a;

import android.support.v4.h.bi;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class x
  implements Animation.AnimationListener
{
  private Animation.AnimationListener a = null;
  private boolean b = false;
  private View c = null;

  public x(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null))
      return;
    this.c = paramView;
  }

  public x(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
  {
    if ((paramView == null) || (paramAnimation == null))
      return;
    this.a = paramAnimationListener;
    this.c = paramView;
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    if ((this.c != null) && (this.b))
      this.c.post(new Runnable()
      {
        public void run()
        {
          bi.a(x.a(x.this), 0, null);
        }
      });
    if (this.a != null)
      this.a.onAnimationEnd(paramAnimation);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
    if (this.a != null)
      this.a.onAnimationRepeat(paramAnimation);
  }

  public void onAnimationStart(Animation paramAnimation)
  {
    if (this.c != null)
    {
      this.b = w.a(this.c, paramAnimation);
      if (this.b)
        this.c.post(new Runnable()
        {
          public void run()
          {
            bi.a(x.a(x.this), 2, null);
          }
        });
    }
    if (this.a != null)
      this.a.onAnimationStart(paramAnimation);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.x
 * JD-Core Version:    0.6.0
 */