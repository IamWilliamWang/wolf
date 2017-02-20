package com.baidu.tts.b.b.a;

import com.baidu.tts.b.b.b.c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.h;

class f$a
  implements Runnable
{
  private h b;

  public f$a(f paramf, h paramh)
  {
    this.b = paramh;
  }

  public void run()
  {
    LoggerProxy.d("PlayQueueMachine", "enter run");
    f.a(this.a).a(this.b);
    LoggerProxy.d("PlayQueueMachine", "end run");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.b.a.f.a
 * JD-Core Version:    0.6.0
 */