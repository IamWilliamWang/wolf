package com.baidu.tts.b.a.b;

import android.text.TextUtils;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.b.a;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.h.b.b;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.ResourceTools;

public class e extends a
{
  private e.b b;
  private long[] c = new long[1];
  private com.baidu.tts.e.c d;

  public int a(com.baidu.tts.m.e parame)
  {
    return EmbeddedSynthesizerEngine.bdTTSDomainDataInit(ResourceTools.stringToByteArrayAddNull(parame.a()), this.c[0]);
  }

  public int a(f paramf)
  {
    String str = paramf.b();
    paramf = paramf.a();
    boolean bool = TextUtils.isEmpty(str);
    if ((TextUtils.isEmpty(paramf)) || (bool))
      return n.Y.b();
    int i = EmbeddedSynthesizerEngine.loadEnglishEngine(ResourceTools.stringToByteArrayAddNull(paramf), ResourceTools.stringToByteArrayAddNull(str), this.c[0]);
    LoggerProxy.d("OfflineSynthesizer", "loadEnglishModel ret=" + i);
    return i;
  }

  public int a(g paramg)
  {
    int j = 0;
    String str = paramg.b();
    paramg = paramg.a();
    boolean bool1 = TextUtils.isEmpty(str);
    boolean bool2 = TextUtils.isEmpty(paramg);
    if ((bool1) && (bool2))
      return n.Y.b();
    if (!bool1);
    for (int i = EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(str), this.c[0]); ; i = 0)
    {
      if (!bool2)
        j = EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(paramg), this.c[0]);
      return j + i;
    }
  }

  public TtsError a()
  {
    int i;
    try
    {
      this.d = com.baidu.tts.e.c.a(b.a().h());
      this.d.a();
      if (this.b == null)
        this.b = new e.b();
      Object localObject1 = com.baidu.tts.auth.a.a().a(this.b);
      if (!((b.a)localObject1).g())
        break label173;
      Object localObject2 = this.b.e();
      localObject1 = this.b.f();
      localObject2 = ResourceTools.stringToByteArrayAddNull((String)localObject2);
      localObject1 = ResourceTools.stringToByteArrayAddNull((String)localObject1);
      LoggerProxy.d("OfflineSynthesizer", "before bdTTSEngineInit");
      i = EmbeddedSynthesizerEngine.bdTTSEngineInit(localObject2, localObject1, this.c);
      LoggerProxy.d("OfflineSynthesizer", "engine init ret = " + i);
      if (i == 0)
        return null;
    }
    catch (Exception localException)
    {
      while (true)
        LoggerProxy.d("OfflineSynthesizer", "embedded statistics open exception=" + localException.toString());
    }
    return com.baidu.tts.h.a.c.a().a(n.y, i, "bdTTSEngineInit result not 0");
    label173: return (TtsError)(TtsError)localException.b();
  }

  public TtsError a(i parami)
  {
    try
    {
      parami = new e.c(this, parami).a();
      return parami;
    }
    catch (java.lang.InterruptedException parami)
    {
      throw parami;
    }
    catch (Exception parami)
    {
    }
    return com.baidu.tts.h.a.c.a().a(n.A, parami);
  }

  public <OfflineSynthesizerParams> void a(OfflineSynthesizerParams paramOfflineSynthesizerParams)
  {
    this.b = ((e.b)paramOfflineSynthesizerParams);
  }

  public int b(com.baidu.tts.m.e parame)
  {
    return EmbeddedSynthesizerEngine.bdTTSDomainDataUninit(this.c[0]);
  }

  public TtsError b()
  {
    EmbeddedSynthesizerEngine.bdTTSEngineUninit(this.c[0]);
    try
    {
      synchronized (this.d)
      {
        if (!this.d.d())
        {
          this.d.c();
          com.baidu.tts.e.c.e();
        }
      }
    }
    catch (Exception localException)
    {
      LoggerProxy.d("OfflineSynthesizer", "embedded statistics release exception=" + localException.toString());
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.e
 * JD-Core Version:    0.6.0
 */