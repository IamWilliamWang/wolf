package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.k.a;
import com.baidu.tts.tools.StringTool;

public class c$a
  implements a
{
  private String a;
  private String b;
  private long c;
  private TtsError d;

  public String a()
  {
    return this.b;
  }

  public void a(long paramLong)
  {
    this.c = paramLong;
  }

  public void a(TtsError paramTtsError)
  {
    if (paramTtsError != null)
      LoggerProxy.d("OnlineAuth", "this=" + this + "--error=" + paramTtsError.getDetailMessage());
    this.d = paramTtsError;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public TtsError b()
  {
    return this.d;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public boolean g()
  {
    if (StringTool.isEmpty(this.a))
    {
      if (this.b == null);
      do
        return false;
      while (System.currentTimeMillis() >= this.c);
      return true;
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.c.a
 * JD-Core Version:    0.6.0
 */