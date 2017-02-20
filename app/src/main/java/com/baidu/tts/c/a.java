package com.baidu.tts.c;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class a extends ThreadPoolExecutor
{
  public a(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory, RejectedExecutionHandler paramRejectedExecutionHandler)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue, paramThreadFactory, paramRejectedExecutionHandler);
  }

  public a(int paramInt, String paramString)
  {
    this(paramInt, paramString, new a.a());
  }

  public a(int paramInt, String paramString, RejectedExecutionHandler paramRejectedExecutionHandler)
  {
    this(paramInt, new com.baidu.tts.g.a.a(paramString), paramRejectedExecutionHandler);
  }

  public a(int paramInt, ThreadFactory paramThreadFactory, RejectedExecutionHandler paramRejectedExecutionHandler)
  {
    this(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(paramInt), paramThreadFactory, paramRejectedExecutionHandler);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.c.a
 * JD-Core Version:    0.6.0
 */