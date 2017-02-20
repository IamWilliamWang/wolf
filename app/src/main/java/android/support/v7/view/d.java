package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.h.j;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public class d extends MenuInflater
{
  private static final Class<?>[] a = { Context.class };
  private static final Class<?>[] b = a;
  private final Object[] c;
  private final Object[] d;
  private Context e;
  private Object f;

  public d(Context paramContext)
  {
    super(paramContext);
    this.e = paramContext;
    this.c = new Object[] { paramContext };
    this.d = this.c;
  }

  private Object a(Object paramObject)
  {
    if ((paramObject instanceof Activity));
    do
      return paramObject;
    while (!(paramObject instanceof ContextWrapper));
    return a(((ContextWrapper)paramObject).getBaseContext());
  }

  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    f localf = new f(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    label49: int k;
    int j;
    if (i == 2)
    {
      paramMenu = paramXmlPullParser.getName();
      if (paramMenu.equals("menu"))
      {
        i = paramXmlPullParser.next();
        paramMenu = null;
        int m = 0;
        k = i;
        j = 0;
        i = m;
        label65: if (j != 0)
          return;
      }
    }
    switch (k)
    {
    default:
    case 2:
    case 3:
      while (true)
      {
        k = paramXmlPullParser.next();
        break label65;
        throw new RuntimeException("Expecting menu, got " + paramMenu);
        j = paramXmlPullParser.next();
        i = j;
        if (j != 1)
          break;
        i = j;
        break label49;
        if (i != 0)
          continue;
        String str = paramXmlPullParser.getName();
        if (str.equals("group"))
        {
          localf.a(paramAttributeSet);
          continue;
        }
        if (str.equals("item"))
        {
          localf.b(paramAttributeSet);
          continue;
        }
        if (str.equals("menu"))
        {
          a(paramXmlPullParser, paramAttributeSet, localf.c());
          continue;
        }
        paramMenu = str;
        i = 1;
        continue;
        str = paramXmlPullParser.getName();
        if ((i != 0) && (str.equals(paramMenu)))
        {
          paramMenu = null;
          i = 0;
          continue;
        }
        if (str.equals("group"))
        {
          localf.a();
          continue;
        }
        if (str.equals("item"))
        {
          if (localf.d())
            continue;
          if ((f.a(localf) != null) && (f.a(localf).e()))
          {
            localf.c();
            continue;
          }
          localf.b();
          continue;
        }
        if (!str.equals("menu"))
          continue;
        j = 1;
      }
    case 1:
    }
    throw new RuntimeException("Unexpected end of document");
  }

  private Object c()
  {
    if (this.f == null)
      this.f = a(this.e);
    return this.f;
  }

  // ERROR //
  public void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 141
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 143	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 5
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 32	android/support/v7/view/d:e	Landroid/content/Context;
    //   26: invokevirtual 147	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 153	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 4
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 5
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 159	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 109	android/support/v7/view/d:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 164 1 0
    //   70: return
    //   71: astore_2
    //   72: aload 4
    //   74: astore_3
    //   75: new 166	android/view/InflateException
    //   78: dup
    //   79: ldc 168
    //   81: aload_2
    //   82: invokespecial 171	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   85: athrow
    //   86: astore_2
    //   87: aload_3
    //   88: ifnull +9 -> 97
    //   91: aload_3
    //   92: invokeinterface 164 1 0
    //   97: aload_2
    //   98: athrow
    //   99: astore_2
    //   100: aload 5
    //   102: astore_3
    //   103: new 166	android/view/InflateException
    //   106: dup
    //   107: ldc 168
    //   109: aload_2
    //   110: invokespecial 171	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   22	35	71	org/xmlpull/v1/XmlPullParserException
    //   46	58	71	org/xmlpull/v1/XmlPullParserException
    //   22	35	86	finally
    //   46	58	86	finally
    //   75	86	86	finally
    //   103	114	86	finally
    //   22	35	99	java/io/IOException
    //   46	58	99	java/io/IOException
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.d
 * JD-Core Version:    0.6.0
 */