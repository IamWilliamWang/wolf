package com.baidu.tts.b.b.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.b.b.b;
import com.baidu.tts.b.b.b.c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.l;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class f extends a
{
  private ThreadPoolExecutor c;
  private c f = b.a().b();
  private h g = new h(this);
  private d h = new d(this);
  private g i = new g(this);
  private e j = new e(this);

  public f()
  {
    this.b = this.g;
  }

  int b(float paramFloat1, float paramFloat2)
  {
    return this.f.a(paramFloat1, paramFloat2);
  }

  int b(int paramInt)
  {
    return this.f.a(paramInt);
  }

  void b(com.baidu.tts.b.b.a parama)
  {
    this.a = parama;
  }

  <T> void b(T paramT)
  {
    paramT = ((com.baidu.tts.m.a)paramT).a();
    this.f.a(paramT);
  }

  void e(com.baidu.tts.m.h paramh)
  {
    this.c.execute(new f.a(this, paramh));
  }

  public boolean m()
  {
    return this.b == this.j;
  }

  public boolean n()
  {
    return (Thread.currentThread().isInterrupted()) || (this.b == this.h);
  }

  public h p()
  {
    return this.g;
  }

  public d q()
  {
    return this.h;
  }

  public g r()
  {
    return this.i;
  }

  public e s()
  {
    return this.j;
  }

  TtsError t()
  {
    this.f.a(new com.baidu.tts.b.b.a()
    {
      public void a(com.baidu.tts.m.h paramh)
      {
        f.this.b(paramh);
      }

      public void b(com.baidu.tts.m.h paramh)
      {
        f.this.c(paramh);
      }

      public void c(com.baidu.tts.m.h paramh)
      {
        f.this.d(paramh);
      }
    });
    return this.f.a();
  }

  void u()
  {
    this.c = new com.baidu.tts.c.a(100, "PlayExecutorPoolThread");
  }

  void v()
  {
    this.f.d();
  }

  void w()
  {
    this.f.c();
  }

  void x()
  {
    this.f.e();
    if (this.c != null)
      if (!this.c.isShutdown())
        this.c.shutdownNow();
    try
    {
      LoggerProxy.d("PlayQueueMachine", "before await");
      boolean bool = this.c.awaitTermination(l.a.a(), TimeUnit.MILLISECONDS);
      LoggerProxy.d("PlayQueueMachine", "after await isTer=" + bool);
      this.c = null;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        LoggerProxy.d("PlayQueueMachine", "InterruptedException");
    }
  }

  void y()
  {
    this.f.f();
  }

  void z()
  {
    this.f.b();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.b.a.f
 * JD-Core Version:    0.6.0
 */