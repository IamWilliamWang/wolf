package com.baidu.tts.b.a.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.b.a.b.b;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.util.concurrent.Callable;

class c$a
  implements Callable<Void>
{
  private i b;

  public c$a(c paramc, i parami)
  {
    this.b = parami;
  }

  public Void a()
  {
    try
    {
      this.a.a(h.b(this.b));
      TtsError localTtsError = this.a.a.a(this.b);
      if (localTtsError == null)
      {
        this.a.c(h.b(this.b));
        return null;
      }
      this.a.e(h.a(this.b, localTtsError));
      return null;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.a.c.a
 * JD-Core Version:    0.6.0
 */