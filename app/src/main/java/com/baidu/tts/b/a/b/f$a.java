package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.f.o;
import com.baidu.tts.h.a.c;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.m.i;
import com.baidu.tts.p.a;
import java.util.concurrent.Callable;

class f$a
  implements Callable<com.baidu.tts.m.h>
{
  private int b;
  private f.c c;
  private i d;
  private f.b e;
  private com.baidu.tts.m.h f;
  private SyncHttpClient g;

  public f$a(f paramf, int paramInt, f.c paramc, i parami, f.b paramb, com.baidu.tts.m.h paramh)
  {
    this.b = paramInt;
    this.c = paramc;
    this.d = parami;
    this.e = paramb;
    this.f = paramh;
  }

  public com.baidu.tts.m.h a()
  {
    while (true)
    {
      h localh;
      TtsError localTtsError;
      try
      {
        Object localObject = f.a(this.a, this.b, this.c.a, this.d, this.e);
        this.g = new SyncHttpClient();
        int i = this.e.m();
        int j = this.e.n();
        this.g.setMaxRetriesAndTimeout(i, j);
        i = this.e.o();
        LoggerProxy.d("OnlineSynthesizer", "timeout=" + i);
        this.g.setTimeout(i);
        localh = new h(this.f);
        localh.a(this.e);
        if (this.b != 1)
          continue;
        this.c.b = o.a.b();
        LoggerProxy.d("OnlineSynthesizer", "serverIp=" + this.c.b);
        if (this.c.b == null)
        {
          localObject = c.a().b(n.q);
          this.f.a((TtsError)localObject);
          return this.f;
        }
      }
      catch (a localTtsError)
      {
        localTtsError = c.a().b(n.h);
        this.f.a(localTtsError);
        return this.f;
      }
      if (Thread.currentThread().isInterrupted())
        continue;
      LoggerProxy.d("OnlineSynthesizer", "before post");
      this.g.post(null, this.c.b, localTtsError, null, localh);
      LoggerProxy.d("OnlineSynthesizer", "after post");
    }
  }

  public void b()
  {
    if (this.g != null)
      this.g.stop();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.f.a
 * JD-Core Version:    0.6.0
 */