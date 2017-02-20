package android.support.v7.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.h.ah;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class f
{
  private Menu b;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private CharSequence l;
  private CharSequence m;
  private int n;
  private char o;
  private char p;
  private int q;
  private boolean r;
  private boolean s;
  private boolean t;
  private int u;
  private int v;
  private String w;
  private String x;
  private String y;
  private android.support.v4.h.j z;

  public f(d paramd, Menu paramMenu)
  {
    this.b = paramMenu;
    a();
  }

  private char a(String paramString)
  {
    if (paramString == null)
      return '\000';
    return paramString.charAt(0);
  }

  private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = d.a(this.a).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
      return paramArrayOfClass;
    }
    catch (java.lang.Exception paramArrayOfClass)
    {
      Log.w("SupportMenuInflater", "Cannot instantiate class: " + paramString, paramArrayOfClass);
    }
    return null;
  }

  private void a(MenuItem paramMenuItem)
  {
    int i1 = 1;
    Object localObject = paramMenuItem.setChecked(this.r).setVisible(this.s).setEnabled(this.t);
    boolean bool;
    if (this.q >= 1)
      bool = true;
    while (true)
    {
      ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.m).setIcon(this.n).setAlphabeticShortcut(this.o).setNumericShortcut(this.p);
      if (this.u >= 0)
        ah.a(paramMenuItem, this.u);
      if (this.y == null)
        break;
      if (d.a(this.a).isRestricted())
      {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        bool = false;
        continue;
      }
      paramMenuItem.setOnMenuItemClickListener(new e(d.c(this.a), this.y));
    }
    if ((paramMenuItem instanceof android.support.v7.view.menu.j))
      localObject = (android.support.v7.view.menu.j)paramMenuItem;
    if (this.q >= 2)
    {
      if ((paramMenuItem instanceof android.support.v7.view.menu.j))
        ((android.support.v7.view.menu.j)paramMenuItem).a(true);
    }
    else
    {
      if (this.w == null)
        break label297;
      ah.a(paramMenuItem, (View)a(this.w, d.b(), d.d(this.a)));
    }
    while (true)
    {
      if (this.v > 0)
      {
        if (i1 != 0)
          break label286;
        ah.b(paramMenuItem, this.v);
      }
      while (true)
      {
        if (this.z != null)
          ah.a(paramMenuItem, this.z);
        return;
        if (!(paramMenuItem instanceof android.support.v7.view.menu.k))
          break;
        ((android.support.v7.view.menu.k)paramMenuItem).a(true);
        break;
        label286: Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
      label297: i1 = 0;
    }
  }

  public void a()
  {
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
    this.g = true;
    this.h = true;
  }

  public void a(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = d.a(this.a).obtainStyledAttributes(paramAttributeSet, android.support.v7.b.k.MenuGroup);
    this.c = paramAttributeSet.getResourceId(android.support.v7.b.k.MenuGroup_android_id, 0);
    this.d = paramAttributeSet.getInt(android.support.v7.b.k.MenuGroup_android_menuCategory, 0);
    this.e = paramAttributeSet.getInt(android.support.v7.b.k.MenuGroup_android_orderInCategory, 0);
    this.f = paramAttributeSet.getInt(android.support.v7.b.k.MenuGroup_android_checkableBehavior, 0);
    this.g = paramAttributeSet.getBoolean(android.support.v7.b.k.MenuGroup_android_visible, true);
    this.h = paramAttributeSet.getBoolean(android.support.v7.b.k.MenuGroup_android_enabled, true);
    paramAttributeSet.recycle();
  }

  public void b()
  {
    this.i = true;
    a(this.b.add(this.c, this.j, this.k, this.l));
  }

  public void b(AttributeSet paramAttributeSet)
  {
    int i2 = 1;
    paramAttributeSet = d.a(this.a).obtainStyledAttributes(paramAttributeSet, android.support.v7.b.k.MenuItem);
    this.j = paramAttributeSet.getResourceId(android.support.v7.b.k.MenuItem_android_id, 0);
    this.k = (paramAttributeSet.getInt(android.support.v7.b.k.MenuItem_android_menuCategory, this.d) & 0xFFFF0000 | paramAttributeSet.getInt(android.support.v7.b.k.MenuItem_android_orderInCategory, this.e) & 0xFFFF);
    this.l = paramAttributeSet.getText(android.support.v7.b.k.MenuItem_android_title);
    this.m = paramAttributeSet.getText(android.support.v7.b.k.MenuItem_android_titleCondensed);
    this.n = paramAttributeSet.getResourceId(android.support.v7.b.k.MenuItem_android_icon, 0);
    this.o = a(paramAttributeSet.getString(android.support.v7.b.k.MenuItem_android_alphabeticShortcut));
    this.p = a(paramAttributeSet.getString(android.support.v7.b.k.MenuItem_android_numericShortcut));
    int i1;
    if (paramAttributeSet.hasValue(android.support.v7.b.k.MenuItem_android_checkable))
      if (paramAttributeSet.getBoolean(android.support.v7.b.k.MenuItem_android_checkable, false))
      {
        i1 = 1;
        this.q = i1;
        label156: this.r = paramAttributeSet.getBoolean(android.support.v7.b.k.MenuItem_android_checked, false);
        this.s = paramAttributeSet.getBoolean(android.support.v7.b.k.MenuItem_android_visible, this.g);
        this.t = paramAttributeSet.getBoolean(android.support.v7.b.k.MenuItem_android_enabled, this.h);
        this.u = paramAttributeSet.getInt(android.support.v7.b.k.MenuItem_showAsAction, -1);
        this.y = paramAttributeSet.getString(android.support.v7.b.k.MenuItem_android_onClick);
        this.v = paramAttributeSet.getResourceId(android.support.v7.b.k.MenuItem_actionLayout, 0);
        this.w = paramAttributeSet.getString(android.support.v7.b.k.MenuItem_actionViewClass);
        this.x = paramAttributeSet.getString(android.support.v7.b.k.MenuItem_actionProviderClass);
        if (this.x == null)
          break label333;
        i1 = i2;
        label264: if ((i1 == 0) || (this.v != 0) || (this.w != null))
          break label338;
      }
    for (this.z = ((android.support.v4.h.j)a(this.x, d.a(), d.b(this.a))); ; this.z = null)
    {
      paramAttributeSet.recycle();
      this.i = false;
      return;
      i1 = 0;
      break;
      this.q = this.f;
      break label156;
      label333: i1 = 0;
      break label264;
      label338: if (i1 == 0)
        continue;
      Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
    }
  }

  public SubMenu c()
  {
    this.i = true;
    SubMenu localSubMenu = this.b.addSubMenu(this.c, this.j, this.k, this.l);
    a(localSubMenu.getItem());
    return localSubMenu;
  }

  public boolean d()
  {
    return this.i;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.f
 * JD-Core Version:    0.6.0
 */