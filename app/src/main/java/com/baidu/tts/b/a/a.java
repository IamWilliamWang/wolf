package com.baidu.tts.b.a;

import com.baidu.tts.b.a.a.c;
import com.baidu.tts.b.a.b.b;
import com.baidu.tts.b.a.b.e;

public class a
{
  private static volatile a a = null;

  private com.baidu.tts.b.a.a.d a(b paramb)
  {
    c localc = new c();
    localc.a(paramb);
    return localc;
  }

  public static a a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new a();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private com.baidu.tts.b.a.a.d b()
  {
    return a(new com.baidu.tts.b.a.b.f());
  }

  private com.baidu.tts.b.a.a.d c()
  {
    return a(new e());
  }

  private com.baidu.tts.b.a.a.d d()
  {
    return a(new com.baidu.tts.b.a.b.d());
  }

  public com.baidu.tts.b.a.a.d a(com.baidu.tts.f.f paramf)
  {
    switch (1.a[paramf.ordinal()])
    {
    default:
      return null;
    case 1:
      return b();
    case 2:
      return c();
    case 3:
    }
    return d();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.a
 * JD-Core Version:    0.6.0
 */