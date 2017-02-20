package com.baidu.tts.auth;

import android.content.Context;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.k.a;
import com.baidu.tts.tools.StringTool;
import java.io.File;

public class b$a
  implements a
{
  private int a;
  private int b = -1;
  private String c;
  private String d;
  private TtsError e;

  public int a()
  {
    if (this.a >= 1000)
      return this.a - 1000;
    return 0;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public void a(TtsError paramTtsError)
  {
    if (paramTtsError != null)
      LoggerProxy.d("OfflineAuth", "this=" + this + "--error=" + paramTtsError.getDetailMessage());
    this.e = paramTtsError;
  }

  public void a(String paramString)
  {
    this.c = paramString;
  }

  public TtsError b()
  {
    return this.e;
  }

  public void b(String paramString)
  {
    this.d = paramString;
  }

  public String c()
  {
    if (e())
      return "valid official";
    if (d())
      return "valid temp";
    switch (this.a)
    {
    case -9:
    default:
      return "not a valid result";
    case -2:
      return "package name unmatched";
    case -3:
      return "sign or appcode unmatched";
    case -4:
      return "cuid unmatched";
    case -5:
      return "official license expired";
    case -6:
      return "will expire after a month";
    case -7:
      return "platform unmatched";
    case -8:
      return "license not exist or invalid license";
    case -10:
    }
    return "temp license expired";
  }

  public boolean d()
  {
    return this.a >= 1000;
  }

  public boolean e()
  {
    return (this.a >= 0) && (this.a < 1000);
  }

  public boolean f()
  {
    return (this.a == -5) || (this.a == -6);
  }

  public boolean g()
  {
    if (StringTool.isEmpty(this.c));
    File localFile;
    do
    {
      return false;
      localFile = new File(this.c);
    }
    while (!localFile.exists());
    Object localObject = com.baidu.tts.h.b.b.a();
    Context localContext = ((com.baidu.tts.h.b.b)localObject).h();
    localObject = ((com.baidu.tts.h.b.b)localObject).i();
    byte[] arrayOfByte = new byte[32];
    this.a = EmbeddedSynthesizerEngine.bdTTSVerifyLicense(localContext, this.d, (String)localObject, this.c, arrayOfByte);
    LoggerProxy.d("OfflineAuth", "verify result=" + this.a);
    if (arrayOfByte != null)
    {
      localObject = new String(arrayOfByte);
      LoggerProxy.d("OfflineAuth", "get appIdStr=" + (String)localObject);
    }
    try
    {
      int i = ((String)localObject).indexOf("end");
      if (i != -1)
        new com.baidu.tts.e.b(localContext, ((String)localObject).substring(0, i)).start();
      if (this.a < 0)
      {
        boolean bool = localFile.delete();
        LoggerProxy.d("OfflineAuth", "isDelete=" + bool);
        return false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        LoggerProxy.d("OfflineAuth", "embedded statistics start exception=" + localException.toString());
    }
    return true;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.b.a
 * JD-Core Version:    0.6.0
 */