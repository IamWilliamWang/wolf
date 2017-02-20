package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class k
{
  public static Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof r))
      localObject = new r(paramDrawable);
    return (Drawable)localObject;
  }

  public static void a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable instanceof q))
      ((q)paramDrawable).a(paramInt);
  }

  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if ((paramDrawable instanceof q))
      ((q)paramDrawable).a(paramColorStateList);
  }

  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
  }

  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if ((paramDrawable instanceof q))
      ((q)paramDrawable).a(paramMode);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.k
 * JD-Core Version:    0.6.0
 */