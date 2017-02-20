package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class e
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class<?>[] a = { MenuItem.class };
  private Object b;
  private Method c;

  public e(Object paramObject, String paramString)
  {
    this.b = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      this.c = localClass.getMethod(paramString, a);
      return;
    }
    catch (java.lang.Exception paramObject)
    {
      paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
      paramString.initCause(paramObject);
    }
    throw paramString;
  }

  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (this.c.getReturnType() == Boolean.TYPE)
        return ((Boolean)this.c.invoke(this.b, new Object[] { paramMenuItem })).booleanValue();
      this.c.invoke(this.b, new Object[] { paramMenuItem });
      return true;
    }
    catch (java.lang.Exception paramMenuItem)
    {
    }
    throw new RuntimeException(paramMenuItem);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.e
 * JD-Core Version:    0.6.0
 */