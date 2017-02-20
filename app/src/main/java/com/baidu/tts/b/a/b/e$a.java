package com.baidu.tts.b.a.b;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.e.c;

class e$a extends Thread
{
  private int b;

  public e$a(e parame, int paramInt)
  {
    this.b = paramInt;
  }

  public void run()
  {
    try
    {
      synchronized (e.c(this.a))
      {
        if (!e.c(this.a).d())
          e.c(this.a).a(System.currentTimeMillis(), this.b, 0, 0, "");
        return;
      }
    }
    catch (Exception localException)
    {
      LoggerProxy.d("OfflineSynthesizer", "AddPVResultsToDB exception=" + localException.toString());
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.e.a
 * JD-Core Version:    0.6.0
 */