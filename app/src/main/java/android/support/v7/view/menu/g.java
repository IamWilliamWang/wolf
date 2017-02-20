package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.b.c;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g
  implements android.support.v4.d.a.a
{
  private static final int[] d = { 1, 4, 5, 3, 2, 0 };
  CharSequence a;
  Drawable b;
  View c;
  private final Context e;
  private final Resources f;
  private boolean g;
  private boolean h;
  private h i;
  private ArrayList<j> j;
  private ArrayList<j> k;
  private boolean l;
  private ArrayList<j> m;
  private ArrayList<j> n;
  private boolean o;
  private int p = 0;
  private ContextMenu.ContextMenuInfo q;
  private boolean r = false;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private ArrayList<j> v = new ArrayList();
  private CopyOnWriteArrayList<WeakReference<t>> w = new CopyOnWriteArrayList();
  private j x;
  private boolean y;

  public g(Context paramContext)
  {
    this.e = paramContext;
    this.f = paramContext.getResources();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = true;
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = true;
    d(true);
  }

  private static int a(ArrayList<j> paramArrayList, int paramInt)
  {
    int i1 = paramArrayList.size() - 1;
    while (i1 >= 0)
    {
      if (((j)paramArrayList.get(i1)).c() <= paramInt)
        return i1 + 1;
      i1 -= 1;
    }
    return 0;
  }

  private j a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    return new j(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
  }

  private void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = c();
    if (paramView != null)
    {
      this.c = paramView;
      this.a = null;
      this.b = null;
      b(false);
      return;
    }
    if (paramInt1 > 0)
    {
      this.a = localResources.getText(paramInt1);
      label47: if (paramInt2 <= 0)
        break label83;
      this.b = android.support.v4.b.a.a(d(), paramInt2);
    }
    while (true)
    {
      this.c = null;
      break;
      if (paramCharSequence == null)
        break label47;
      this.a = paramCharSequence;
      break label47;
      label83: if (paramDrawable == null)
        continue;
      this.b = paramDrawable;
    }
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.j.size()));
    do
    {
      return;
      this.j.remove(paramInt);
    }
    while (!paramBoolean);
    b(true);
  }

  private boolean a(z paramz, t paramt)
  {
    boolean bool = false;
    if (this.w.isEmpty())
      return false;
    if (paramt != null)
      bool = paramt.a(paramz);
    paramt = this.w.iterator();
    t localt;
    if (paramt.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramt.next();
      localt = (t)localWeakReference.get();
      if (localt == null)
        this.w.remove(localWeakReference);
    }
    while (true)
    {
      break;
      if (!bool)
      {
        bool = localt.a(paramz);
        continue;
        return bool;
      }
    }
  }

  private static int c(int paramInt)
  {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if ((i1 < 0) || (i1 >= d.length))
      throw new IllegalArgumentException("order does not contain a valid category.");
    return d[i1] << 16 | 0xFFFF & paramInt;
  }

  private void c(boolean paramBoolean)
  {
    if (this.w.isEmpty())
      return;
    f();
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      t localt = (t)localWeakReference.get();
      if (localt == null)
      {
        this.w.remove(localWeakReference);
        continue;
      }
      localt.b(paramBoolean);
    }
    g();
  }

  private void d(boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramBoolean) && (this.f.getConfiguration().keyboard != 1) && (this.f.getBoolean(c.abc_config_showMenuShortcutsWhenKeyboardPresent)));
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      this.h = paramBoolean;
      return;
    }
  }

  public int a(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((j)this.j.get(i1)).getItemId() == paramInt)
        return i1;
      i1 += 1;
    }
    return -1;
  }

  public int a(int paramInt1, int paramInt2)
  {
    int i2 = size();
    int i1 = paramInt2;
    if (paramInt2 < 0)
      i1 = 0;
    while (i1 < i2)
    {
      if (((j)this.j.get(i1)).getGroupId() == paramInt1)
        return i1;
      i1 += 1;
    }
    return -1;
  }

  protected g a(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }

  protected g a(View paramView)
  {
    a(0, null, 0, null, paramView);
    return this;
  }

  protected g a(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }

  j a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.v;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty())
    {
      paramKeyEvent = null;
      return paramKeyEvent;
    }
    int i3 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i4 = localArrayList.size();
    if (i4 == 1)
      return (j)localArrayList.get(0);
    boolean bool = a();
    int i1 = 0;
    label84: if (i1 < i4)
    {
      j localj = (j)localArrayList.get(i1);
      if (bool);
      for (int i2 = localj.getAlphabeticShortcut(); ; i2 = localj.getNumericShortcut())
      {
        if (i2 == localKeyData.meta[0])
        {
          paramKeyEvent = localj;
          if ((i3 & 0x2) == 0)
            break;
        }
        if (i2 == localKeyData.meta[2])
        {
          paramKeyEvent = localj;
          if ((i3 & 0x2) != 0)
            break;
        }
        if ((bool) && (i2 == 8))
        {
          paramKeyEvent = localj;
          if (paramInt == 67)
            break;
        }
        i1 += 1;
        break label84;
      }
    }
    return null;
  }

  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = c(paramInt3);
    paramCharSequence = a(paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.p);
    if (this.q != null)
      paramCharSequence.a(this.q);
    this.j.add(a(this.j, i1), paramCharSequence);
    b(true);
    return paramCharSequence;
  }

  public void a(h paramh)
  {
    this.i = paramh;
  }

  void a(j paramj)
  {
    this.l = true;
    b(true);
  }

  public void a(t paramt, Context paramContext)
  {
    this.w.add(new WeakReference(paramt));
    paramt.a(paramContext, this);
    this.o = true;
  }

  void a(MenuItem paramMenuItem)
  {
    int i2 = paramMenuItem.getGroupId();
    int i3 = this.j.size();
    int i1 = 0;
    if (i1 < i3)
    {
      j localj = (j)this.j.get(i1);
      if ((localj.getGroupId() != i2) || (!localj.g()));
      do
      {
        i1 += 1;
        break;
      }
      while (!localj.isCheckable());
      if (localj == paramMenuItem);
      for (boolean bool = true; ; bool = false)
      {
        localj.b(bool);
        break;
      }
    }
  }

  void a(List<j> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = a();
    int i3 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int i4 = this.j.size();
    int i1 = 0;
    label49: j localj;
    if (i1 < i4)
    {
      localj = (j)this.j.get(i1);
      if (localj.hasSubMenu())
        ((g)localj.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label184;
    }
    label184: for (int i2 = localj.getAlphabeticShortcut(); ; i2 = localj.getNumericShortcut())
    {
      if (((i3 & 0x5) == 0) && (i2 != 0) && ((i2 == localKeyData.meta[0]) || (i2 == localKeyData.meta[2]) || ((bool) && (i2 == 8) && (paramInt == 67))) && (localj.isEnabled()))
        paramList.add(localj);
      i1 += 1;
      break label49;
      break;
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.u)
      return;
    this.u = true;
    Iterator localIterator = this.w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      t localt = (t)localWeakReference.get();
      if (localt == null)
      {
        this.w.remove(localWeakReference);
        continue;
      }
      localt.a(this, paramBoolean);
    }
    this.u = false;
  }

  boolean a()
  {
    return this.g;
  }

  boolean a(g paramg, MenuItem paramMenuItem)
  {
    return (this.i != null) && (this.i.a(paramg, paramMenuItem));
  }

  public boolean a(MenuItem paramMenuItem, int paramInt)
  {
    return a(paramMenuItem, null, paramInt);
  }

  public boolean a(MenuItem paramMenuItem, t paramt, int paramInt)
  {
    boolean bool2 = false;
    Object localObject = (j)paramMenuItem;
    boolean bool1 = bool2;
    if (localObject != null)
    {
      if (((j)localObject).isEnabled())
        break label33;
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      label33: bool1 = ((j)localObject).b();
      paramMenuItem = ((j)localObject).a();
      if ((paramMenuItem != null) && (paramMenuItem.e()));
      for (int i1 = 1; ; i1 = 0)
      {
        if (!((j)localObject).n())
          break label101;
        bool2 = ((j)localObject).expandActionView() | bool1;
        bool1 = bool2;
        if (!bool2)
          break;
        a(true);
        return bool2;
      }
      label101: if ((!((j)localObject).hasSubMenu()) && (i1 == 0))
        break;
      a(false);
      if (!((j)localObject).hasSubMenu())
        ((j)localObject).a(new z(d(), this, (j)localObject));
      localObject = (z)((j)localObject).getSubMenu();
      if (i1 != 0)
        paramMenuItem.a((SubMenu)localObject);
      bool2 = a((z)localObject, paramt) | bool1;
      bool1 = bool2;
      if (bool2)
        continue;
      a(true);
      return bool2;
    }
    if ((paramInt & 0x1) == 0)
      a(true);
    return bool1;
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.f.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.e.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      paramInt4 = 0;
      if (paramInt4 >= i1)
        break label214;
      localResolveInfo = (ResolveInfo)localList.get(paramInt4);
      if (localResolveInfo.specificIndex >= 0)
        break label201;
    }
    label201: for (paramComponentName = paramIntent; ; paramComponentName = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = paramComponentName;
      paramInt4 += 1;
      break label52;
      i1 = 0;
      break;
    }
    label214: return i1;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.f.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.f.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    z localz = new z(this.e, this, paramCharSequence);
    paramCharSequence.a(localz);
    return localz;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  public int b(int paramInt)
  {
    return a(paramInt, 0);
  }

  void b(j paramj)
  {
    this.o = true;
    b(true);
  }

  public void b(boolean paramBoolean)
  {
    if (!this.r)
    {
      if (paramBoolean)
      {
        this.l = true;
        this.o = true;
      }
      c(paramBoolean);
      return;
    }
    this.s = true;
  }

  public boolean b()
  {
    return this.h;
  }

  Resources c()
  {
    return this.f;
  }

  public boolean c(j paramj)
  {
    boolean bool2 = false;
    if (this.w.isEmpty())
      return bool2;
    f();
    Iterator localIterator = this.w.iterator();
    boolean bool1 = false;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      t localt = (t)localWeakReference.get();
      if (localt == null)
        this.w.remove(localWeakReference);
      do
      {
        break;
        bool2 = localt.a(this, paramj);
        bool1 = bool2;
      }
      while (!bool2);
      bool1 = bool2;
    }
    while (true)
    {
      g();
      bool2 = bool1;
      if (!bool1)
        break;
      this.x = paramj;
      return bool1;
    }
  }

  public void clear()
  {
    if (this.x != null)
      d(this.x);
    this.j.clear();
    b(true);
  }

  public void clearHeader()
  {
    this.b = null;
    this.a = null;
    this.c = null;
    b(false);
  }

  public void close()
  {
    a(true);
  }

  public Context d()
  {
    return this.e;
  }

  public boolean d(j paramj)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!this.w.isEmpty())
    {
      if (this.x != paramj)
        bool2 = bool1;
    }
    else
      return bool2;
    f();
    Iterator localIterator = this.w.iterator();
    bool1 = false;
    if (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      t localt = (t)localWeakReference.get();
      if (localt == null)
        this.w.remove(localWeakReference);
      do
      {
        break;
        bool2 = localt.b(this, paramj);
        bool1 = bool2;
      }
      while (!bool2);
      bool1 = bool2;
    }
    while (true)
    {
      g();
      bool2 = bool1;
      if (!bool1)
        break;
      this.x = null;
      return bool1;
    }
  }

  public void e()
  {
    if (this.i != null)
      this.i.a(this);
  }

  public void f()
  {
    if (!this.r)
    {
      this.r = true;
      this.s = false;
    }
  }

  public MenuItem findItem(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = (j)this.j.get(i1);
      if (((j)localObject).getItemId() == paramInt);
      MenuItem localMenuItem;
      do
      {
        return localObject;
        if (!((j)localObject).hasSubMenu())
          break;
        localMenuItem = ((j)localObject).getSubMenu().findItem(paramInt);
        localObject = localMenuItem;
      }
      while (localMenuItem != null);
      i1 += 1;
    }
    return (MenuItem)null;
  }

  public void g()
  {
    this.r = false;
    if (this.s)
    {
      this.s = false;
      b(true);
    }
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.j.get(paramInt);
  }

  public ArrayList<j> h()
  {
    if (!this.l)
      return this.k;
    this.k.clear();
    int i2 = this.j.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)this.j.get(i1);
      if (localj.isVisible())
        this.k.add(localj);
      i1 += 1;
    }
    this.l = false;
    this.o = true;
    return this.k;
  }

  public boolean hasVisibleItems()
  {
    if (this.y)
      return true;
    int i2 = size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((j)this.j.get(i1)).isVisible())
        return true;
      i1 += 1;
    }
    return false;
  }

  public void i()
  {
    ArrayList localArrayList = h();
    if (!this.o)
      return;
    Object localObject = this.w.iterator();
    int i1 = 0;
    if (((Iterator)localObject).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject).next();
      t localt = (t)localWeakReference.get();
      if (localt == null)
        this.w.remove(localWeakReference);
      while (true)
      {
        break;
        i1 = localt.b() | i1;
      }
    }
    if (i1 != 0)
    {
      this.m.clear();
      this.n.clear();
      int i3 = localArrayList.size();
      i1 = 0;
      if (i1 < i3)
      {
        localObject = (j)localArrayList.get(i1);
        if (((j)localObject).j())
          this.m.add(localObject);
        while (true)
        {
          int i2;
          i1 += 1;
          break;
          this.n.add(localObject);
        }
      }
    }
    else
    {
      this.m.clear();
      this.n.clear();
      this.n.addAll(h());
    }
    this.o = false;
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }

  public ArrayList<j> j()
  {
    i();
    return this.m;
  }

  public ArrayList<j> k()
  {
    i();
    return this.n;
  }

  public g l()
  {
    return this;
  }

  boolean m()
  {
    return this.t;
  }

  public j n()
  {
    return this.x;
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (paramKeyEvent != null)
      bool = a(paramKeyEvent, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      a(true);
    return bool;
  }

  public void removeGroup(int paramInt)
  {
    int i2 = b(paramInt);
    if (i2 >= 0)
    {
      int i3 = this.j.size();
      int i1 = 0;
      while ((i1 < i3 - i2) && (((j)this.j.get(i2)).getGroupId() == paramInt))
      {
        a(i2, false);
        i1 += 1;
      }
      b(true);
    }
  }

  public void removeItem(int paramInt)
  {
    a(a(paramInt), true);
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = this.j.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)this.j.get(i1);
      if (localj.getGroupId() == paramInt)
      {
        localj.a(paramBoolean2);
        localj.setCheckable(paramBoolean1);
      }
      i1 += 1;
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i2 = this.j.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)this.j.get(i1);
      if (localj.getGroupId() == paramInt)
        localj.setEnabled(paramBoolean);
      i1 += 1;
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i3 = this.j.size();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i3)
    {
      j localj = (j)this.j.get(i2);
      if ((localj.getGroupId() != paramInt) || (!localj.c(paramBoolean)))
        break label74;
      i1 = 1;
    }
    label74: 
    while (true)
    {
      i2 += 1;
      break;
      if (i1 != 0)
        b(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.g = paramBoolean;
    b(false);
  }

  public int size()
  {
    return this.j.size();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.g
 * JD-Core Version:    0.6.0
 */