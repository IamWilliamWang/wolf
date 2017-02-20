package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AProxyFactory;
import com.baidu.tts.aop.IInterceptor;
import com.baidu.tts.aop.IInterceptorHandler;
import com.baidu.tts.o.a.c;
import java.util.ArrayList;
import java.util.List;

public class TtsFactory extends AProxyFactory<ITts>
{
  public IInterceptorHandler createInterceptorHandler()
  {
    TtsInterceptorHandler localTtsInterceptorHandler = new TtsInterceptorHandler();
    localTtsInterceptorHandler.registerMethods();
    return localTtsInterceptorHandler;
  }

  public List<IInterceptor> createInterceptors()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ArgsCheckInterceptor());
    localArrayList.add(new StatisticsInterceptor());
    localArrayList.add(new OfflineAuthNotificationInterceptor());
    localArrayList.add(new CallbackInterceptor());
    return localArrayList;
  }

  public ITts createProxied()
  {
    return new c();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.TtsFactory
 * JD-Core Version:    0.6.0
 */