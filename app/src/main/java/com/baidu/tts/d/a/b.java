package com.baidu.tts.d.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b extends com.baidu.tts.j.a
{
  private volatile a a = this.b;
  private i b = new i(this);
  private f c = new f(this);
  private d f = new d(this);
  private h g = new h(this);
  private ThreadPoolExecutor h;
  private com.baidu.tts.l.a i;

  public b()
  {
    b();
  }

  public a a()
  {
    return this.a;
  }

  public e a(c paramc)
  {
    return this.a.a(paramc);
  }

  public void a(a parama)
  {
    this.a = parama;
  }

  public void a(com.baidu.tts.l.a parama)
  {
    this.i = parama;
  }

  e b(c paramc)
  {
    b.a locala = new b.a(this, paramc);
    paramc.c();
    LoggerProxy.d("DownloadEngine", "before submit");
    e locale = null;
    try
    {
      Future localFuture = this.h.submit(locala);
      paramc = localFuture;
      locale = new e();
      locale.a(paramc);
      locale.a(locala);
      return locale;
    }
    catch (Exception localException)
    {
      while (true)
      {
        LoggerProxy.d("DownloadEngine", "submit exception");
        paramc.a(com.baidu.tts.h.a.c.a().a(n.ak, localException));
        paramc = locale;
      }
    }
  }

  protected TtsError g()
  {
    return this.a.b();
  }

  protected void h()
  {
    this.a.a();
  }

  protected void i()
  {
    this.a.c();
  }

  protected void j()
  {
    this.a.d();
  }

  protected void k()
  {
    this.a.e();
  }

  protected void l()
  {
    this.a.f();
  }

  public boolean m()
  {
    return this.a == this.g;
  }

  public boolean n()
  {
    return (Thread.currentThread().isInterrupted()) || (this.a == this.c);
  }

  public i o()
  {
    return this.b;
  }

  public f p()
  {
    return this.c;
  }

  public d q()
  {
    return this.f;
  }

  public h r()
  {
    return this.g;
  }

  void s()
  {
    this.h = ((ThreadPoolExecutor)Executors.newFixedThreadPool(5, new com.baidu.tts.g.a.a("downloadPoolThread")));
  }

  void t()
  {
    LoggerProxy.d("DownloadEngine", "enter stop");
    if (this.h != null)
      if (!this.h.isShutdown())
        this.h.shutdownNow();
    try
    {
      LoggerProxy.d("DownloadEngine", "before awaitTermination");
      boolean bool = this.h.awaitTermination(l.a.a(), TimeUnit.MILLISECONDS);
      LoggerProxy.d("DownloadEngine", "after awaitTermination isTermination=" + bool);
      label80: this.h = null;
      LoggerProxy.d("DownloadEngine", "end stop");
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label80;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.a.b
 * JD-Core Version:    0.6.0
 */