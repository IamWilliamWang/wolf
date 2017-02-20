package com.baidu.tts.aop.ttslistener;

import com.baidu.tts.aop.AProxyFactory;
import com.baidu.tts.aop.IInterceptor;
import com.baidu.tts.aop.IInterceptorHandler;
import java.util.ArrayList;
import java.util.List;

public class TtsListenerFactory extends AProxyFactory<TtsListener>
{
  private TtsListener a;

  public TtsListenerFactory(TtsListener paramTtsListener)
  {
    this.a = paramTtsListener;
  }

  public IInterceptorHandler createInterceptorHandler()
  {
    TtsListenerInterceptorHandler localTtsListenerInterceptorHandler = new TtsListenerInterceptorHandler();
    localTtsListenerInterceptorHandler.registerMethods();
    return localTtsListenerInterceptorHandler;
  }

  public List<IInterceptor> createInterceptors()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ProgressCorrectInterceptor());
    return localArrayList;
  }

  public TtsListener createProxied()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.ttslistener.TtsListenerFactory
 * JD-Core Version:    0.6.0
 */