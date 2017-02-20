package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;
import java.util.List;

public class StatisticsInterceptor extends AInterceptor
{
  protected Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    LoggerProxy.d("StatisticsInterceptor", "statistics");
    return AInterceptorHandler.DEFAULT;
  }

  protected void a()
  {
    this.a.add("speak");
    this.a.add("synthesize");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.StatisticsInterceptor
 * JD-Core Version:    0.6.0
 */