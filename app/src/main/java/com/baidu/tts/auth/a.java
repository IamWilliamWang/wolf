package com.baidu.tts.auth;

import com.baidu.tts.b.a.b.e.b;
import com.baidu.tts.b.a.b.f.b;
import com.baidu.tts.f.l;
import com.baidu.tts.f.m;
import com.baidu.tts.f.n;
import com.baidu.tts.m.j;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class a
{
  private static volatile a a = null;
  private com.baidu.tts.k.c<c, c.a> b = new com.baidu.tts.k.c();
  private com.baidu.tts.k.c<b, b.a> c = new com.baidu.tts.k.c();

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

  private <T> T a(Callable<T> paramCallable, long paramLong)
  {
    return a(paramCallable).get(paramLong, TimeUnit.MILLISECONDS);
  }

  private <T> FutureTask<T> a(Callable<T> paramCallable)
  {
    paramCallable = new FutureTask(paramCallable);
    new Thread(paramCallable).start();
    return paramCallable;
  }

  public AuthInfo a(m paramm, j paramj)
  {
    paramj = paramj.a();
    AuthInfo localAuthInfo = new AuthInfo();
    localAuthInfo.setTtsEnum(paramm);
    switch (3.a[paramm.ordinal()])
    {
    default:
      return localAuthInfo;
    case 1:
      localAuthInfo.setOnlineResult(a(paramj.a()));
      return localAuthInfo;
    case 2:
      localAuthInfo.setOfflineResult(a(paramj.b()));
      return localAuthInfo;
    case 3:
    }
    return a(paramj);
  }

  // ERROR //
  public AuthInfo a(com.baidu.tts.m.b paramb)
  {
    // Byte code:
    //   0: ldc 120
    //   2: ldc 122
    //   4: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   7: new 130	java/util/concurrent/CountDownLatch
    //   10: dup
    //   11: iconst_2
    //   12: invokespecial 133	java/util/concurrent/CountDownLatch:<init>	(I)V
    //   15: astore_2
    //   16: new 47	java/util/concurrent/FutureTask
    //   19: dup
    //   20: new 6	com/baidu/tts/auth/a$1
    //   23: dup
    //   24: aload_0
    //   25: aload_1
    //   26: aload_2
    //   27: invokespecial 136	com/baidu/tts/auth/a$1:<init>	(Lcom/baidu/tts/auth/a;Lcom/baidu/tts/m/b;Ljava/util/concurrent/CountDownLatch;)V
    //   30: invokespecial 56	java/util/concurrent/FutureTask:<init>	(Ljava/util/concurrent/Callable;)V
    //   33: astore_3
    //   34: new 47	java/util/concurrent/FutureTask
    //   37: dup
    //   38: new 8	com/baidu/tts/auth/a$2
    //   41: dup
    //   42: aload_0
    //   43: aload_1
    //   44: aload_2
    //   45: invokespecial 137	com/baidu/tts/auth/a$2:<init>	(Lcom/baidu/tts/auth/a;Lcom/baidu/tts/m/b;Ljava/util/concurrent/CountDownLatch;)V
    //   48: invokespecial 56	java/util/concurrent/FutureTask:<init>	(Ljava/util/concurrent/Callable;)V
    //   51: astore 4
    //   53: new 58	java/lang/Thread
    //   56: dup
    //   57: aload_3
    //   58: invokespecial 61	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   61: invokevirtual 64	java/lang/Thread:start	()V
    //   64: new 58	java/lang/Thread
    //   67: dup
    //   68: aload 4
    //   70: invokespecial 61	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 64	java/lang/Thread:start	()V
    //   76: ldc 120
    //   78: ldc 139
    //   80: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: aload_2
    //   84: invokevirtual 142	java/util/concurrent/CountDownLatch:await	()V
    //   87: ldc 120
    //   89: ldc 144
    //   91: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: new 146	com/baidu/tts/auth/c$a
    //   97: dup
    //   98: invokespecial 147	com/baidu/tts/auth/c$a:<init>	()V
    //   101: astore_2
    //   102: ldc 120
    //   104: new 149	java/lang/StringBuilder
    //   107: dup
    //   108: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   111: ldc 152
    //   113: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload_2
    //   117: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_3
    //   127: invokevirtual 166	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   130: checkcast 146	com/baidu/tts/auth/c$a
    //   133: astore_1
    //   134: aload_1
    //   135: astore_2
    //   136: ldc 120
    //   138: ldc 168
    //   140: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: new 170	com/baidu/tts/auth/b$a
    //   146: dup
    //   147: invokespecial 171	com/baidu/tts/auth/b$a:<init>	()V
    //   150: astore_1
    //   151: ldc 120
    //   153: new 149	java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   160: ldc 173
    //   162: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_1
    //   166: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   169: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload 4
    //   177: invokevirtual 166	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   180: checkcast 170	com/baidu/tts/auth/b$a
    //   183: astore_3
    //   184: aload_3
    //   185: astore_1
    //   186: ldc 120
    //   188: ldc 175
    //   190: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: new 73	com/baidu/tts/auth/AuthInfo
    //   196: dup
    //   197: invokespecial 74	com/baidu/tts/auth/AuthInfo:<init>	()V
    //   200: astore_3
    //   201: aload_3
    //   202: getstatic 178	com/baidu/tts/f/m:c	Lcom/baidu/tts/f/m;
    //   205: invokevirtual 78	com/baidu/tts/auth/AuthInfo:setTtsEnum	(Lcom/baidu/tts/f/m;)V
    //   208: aload_3
    //   209: aload_2
    //   210: invokevirtual 99	com/baidu/tts/auth/AuthInfo:setOnlineResult	(Lcom/baidu/tts/auth/c$a;)V
    //   213: aload_3
    //   214: aload_1
    //   215: invokevirtual 109	com/baidu/tts/auth/AuthInfo:setOfflineResult	(Lcom/baidu/tts/auth/b$a;)V
    //   218: ldc 120
    //   220: ldc 180
    //   222: invokestatic 128	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: aload_3
    //   226: areturn
    //   227: astore_1
    //   228: invokestatic 184	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   231: invokevirtual 187	java/lang/Thread:interrupt	()V
    //   234: aload_3
    //   235: iconst_1
    //   236: invokevirtual 191	java/util/concurrent/FutureTask:cancel	(Z)Z
    //   239: pop
    //   240: aload 4
    //   242: iconst_1
    //   243: invokevirtual 191	java/util/concurrent/FutureTask:cancel	(Z)Z
    //   246: pop
    //   247: goto -153 -> 94
    //   250: astore_1
    //   251: invokestatic 184	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   254: invokevirtual 187	java/lang/Thread:interrupt	()V
    //   257: aload_3
    //   258: iconst_1
    //   259: invokevirtual 191	java/util/concurrent/FutureTask:cancel	(Z)Z
    //   262: pop
    //   263: aload_2
    //   264: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   267: getstatic 201	com/baidu/tts/f/n:d	Lcom/baidu/tts/f/n;
    //   270: aload_1
    //   271: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   274: invokevirtual 207	com/baidu/tts/auth/c$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   277: goto -141 -> 136
    //   280: astore_1
    //   281: aload_2
    //   282: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   285: getstatic 210	com/baidu/tts/f/n:e	Lcom/baidu/tts/f/n;
    //   288: aload_1
    //   289: invokevirtual 214	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   292: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   295: invokevirtual 207	com/baidu/tts/auth/c$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   298: goto -162 -> 136
    //   301: astore_1
    //   302: aload_2
    //   303: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   306: getstatic 217	com/baidu/tts/f/n:p	Lcom/baidu/tts/f/n;
    //   309: aload_1
    //   310: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   313: invokevirtual 207	com/baidu/tts/auth/c$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   316: goto -180 -> 136
    //   319: astore_3
    //   320: invokestatic 184	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   323: invokevirtual 187	java/lang/Thread:interrupt	()V
    //   326: aload 4
    //   328: iconst_1
    //   329: invokevirtual 191	java/util/concurrent/FutureTask:cancel	(Z)Z
    //   332: pop
    //   333: aload_1
    //   334: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   337: getstatic 220	com/baidu/tts/f/n:v	Lcom/baidu/tts/f/n;
    //   340: aload_3
    //   341: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   344: invokevirtual 221	com/baidu/tts/auth/b$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   347: goto -161 -> 186
    //   350: astore_3
    //   351: aload_1
    //   352: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   355: getstatic 224	com/baidu/tts/f/n:w	Lcom/baidu/tts/f/n;
    //   358: aload_3
    //   359: invokevirtual 214	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   362: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   365: invokevirtual 221	com/baidu/tts/auth/b$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   368: goto -182 -> 186
    //   371: astore_3
    //   372: aload_1
    //   373: invokestatic 196	com/baidu/tts/h/a/c:a	()Lcom/baidu/tts/h/a/c;
    //   376: getstatic 227	com/baidu/tts/f/n:I	Lcom/baidu/tts/f/n;
    //   379: aload_3
    //   380: invokevirtual 204	com/baidu/tts/h/a/c:a	(Lcom/baidu/tts/f/n;Ljava/lang/Throwable;)Lcom/baidu/tts/aop/tts/TtsError;
    //   383: invokevirtual 221	com/baidu/tts/auth/b$a:a	(Lcom/baidu/tts/aop/tts/TtsError;)V
    //   386: goto -200 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   76	94	227	java/lang/InterruptedException
    //   126	134	250	java/lang/InterruptedException
    //   126	134	280	java/util/concurrent/ExecutionException
    //   126	134	301	java/util/concurrent/CancellationException
    //   175	184	319	java/lang/InterruptedException
    //   175	184	350	java/util/concurrent/ExecutionException
    //   175	184	371	java/util/concurrent/CancellationException
  }

  public b.a a(e.b paramb)
  {
    b.a locala = new b.a();
    try
    {
      paramb = (b.a)a(new a.a(this, paramb), l.a.a());
      return paramb;
    }
    catch (java.lang.InterruptedException paramb)
    {
      Thread.currentThread().interrupt();
      locala.a(com.baidu.tts.h.a.c.a().a(n.v, paramb));
      return locala;
    }
    catch (ExecutionException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.w, paramb.getCause()));
      return locala;
    }
    catch (java.util.concurrent.TimeoutException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.x, paramb));
      return locala;
    }
    catch (java.util.concurrent.CancellationException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.I, paramb));
    }
    return locala;
  }

  public c.a a(f.b paramb)
  {
    c.a locala = new c.a();
    try
    {
      paramb = (c.a)a(new a.b(this, paramb), l.a.a());
      return paramb;
    }
    catch (java.lang.InterruptedException paramb)
    {
      Thread.currentThread().interrupt();
      locala.a(com.baidu.tts.h.a.c.a().a(n.d, paramb));
      return locala;
    }
    catch (ExecutionException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.e, paramb.getCause()));
      return locala;
    }
    catch (java.util.concurrent.TimeoutException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.f, paramb));
      return locala;
    }
    catch (java.util.concurrent.CancellationException paramb)
    {
      locala.a(com.baidu.tts.h.a.c.a().a(n.p, paramb));
    }
    return locala;
  }

  public void b()
  {
    if (this.b != null)
      this.b.a();
    if (this.c != null)
      this.c.a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.a
 * JD-Core Version:    0.6.0
 */