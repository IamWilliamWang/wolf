package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import java.util.List;

public class LoggerProxy
{
  private static d a = d.a();

  public static void a(String paramString1, String paramString2)
  {
    log(7, paramString1, paramString2);
  }

  public static void addPrintString(String paramString)
  {
    a.a(paramString);
  }

  public static void addPrintStrings(List<String> paramList)
  {
    a.a(paramList);
  }

  public static void addUnPrintString(String paramString)
  {
    a.b(paramString);
  }

  public static void clearHandler()
  {
    a.b();
  }

  public static void clearSpecifyStrings()
  {
    a.c();
  }

  public static void d(String paramString1, String paramString2)
  {
    log(3, paramString1, paramString2);
  }

  public static void e(String paramString1, String paramString2)
  {
    log(6, paramString1, paramString2);
  }

  public static void i(String paramString1, String paramString2)
  {
    log(4, paramString1, paramString2);
  }

  public static boolean isModeRelease()
  {
    return a.e();
  }

  public static void log(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      a.a(paramInt, paramString1, paramString2);
      return;
    }
    catch (Exception paramString1)
    {
      Log.e("LoggerProxy", "log exception=" + paramString1.toString());
    }
  }

  public static void printable(boolean paramBoolean)
  {
    a.a(paramBoolean);
  }

  public static void setModeRelease()
  {
    a.d();
  }

  public static void v(String paramString1, String paramString2)
  {
    log(2, paramString1, paramString2);
  }

  public static void w(String paramString1, String paramString2)
  {
    log(5, paramString1, paramString2);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.chainofresponsibility.logger.LoggerProxy
 * JD-Core Version:    0.6.0
 */