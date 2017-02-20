package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.support.v7.b.k;
import android.support.v7.d.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class an
{
  private static final int[] b = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private static final int[] c = { b.textAllCaps };
  final TextView a;
  private by d;
  private by e;
  private by f;
  private by g;

  an(TextView paramTextView)
  {
    this.a = paramTextView;
  }

  static an a(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17)
      return new ao(paramTextView);
    return new an(paramTextView);
  }

  protected static by a(Context paramContext, ac paramac, int paramInt)
  {
    paramContext = paramac.b(paramContext, paramInt);
    if (paramContext != null)
    {
      paramac = new by();
      paramac.d = true;
      paramac.a = paramContext;
      return paramac;
    }
    return null;
  }

  void a()
  {
    if ((this.d != null) || (this.e != null) || (this.f != null) || (this.g != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.d);
      a(arrayOfDrawable[1], this.e);
      a(arrayOfDrawable[2], this.f);
      a(arrayOfDrawable[3], this.g);
    }
  }

  void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, c);
    if (paramContext.getBoolean(0, false))
      a(true);
    paramContext.recycle();
  }

  final void a(Drawable paramDrawable, by paramby)
  {
    if ((paramDrawable != null) && (paramby != null))
      ac.a(paramDrawable, paramby, this.a.getDrawableState());
  }

  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int j = 1;
    Context localContext = this.a.getContext();
    Object localObject = ac.a();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    int i = localTypedArray.getResourceId(0, -1);
    if (localTypedArray.hasValue(1))
      this.d = a(localContext, (ac)localObject, localTypedArray.getResourceId(1, 0));
    if (localTypedArray.hasValue(2))
      this.e = a(localContext, (ac)localObject, localTypedArray.getResourceId(2, 0));
    if (localTypedArray.hasValue(3))
      this.f = a(localContext, (ac)localObject, localTypedArray.getResourceId(3, 0));
    if (localTypedArray.hasValue(4))
      this.g = a(localContext, (ac)localObject, localTypedArray.getResourceId(4, 0));
    localTypedArray.recycle();
    boolean bool;
    if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      if (i == -1)
        break label268;
      localObject = localContext.obtainStyledAttributes(i, k.TextAppearance);
      if (!((TypedArray)localObject).hasValue(k.TextAppearance_textAllCaps))
        break label260;
      bool = ((TypedArray)localObject).getBoolean(k.TextAppearance_textAllCaps, false);
      i = 1;
      ((TypedArray)localObject).recycle();
    }
    while (true)
    {
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
      if (paramAttributeSet.hasValue(0))
        bool = paramAttributeSet.getBoolean(0, false);
      for (paramInt = j; ; paramInt = i)
      {
        paramAttributeSet.recycle();
        if (paramInt != 0)
          a(bool);
        return;
      }
      label260: i = 0;
      bool = false;
      break;
      label268: i = 0;
      bool = false;
    }
  }

  void a(boolean paramBoolean)
  {
    TextView localTextView = this.a;
    if (paramBoolean);
    for (a locala = new a(this.a.getContext()); ; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.an
 * JD-Core Version:    0.6.0
 */