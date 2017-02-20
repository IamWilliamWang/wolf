package android.support.v4.h;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

class y
{
  private static Field a;
  private static boolean b;

  static void a(LayoutInflater paramLayoutInflater, ab paramab)
  {
    if (paramab != null);
    for (paramab = new z(paramab); ; paramab = null)
    {
      paramLayoutInflater.setFactory2(paramab);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2))
        break;
      a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      return;
    }
    a(paramLayoutInflater, paramab);
  }

  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!b);
    try
    {
      a = LayoutInflater.class.getDeclaredField("mFactory2");
      a.setAccessible(true);
      b = true;
      if (a == null);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        a.set(paramLayoutInflater, paramFactory2);
        return;
        localNoSuchFieldException = localNoSuchFieldException;
        Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", localNoSuchFieldException);
      }
      catch (java.lang.IllegalAccessException paramFactory2)
      {
        Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + paramLayoutInflater + "; inflation may have unexpected results.", paramFactory2);
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.y
 * JD-Core Version:    0.6.0
 */