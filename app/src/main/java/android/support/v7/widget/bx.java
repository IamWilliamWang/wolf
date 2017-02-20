package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class bx extends ContextWrapper
{
  private static final ArrayList<WeakReference<bx>> a = new ArrayList();
  private Resources b;
  private final Resources.Theme c = getResources().newTheme();

  private bx(Context paramContext)
  {
    super(paramContext);
    this.c.setTo(paramContext.getTheme());
  }

  public static Context a(Context paramContext)
  {
    Object localObject = paramContext;
    int j;
    int i;
    if (b(paramContext))
    {
      j = a.size();
      i = 0;
    }
    while (i < j)
    {
      localObject = (WeakReference)a.get(i);
      if (localObject != null);
      for (localObject = (bx)((WeakReference)localObject).get(); (localObject != null) && (((bx)localObject).getBaseContext() == paramContext); localObject = null)
        return localObject;
      i += 1;
    }
    paramContext = new bx(paramContext);
    a.add(new WeakReference(paramContext));
    return (Context)paramContext;
  }

  private static boolean b(Context paramContext)
  {
    if ((paramContext instanceof bx));
    do
      return false;
    while ((paramContext.getResources() instanceof bz));
    return true;
  }

  public Resources getResources()
  {
    if (this.b == null)
      this.b = new bz(this, super.getResources());
    return this.b;
  }

  public Resources.Theme getTheme()
  {
    return this.c;
  }

  public void setTheme(int paramInt)
  {
    this.c.applyStyle(paramInt, true);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bx
 * JD-Core Version:    0.6.0
 */