package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;

class aa extends y
{
  aa(Drawable paramDrawable)
  {
    super(paramDrawable);
  }

  aa(s params, Resources paramResources)
  {
    super(params, paramResources);
  }

  s b()
  {
    return new ab(this.b, null);
  }

  protected boolean c()
  {
    int j = 0;
    int i = j;
    if (Build.VERSION.SDK_INT == 21)
    {
      Drawable localDrawable = this.c;
      if ((!(localDrawable instanceof GradientDrawable)) && (!(localDrawable instanceof DrawableContainer)))
      {
        i = j;
        if (!(localDrawable instanceof InsetDrawable));
      }
      else
      {
        i = 1;
      }
    }
    return i;
  }

  public Rect getDirtyBounds()
  {
    return this.c.getDirtyBounds();
  }

  public void getOutline(Outline paramOutline)
  {
    this.c.getOutline(paramOutline);
  }

  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.c.setHotspot(paramFloat1, paramFloat2);
  }

  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    if (super.setState(paramArrayOfInt))
    {
      invalidateSelf();
      return true;
    }
    return false;
  }

  public void setTint(int paramInt)
  {
    if (c())
    {
      a(paramInt);
      return;
    }
    this.c.setTint(paramInt);
  }

  public void setTintList(ColorStateList paramColorStateList)
  {
    if (c())
    {
      a(paramColorStateList);
      return;
    }
    this.c.setTintList(paramColorStateList);
  }

  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (c())
    {
      a(paramMode);
      return;
    }
    this.c.setTintMode(paramMode);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.aa
 * JD-Core Version:    0.6.0
 */