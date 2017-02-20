package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class u extends r
{
  u(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  u(s params, Resources paramResources)
  {
    super(params, paramResources);
  }

  protected Drawable a(Drawable.ConstantState paramConstantState, Resources paramResources)
  {
    return paramConstantState.newDrawable(paramResources);
  }

  s b()
  {
    return new v(this.b, null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.u
 * JD-Core Version:    0.6.0
 */