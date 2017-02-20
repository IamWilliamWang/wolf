package com.baidu.tts.aop;

import java.util.List;

public abstract interface IProxyFactory<T>
{
  public native abstract IInterceptorHandler createInterceptorHandler();

  public native abstract List<IInterceptor> createInterceptors();

  public native abstract T createProxied();

  public native abstract T makeProxy();
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.IProxyFactory
 * JD-Core Version:    0.6.0
 */