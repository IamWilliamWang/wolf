package com.baidu.tts.aop;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public abstract class AInterceptorHandler
  implements IInterceptorHandler
{
  public static final Object DEFAULT = Integer.valueOf(0);
  public static final Object END = Integer.valueOf(1);
  protected List<IInterceptor> a;
  protected Object b;
  protected List<String> c = new ArrayList();

  protected Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject = DEFAULT;
    int j = this.a.size();
    int i = 0;
    while (true)
    {
      if (i < j)
      {
        localObject = ((IInterceptor)this.a.get(i)).before(paramObject, paramMethod, paramArrayOfObject);
        if (!localObject.equals(END));
      }
      else
      {
        return localObject;
      }
      i += 1;
    }
  }

  protected Object a(Object paramObject1, Method paramMethod, Object[] paramArrayOfObject, Object paramObject2)
  {
    Object localObject = DEFAULT;
    int i = this.a.size();
    i -= 1;
    while (i >= 0)
    {
      localObject = ((IInterceptor)this.a.get(i)).after(paramObject1, paramMethod, paramArrayOfObject, paramObject2);
      i -= 1;
    }
    return localObject;
  }

  public Object bind(Object paramObject, List<IInterceptor> paramList)
  {
    this.b = paramObject;
    this.a = paramList;
    paramObject = this.b.getClass();
    paramObject = Proxy.newProxyInstance(paramObject.getClassLoader(), paramObject.getInterfaces(), this);
    LoggerProxy.d("AInterceptorHandler", "proxy=" + paramObject);
    return paramObject;
  }

  public boolean canIntercept(String paramString)
  {
    return this.c.contains(paramString);
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (canIntercept(paramMethod.getName()))
    {
      if (a(this.b, paramMethod, paramArrayOfObject).equals(END))
        return null;
      paramObject = paramMethod.invoke(this.b, paramArrayOfObject);
      paramMethod = a(this.b, paramMethod, paramArrayOfObject, paramObject);
      LoggerProxy.d("AInterceptorHandler", "afterResult=" + paramMethod);
      return paramObject;
    }
    return paramMethod.invoke(this.b, paramArrayOfObject);
  }

  public void registerMethod(String paramString)
  {
    if (paramString != null)
      this.c.add(paramString);
  }

  public void unregisterMethod(String paramString)
  {
    if (paramString != null)
      this.c.remove(paramString);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.AInterceptorHandler
 * JD-Core Version:    0.6.0
 */