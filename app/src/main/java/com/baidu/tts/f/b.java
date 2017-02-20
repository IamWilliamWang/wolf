package com.baidu.tts.f;

public enum b
{
  private final String d;

  private b(String paramString)
  {
    this.d = paramString;
  }

  public static b a(String paramString)
  {
    b[] arrayOfb = values();
    int j = arrayOfb.length;
    int i = 0;
    while (i < j)
    {
      b localb = arrayOfb[i];
      if (localb.a().equals(paramString))
        return localb;
      i += 1;
    }
    return null;
  }

  public String a()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.f.b
 * JD-Core Version:    0.6.0
 */