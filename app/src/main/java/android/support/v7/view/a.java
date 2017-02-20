package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.h.ce;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.d;
import android.support.v7.b.g;
import android.support.v7.b.k;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class a
{
  private Context a;

  private a(Context paramContext)
  {
    this.a = paramContext;
  }

  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }

  public int a()
  {
    return this.a.getResources().getInteger(g.abc_max_action_buttons);
  }

  public boolean b()
  {
    if (Build.VERSION.SDK_INT >= 19);
    do
      return true;
    while (!ce.a(ViewConfiguration.get(this.a)));
    return false;
  }

  public int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public boolean d()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16)
      return this.a.getResources().getBoolean(c.abc_action_bar_embed_tabs);
    return this.a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
  }

  public int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, k.ActionBar, b.actionBarStyle, 0);
    int j = localTypedArray.getLayoutDimension(k.ActionBar_height, 0);
    Resources localResources = this.a.getResources();
    int i = j;
    if (!d())
      i = Math.min(j, localResources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
    localTypedArray.recycle();
    return i;
  }

  public int f()
  {
    return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.a
 * JD-Core Version:    0.6.0
 */