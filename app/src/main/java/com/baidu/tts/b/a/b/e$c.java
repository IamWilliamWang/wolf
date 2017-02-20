package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.b.a;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.d;
import com.baidu.tts.f.f;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine.OnNewDataListener;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.util.concurrent.Callable;

class e$c
  implements EmbeddedSynthesizerEngine.OnNewDataListener, Callable<TtsError>
{
  private i b;
  private int c = 0;

  public e$c(e parame, i parami)
  {
    this.b = parami;
  }

  public TtsError a()
  {
    Object localObject = com.baidu.tts.auth.a.a().a(e.a(this.a));
    if (localObject != null)
    {
      if (((b.a)localObject).g())
      {
        int i = EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 0, 0L);
        LoggerProxy.d("OfflineSynthesizer", "engineResult = " + i);
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 5, e.a(this.a).v());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 6, e.a(this.a).w());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 7, e.a(this.a).x());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 17, e.a(this.a).a());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 18, e.a(this.a).b());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 19, e.a(this.a).c());
        EmbeddedSynthesizerEngine.bdTTSSetParam(e.b(this.a)[0], 9, e.a(this.a).d());
        EmbeddedSynthesizerEngine.setOnNewDataListener(this);
        this.b.c(d.d.a());
        localObject = this.b.e();
        LoggerProxy.d("OfflineSynthesizer", "before bdttssynthesis");
        i = EmbeddedSynthesizerEngine.bdTTSSynthesis(e.b(this.a)[0], localObject, localObject.length);
        LoggerProxy.d("OfflineSynthesizer", "after bdttssynthesis result = " + i);
        try
        {
          new e.a(this.a, i).start();
          if (i == 0)
            return null;
        }
        catch (Exception localException)
        {
          while (true)
            LoggerProxy.d("OfflineSynthesizer", "AddPVResultsToDB start exception=" + localException.toString());
        }
        return c.a().a(n.B, i);
      }
      return localException.b();
    }
    return (TtsError)c.a().b(n.u);
  }

  public int onNewData(byte[] paramArrayOfByte, int paramInt)
  {
    h localh = h.b(this.b);
    localh.d(f.b.a());
    localh.a(com.baidu.tts.f.a.a);
    localh.a(paramArrayOfByte);
    localh.c(paramInt);
    this.c += 1;
    if (paramArrayOfByte.length == 0)
      this.c = (-this.c);
    localh.b(this.c);
    this.a.a(localh);
    if (Thread.currentThread().isInterrupted())
    {
      LoggerProxy.d("OfflineSynthesizer", "interrupted to interrupt syn");
      return -1;
    }
    return 0;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.e.c
 * JD-Core Version:    0.6.0
 */