package com.baidu.tts.h.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.f.n;

public class b extends a
{
  public b(n paramn)
  {
    super(paramn);
  }

  public int a(TtsError paramTtsError)
  {
    return this.a.b();
  }

  public String b(TtsError paramTtsError)
  {
    int i = paramTtsError.getCode();
    String str = paramTtsError.getMessage();
    Throwable localThrowable = paramTtsError.getThrowable();
    int j = this.a.b();
    paramTtsError = this.a.c();
    Object localObject = "(" + j + ")" + paramTtsError;
    if (str != null)
      paramTtsError = (String)localObject + "[(" + i + ")" + str + "]";
    while (true)
    {
      localObject = paramTtsError;
      if (localThrowable != null)
      {
        localObject = localThrowable.toString();
        localObject = paramTtsError + "[(cause)" + (String)localObject + "]";
      }
      return localObject;
      paramTtsError = (TtsError)localObject;
      if (i == 0)
        continue;
      paramTtsError = (String)localObject + "[(" + i + ")]";
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.h.a.b
 * JD-Core Version:    0.6.0
 */