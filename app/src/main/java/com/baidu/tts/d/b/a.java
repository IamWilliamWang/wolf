package com.baidu.tts.d.b;

import com.baidu.tts.client.model.DownloadHandler;

public class a
{
  private static volatile a a = null;
  private e b = e.a();
  private com.baidu.tts.database.a c;

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

  public b a(String paramString)
  {
    return this.b.c(paramString);
  }

  public void a(DownloadHandler paramDownloadHandler)
  {
    this.b.a(paramDownloadHandler);
  }

  public void a(com.baidu.tts.database.a parama)
  {
    this.c = parama;
  }

  public void a(String paramString1, String paramString2)
  {
    this.b.a(paramString1, paramString2);
  }

  public d b(String paramString)
  {
    return this.b.a(paramString);
  }

  public com.baidu.tts.database.a b()
  {
    return this.c;
  }

  public c c(String paramString)
  {
    return this.b.b(paramString);
  }

  public void c()
  {
    this.b.b();
  }

  public long d(String paramString)
  {
    return this.b.e(paramString);
  }

  public int e(String paramString)
  {
    return this.b.f(paramString);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.b.a
 * JD-Core Version:    0.6.0
 */