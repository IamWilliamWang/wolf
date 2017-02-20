package com.baidu.tts.d.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.Future;

public class e
{
  private Future<Void> a;
  private b.a b;

  public void a()
  {
    LoggerProxy.d("EngineDownloadHandler", "before stop");
    try
    {
      LoggerProxy.d("EngineDownloadHandler", "stop fileId=" + this.b.c().a());
      label40: if (this.a != null)
      {
        boolean bool = this.a.cancel(true);
        LoggerProxy.d("EngineDownloadHandler", "unDone = " + bool);
      }
      if (this.b != null)
        this.b.b();
      LoggerProxy.d("EngineDownloadHandler", "after stop");
      return;
    }
    catch (Exception localException)
    {
      break label40;
    }
  }

  public void a(b.a parama)
  {
    this.b = parama;
  }

  public void a(Future<Void> paramFuture)
  {
    this.a = paramFuture;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.a.e
 * JD-Core Version:    0.6.0
 */