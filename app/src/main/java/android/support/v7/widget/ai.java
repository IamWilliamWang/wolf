package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.bc;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ai extends ImageView
  implements bc
{
  private ab a;
  private ah b;

  public ai(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(bx.a(paramContext), paramAttributeSet, paramInt);
    paramContext = ac.a();
    this.a = new ab(this, paramContext);
    this.a.a(paramAttributeSet, paramInt);
    this.b = new ah(this, paramContext);
    this.b.a(paramAttributeSet, paramInt);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.a != null)
      this.a.c();
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.a != null)
      return this.a.a();
    return null;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.a != null)
      return this.a.b();
    return null;
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.a != null)
      this.a.a(paramDrawable);
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.a != null)
      this.a.a(paramInt);
  }

  public void setImageResource(int paramInt)
  {
    this.b.a(paramInt);
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.a != null)
      this.a.a(paramColorStateList);
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.a != null)
      this.a.a(paramMode);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ai
 * JD-Core Version:    0.6.0
 */