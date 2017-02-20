package com.baidu.tts.g.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.ThreadFactory;

public class a
  implements ThreadFactory
{
  private String a;
  private int b;

  public a(String paramString)
  {
    this.a = paramString;
  }

  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    this.b += 1;
    String str = this.a + "(" + this.b + ")";
    paramRunnable.setName(str);
    LoggerProxy.d("NameThreadFactory", "threadName=" + str);
    return paramRunnable;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.g.a.a
 * JD-Core Version:    0.6.0
 */