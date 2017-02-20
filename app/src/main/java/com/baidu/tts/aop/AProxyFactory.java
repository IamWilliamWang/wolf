package com.baidu.tts.aop;

import java.util.List;

public abstract class AProxyFactory<T>
  implements IProxyFactory<T>
{
  public T makeProxy()
  {
    Object localObject2 = createProxied();
    IInterceptorHandler localIInterceptorHandler = createInterceptorHandler();
    List localList = createInterceptors();
    Object localObject1 = localObject2;
    if (localIInterceptorHandler != null)
    {
      localObject1 = localObject2;
      if (localList != null)
        localObject1 = localIInterceptorHandler.bind(localObject2, localList);
    }
    return localObject1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.AProxyFactory
 * JD-Core Version:    0.6.0
 */