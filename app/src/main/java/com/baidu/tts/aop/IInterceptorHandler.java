package com.baidu.tts.aop;

import java.lang.reflect.InvocationHandler;
import java.util.List;

public abstract interface IInterceptorHandler extends InvocationHandler
{
  public native abstract Object bind(Object paramObject, List<IInterceptor> paramList);

  public native abstract boolean canIntercept(String paramString);

  public native abstract void registerMethod(String paramString);

  public native abstract void registerMethods();

  public native abstract void unregisterMethod(String paramString);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.IInterceptorHandler
 * JD-Core Version:    0.6.0
 */