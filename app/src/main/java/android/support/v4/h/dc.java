package android.support.v4.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

class dc
{
  public static void a(View paramView)
  {
    paramView.animate().cancel();
  }

  public static void a(View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }

  public static void a(View paramView, de paramde)
  {
    if (paramde != null)
    {
      paramView.animate().setListener(new AnimatorListenerAdapter(paramde, paramView)
      {
        public void onAnimationCancel(Animator paramAnimator)
        {
          dc.this.c(this.b);
        }

        public void onAnimationEnd(Animator paramAnimator)
        {
          dc.this.b(this.b);
        }

        public void onAnimationStart(Animator paramAnimator)
        {
          dc.this.a(this.b);
        }
      });
      return;
    }
    paramView.animate().setListener(null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.dc
 * JD-Core Version:    0.6.0
 */