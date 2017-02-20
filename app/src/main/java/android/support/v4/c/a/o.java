package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class o
{
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }

  public static boolean a(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }

  public static Drawable b(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof y))
      localObject = new y(paramDrawable);
    return (Drawable)localObject;
  }

  public static int c(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.o
 * JD-Core Version:    0.6.0
 */