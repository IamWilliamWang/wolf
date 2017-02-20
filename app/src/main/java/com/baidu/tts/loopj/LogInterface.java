package com.baidu.tts.loopj;

public abstract interface LogInterface
{
  public static final int DEBUG = 3;
  public static final int ERROR = 6;
  public static final int INFO = 4;
  public static final int VERBOSE = 2;
  public static final int WARN = 5;
  public static final int WTF = 8;

  public native abstract void d(String paramString1, String paramString2);

  public native abstract void d(String paramString1, String paramString2, Throwable paramThrowable);

  public native abstract void e(String paramString1, String paramString2);

  public native abstract void e(String paramString1, String paramString2, Throwable paramThrowable);

  public native abstract int getLoggingLevel();

  public native abstract void i(String paramString1, String paramString2);

  public native abstract void i(String paramString1, String paramString2, Throwable paramThrowable);

  public native abstract boolean isLoggingEnabled();

  public native abstract void setLoggingEnabled(boolean paramBoolean);

  public native abstract void setLoggingLevel(int paramInt);

  public native abstract boolean shouldLog(int paramInt);

  public native abstract void v(String paramString1, String paramString2);

  public native abstract void v(String paramString1, String paramString2, Throwable paramThrowable);

  public native abstract void w(String paramString1, String paramString2);

  public native abstract void w(String paramString1, String paramString2, Throwable paramThrowable);

  public native abstract void wtf(String paramString1, String paramString2);

  public native abstract void wtf(String paramString1, String paramString2, Throwable paramThrowable);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.LogInterface
 * JD-Core Version:    0.6.0
 */