package com.baidu.tts.b.a.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.m.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class c extends a
{
  private ExecutorService f;
  private h g = new h(this);
  private e h = new e(this);
  private g i = new g(this);
  private f j = new f(this);

  public c()
  {
    this.c = this.g;
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      d(null);
      return;
    }
    com.baidu.tts.m.h localh = new com.baidu.tts.m.h();
    localh.a(com.baidu.tts.h.a.c.a().b(n.W));
    d(localh);
  }

  int b(com.baidu.tts.m.f paramf)
  {
    return this.a.a(paramf);
  }

  int b(com.baidu.tts.m.g paramg)
  {
    return this.a.a(paramg);
  }

  void b(com.baidu.tts.b.a.b.b paramb)
  {
    this.a = paramb;
  }

  void b(com.baidu.tts.b.a.b paramb)
  {
    if (this.b == null)
      this.b = new ArrayList();
    if (!this.b.contains(paramb))
      this.b.add(paramb);
  }

  void b(i parami)
  {
    this.f.submit(new c.a(this, parami));
  }

  <T> void b(T paramT)
  {
    this.a.a(paramT);
  }

  int c(com.baidu.tts.m.e parame)
  {
    return this.a.a(parame);
  }

  int d(com.baidu.tts.m.e parame)
  {
    return this.a.b(parame);
  }

  public boolean m()
  {
    return this.c == this.j;
  }

  public boolean n()
  {
    return (Thread.currentThread().isInterrupted()) || (this.c == this.h);
  }

  public h o()
  {
    return this.g;
  }

  public e p()
  {
    return this.h;
  }

  public g q()
  {
    return this.i;
  }

  public f r()
  {
    return this.j;
  }

  TtsError s()
  {
    if (this.b == null)
      this.b = new ArrayList();
    this.a.a(new com.baidu.tts.b.a.b()
    {
      public void a(com.baidu.tts.m.h paramh)
      {
      }

      public void b(com.baidu.tts.m.h paramh)
      {
      }

      public void c(com.baidu.tts.m.h paramh)
      {
        c.this.b(paramh);
      }

      public void d(com.baidu.tts.m.h paramh)
      {
      }

      public void e(com.baidu.tts.m.h paramh)
      {
      }
    });
    return this.a.a();
  }

  void t()
  {
    this.f = Executors.newSingleThreadExecutor(new com.baidu.tts.g.a.a("EngineExecutorPoolThread"));
  }

  void u()
  {
  }

  void v()
  {
  }

  void w()
  {
    if (this.f != null)
      if (!this.f.isShutdown())
        this.f.shutdownNow();
    try
    {
      LoggerProxy.d("EngineExecutor", "before awaitTermination");
      boolean bool = this.f.awaitTermination(l.a.a(), TimeUnit.MILLISECONDS);
      LoggerProxy.d("EngineExecutor", "after awaitTermination isTermination=" + bool);
      a(bool);
      this.f = null;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        a(false);
    }
  }

  void x()
  {
    this.a.b();
    this.b = null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.a.c
 * JD-Core Version:    0.6.0
 */