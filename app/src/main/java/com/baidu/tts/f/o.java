package com.baidu.tts.f;

import java.net.InetAddress;

public enum o
{
  private final String c;

  private o(String paramString)
  {
    this.c = paramString;
  }

  public static String a(String paramString)
  {
    try
    {
      paramString = InetAddress.getByName(paramString).getHostAddress();
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }

  public String a()
  {
    return this.c;
  }

  public native abstract String b();
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.f.o
 * JD-Core Version:    0.6.0
 */