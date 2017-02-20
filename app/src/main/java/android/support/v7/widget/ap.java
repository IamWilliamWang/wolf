package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.bc;
import android.util.AttributeSet;
import android.widget.TextView;

public class ap extends TextView
  implements bc
{
  private ac a = ac.a();
  private ab b = new ab(this, this.a);
  private an c;

  public ap(Context paramContext)
  {
    this(paramContext, null);
  }

  public ap(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }

  public ap(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(bx.a(paramContext), paramAttributeSet, paramInt);
    this.b.a(paramAttributeSet, paramInt);
    this.c = an.a(this);
    this.c.a(paramAttributeSet, paramInt);
    this.c.a();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.b != null)
      this.b.c();
    if (this.c != null)
      this.c.a();
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.b != null)
      return this.b.a();
    return null;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.b != null)
      return this.b.b();
    return null;
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.b != null)
      this.b.a(paramDrawable);
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.b != null)
      this.b.a(paramInt);
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.b != null)
      this.b.a(paramColorStateList);
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.b != null)
      this.b.a(paramMode);
  }

  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.c != null)
      this.c.a(paramContext, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ap
 * JD-Core Version:    0.6.0
 */