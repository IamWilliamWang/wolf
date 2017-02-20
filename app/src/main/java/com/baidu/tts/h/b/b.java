package com.baidu.tts.h.b;

import android.content.Context;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.f.g;
import java.lang.ref.WeakReference;
import java.util.Hashtable;

public class b
  implements com.baidu.tts.j.b
{
  private static volatile b a = null;
  private Hashtable<WeakReference<Context>, a> b = new Hashtable();
  private WeakReference<Context> c;
  private Hashtable<String, Object> d = new Hashtable();

  private b()
  {
    this.d.put(g.Y.a(), "10");
    this.d.put(g.aa.a(), "V2.2.8");
  }

  public static b a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new b();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public a a(WeakReference<Context> paramWeakReference)
  {
    if (paramWeakReference == null)
      localObject = null;
    a locala;
    do
    {
      return localObject;
      locala = (a)this.b.get(paramWeakReference);
      localObject = locala;
    }
    while (locala != null);
    Object localObject = new a(paramWeakReference);
    this.b.put(paramWeakReference, localObject);
    return (a)localObject;
  }

  public String a(String paramString)
  {
    try
    {
      paramString = (String)this.d.get(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
    }
    return null;
  }

  public void a(Context paramContext)
  {
    this.c = new WeakReference(paramContext);
  }

  public TtsError b()
  {
    return null;
  }

  public void c()
  {
  }

  public void d()
  {
  }

  public void e()
  {
  }

  public void f()
  {
    if (this.b != null)
      this.b.clear();
    this.c = null;
  }

  public a g()
  {
    return a(this.c);
  }

  public Context h()
  {
    return (Context)this.c.get();
  }

  public String i()
  {
    try
    {
      Object localObject = g();
      if (localObject == null)
        return null;
      localObject = ((a)localObject).a();
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return (String)null;
  }

  public String j()
  {
    return a(g.aa.a());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.h.b.b
 * JD-Core Version:    0.6.0
 */