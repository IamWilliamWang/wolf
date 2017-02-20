package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class z extends g
  implements SubMenu
{
  private g d;
  private j e;

  public z(Context paramContext, g paramg, j paramj)
  {
    super(paramContext);
    this.d = paramg;
    this.e = paramj;
  }

  public void a(h paramh)
  {
    this.d.a(paramh);
  }

  public boolean a()
  {
    return this.d.a();
  }

  boolean a(g paramg, MenuItem paramMenuItem)
  {
    return (super.a(paramg, paramMenuItem)) || (this.d.a(paramg, paramMenuItem));
  }

  public boolean b()
  {
    return this.d.b();
  }

  public boolean c(j paramj)
  {
    return this.d.c(paramj);
  }

  public boolean d(j paramj)
  {
    return this.d.d(paramj);
  }

  public MenuItem getItem()
  {
    return this.e;
  }

  public g l()
  {
    return this.d;
  }

  public Menu o()
  {
    return this.d;
  }

  public SubMenu setHeaderIcon(int paramInt)
  {
    super.a(a.a(d(), paramInt));
    return this;
  }

  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    return this;
  }

  public SubMenu setHeaderTitle(int paramInt)
  {
    super.a(d().getResources().getString(paramInt));
    return this;
  }

  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(paramCharSequence);
    return this;
  }

  public SubMenu setHeaderView(View paramView)
  {
    super.a(paramView);
    return this;
  }

  public SubMenu setIcon(int paramInt)
  {
    this.e.setIcon(paramInt);
    return this;
  }

  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.e.setIcon(paramDrawable);
    return this;
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.d.setQwertyMode(paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.z
 * JD-Core Version:    0.6.0
 */