package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class k extends n
{
  public k()
  {
  }

  public k(k paramk)
  {
    super(paramk);
  }

  private void a(TypedArray paramTypedArray)
  {
    String str = paramTypedArray.getString(0);
    if (str != null)
      this.n = str;
    paramTypedArray = paramTypedArray.getString(1);
    if (paramTypedArray != null)
      this.m = e.a(paramTypedArray);
  }

  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    if (!h.a(paramXmlPullParser, "pathData"))
      return;
    paramResources = i.b(paramResources, paramTheme, paramAttributeSet, a.d);
    a(paramResources);
    paramResources.recycle();
  }

  public boolean a()
  {
    return true;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.k
 * JD-Core Version:    0.6.0
 */