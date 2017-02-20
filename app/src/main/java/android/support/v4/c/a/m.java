package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class m
{
  public static void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }

  public static Drawable b(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof w))
      localObject = new w(paramDrawable);
    return (Drawable)localObject;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.c.a.m
 * JD-Core Version:    0.6.0
 */