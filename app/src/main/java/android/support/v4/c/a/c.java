package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

abstract interface c
{
  public native abstract void a(Drawable paramDrawable);

  public native abstract void a(Drawable paramDrawable, float paramFloat1, float paramFloat2);

  public native abstract void a(Drawable paramDrawable, int paramInt);

  public native abstract void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public native abstract void a(Drawable paramDrawable, ColorStateList paramColorStateList);

  public native abstract void a(Drawable paramDrawable, Resources.Theme paramTheme);

  public native abstract void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);

  public native abstract void a(Drawable paramDrawable, PorterDuff.Mode paramMode);

  public native abstract void a(Drawable paramDrawable, boolean paramBoolean);

  public native abstract boolean b(Drawable paramDrawable);

  public native abstract Drawable c(Drawable paramDrawable);

  public native abstract int d(Drawable paramDrawable);

  public native abstract int e(Drawable paramDrawable);

  public native abstract boolean f(Drawable paramDrawable);

  public native abstract ColorFilter g(Drawable paramDrawable);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.c
 * JD-Core Version:    0.6.0
 */