package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.support.v4.e.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class s extends DataSetObservable
{
  private static final String a = s.class.getSimpleName();
  private static final Object b = new Object();
  private static final Map<String, s> c = new HashMap();
  private final Object d;
  private final List<t> e;
  private final List<v> f;
  private final Context g;
  private final String h;
  private Intent i;
  private u j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private w p;

  private boolean a(v paramv)
  {
    boolean bool = this.f.add(paramv);
    if (bool)
    {
      this.n = true;
      i();
      d();
      f();
      notifyChanged();
    }
    return bool;
  }

  private void d()
  {
    if (!this.m)
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    if (!this.n);
    do
    {
      return;
      this.n = false;
    }
    while (TextUtils.isEmpty(this.h));
    a.a(new x(this, null), new Object[] { new ArrayList(this.f), this.h });
  }

  private void e()
  {
    boolean bool1 = g();
    boolean bool2 = h();
    i();
    if ((bool1 | bool2))
    {
      f();
      notifyChanged();
    }
  }

  private boolean f()
  {
    if ((this.j != null) && (this.i != null) && (!this.e.isEmpty()) && (!this.f.isEmpty()))
    {
      this.j.a(this.i, this.e, Collections.unmodifiableList(this.f));
      return true;
    }
    return false;
  }

  private boolean g()
  {
    int i4 = 0;
    int i3 = i4;
    if (this.o)
    {
      i3 = i4;
      if (this.i != null)
      {
        this.o = false;
        this.e.clear();
        List localList = this.g.getPackageManager().queryIntentActivities(this.i, 0);
        int i2 = localList.size();
        int i1 = 0;
        while (i1 < i2)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i1);
          this.e.add(new t(this, localResolveInfo));
          i1 += 1;
        }
        i3 = 1;
      }
    }
    return i3;
  }

  private boolean h()
  {
    if ((this.l) && (this.n) && (!TextUtils.isEmpty(this.h)))
    {
      this.l = false;
      this.m = true;
      j();
      return true;
    }
    return false;
  }

  private void i()
  {
    int i2 = this.f.size() - this.k;
    if (i2 <= 0);
    while (true)
    {
      return;
      this.n = true;
      int i1 = 0;
      while (i1 < i2)
      {
        v localv = (v)this.f.remove(0);
        i1 += 1;
      }
    }
  }

  // ERROR //
  private void j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 61	android/support/v7/widget/s:g	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 88	android/support/v7/widget/s:h	Ljava/lang/String;
    //   8: invokevirtual 192	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 198	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: ldc 200
    //   20: invokeinterface 206 3 0
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iconst_1
    //   29: if_icmpeq +18 -> 47
    //   32: iload_1
    //   33: iconst_2
    //   34: if_icmpeq +13 -> 47
    //   37: aload_3
    //   38: invokeinterface 209 1 0
    //   43: istore_1
    //   44: goto -17 -> 27
    //   47: ldc 211
    //   49: aload_3
    //   50: invokeinterface 214 1 0
    //   55: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne +53 -> 111
    //   61: new 186	org/xmlpull/v1/XmlPullParserException
    //   64: dup
    //   65: ldc 221
    //   67: invokespecial 222	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_3
    //   72: getstatic 45	android/support/v7/widget/s:a	Ljava/lang/String;
    //   75: new 224	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   82: ldc 227
    //   84: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_0
    //   88: getfield 88	android/support/v7/widget/s:h	Ljava/lang/String;
    //   91: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: aload_3
    //   98: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   101: pop
    //   102: aload_2
    //   103: ifnull +7 -> 110
    //   106: aload_2
    //   107: invokevirtual 244	java/io/FileInputStream:close	()V
    //   110: return
    //   111: aload_0
    //   112: getfield 67	android/support/v7/widget/s:f	Ljava/util/List;
    //   115: astore 4
    //   117: aload 4
    //   119: invokeinterface 146 1 0
    //   124: aload_3
    //   125: invokeinterface 209 1 0
    //   130: istore_1
    //   131: iload_1
    //   132: iconst_1
    //   133: if_icmpne +14 -> 147
    //   136: aload_2
    //   137: ifnull -27 -> 110
    //   140: aload_2
    //   141: invokevirtual 244	java/io/FileInputStream:close	()V
    //   144: return
    //   145: astore_2
    //   146: return
    //   147: iload_1
    //   148: iconst_3
    //   149: if_icmpeq -25 -> 124
    //   152: iload_1
    //   153: iconst_4
    //   154: if_icmpeq -30 -> 124
    //   157: ldc 246
    //   159: aload_3
    //   160: invokeinterface 214 1 0
    //   165: invokevirtual 219	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   168: ifne +55 -> 223
    //   171: new 186	org/xmlpull/v1/XmlPullParserException
    //   174: dup
    //   175: ldc 248
    //   177: invokespecial 222	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   180: athrow
    //   181: astore_3
    //   182: getstatic 45	android/support/v7/widget/s:a	Ljava/lang/String;
    //   185: new 224	java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   192: ldc 227
    //   194: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_0
    //   198: getfield 88	android/support/v7/widget/s:h	Ljava/lang/String;
    //   201: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: aload_3
    //   208: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: aload_2
    //   213: ifnull -103 -> 110
    //   216: aload_2
    //   217: invokevirtual 244	java/io/FileInputStream:close	()V
    //   220: return
    //   221: astore_2
    //   222: return
    //   223: aload 4
    //   225: new 182	android/support/v7/widget/v
    //   228: dup
    //   229: aload_3
    //   230: aconst_null
    //   231: ldc 250
    //   233: invokeinterface 254 3 0
    //   238: aload_3
    //   239: aconst_null
    //   240: ldc_w 256
    //   243: invokeinterface 254 3 0
    //   248: invokestatic 262	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   251: aload_3
    //   252: aconst_null
    //   253: ldc_w 264
    //   256: invokeinterface 254 3 0
    //   261: invokestatic 270	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   264: invokespecial 273	android/support/v7/widget/v:<init>	(Ljava/lang/String;JF)V
    //   267: invokeinterface 73 2 0
    //   272: pop
    //   273: goto -149 -> 124
    //   276: astore_3
    //   277: aload_2
    //   278: ifnull +7 -> 285
    //   281: aload_2
    //   282: invokevirtual 244	java/io/FileInputStream:close	()V
    //   285: aload_3
    //   286: athrow
    //   287: astore_2
    //   288: return
    //   289: astore_2
    //   290: goto -5 -> 285
    //   293: astore_2
    //   294: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	25	71	org/xmlpull/v1/XmlPullParserException
    //   37	44	71	org/xmlpull/v1/XmlPullParserException
    //   47	71	71	org/xmlpull/v1/XmlPullParserException
    //   111	124	71	org/xmlpull/v1/XmlPullParserException
    //   124	131	71	org/xmlpull/v1/XmlPullParserException
    //   157	181	71	org/xmlpull/v1/XmlPullParserException
    //   223	273	71	org/xmlpull/v1/XmlPullParserException
    //   140	144	145	java/io/IOException
    //   12	25	181	java/io/IOException
    //   37	44	181	java/io/IOException
    //   47	71	181	java/io/IOException
    //   111	124	181	java/io/IOException
    //   124	131	181	java/io/IOException
    //   157	181	181	java/io/IOException
    //   223	273	181	java/io/IOException
    //   216	220	221	java/io/IOException
    //   12	25	276	finally
    //   37	44	276	finally
    //   47	71	276	finally
    //   72	102	276	finally
    //   111	124	276	finally
    //   124	131	276	finally
    //   157	181	276	finally
    //   182	212	276	finally
    //   223	273	276	finally
    //   106	110	287	java/io/IOException
    //   281	285	289	java/io/IOException
    //   0	12	293	java/io/FileNotFoundException
  }

  public int a()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.e.size();
      return i1;
    }
  }

  public int a(ResolveInfo paramResolveInfo)
  {
    while (true)
    {
      int i1;
      synchronized (this.d)
      {
        e();
        List localList = this.e;
        int i2 = localList.size();
        i1 = 0;
        if (i1 >= i2)
          continue;
        if (((t)localList.get(i1)).a == paramResolveInfo)
        {
          return i1;
          return -1;
        }
      }
      i1 += 1;
    }
  }

  public ResolveInfo a(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      ResolveInfo localResolveInfo = ((t)this.e.get(paramInt)).a;
      return localResolveInfo;
    }
  }

  public Intent b(int paramInt)
  {
    synchronized (this.d)
    {
      if (this.i == null)
        return null;
      e();
      Object localObject2 = (t)this.e.get(paramInt);
      localObject2 = new ComponentName(((t)localObject2).a.activityInfo.packageName, ((t)localObject2).a.activityInfo.name);
      Intent localIntent1 = new Intent(this.i);
      localIntent1.setComponent((ComponentName)localObject2);
      if (this.p != null)
      {
        Intent localIntent2 = new Intent(localIntent1);
        if (this.p.a(this, localIntent2))
          return null;
      }
      a(new v((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent1;
    }
  }

  public ResolveInfo b()
  {
    synchronized (this.d)
    {
      e();
      if (!this.e.isEmpty())
      {
        ResolveInfo localResolveInfo = ((t)this.e.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }

  public void c(int paramInt)
  {
    while (true)
    {
      synchronized (this.d)
      {
        e();
        t localt1 = (t)this.e.get(paramInt);
        t localt2 = (t)this.e.get(0);
        if (localt2 != null)
        {
          f1 = localt2.b - localt1.b + 5.0F;
          a(new v(new ComponentName(localt1.a.activityInfo.packageName, localt1.a.activityInfo.name), System.currentTimeMillis(), f1));
          return;
        }
      }
      float f1 = 1.0F;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.s
 * JD-Core Version:    0.6.0
 */