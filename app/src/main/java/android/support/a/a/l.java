package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class l extends n
{
  int a = 0;
  float b = 0.0F;
  int c = 0;
  float d = 1.0F;
  int e;
  float f = 1.0F;
  float g = 0.0F;
  float h = 1.0F;
  float i = 0.0F;
  Paint.Cap j = Paint.Cap.BUTT;
  Paint.Join k = Paint.Join.MITER;
  float l = 4.0F;
  private int[] p;

  public l()
  {
  }

  public l(l paraml)
  {
    super(paraml);
    this.p = paraml.p;
    this.a = paraml.a;
    this.b = paraml.b;
    this.d = paraml.d;
    this.c = paraml.c;
    this.e = paraml.e;
    this.f = paraml.f;
    this.g = paraml.g;
    this.h = paraml.h;
    this.i = paraml.i;
    this.j = paraml.j;
    this.k = paraml.k;
    this.l = paraml.l;
  }

  private Paint.Cap a(int paramInt, Paint.Cap paramCap)
  {
    switch (paramInt)
    {
    default:
      return paramCap;
    case 0:
      return Paint.Cap.BUTT;
    case 1:
      return Paint.Cap.ROUND;
    case 2:
    }
    return Paint.Cap.SQUARE;
  }

  private Paint.Join a(int paramInt, Paint.Join paramJoin)
  {
    switch (paramInt)
    {
    default:
      return paramJoin;
    case 0:
      return Paint.Join.MITER;
    case 1:
      return Paint.Join.ROUND;
    case 2:
    }
    return Paint.Join.BEVEL;
  }

  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.p = null;
    if (!h.a(paramXmlPullParser, "pathData"))
      return;
    String str = paramTypedArray.getString(0);
    if (str != null)
      this.n = str;
    str = paramTypedArray.getString(2);
    if (str != null)
      this.m = e.a(str);
    this.c = h.b(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.c);
    this.f = h.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.f);
    this.j = a(h.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), this.j);
    this.k = a(h.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), this.k);
    this.l = h.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.l);
    this.a = h.b(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.a);
    this.d = h.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.d);
    this.b = h.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.b);
    this.h = h.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.h);
    this.i = h.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.i);
    this.g = h.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.g);
  }

  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = i.b(paramResources, paramTheme, paramAttributeSet, a.c);
    a(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.l
 * JD-Core Version:    0.6.0
 */