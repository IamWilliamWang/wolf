package com.baidu.tts.f;

public enum d
{
  private final String f;
  private final String g;

  private d(String paramString1, String paramString2)
  {
    this.f = paramString1;
    this.g = paramString2;
  }

  public static d a(String paramString)
  {
    d[] arrayOfd = values();
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      d locald = arrayOfd[i];
      if (locald.b().equals(paramString))
        return locald;
      i += 1;
    }
    return null;
  }

  public String a()
  {
    return this.f;
  }

  public String b()
  {
    return this.g;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.f.d
 * JD-Core Version:    0.6.0
 */