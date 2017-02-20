package com.baidu.tts.c;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class a$a
  implements RejectedExecutionHandler
{
  public void rejectedExecution(Runnable paramRunnable, ThreadPoolExecutor paramThreadPoolExecutor)
  {
    LoggerProxy.d("LimitQueueThreadPoolExecutor", "rejectedExecution");
    if (!paramThreadPoolExecutor.isShutdown());
    try
    {
      paramThreadPoolExecutor.getQueue().put(paramRunnable);
      return;
    }
    catch (java.lang.InterruptedException paramRunnable)
    {
      Thread.currentThread().interrupt();
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.c.a.a
 * JD-Core Version:    0.6.0
 */