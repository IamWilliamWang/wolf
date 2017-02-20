package android.support.a.a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

class h
{
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    if (!a(paramXmlPullParser, paramString))
      return paramFloat;
    return paramTypedArray.getFloat(paramInt, paramFloat);
  }

  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString))
      return paramInt2;
    return paramTypedArray.getInt(paramInt1, paramInt2);
  }

  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean)
  {
    if (!a(paramXmlPullParser, paramString))
      return paramBoolean;
    return paramTypedArray.getBoolean(paramInt, paramBoolean);
  }

  public static boolean a(XmlPullParser paramXmlPullParser, String paramString)
  {
    return paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null;
  }

  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!a(paramXmlPullParser, paramString))
      return paramInt2;
    return paramTypedArray.getColor(paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.h
 * JD-Core Version:    0.6.0
 */