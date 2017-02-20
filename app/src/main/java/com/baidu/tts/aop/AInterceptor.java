package com.baidu.tts.aop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class AInterceptor
  implements IInterceptor
{
  protected List<String> a = new ArrayList();

  public AInterceptor()
  {
    a();
  }

  private boolean a(String paramString)
  {
    return this.a.contains(paramString);
  }

  protected native abstract Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);

  protected native abstract void a();

  public Object after(Object paramObject1, Method paramMethod, Object[] paramArrayOfObject, Object paramObject2)
  {
    return AInterceptorHandler.DEFAULT;
  }

  public Object before(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (a(paramMethod.getName()))
      return a(paramObject, paramMethod, paramArrayOfObject);
    return AInterceptorHandler.DEFAULT;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.AInterceptor
 * JD-Core Version:    0.6.0
 */