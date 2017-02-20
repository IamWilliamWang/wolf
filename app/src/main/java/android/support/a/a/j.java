package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
public class j extends i
{
  static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  private p c;
  private PorterDuffColorFilter d;
  private ColorFilter e;
  private boolean f;
  private boolean g = true;
  private Drawable.ConstantState h;
  private final float[] i = new float[9];
  private final Matrix j = new Matrix();
  private final Rect k = new Rect();

  private j()
  {
    this.c = new p();
  }

  private j(p paramp)
  {
    this.c = paramp;
    this.d = a(this.d, paramp.c, paramp.d);
  }

  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    case 4:
    case 6:
    case 7:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
      return paramMode;
    case 3:
      return PorterDuff.Mode.SRC_OVER;
    case 5:
      return PorterDuff.Mode.SRC_IN;
    case 9:
      return PorterDuff.Mode.SRC_ATOP;
    case 14:
      return PorterDuff.Mode.MULTIPLY;
    case 15:
      return PorterDuff.Mode.SCREEN;
    case 16:
    }
    return PorterDuff.Mode.ADD;
  }

  public static j a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new j();
      ((j)localObject).a = android.support.v4.b.a.a.a(paramResources, paramInt, paramTheme);
      ((j)localObject).h = new q(((j)localObject).a.getConstantState());
      return localObject;
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
        paramInt = ((XmlPullParser)localObject).next();
      while ((paramInt != 2) && (paramInt != 1));
      if (paramInt != 2)
        throw new XmlPullParserException("No start tag found");
    }
    catch (XmlPullParserException paramResources)
    {
      AttributeSet localAttributeSet;
      Log.e("VectorDrawableCompat", "parser error", paramResources);
      return null;
      paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      return paramResources;
    }
    catch (java.io.IOException paramResources)
    {
      while (true)
        Log.e("VectorDrawableCompat", "parser error", paramResources);
    }
  }

  public static j a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    j localj = new j();
    localj.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localj;
  }

  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    p localp = this.c;
    o localo = localp.b;
    localp.d = a(h.a(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    ColorStateList localColorStateList = paramTypedArray.getColorStateList(1);
    if (localColorStateList != null)
      localp.c = localColorStateList;
    localp.e = h.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, localp.e);
    localo.c = h.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, localo.c);
    localo.d = h.a(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, localo.d);
    if (localo.c <= 0.0F)
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    if (localo.d <= 0.0F)
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    localo.a = paramTypedArray.getDimension(3, localo.a);
    localo.b = paramTypedArray.getDimension(2, localo.b);
    if (localo.a <= 0.0F)
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    if (localo.b <= 0.0F)
      throw new XmlPullParserException(paramTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    localo.a(h.a(paramTypedArray, paramXmlPullParser, "alpha", 4, localo.b()));
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null)
    {
      localo.f = paramTypedArray;
      localo.g.put(paramTypedArray, localo);
    }
  }

  private boolean a()
  {
    return false;
  }

  private static int b(int paramInt, float paramFloat)
  {
    return (int)(Color.alpha(paramInt) * paramFloat) << 24 | 0xFFFFFF & paramInt;
  }

  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    p localp = this.c;
    o localo = localp.b;
    Stack localStack = new Stack();
    localStack.push(o.a(localo));
    int i1 = paramXmlPullParser.getEventType();
    int m = 1;
    if (i1 != 1)
    {
      Object localObject;
      m localm;
      int n;
      if (i1 == 2)
      {
        localObject = paramXmlPullParser.getName();
        localm = (m)localStack.peek();
        if ("path".equals(localObject))
        {
          localObject = new l();
          ((l)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localm.a.add(localObject);
          if (((l)localObject).b() != null)
            localo.g.put(((l)localObject).b(), localObject);
          m = 0;
          n = localp.a;
          localp.a = (((l)localObject).o | n);
          label162: n = m;
        }
      }
      while (true)
      {
        i1 = paramXmlPullParser.next();
        m = n;
        break;
        if ("clip-path".equals(localObject))
        {
          localObject = new k();
          ((k)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localm.a.add(localObject);
          if (((k)localObject).b() != null)
            localo.g.put(((k)localObject).b(), localObject);
          localp.a |= ((k)localObject).o;
          break label162;
        }
        if ("group".equals(localObject))
        {
          localObject = new m();
          ((m)localObject).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          localm.a.add(localObject);
          localStack.push(localObject);
          if (((m)localObject).a() != null)
            localo.g.put(((m)localObject).a(), localObject);
          localp.a |= m.a((m)localObject);
        }
        break label162;
        n = m;
        if (i1 != 3)
          continue;
        n = m;
        if (!"group".equals(paramXmlPullParser.getName()))
          continue;
        localStack.pop();
        n = m;
      }
    }
    if (m != 0)
    {
      paramResources = new StringBuffer();
      if (paramResources.length() > 0)
        paramResources.append(" or ");
      paramResources.append("path");
      throw new XmlPullParserException("no " + paramResources + " defined");
    }
  }

  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null))
      return null;
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }

  Object a(String paramString)
  {
    return this.c.b.g.get(paramString);
  }

  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean canApplyTheme()
  {
    if (this.a != null)
      android.support.v4.c.a.a.d(this.a);
    return false;
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.a != null)
      this.a.draw(paramCanvas);
    Object localObject;
    int m;
    int n;
    int i1;
    while (true)
    {
      return;
      copyBounds(this.k);
      if ((this.k.width() <= 0) || (this.k.height() <= 0))
        continue;
      if (this.e != null)
        break;
      localObject = this.d;
      paramCanvas.getMatrix(this.j);
      this.j.getValues(this.i);
      float f2 = Math.abs(this.i[0]);
      float f1 = Math.abs(this.i[4]);
      float f4 = Math.abs(this.i[1]);
      float f3 = Math.abs(this.i[3]);
      if ((f4 != 0.0F) || (f3 != 0.0F))
      {
        f1 = 1.0F;
        f2 = 1.0F;
      }
      m = (int)(f2 * this.k.width());
      n = (int)(f1 * this.k.height());
      m = Math.min(2048, m);
      n = Math.min(2048, n);
      if ((m <= 0) || (n <= 0))
        continue;
      i1 = paramCanvas.save();
      paramCanvas.translate(this.k.left, this.k.top);
      if (a())
      {
        paramCanvas.translate(this.k.width(), 0.0F);
        paramCanvas.scale(-1.0F, 1.0F);
      }
      this.k.offsetTo(0, 0);
      this.c.b(m, n);
      if (this.g)
        break label314;
      this.c.a(m, n);
    }
    while (true)
    {
      this.c.a(paramCanvas, (ColorFilter)localObject, this.k);
      paramCanvas.restoreToCount(i1);
      return;
      localObject = this.e;
      break;
      label314: if (this.c.b())
        continue;
      this.c.a(m, n);
      this.c.c();
    }
  }

  public int getAlpha()
  {
    if (this.a != null)
      return android.support.v4.c.a.a.c(this.a);
    return this.c.b.a();
  }

  public int getChangingConfigurations()
  {
    if (this.a != null)
      return this.a.getChangingConfigurations();
    return super.getChangingConfigurations() | this.c.getChangingConfigurations();
  }

  public Drawable.ConstantState getConstantState()
  {
    if (this.a != null)
      return new q(this.a.getConstantState());
    this.c.a = getChangingConfigurations();
    return this.c;
  }

  public int getIntrinsicHeight()
  {
    if (this.a != null)
      return this.a.getIntrinsicHeight();
    return (int)this.c.b.b;
  }

  public int getIntrinsicWidth()
  {
    if (this.a != null)
      return this.a.getIntrinsicWidth();
    return (int)this.c.b.a;
  }

  public int getOpacity()
  {
    if (this.a != null)
      return this.a.getOpacity();
    return -3;
  }

  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.a != null)
    {
      this.a.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }

  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.a != null)
    {
      android.support.v4.c.a.a.a(this.a, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    p localp = this.c;
    localp.b = new o();
    TypedArray localTypedArray = b(paramResources, paramTheme, paramAttributeSet, a.a);
    a(localTypedArray, paramXmlPullParser);
    localTypedArray.recycle();
    localp.a = getChangingConfigurations();
    localp.k = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.d = a(this.d, localp.c, localp.d);
  }

  public void invalidateSelf()
  {
    if (this.a != null)
    {
      this.a.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }

  public boolean isStateful()
  {
    if (this.a != null)
      return this.a.isStateful();
    return (super.isStateful()) || ((this.c != null) && (this.c.c != null) && (this.c.c.isStateful()));
  }

  public Drawable mutate()
  {
    if (this.a != null)
      this.a.mutate();
    do
      return this;
    while ((this.f) || (super.mutate() != this));
    this.c = new p(this.c);
    this.f = true;
    return this;
  }

  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.a != null)
      return this.a.setState(paramArrayOfInt);
    paramArrayOfInt = this.c;
    if ((paramArrayOfInt.c != null) && (paramArrayOfInt.d != null))
    {
      this.d = a(this.d, paramArrayOfInt.c, paramArrayOfInt.d);
      invalidateSelf();
      return true;
    }
    return false;
  }

  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.a != null)
    {
      this.a.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }

  public void setAlpha(int paramInt)
  {
    if (this.a != null)
      this.a.setAlpha(paramInt);
    do
      return;
    while (this.c.b.a() == paramInt);
    this.c.b.a(paramInt);
    invalidateSelf();
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setBounds(Rect paramRect)
  {
    if (this.a != null)
    {
      this.a.setBounds(paramRect);
      return;
    }
    super.setBounds(paramRect);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.a != null)
    {
      this.a.setColorFilter(paramColorFilter);
      return;
    }
    this.e = paramColorFilter;
    invalidateSelf();
  }

  public void setTint(int paramInt)
  {
    if (this.a != null)
    {
      android.support.v4.c.a.a.a(this.a, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }

  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.a != null)
      android.support.v4.c.a.a.a(this.a, paramColorStateList);
    p localp;
    do
    {
      return;
      localp = this.c;
    }
    while (localp.c == paramColorStateList);
    localp.c = paramColorStateList;
    this.d = a(this.d, paramColorStateList, localp.d);
    invalidateSelf();
  }

  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.a != null)
      android.support.v4.c.a.a.a(this.a, paramMode);
    p localp;
    do
    {
      return;
      localp = this.c;
    }
    while (localp.d == paramMode);
    localp.d = paramMode;
    this.d = a(this.d, localp.c, paramMode);
    invalidateSelf();
  }

  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.a != null)
      return this.a.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }

  public void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.a != null)
    {
      this.a.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.j
 * JD-Core Version:    0.6.0
 */