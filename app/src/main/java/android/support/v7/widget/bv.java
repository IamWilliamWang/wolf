package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.c.a;
import android.util.TypedValue;

class bv
{
  static final int[] a;
  static final int[] b;
  static final int[] c;
  static final int[] d;
  static final int[] e;
  static final int[] f;
  static final int[] g;
  static final int[] h;
  private static final ThreadLocal<TypedValue> i = new ThreadLocal();
  private static final int[] j;

  static
  {
    a = new int[] { -16842910 };
    b = new int[] { 16842908 };
    c = new int[] { 16843518 };
    d = new int[] { 16842919 };
    e = new int[] { 16842912 };
    f = new int[] { 16842913 };
    g = new int[] { -16842919, -16842908 };
    h = new int[0];
    j = new int[1];
  }

  public static int a(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, j);
    try
    {
      paramInt = paramContext.getColor(0, 0);
      return paramInt;
    }
    finally
    {
      paramContext.recycle();
    }
    throw localObject;
  }

  static int a(Context paramContext, int paramInt, float paramFloat)
  {
    paramInt = a(paramContext, paramInt);
    return a.b(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }

  private static TypedValue a()
  {
    TypedValue localTypedValue2 = (TypedValue)i.get();
    TypedValue localTypedValue1 = localTypedValue2;
    if (localTypedValue2 == null)
    {
      localTypedValue1 = new TypedValue();
      i.set(localTypedValue1);
    }
    return localTypedValue1;
  }

  public static ColorStateList b(Context paramContext, int paramInt)
  {
    j[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, j);
    try
    {
      ColorStateList localColorStateList = paramContext.getColorStateList(0);
      return localColorStateList;
    }
    finally
    {
      paramContext.recycle();
    }
    throw localObject;
  }

  public static int c(Context paramContext, int paramInt)
  {
    Object localObject = b(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful()))
      return ((ColorStateList)localObject).getColorForState(a, ((ColorStateList)localObject).getDefaultColor());
    localObject = a();
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    return a(paramContext, paramInt, ((TypedValue)localObject).getFloat());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bv
 * JD-Core Version:    0.6.0
 */