package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a;
import android.support.v4.h.bc;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class ak extends Spinner
  implements bc
{
  private static final boolean a;
  private static final boolean b;
  private static final int[] c;
  private ac d;
  private ab e;
  private Context f;
  private az g;
  private SpinnerAdapter h;
  private boolean i;
  private am j;
  private int k;
  private final Rect l;

  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      a = bool;
      if (Build.VERSION.SDK_INT < 16)
        break label45;
    }
    label45: for (boolean bool = true; ; bool = false)
    {
      b = bool;
      c = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }

  public ak(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }

  public ak(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }

  // ERROR //
  public ak(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, android.content.res.Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 57	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 59	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 61	android/graphics/Rect:<init>	()V
    //   15: putfield 63	android/support/v7/widget/ak:l	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 68	android/support/v7/b/k:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 73	android/support/v7/widget/ca:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ca;
    //   28: astore 10
    //   30: aload_0
    //   31: invokestatic 78	android/support/v7/widget/ac:a	()Landroid/support/v7/widget/ac;
    //   34: putfield 80	android/support/v7/widget/ak:d	Landroid/support/v7/widget/ac;
    //   37: aload_0
    //   38: new 82	android/support/v7/widget/ab
    //   41: dup
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 80	android/support/v7/widget/ak:d	Landroid/support/v7/widget/ac;
    //   47: invokespecial 85	android/support/v7/widget/ab:<init>	(Landroid/view/View;Landroid/support/v7/widget/ac;)V
    //   50: putfield 87	android/support/v7/widget/ak:e	Landroid/support/v7/widget/ab;
    //   53: aload 5
    //   55: ifnull +286 -> 341
    //   58: aload_0
    //   59: new 89	android/support/v7/view/c
    //   62: dup
    //   63: aload_1
    //   64: aload 5
    //   66: invokespecial 92	android/support/v7/view/c:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   69: putfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   72: aload_0
    //   73: getfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   76: ifnull +184 -> 260
    //   79: iload 4
    //   81: istore 7
    //   83: iload 4
    //   85: iconst_m1
    //   86: if_icmpne +71 -> 157
    //   89: getstatic 37	android/os/Build$VERSION:SDK_INT	I
    //   92: bipush 11
    //   94: if_icmplt +360 -> 454
    //   97: aload_1
    //   98: aload_2
    //   99: getstatic 44	android/support/v7/widget/ak:c	[I
    //   102: iload_3
    //   103: iconst_0
    //   104: invokevirtual 100	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   107: astore 8
    //   109: iload 4
    //   111: istore 6
    //   113: aload 8
    //   115: astore 5
    //   117: aload 8
    //   119: iconst_0
    //   120: invokevirtual 106	android/content/res/TypedArray:hasValue	(I)Z
    //   123: ifeq +16 -> 139
    //   126: aload 8
    //   128: astore 5
    //   130: aload 8
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual 110	android/content/res/TypedArray:getInt	(II)I
    //   137: istore 6
    //   139: iload 6
    //   141: istore 7
    //   143: aload 8
    //   145: ifnull +12 -> 157
    //   148: aload 8
    //   150: invokevirtual 113	android/content/res/TypedArray:recycle	()V
    //   153: iload 6
    //   155: istore 7
    //   157: iload 7
    //   159: iconst_1
    //   160: if_icmpne +100 -> 260
    //   163: new 115	android/support/v7/widget/am
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: getfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   172: aload_2
    //   173: iload_3
    //   174: invokespecial 118	android/support/v7/widget/am:<init>	(Landroid/support/v7/widget/ak;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   177: astore 5
    //   179: aload_0
    //   180: getfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   183: aload_2
    //   184: getstatic 68	android/support/v7/b/k:Spinner	[I
    //   187: iload_3
    //   188: iconst_0
    //   189: invokestatic 73	android/support/v7/widget/ca:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ca;
    //   192: astore 8
    //   194: aload_0
    //   195: aload 8
    //   197: getstatic 121	android/support/v7/b/k:Spinner_android_dropDownWidth	I
    //   200: bipush 254
    //   202: invokevirtual 123	android/support/v7/widget/ca:f	(II)I
    //   205: putfield 125	android/support/v7/widget/ak:k	I
    //   208: aload 5
    //   210: aload 8
    //   212: getstatic 128	android/support/v7/b/k:Spinner_android_popupBackground	I
    //   215: invokevirtual 131	android/support/v7/widget/ca:a	(I)Landroid/graphics/drawable/Drawable;
    //   218: invokevirtual 134	android/support/v7/widget/am:a	(Landroid/graphics/drawable/Drawable;)V
    //   221: aload 5
    //   223: aload 10
    //   225: getstatic 137	android/support/v7/b/k:Spinner_android_prompt	I
    //   228: invokevirtual 140	android/support/v7/widget/ca:d	(I)Ljava/lang/String;
    //   231: invokevirtual 143	android/support/v7/widget/am:a	(Ljava/lang/CharSequence;)V
    //   234: aload 8
    //   236: invokevirtual 145	android/support/v7/widget/ca:a	()V
    //   239: aload_0
    //   240: aload 5
    //   242: putfield 147	android/support/v7/widget/ak:j	Landroid/support/v7/widget/am;
    //   245: aload_0
    //   246: new 8	android/support/v7/widget/ak$1
    //   249: dup
    //   250: aload_0
    //   251: aload_0
    //   252: aload 5
    //   254: invokespecial 150	android/support/v7/widget/ak$1:<init>	(Landroid/support/v7/widget/ak;Landroid/view/View;Landroid/support/v7/widget/am;)V
    //   257: putfield 152	android/support/v7/widget/ak:g	Landroid/support/v7/widget/az;
    //   260: aload 10
    //   262: getstatic 155	android/support/v7/b/k:Spinner_android_entries	I
    //   265: invokevirtual 158	android/support/v7/widget/ca:e	(I)[Ljava/lang/CharSequence;
    //   268: astore 5
    //   270: aload 5
    //   272: ifnull +29 -> 301
    //   275: new 160	android/widget/ArrayAdapter
    //   278: dup
    //   279: aload_1
    //   280: getstatic 165	android/support/v7/b/h:support_simple_spinner_dropdown_item	I
    //   283: aload 5
    //   285: invokespecial 168	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   288: astore_1
    //   289: aload_1
    //   290: getstatic 165	android/support/v7/b/h:support_simple_spinner_dropdown_item	I
    //   293: invokevirtual 172	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   296: aload_0
    //   297: aload_1
    //   298: invokevirtual 176	android/support/v7/widget/ak:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   301: aload 10
    //   303: invokevirtual 145	android/support/v7/widget/ca:a	()V
    //   306: aload_0
    //   307: iconst_1
    //   308: putfield 178	android/support/v7/widget/ak:i	Z
    //   311: aload_0
    //   312: getfield 180	android/support/v7/widget/ak:h	Landroid/widget/SpinnerAdapter;
    //   315: ifnull +16 -> 331
    //   318: aload_0
    //   319: aload_0
    //   320: getfield 180	android/support/v7/widget/ak:h	Landroid/widget/SpinnerAdapter;
    //   323: invokevirtual 176	android/support/v7/widget/ak:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   326: aload_0
    //   327: aconst_null
    //   328: putfield 180	android/support/v7/widget/ak:h	Landroid/widget/SpinnerAdapter;
    //   331: aload_0
    //   332: getfield 87	android/support/v7/widget/ak:e	Landroid/support/v7/widget/ab;
    //   335: aload_2
    //   336: iload_3
    //   337: invokevirtual 183	android/support/v7/widget/ab:a	(Landroid/util/AttributeSet;I)V
    //   340: return
    //   341: aload 10
    //   343: getstatic 186	android/support/v7/b/k:Spinner_popupTheme	I
    //   346: iconst_0
    //   347: invokevirtual 188	android/support/v7/widget/ca:g	(II)I
    //   350: istore 6
    //   352: iload 6
    //   354: ifeq +20 -> 374
    //   357: aload_0
    //   358: new 89	android/support/v7/view/c
    //   361: dup
    //   362: aload_1
    //   363: iload 6
    //   365: invokespecial 191	android/support/v7/view/c:<init>	(Landroid/content/Context;I)V
    //   368: putfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   371: goto -299 -> 72
    //   374: getstatic 39	android/support/v7/widget/ak:a	Z
    //   377: ifne +15 -> 392
    //   380: aload_1
    //   381: astore 5
    //   383: aload_0
    //   384: aload 5
    //   386: putfield 94	android/support/v7/widget/ak:f	Landroid/content/Context;
    //   389: goto -317 -> 72
    //   392: aconst_null
    //   393: astore 5
    //   395: goto -12 -> 383
    //   398: astore 9
    //   400: aconst_null
    //   401: astore 8
    //   403: aload 8
    //   405: astore 5
    //   407: ldc 193
    //   409: ldc 195
    //   411: aload 9
    //   413: invokestatic 200	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   416: pop
    //   417: iload 4
    //   419: istore 7
    //   421: aload 8
    //   423: ifnull -266 -> 157
    //   426: aload 8
    //   428: invokevirtual 113	android/content/res/TypedArray:recycle	()V
    //   431: iload 4
    //   433: istore 7
    //   435: goto -278 -> 157
    //   438: astore_1
    //   439: aconst_null
    //   440: astore 5
    //   442: aload 5
    //   444: ifnull +8 -> 452
    //   447: aload 5
    //   449: invokevirtual 113	android/content/res/TypedArray:recycle	()V
    //   452: aload_1
    //   453: athrow
    //   454: iconst_1
    //   455: istore 7
    //   457: goto -300 -> 157
    //   460: astore_1
    //   461: goto -19 -> 442
    //   464: astore 9
    //   466: goto -63 -> 403
    //
    // Exception table:
    //   from	to	target	type
    //   97	109	398	java/lang/Exception
    //   97	109	438	finally
    //   117	126	460	finally
    //   130	139	460	finally
    //   407	417	460	finally
    //   117	126	464	java/lang/Exception
    //   130	139	464	java/lang/Exception
  }

  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null)
      return 0;
    int i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int i5 = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int n = Math.max(0, m - (15 - (i5 - m)));
    View localView = null;
    int i1 = 0;
    m = 0;
    if (n < i5)
    {
      int i2 = paramSpinnerAdapter.getItemViewType(n);
      if (i2 == m)
        break label204;
      localView = null;
      m = i2;
    }
    label204: 
    while (true)
    {
      localView = paramSpinnerAdapter.getView(n, localView, this);
      if (localView.getLayoutParams() == null)
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView.measure(i3, i4);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      n += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.l);
        return this.l.left + this.l.right + i1;
      }
      return i1;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.e != null)
      this.e.c();
  }

  public int getDropDownHorizontalOffset()
  {
    if (this.j != null)
      return this.j.f();
    if (b)
      return super.getDropDownHorizontalOffset();
    return 0;
  }

  public int getDropDownVerticalOffset()
  {
    if (this.j != null)
      return this.j.g();
    if (b)
      return super.getDropDownVerticalOffset();
    return 0;
  }

  public int getDropDownWidth()
  {
    if (this.j != null)
      return this.k;
    if (b)
      return super.getDropDownWidth();
    return 0;
  }

  public Drawable getPopupBackground()
  {
    if (this.j != null)
      return this.j.d();
    if (b)
      return super.getPopupBackground();
    return null;
  }

  public Context getPopupContext()
  {
    if (this.j != null)
      return this.f;
    if (a)
      return super.getPopupContext();
    return null;
  }

  public CharSequence getPrompt()
  {
    if (this.j != null)
      return this.j.a();
    return super.getPrompt();
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.e != null)
      return this.e.a();
    return null;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.e != null)
      return this.e.b();
    return null;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.j != null) && (this.j.k()))
      this.j.i();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.j != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.g != null) && (this.g.onTouch(this, paramMotionEvent)))
      return true;
    return super.onTouchEvent(paramMotionEvent);
  }

  public boolean performClick()
  {
    if ((this.j != null) && (!this.j.k()))
    {
      this.j.c();
      return true;
    }
    return super.performClick();
  }

  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.i)
      this.h = paramSpinnerAdapter;
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    }
    while (this.j == null);
    if (this.f == null);
    for (Context localContext = getContext(); ; localContext = this.f)
    {
      this.j.a(new al(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.e != null)
      this.e.a(paramDrawable);
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.e != null)
      this.e.a(paramInt);
  }

  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.j != null)
      this.j.b(paramInt);
    do
      return;
    while (!b);
    super.setDropDownHorizontalOffset(paramInt);
  }

  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.j != null)
      this.j.c(paramInt);
    do
      return;
    while (!b);
    super.setDropDownVerticalOffset(paramInt);
  }

  public void setDropDownWidth(int paramInt)
  {
    if (this.j != null)
      this.k = paramInt;
    do
      return;
    while (!b);
    super.setDropDownWidth(paramInt);
  }

  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.j != null)
      this.j.a(paramDrawable);
    do
      return;
    while (!b);
    super.setPopupBackgroundDrawable(paramDrawable);
  }

  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(a.a(getPopupContext(), paramInt));
  }

  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.j != null)
    {
      this.j.a(paramCharSequence);
      return;
    }
    super.setPrompt(paramCharSequence);
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.e != null)
      this.e.a(paramColorStateList);
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != null)
      this.e.a(paramMode);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ak
 * JD-Core Version:    0.6.0
 */