package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class j
{
  private final Context a;
  private k b;
  private l c;

  public j(Context paramContext)
  {
    this.a = paramContext;
  }

  public native abstract View a();

  public View a(MenuItem paramMenuItem)
  {
    return a();
  }

  public void a(k paramk)
  {
    this.b = paramk;
  }

  public void a(l paraml)
  {
    if ((this.c != null) && (paraml != null))
      Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
    this.c = paraml;
  }

  public void a(SubMenu paramSubMenu)
  {
  }

  public void a(boolean paramBoolean)
  {
    if (this.b != null)
      this.b.a(paramBoolean);
  }

  public boolean b()
  {
    return false;
  }

  public boolean c()
  {
    return true;
  }

  public boolean d()
  {
    return false;
  }

  public boolean e()
  {
    return false;
  }

  public void f()
  {
    this.c = null;
    this.b = null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.j
 * JD-Core Version:    0.6.0
 */