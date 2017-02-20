package com.baidu.tts.d;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.DownloadHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c
  implements com.baidu.tts.j.b
{
  private static volatile c a = null;
  private com.baidu.tts.l.a b;
  private com.baidu.tts.d.b.a c = com.baidu.tts.d.b.a.a();
  private com.baidu.tts.d.a.b d = new com.baidu.tts.d.a.b();
  private ExecutorService e;

  public static c a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new c();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private ExecutorService h()
  {
    monitorenter;
    try
    {
      if (this.e == null)
        this.e = Executors.newSingleThreadExecutor();
      ExecutorService localExecutorService = this.e;
      return localExecutorService;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public DownloadHandler a(DownloadHandler paramDownloadHandler)
  {
    monitorenter;
    try
    {
      LoggerProxy.d("Downloader", "download handler=" + paramDownloadHandler);
      c.a locala = new c.a(this, paramDownloadHandler);
      paramDownloadHandler.setCheckFuture(h().submit(locala));
      monitorexit;
      return paramDownloadHandler;
    }
    finally
    {
      paramDownloadHandler = finally;
      monitorexit;
    }
    throw paramDownloadHandler;
  }

  public void a(com.baidu.tts.l.a parama)
  {
    this.b = parama;
    this.c.a(this.b.e());
    this.d.a(this.b);
  }

  public TtsError b()
  {
    monitorenter;
    monitorexit;
    return null;
  }

  public void c()
  {
    monitorenter;
    try
    {
      this.d.c();
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

  public void d()
  {
    monitorenter;
    try
    {
      this.d.d();
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

  // ERROR //
  public void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 55
    //   4: ldc 115
    //   6: invokestatic 76	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 31	com/baidu/tts/d/c:c	Lcom/baidu/tts/d/b/a;
    //   13: invokevirtual 116	com/baidu/tts/d/b/a:c	()V
    //   16: aload_0
    //   17: getfield 47	com/baidu/tts/d/c:e	Ljava/util/concurrent/ExecutorService;
    //   20: ifnull +94 -> 114
    //   23: aload_0
    //   24: getfield 47	com/baidu/tts/d/c:e	Ljava/util/concurrent/ExecutorService;
    //   27: invokeinterface 120 1 0
    //   32: ifne +27 -> 59
    //   35: aload_0
    //   36: getfield 47	com/baidu/tts/d/c:e	Ljava/util/concurrent/ExecutorService;
    //   39: invokeinterface 124 1 0
    //   44: pop
    //   45: aload_0
    //   46: getfield 36	com/baidu/tts/d/c:d	Lcom/baidu/tts/d/a/b;
    //   49: invokevirtual 126	com/baidu/tts/d/a/b:e	()V
    //   52: ldc 55
    //   54: ldc 128
    //   56: invokestatic 76	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: ldc 55
    //   61: ldc 130
    //   63: invokestatic 76	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: aload_0
    //   67: getfield 47	com/baidu/tts/d/c:e	Ljava/util/concurrent/ExecutorService;
    //   70: getstatic 135	com/baidu/tts/f/l:a	Lcom/baidu/tts/f/l;
    //   73: invokevirtual 138	com/baidu/tts/f/l:a	()J
    //   76: getstatic 144	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   79: invokeinterface 148 4 0
    //   84: istore_1
    //   85: ldc 55
    //   87: new 57	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   94: ldc 150
    //   96: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: iload_1
    //   100: invokevirtual 153	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   103: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 76	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: aload_0
    //   110: aconst_null
    //   111: putfield 47	com/baidu/tts/d/c:e	Ljava/util/concurrent/ExecutorService;
    //   114: ldc 55
    //   116: ldc 155
    //   118: invokestatic 76	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload_0
    //   122: monitorexit
    //   123: return
    //   124: astore_2
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_2
    //   128: athrow
    //   129: astore_2
    //   130: goto -21 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   2	59	124	finally
    //   59	109	124	finally
    //   109	114	124	finally
    //   114	121	124	finally
    //   59	109	129	java/lang/InterruptedException
  }

  public void f()
  {
    monitorenter;
    monitorexit;
  }

  public void g()
  {
    monitorenter;
    try
    {
      h();
      this.d.A();
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
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.c
 * JD-Core Version:    0.6.0
 */