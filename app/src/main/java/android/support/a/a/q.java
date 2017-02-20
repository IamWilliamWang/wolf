package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

class q extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;

  public q(Drawable.ConstantState paramConstantState)
  {
    this.a = paramConstantState;
  }

  public boolean canApplyTheme()
  {
    return this.a.canApplyTheme();
  }

  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }

  public Drawable newDrawable()
  {
    j localj = new j(null);
    localj.a = ((VectorDrawable)this.a.newDrawable());
    return localj;
  }

  public Drawable newDrawable(Resources paramResources)
  {
    j localj = new j(null);
    localj.a = ((VectorDrawable)this.a.newDrawable(paramResources));
    return localj;
  }

  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    j localj = new j(null);
    localj.a = ((VectorDrawable)this.a.newDrawable(paramResources, paramTheme));
    return localj;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.q
 * JD-Core Version:    0.6.0
 */