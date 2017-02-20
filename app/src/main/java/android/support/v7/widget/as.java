package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.q;
import android.support.v7.c.a.a;

class as
{
  public static final Rect a = new Rect();
  private static Class<?> b;

  static
  {
    if (Build.VERSION.SDK_INT >= 18);
    try
    {
      b = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
  }

  static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    case 4:
    case 6:
    case 7:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
    case 3:
    case 5:
    case 9:
    case 14:
    case 15:
    case 16:
    }
    do
    {
      return paramMode;
      return PorterDuff.Mode.SRC_OVER;
      return PorterDuff.Mode.SRC_IN;
      return PorterDuff.Mode.SRC_ATOP;
      return PorterDuff.Mode.MULTIPLY;
      return PorterDuff.Mode.SCREEN;
    }
    while (Build.VERSION.SDK_INT < 11);
    return PorterDuff.Mode.valueOf("ADD");
  }

  static void a(Drawable paramDrawable)
  {
    if ((Build.VERSION.SDK_INT == 21) && ("android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName())))
      c(paramDrawable);
  }

  static boolean b(Drawable paramDrawable)
  {
    int m = 1;
    int k;
    if ((paramDrawable instanceof LayerDrawable))
      if (Build.VERSION.SDK_INT >= 16)
        k = 1;
    do
    {
      while (true)
      {
        return k;
        k = 0;
        continue;
        if ((paramDrawable instanceof InsetDrawable))
        {
          k = m;
          if (Build.VERSION.SDK_INT < 14)
            return false;
        }
        if ((paramDrawable instanceof StateListDrawable))
        {
          k = m;
          if (Build.VERSION.SDK_INT < 8)
            return false;
        }
        if ((paramDrawable instanceof GradientDrawable))
        {
          k = m;
          if (Build.VERSION.SDK_INT < 14)
            return false;
        }
        if (!(paramDrawable instanceof DrawableContainer))
          break;
        paramDrawable = paramDrawable.getConstantState();
        k = m;
        if (!(paramDrawable instanceof DrawableContainer.DrawableContainerState))
          continue;
        paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
        int j = paramDrawable.length;
        int i = 0;
        while (true)
        {
          k = m;
          if (i >= j)
            break;
          if (!b(paramDrawable[i]))
            return false;
          i += 1;
        }
      }
      if ((paramDrawable instanceof q))
        return b(((q)paramDrawable).a());
      k = m;
    }
    while (!(paramDrawable instanceof a));
    return b(((a)paramDrawable).a());
  }

  private static void c(Drawable paramDrawable)
  {
    int[] arrayOfInt = paramDrawable.getState();
    if ((arrayOfInt == null) || (arrayOfInt.length == 0))
      paramDrawable.setState(bv.e);
    while (true)
    {
      paramDrawable.setState(arrayOfInt);
      return;
      paramDrawable.setState(bv.h);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.as
 * JD-Core Version:    0.6.0
 */