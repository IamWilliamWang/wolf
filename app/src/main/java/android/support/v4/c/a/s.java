package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class s extends Drawable.ConstantState
{
  int a;
  Drawable.ConstantState b;
  ColorStateList c = null;
  PorterDuff.Mode d = r.a;

  s(s params, Resources paramResources)
  {
    if (params != null)
    {
      this.a = params.a;
      this.b = params.b;
      this.c = params.c;
      this.d = params.d;
    }
  }

  boolean a()
  {
    return this.b != null;
  }

  public int getChangingConfigurations()
  {
    int j = this.a;
    if (this.b != null);
    for (int i = this.b.getChangingConfigurations(); ; i = 0)
      return i | j;
  }

  public Drawable newDrawable()
  {
    return newDrawable(null);
  }

  public native abstract Drawable newDrawable(Resources paramResources);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.s
 * JD-Core Version:    0.6.0
 */