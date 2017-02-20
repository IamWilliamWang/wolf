package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

class q extends l
  implements ActionProvider.VisibilityListener
{
  android.support.v4.h.l c;

  public q(p paramp, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramp, paramContext, paramActionProvider);
  }

  public View a(MenuItem paramMenuItem)
  {
    return this.a.onCreateActionView(paramMenuItem);
  }

  public void a(android.support.v4.h.l paraml)
  {
    this.c = paraml;
    ActionProvider localActionProvider = this.a;
    if (paraml != null);
    for (paraml = this; ; paraml = null)
    {
      localActionProvider.setVisibilityListener(paraml);
      return;
    }
  }

  public boolean b()
  {
    return this.a.overridesItemVisibility();
  }

  public boolean c()
  {
    return this.a.isVisible();
  }

  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    if (this.c != null)
      this.c.a(paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.q
 * JD-Core Version:    0.6.0
 */