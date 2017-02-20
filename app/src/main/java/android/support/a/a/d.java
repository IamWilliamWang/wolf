package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class d extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;

  public d(Drawable.ConstantState paramConstantState)
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
    b localb = new b(null);
    localb.a = this.a.newDrawable();
    localb.a.setCallback(b.a(localb));
    return localb;
  }

  public Drawable newDrawable(Resources paramResources)
  {
    b localb = new b(null);
    localb.a = this.a.newDrawable(paramResources);
    localb.a.setCallback(b.a(localb));
    return localb;
  }

  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    b localb = new b(null);
    localb.a = this.a.newDrawable(paramResources, paramTheme);
    localb.a.setCallback(b.a(localb));
    return localb;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.d
 * JD-Core Version:    0.6.0
 */