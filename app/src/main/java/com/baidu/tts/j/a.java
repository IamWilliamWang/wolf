package com.baidu.tts.j;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class a
  implements b
{
  protected final Lock d = new ReentrantLock();
  protected final Condition e = this.d.newCondition();

  public void A()
  {
    monitorenter;
    try
    {
      h();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void B()
  {
    Thread.currentThread().interrupt();
  }

  public boolean C()
  {
    try
    {
      a(null);
      if (n())
        return false;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        B();
    }
    return true;
  }

  public void a(a.a parama)
  {
    while (m())
      b(parama);
  }

  public TtsError b()
  {
    monitorenter;
    try
    {
      TtsError localTtsError = g();
      monitorexit;
      return localTtsError;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void b(a.a parama)
  {
    try
    {
      this.d.lock();
      if (parama != null)
        parama.a();
      LoggerProxy.d("ASafeLife", "before await");
      this.e.await();
      LoggerProxy.d("ASafeLife", "after await");
      return;
    }
    finally
    {
      this.d.unlock();
    }
    throw parama;
  }

  // ERROR //
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 97	com/baidu/tts/j/a:i	()V
    //   6: aload_0
    //   7: getfield 19	com/baidu/tts/j/a:d	Ljava/util/concurrent/locks/Lock;
    //   10: invokeinterface 68 1 0
    //   15: aload_0
    //   16: getfield 27	com/baidu/tts/j/a:e	Ljava/util/concurrent/locks/Condition;
    //   19: invokeinterface 100 1 0
    //   24: aload_0
    //   25: getfield 19	com/baidu/tts/j/a:d	Ljava/util/concurrent/locks/Lock;
    //   28: invokeinterface 91 1 0
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_1
    //   38: invokevirtual 103	java/lang/Exception:printStackTrace	()V
    //   41: aload_0
    //   42: getfield 19	com/baidu/tts/j/a:d	Ljava/util/concurrent/locks/Lock;
    //   45: invokeinterface 91 1 0
    //   50: goto -17 -> 33
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: getfield 19	com/baidu/tts/j/a:d	Ljava/util/concurrent/locks/Lock;
    //   63: invokeinterface 91 1 0
    //   68: aload_1
    //   69: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   6	24	36	java/lang/Exception
    //   2	6	53	finally
    //   24	33	53	finally
    //   41	50	53	finally
    //   59	70	53	finally
    //   6	24	58	finally
    //   37	41	58	finally
  }

  public void d()
  {
    monitorenter;
    try
    {
      j();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void e()
  {
    monitorenter;
    try
    {
      k();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void f()
  {
    monitorenter;
    try
    {
      l();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  protected native abstract TtsError g();

  protected native abstract void h();

  protected native abstract void i();

  protected native abstract void j();

  protected native abstract void k();

  protected native abstract void l();

  public native abstract boolean m();

  public native abstract boolean n();
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.j.a
 * JD-Core Version:    0.6.0
 */