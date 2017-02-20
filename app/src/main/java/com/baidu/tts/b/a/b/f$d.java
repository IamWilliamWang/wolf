package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.util.concurrent.Callable;

class f$d
  implements Callable<TtsError>
{
  private i b;
  private f.c c;

  public f$d(f paramf, i parami)
  {
    this.b = parami;
    this.c = new f.c(paramf);
  }

  private boolean a(h paramh)
  {
    if (paramh == null);
    do
      return false;
    while ((paramh.f() != null) || (paramh.a() != 0));
    return true;
  }

  private boolean b(h paramh)
  {
    return (!a(paramh)) || (paramh.b() < 0);
  }

  public TtsError a()
  {
    int i = 0;
    h localh;
    do
    {
      i += 1;
      LoggerProxy.d("OnlineSynthesizer", "count=" + i);
      localh = f.a(this.a, i, this.c, this.b);
      if (!a(localh))
        continue;
      this.a.a(localh);
    }
    while (!b(localh));
    if (localh == null)
      return c.a().b(n.j);
    return localh.f();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.f.d
 * JD-Core Version:    0.6.0
 */