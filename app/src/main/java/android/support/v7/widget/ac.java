package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ac
{
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private static ac b;
  private static final ae c = new ae(6);
  private static final int[] d = { android.support.v7.b.e.abc_textfield_search_default_mtrl_alpha, android.support.v7.b.e.abc_textfield_default_mtrl_alpha, android.support.v7.b.e.abc_ab_share_pack_mtrl_alpha };
  private static final int[] e = { android.support.v7.b.e.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.b.e.abc_ic_go_search_api_mtrl_alpha, android.support.v7.b.e.abc_ic_search_api_mtrl_alpha, android.support.v7.b.e.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.b.e.abc_ic_clear_mtrl_alpha, android.support.v7.b.e.abc_ic_menu_share_mtrl_alpha, android.support.v7.b.e.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.b.e.abc_ic_menu_cut_mtrl_alpha, android.support.v7.b.e.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.b.e.abc_ic_menu_paste_mtrl_am_alpha, android.support.v7.b.e.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.b.e.abc_ic_voice_search_api_mtrl_alpha };
  private static final int[] f = { android.support.v7.b.e.abc_textfield_activated_mtrl_alpha, android.support.v7.b.e.abc_textfield_search_activated_mtrl_alpha, android.support.v7.b.e.abc_cab_background_top_mtrl_alpha, android.support.v7.b.e.abc_text_cursor_material };
  private static final int[] g = { android.support.v7.b.e.abc_popup_background_mtrl_mult, android.support.v7.b.e.abc_cab_background_internal_bg, android.support.v7.b.e.abc_menu_hardkey_panel_mtrl_mult };
  private static final int[] h = { android.support.v7.b.e.abc_edit_text_material, android.support.v7.b.e.abc_tab_indicator_material, android.support.v7.b.e.abc_textfield_search_material, android.support.v7.b.e.abc_spinner_mtrl_am_alpha, android.support.v7.b.e.abc_spinner_textfield_background_material, android.support.v7.b.e.abc_ratingbar_full_material, android.support.v7.b.e.abc_switch_track_mtrl_alpha, android.support.v7.b.e.abc_switch_thumb_material, android.support.v7.b.e.abc_btn_default_mtrl_shape, android.support.v7.b.e.abc_btn_borderless_material };
  private static final int[] i = { android.support.v7.b.e.abc_btn_check_material, android.support.v7.b.e.abc_btn_radio_material };
  private WeakHashMap<Context, SparseArray<ColorStateList>> j;
  private android.support.v4.g.a<String, af> k;
  private SparseArray<String> l;
  private final Object m = new Object();
  private final WeakHashMap<Context, android.support.v4.g.e<WeakReference<Drawable.ConstantState>>> n = new WeakHashMap(0);
  private TypedValue o;

  private ColorStateList a(Context paramContext)
  {
    int i1 = bv.a(paramContext, b.colorControlNormal);
    int i2 = bv.a(paramContext, b.colorControlActivated);
    int[] arrayOfInt = bv.a;
    int i3 = bv.c(paramContext, b.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt, bv.b, bv.c, bv.d, bv.e, bv.f, bv.h }, new int[] { i3, i2, i2, i2, i2, i2, i1 });
  }

  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter2 = c.a(paramInt, paramMode);
    PorterDuffColorFilter localPorterDuffColorFilter1 = localPorterDuffColorFilter2;
    if (localPorterDuffColorFilter2 == null)
    {
      localPorterDuffColorFilter1 = new PorterDuffColorFilter(paramInt, paramMode);
      c.a(paramInt, paramMode, localPorterDuffColorFilter1);
    }
    return localPorterDuffColorFilter1;
  }

  private static PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList == null) || (paramMode == null))
      return null;
    return a(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
  }

  private Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = b(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (as.b(paramDrawable))
        paramContext = paramDrawable.mutate();
      paramContext = android.support.v4.c.a.a.f(paramContext);
      android.support.v4.c.a.a.a(paramContext, (ColorStateList)localObject);
      paramDrawable = a(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        android.support.v4.c.a.a.a(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    do
    {
      do
      {
        return localObject;
        if (paramInt == android.support.v7.b.e.abc_cab_background_top_material)
          return new LayerDrawable(new Drawable[] { a(paramContext, android.support.v7.b.e.abc_cab_background_internal_bg), a(paramContext, android.support.v7.b.e.abc_cab_background_top_mtrl_alpha) });
        if (paramInt == android.support.v7.b.e.abc_seekbar_track_material)
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), bv.a(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), bv.a(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), bv.a(paramContext, b.colorControlActivated), a);
          return paramDrawable;
        }
        if ((paramInt == android.support.v7.b.e.abc_ratingbar_indicator_material) || (paramInt == android.support.v7.b.e.abc_ratingbar_small_material))
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), bv.c(paramContext, b.colorControlNormal), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), bv.a(paramContext, b.colorControlActivated), a);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), bv.a(paramContext, b.colorControlActivated), a);
          return paramDrawable;
        }
        localObject = paramDrawable;
      }
      while (a(paramContext, paramInt, paramDrawable));
      localObject = paramDrawable;
    }
    while (!paramBoolean);
    return (Drawable)null;
  }

  private Drawable a(Context paramContext, long paramLong)
  {
    android.support.v4.g.e locale;
    synchronized (this.m)
    {
      locale = (android.support.v4.g.e)this.n.get(paramContext);
      if (locale == null)
        return null;
      Object localObject2 = (WeakReference)locale.a(paramLong);
      if (localObject2 == null)
        break label90;
      localObject2 = (Drawable.ConstantState)((WeakReference)localObject2).get();
      if (localObject2 != null)
      {
        paramContext = ((Drawable.ConstantState)localObject2).newDrawable(paramContext.getResources());
        return paramContext;
      }
    }
    locale.b(paramLong);
    label90: monitorexit;
    return (Drawable)null;
  }

  public static ac a()
  {
    if (b == null)
    {
      b = new ac();
      a(b);
    }
    return b;
  }

  private void a(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (this.j == null)
      this.j = new WeakHashMap();
    SparseArray localSparseArray2 = (SparseArray)this.j.get(paramContext);
    SparseArray localSparseArray1 = localSparseArray2;
    if (localSparseArray2 == null)
    {
      localSparseArray1 = new SparseArray();
      this.j.put(paramContext, localSparseArray1);
    }
    localSparseArray1.append(paramInt, paramColorStateList);
  }

  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (as.b(paramDrawable))
      localDrawable = paramDrawable.mutate();
    paramDrawable = paramMode;
    if (paramMode == null)
      paramDrawable = a;
    localDrawable.setColorFilter(a(paramInt, paramDrawable));
  }

  public static void a(Drawable paramDrawable, by paramby, int[] paramArrayOfInt)
  {
    if ((as.b(paramDrawable)) && (paramDrawable.mutate() != paramDrawable))
      Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
    label64: label92: label104: 
    while (true)
    {
      return;
      ColorStateList localColorStateList;
      if ((paramby.d) || (paramby.c))
        if (paramby.d)
        {
          localColorStateList = paramby.a;
          if (!paramby.c)
            break label92;
          paramby = paramby.b;
          paramDrawable.setColorFilter(a(localColorStateList, paramby, paramArrayOfInt));
        }
      while (true)
      {
        if (Build.VERSION.SDK_INT > 23)
          break label104;
        paramDrawable.invalidateSelf();
        return;
        localColorStateList = null;
        break;
        paramby = a;
        break label64;
        paramDrawable.clearColorFilter();
      }
    }
  }

  private static void a(ac paramac)
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 < 21)
    {
      paramac.a("vector", new ag(null));
      if (i1 >= 11)
        paramac.a("animated-vector", new ad(null));
    }
  }

  private void a(String paramString, af paramaf)
  {
    if (this.k == null)
      this.k = new android.support.v4.g.a();
    this.k.put(paramString, paramaf);
  }

  private static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = a;
    int i1;
    int i2;
    if (a(d, paramInt))
    {
      i1 = b.colorControlNormal;
      i2 = 1;
      paramInt = -1;
    }
    while (true)
    {
      if (i2 != 0)
      {
        Drawable localDrawable = paramDrawable;
        if (as.b(paramDrawable))
          localDrawable = paramDrawable.mutate();
        localDrawable.setColorFilter(a(bv.a(paramContext, i1), localMode));
        if (paramInt != -1)
          localDrawable.setAlpha(paramInt);
        return true;
        if (a(f, paramInt))
        {
          i1 = b.colorControlActivated;
          i2 = 1;
          paramInt = -1;
          continue;
        }
        if (a(g, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          i2 = 1;
          i1 = 16842801;
          paramInt = -1;
          continue;
        }
        if (paramInt == android.support.v7.b.e.abc_list_divider_mtrl_alpha)
        {
          i1 = 16842800;
          paramInt = Math.round(40.799999F);
          i2 = 1;
          continue;
        }
      }
      else
      {
        return false;
      }
      paramInt = -1;
      i1 = 0;
      i2 = 0;
    }
  }

  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null)
      synchronized (this.m)
      {
        android.support.v4.g.e locale = (android.support.v4.g.e)this.n.get(paramContext);
        paramDrawable = locale;
        if (locale == null)
        {
          paramDrawable = new android.support.v4.g.e();
          this.n.put(paramContext, paramDrawable);
        }
        paramDrawable.b(paramLong, new WeakReference(localConstantState));
        return true;
      }
    return false;
  }

  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i4 = 0;
    int i2 = paramArrayOfInt.length;
    int i1 = 0;
    while (true)
    {
      int i3 = i4;
      if (i1 < i2)
      {
        if (paramArrayOfInt[i1] == paramInt)
          i3 = 1;
      }
      else
        return i3;
      i1 += 1;
    }
  }

  private ColorStateList b(Context paramContext)
  {
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = bv.e;
    int i2 = bv.a(paramContext, b.colorControlActivated);
    int[] arrayOfInt3 = bv.h;
    int i3 = bv.a(paramContext, b.colorControlNormal);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }

  private ColorStateList c(Context paramContext)
  {
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.a(paramContext, 16842800, 0.1F);
    int[] arrayOfInt2 = bv.e;
    int i2 = bv.a(paramContext, b.colorControlActivated, 0.3F);
    int[] arrayOfInt3 = bv.h;
    int i3 = bv.a(paramContext, 16842800, 0.3F);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }

  private Drawable c(Context paramContext, int paramInt)
  {
    if ((this.k != null) && (!this.k.isEmpty()))
    {
      if (this.l != null)
      {
        localObject1 = (String)this.l.get(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (this.k.get(localObject1) == null)))
        {
          localObject1 = null;
          return localObject1;
        }
      }
      else
      {
        this.l = new SparseArray();
      }
      if (this.o == null)
        this.o = new TypedValue();
      TypedValue localTypedValue = this.o;
      Object localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l1 = localTypedValue.assetCookie << 32 | localTypedValue.data;
      Drawable localDrawable = a(paramContext, l1);
      if (localDrawable != null)
        return localDrawable;
      Object localObject2 = localDrawable;
      XmlResourceParser localXmlResourceParser;
      AttributeSet localAttributeSet;
      if (localTypedValue.string != null)
      {
        localObject2 = localDrawable;
        if (localTypedValue.string.toString().endsWith(".xml"))
        {
          localObject2 = localDrawable;
          try
          {
            localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
            localObject2 = localDrawable;
            localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
            int i1;
            do
            {
              localObject2 = localDrawable;
              i1 = localXmlResourceParser.next();
            }
            while ((i1 != 2) && (i1 != 1));
            if (i1 != 2)
            {
              localObject2 = localDrawable;
              throw new XmlPullParserException("No start tag found");
            }
          }
          catch (java.lang.Exception paramContext)
          {
            Log.e("AppCompatDrawableManager", "Exception while inflating drawable", paramContext);
          }
        }
      }
      for (paramContext = (Context)localObject2; ; paramContext = (Context)localObject1)
      {
        localObject1 = paramContext;
        if (paramContext != null)
          break;
        this.l.append(paramInt, "appcompat_skip_skip");
        return paramContext;
        localObject2 = localDrawable;
        localObject1 = localXmlResourceParser.getName();
        localObject2 = localDrawable;
        this.l.append(paramInt, localObject1);
        localObject2 = localDrawable;
        af localaf = (af)this.k.get(localObject1);
        localObject1 = localDrawable;
        if (localaf != null)
        {
          localObject2 = localDrawable;
          localObject1 = localaf.a(paramContext, localXmlResourceParser, localAttributeSet, paramContext.getTheme());
        }
        if (localObject1 == null)
          continue;
        localObject2 = localObject1;
        ((Drawable)localObject1).setChangingConfigurations(localTypedValue.changingConfigurations);
        localObject2 = localObject1;
        boolean bool = a(paramContext, l1, (Drawable)localObject1);
        if (!bool)
          continue;
      }
    }
    return (Drawable)(Drawable)null;
  }

  private ColorStateList d(Context paramContext)
  {
    int[][] arrayOfInt = new int[3][];
    int[] arrayOfInt1 = new int[3];
    ColorStateList localColorStateList = bv.b(paramContext, b.colorSwitchThumbNormal);
    if ((localColorStateList != null) && (localColorStateList.isStateful()))
    {
      arrayOfInt[0] = bv.a;
      arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt[0], 0);
      arrayOfInt[1] = bv.e;
      arrayOfInt1[1] = bv.a(paramContext, b.colorControlActivated);
      arrayOfInt[2] = bv.h;
      arrayOfInt1[2] = localColorStateList.getDefaultColor();
    }
    while (true)
    {
      return new ColorStateList(arrayOfInt, arrayOfInt1);
      arrayOfInt[0] = bv.a;
      arrayOfInt1[0] = bv.c(paramContext, b.colorSwitchThumbNormal);
      arrayOfInt[1] = bv.e;
      arrayOfInt1[1] = bv.a(paramContext, b.colorControlActivated);
      arrayOfInt[2] = bv.h;
      arrayOfInt1[2] = bv.a(paramContext, b.colorSwitchThumbNormal);
    }
  }

  private ColorStateList d(Context paramContext, int paramInt)
  {
    if (this.j != null)
    {
      paramContext = (SparseArray)this.j.get(paramContext);
      if (paramContext != null)
        return (ColorStateList)paramContext.get(paramInt);
      return null;
    }
    return null;
  }

  private ColorStateList e(Context paramContext)
  {
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = bv.g;
    int i2 = bv.a(paramContext, b.colorControlNormal);
    int[] arrayOfInt3 = bv.h;
    int i3 = bv.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }

  private ColorStateList e(Context paramContext, int paramInt)
  {
    paramInt = bv.a(paramContext, paramInt);
    int i3 = bv.a(paramContext, b.colorControlHighlight);
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.c(paramContext, b.colorButtonNormal);
    paramContext = bv.d;
    int i2 = android.support.v4.c.a.a(i3, paramInt);
    int[] arrayOfInt2 = bv.b;
    i3 = android.support.v4.c.a.a(i3, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, paramContext, arrayOfInt2, bv.h }, new int[] { i1, i2, i3, paramInt });
  }

  private ColorStateList f(Context paramContext)
  {
    return e(paramContext, b.colorButtonNormal);
  }

  private ColorStateList g(Context paramContext)
  {
    return e(paramContext, b.colorAccent);
  }

  private ColorStateList h(Context paramContext)
  {
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.c(paramContext, b.colorControlNormal);
    int[] arrayOfInt2 = bv.g;
    int i2 = bv.a(paramContext, b.colorControlNormal);
    int[] arrayOfInt3 = bv.h;
    int i3 = bv.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2, arrayOfInt3 }, new int[] { i1, i2, i3 });
  }

  private ColorStateList i(Context paramContext)
  {
    int[] arrayOfInt1 = bv.a;
    int i1 = bv.c(paramContext, b.colorControlActivated);
    int[] arrayOfInt2 = bv.h;
    int i2 = bv.a(paramContext, b.colorControlActivated);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt2 }, new int[] { i1, i2 });
  }

  final PorterDuff.Mode a(int paramInt)
  {
    PorterDuff.Mode localMode = null;
    if (paramInt == android.support.v7.b.e.abc_switch_thumb_material)
      localMode = PorterDuff.Mode.MULTIPLY;
    return localMode;
  }

  public Drawable a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, false);
  }

  public Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    Object localObject2 = c(paramContext, paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = android.support.v4.b.a.a(paramContext, paramInt);
    localObject2 = localObject1;
    if (localObject1 != null)
      localObject2 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
    if (localObject2 != null)
      as.a((Drawable)localObject2);
    return (Drawable)(Drawable)localObject2;
  }

  public final Drawable a(Context paramContext, bz parambz, int paramInt)
  {
    Drawable localDrawable2 = c(paramContext, paramInt);
    Drawable localDrawable1 = localDrawable2;
    if (localDrawable2 == null)
      localDrawable1 = parambz.a(paramInt);
    if (localDrawable1 != null)
      return a(paramContext, paramInt, false, localDrawable1);
    return null;
  }

  public final ColorStateList b(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList1 = d(paramContext, paramInt);
    ColorStateList localColorStateList2 = localColorStateList1;
    if (localColorStateList1 == null)
    {
      if (paramInt != android.support.v7.b.e.abc_edit_text_material)
        break label47;
      localColorStateList1 = e(paramContext);
    }
    while (true)
    {
      localColorStateList2 = localColorStateList1;
      if (localColorStateList1 != null)
      {
        a(paramContext, paramInt, localColorStateList1);
        localColorStateList2 = localColorStateList1;
      }
      return localColorStateList2;
      label47: if (paramInt == android.support.v7.b.e.abc_switch_track_mtrl_alpha)
      {
        localColorStateList1 = c(paramContext);
        continue;
      }
      if (paramInt == android.support.v7.b.e.abc_switch_thumb_material)
      {
        localColorStateList1 = d(paramContext);
        continue;
      }
      if ((paramInt == android.support.v7.b.e.abc_btn_default_mtrl_shape) || (paramInt == android.support.v7.b.e.abc_btn_borderless_material))
      {
        localColorStateList1 = f(paramContext);
        continue;
      }
      if (paramInt == android.support.v7.b.e.abc_btn_colored_material)
      {
        localColorStateList1 = g(paramContext);
        continue;
      }
      if ((paramInt == android.support.v7.b.e.abc_spinner_mtrl_am_alpha) || (paramInt == android.support.v7.b.e.abc_spinner_textfield_background_material))
      {
        localColorStateList1 = h(paramContext);
        continue;
      }
      if (a(e, paramInt))
      {
        localColorStateList1 = bv.b(paramContext, b.colorControlNormal);
        continue;
      }
      if (a(h, paramInt))
      {
        localColorStateList1 = a(paramContext);
        continue;
      }
      if (a(i, paramInt))
      {
        localColorStateList1 = b(paramContext);
        continue;
      }
      if (paramInt != android.support.v7.b.e.abc_seekbar_thumb_material)
        continue;
      localColorStateList1 = i(paramContext);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ac
 * JD-Core Version:    0.6.0
 */