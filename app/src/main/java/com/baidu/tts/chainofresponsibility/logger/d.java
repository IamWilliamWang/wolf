package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import com.baidu.tts.g.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class d
{
  private static volatile d a = null;
  private List<b> b = g();
  private ExecutorService c;
  private f d = new f();
  private e e = new e();
  private d.a f = d.a.b;
  private boolean g = false;

  private d()
  {
    this.b.add(this.d);
    this.c = Executors.newSingleThreadExecutor(new a("LoggerChainPoolThread"));
  }

  public static d a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new d();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void a(c paramc, int paramInt, String paramString1, String paramString2)
  {
    c localc = paramc;
    if (paramc == null)
      localc = new c();
    localc.a(paramInt);
    localc.a(paramString1);
    localc.b(paramString2);
    a(localc);
  }

  private void b(c paramc)
  {
    try
    {
      if ((this.c != null) && (!this.c.isShutdown()))
        this.c.execute(new d.b(this, paramc));
      return;
    }
    catch (Exception paramc)
    {
      Log.e("LoggerChain", "executeWork exception=" + paramc.toString());
    }
  }

  private List<b> g()
  {
    if (this.b == null)
      return new CopyOnWriteArrayList();
    return this.b;
  }

  public void a(int paramInt, String paramString1, String paramString2)
  {
    a(new c(), paramInt, paramString1, paramString2);
  }

  public void a(c paramc)
  {
    if (paramc != null)
      switch (1.a[this.f.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    while (true)
    {
      b(paramc);
      return;
      paramc.a(6);
      this.e.a(paramc, null, a);
      continue;
      if (!this.g)
        continue;
      this.e.a(paramc, null, a);
    }
  }

  public void a(String paramString)
  {
    if (this.e != null)
      this.e.a(paramString);
  }

  public void a(List<String> paramList)
  {
    if (this.e != null)
      this.e.a(paramList);
  }

  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void b()
  {
    if (this.b != null)
      this.b.clear();
  }

  public void b(String paramString)
  {
    if (this.e != null)
      this.e.b(paramString);
  }

  public void c()
  {
    if (this.e != null)
      this.e.a();
  }

  public void d()
  {
    this.f = d.a.b;
  }

  public boolean e()
  {
    return (this.f == null) || (this.f == d.a.b);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.chainofresponsibility.logger.d
 * JD-Core Version:    0.6.0
 */