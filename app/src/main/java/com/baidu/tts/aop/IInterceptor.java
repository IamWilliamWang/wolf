package com.baidu.tts.aop;

import java.lang.reflect.Method;

public abstract interface IInterceptor
{
  public native abstract Object after(Object paramObject1, Method paramMethod, Object[] paramArrayOfObject, Object paramObject2);

  public native abstract Object before(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.IInterceptor
 * JD-Core Version:    0.6.0
 */