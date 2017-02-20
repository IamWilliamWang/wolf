package com.baidu.tts.b.b;

import com.baidu.tts.b.b.b.c;

public class b
{
  private static volatile b a = null;

  public static b a()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new b();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private com.baidu.tts.b.b.b.b c()
  {
    return new com.baidu.tts.b.b.b.b();
  }

  public c b()
  {
    return c();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.b.b
 * JD-Core Version:    0.6.0
 */