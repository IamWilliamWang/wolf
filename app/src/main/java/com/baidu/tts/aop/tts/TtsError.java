package com.baidu.tts.aop.tts;

import com.baidu.tts.f.n;
import com.baidu.tts.h.a.b;

public class TtsError
{
  private Throwable a;
  private int b;
  private String c;
  private b d;

  public int getCode()
  {
    return this.b;
  }

  public int getDetailCode()
  {
    if (this.d != null)
      return this.d.a(this);
    return this.b;
  }

  public String getDetailMessage()
  {
    if (this.d != null)
      return this.d.b(this);
    if (this.c != null)
      return this.c;
    return "TtsErrorFlyweight is null";
  }

  public n getErrorEnum()
  {
    if (this.d == null)
      return null;
    return this.d.a();
  }

  public String getMessage()
  {
    return this.c;
  }

  public Throwable getThrowable()
  {
    return this.a;
  }

  public b getTtsErrorFlyweight()
  {
    return this.d;
  }

  public void setCode(int paramInt)
  {
    this.b = paramInt;
  }

  public void setMessage(String paramString)
  {
    this.c = paramString;
  }

  public void setThrowable(Throwable paramThrowable)
  {
    this.a = paramThrowable;
  }

  public void setTtsErrorFlyweight(b paramb)
  {
    this.d = paramb;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.TtsError
 * JD-Core Version:    0.6.0
 */