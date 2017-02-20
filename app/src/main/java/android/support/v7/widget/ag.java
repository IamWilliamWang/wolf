package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.a.a.j;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

class ag
  implements af
{
  public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      paramContext = j.a(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
      return paramContext;
    }
    catch (java.lang.Exception paramContext)
    {
      Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ag
 * JD-Core Version:    0.6.0
 */