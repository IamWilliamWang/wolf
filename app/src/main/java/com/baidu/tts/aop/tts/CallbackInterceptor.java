package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.aop.IProxyFactory;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.aop.ttslistener.TtsListenerFactory;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;
import java.util.List;

public class CallbackInterceptor extends AInterceptor
{
  protected Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    LoggerProxy.d("CallbackInterceptor", "method=" + paramMethod.getName());
    paramArrayOfObject[0] = ((TtsListener)new TtsListenerFactory((TtsListener)paramArrayOfObject[0]).makeProxy());
    return AInterceptorHandler.DEFAULT;
  }

  protected void a()
  {
    this.a.add("setTtsListener");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.CallbackInterceptor
 * JD-Core Version:    0.6.0
 */