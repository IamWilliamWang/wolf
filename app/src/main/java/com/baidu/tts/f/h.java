package com.baidu.tts.f;

public enum h
{
  private final String c;
  private final String d;

  private h(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }

  public static h a(String paramString)
  {
    h[] arrayOfh = values();
    int j = arrayOfh.length;
    int i = 0;
    while (i < j)
    {
      h localh = arrayOfh[i];
      if (localh.a().equalsIgnoreCase(paramString))
        return localh;
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
 * Qualified Name:     com.baidu.tts.f.h
 * JD-Core Version:    0.6.0
 */