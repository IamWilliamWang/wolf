package com.baidu.tts.a.b;

import android.content.Context;
import android.os.Bundle;
import com.baidu.tts.aop.IProxyFactory;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.tts.TtsFactory;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizeBag;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.ResourceTools;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

public class a
{
  private ITts a = g();
  private SpeechSynthesizerListener b;
  private ThreadPoolExecutor c;
  private TtsListener d = new TtsListener()
  {
    private boolean a(h paramh)
    {
      try
      {
        paramh = paramh.f().getTtsErrorFlyweight().a();
        int i = a.2.a[paramh.ordinal()];
        switch (i)
        {
        default:
          return false;
        case 1:
        case 2:
        case 3:
        }
        return true;
      }
      catch (Exception paramh)
      {
        LoggerProxy.d("SpeechSynthesizerAdapter", "isStopped exception=" + paramh.toString());
      }
      return false;
    }

    public void onError(h paramh)
    {
      if ((a.b(a.this) != null) && (!a(paramh)))
      {
        String str = a.a(a.this, paramh);
        paramh = a.b(a.this, paramh);
        a.b(a.this).onError(str, paramh);
      }
    }

    public void onPlayFinished(h paramh)
    {
      if (a.b(a.this) != null)
      {
        paramh = a.a(a.this, paramh);
        a.b(a.this).onSpeechFinish(paramh);
      }
    }

    public void onPlayProgressUpdate(h paramh)
    {
      if (a.b(a.this) != null)
      {
        String str = a.a(a.this, paramh);
        int i = paramh.c();
        a.b(a.this).onSpeechProgressChanged(str, i);
      }
    }

    public void onPlayStart(h paramh)
    {
      if (a.b(a.this) != null)
      {
        paramh = a.a(a.this, paramh);
        a.b(a.this).onSpeechStart(paramh);
      }
    }

    public void onSynthesizeDataArrived(h paramh)
    {
      if (a.b(a.this) != null)
      {
        String str = a.a(a.this, paramh);
        byte[] arrayOfByte = paramh.d();
        int i = paramh.c();
        a.b(a.this).onSynthesizeDataArrived(str, arrayOfByte, i);
      }
    }

    public void onSynthesizeFinished(h paramh)
    {
      if (a.b(a.this) != null)
      {
        paramh = a.a(a.this, paramh);
        a.b(a.this).onSynthesizeFinish(paramh);
      }
    }

    public void onSynthesizeStart(h paramh)
    {
      if (a.b(a.this) != null)
      {
        paramh = a.a(a.this, paramh);
        a.b(a.this).onSynthesizeStart(paramh);
      }
    }
  };

  public a()
  {
    this.a.setTtsListener(this.d);
  }

  private int a(String paramString, Callable<Void> paramCallable)
  {
    paramString = ResourceTools.isTextValid(paramString);
    if (paramString == null)
      return a(paramCallable);
    return paramString.b();
  }

  private int a(Callable<Void> paramCallable)
  {
    try
    {
      h().submit(paramCallable);
      return 0;
    }
    catch (java.util.concurrent.RejectedExecutionException paramCallable)
    {
    }
    return SpeechSynthesizer.ERROR_QUEUE_IS_FULL;
  }

  private String a(h paramh)
  {
    if (paramh != null)
    {
      paramh = paramh.e();
      if (paramh != null)
        return paramh.f();
    }
    LoggerProxy.d("SpeechSynthesizerAdapter", "getUtteranceId null");
    return null;
  }

  private SpeechError b(h paramh)
  {
    if (paramh != null)
    {
      paramh = paramh.f();
      if (paramh != null)
      {
        int i = paramh.getDetailCode();
        paramh = paramh.getDetailMessage();
        SpeechError localSpeechError = new SpeechError();
        localSpeechError.code = i;
        localSpeechError.description = paramh;
        return localSpeechError;
      }
      LoggerProxy.d("SpeechSynthesizerAdapter", "ttsError is null");
    }
    paramh = new SpeechError();
    paramh.code = n.al.b();
    paramh.description = n.al.c();
    return paramh;
  }

