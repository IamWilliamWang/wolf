package com.baidu.tts.tools;

import java.lang.reflect.Method;

public class ReflectTool
{
  public static Method getSupportedMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    if (paramClass == null)
      throw new NoSuchMethodException();
    try
    {
      Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    return getSupportedMethod(paramClass.getSuperclass(), paramString, paramArrayOfClass);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.tools.ReflectTool
 * JD-Core Version:    0.6.0
 */