  private ITts g()
  {
    return (ITts)new TtsFactory().makeProxy();
  }

  private ExecutorService h()
  {
    monitorenter;
    try
    {
      if (this.c == null)
        this.c = new com.baidu.tts.c.a(1000, "SpeechSynthesizerPoolThread", new ThreadPoolExecutor.AbortPolicy());
      ThreadPoolExecutor localThreadPoolExecutor = this.c;
      return localThreadPoolExecutor;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void i()
  {
    if (this.c != null)
      if (!this.c.isShutdown())
        this.c.shutdownNow();
    try
    {
      boolean bool = this.c.awaitTermination(l.a.a(), TimeUnit.MILLISECONDS);
      LoggerProxy.d("SpeechSynthesizerAdapter", "isTerminated=" + bool);
      this.c = null;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        LoggerProxy.d("SpeechSynthesizerAdapter", "InterruptedException");
    }
  }

  public int a(float paramFloat1, float paramFloat2)
  {
    return this.a.setStereoVolume(paramFloat1, paramFloat2);
  }

  public int a(int paramInt)
  {
    return this.a.setAudioStreamType(paramInt);
  }

  public int a(String paramString)
  {
    e locale = new e();
    locale.a(paramString);
    return this.a.loadCustomResource(locale);
  }

  public int a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = com.baidu.tts.f.g.valueOf(paramString1);
      int i = this.a.setParam(paramString1, paramString2);
      return i;
    }
    catch (Exception paramString1)
    {
    }
    return n.Y.b();
  }

  public int a(String paramString1, String paramString2, Bundle paramBundle)
  {
    return a(paramString1, new a.b(this, paramString1, paramString2));
  }

  public int a(List<SpeechSynthesizeBag> paramList)
  {
    if (paramList.size() <= 100)
      return a(new a.a(this, paramList));
    return SpeechSynthesizer.ERROR_LIST_IS_TOO_LONG;
  }

  public TtsError a(TtsMode paramTtsMode)
  {
    this.a.setMode(paramTtsMode.getTtsEnum());
    return this.a.b();
  }

  public String a()
  {
    return com.baidu.tts.h.b.b.a().j();
  }

  public void a(Context paramContext)
  {
    this.a.setContext(paramContext);
  }

  public void a(SpeechSynthesizerListener paramSpeechSynthesizerListener)
  {
    if (this.b != paramSpeechSynthesizerListener)
      this.b = paramSpeechSynthesizerListener;
  }

  public int b()
  {
    if (this.a != null)
      this.a.d();
    return 0;
  }

  public int b(String paramString1, String paramString2)
  {
    com.baidu.tts.m.g localg = new com.baidu.tts.m.g();
    localg.b(paramString1);
    localg.a(paramString2);
    return this.a.loadModel(localg);
  }

  public int b(String paramString1, String paramString2, Bundle paramBundle)
  {
    return a(paramString1, new a.c(this, paramString1, paramString2));
  }

  public AuthInfo b(TtsMode paramTtsMode)
  {
    return this.a.auth(paramTtsMode.getTtsEnum());
  }

  public int c()
  {
    if (this.a != null)
      this.a.c();
    return 0;
  }

  public int c(String paramString1, String paramString2)
  {
    f localf = new f();
    localf.a(paramString1);
    localf.b(paramString2);
    return this.a.loadEnglishModel(localf);
  }

  public int d()
  {
    i();
    if (this.a != null)
      this.a.e();
    return 0;
  }

  public int e()
  {
    i();
    if (this.a != null)
    {
      this.a.f();
      this.a = null;
    }
    return 0;
  }

  public int f()
  {
    return this.a.freeCustomResource(null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.a.b.a
 * JD-Core Version:    0.6.0
 */