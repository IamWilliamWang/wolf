package com.baidu.tts.auth;

import android.content.Context;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.tools.StringTool;

public class b
  implements com.baidu.tts.k.b<b, b.a>
{
  private String a;
  private String b;

  public int a(b paramb)
  {
    String str = paramb.a();
    paramb = paramb.b();
    boolean bool1 = StringTool.isEqual(this.a, str);
    boolean bool2 = StringTool.isEqual(this.b, paramb);
    if ((bool1) && (bool2))
      return 0;
    return 1;
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public b.a c()
  {
    b.a locala = new b.a();
    locala.a(this.b);
    locala.b(this.a);
    if (!locala.g())
    {
      Object localObject = com.baidu.tts.h.b.b.a();
      Context localContext = ((com.baidu.tts.h.b.b)localObject).h();
      localObject = ((com.baidu.tts.h.b.b)localObject).i();
      LoggerProxy.d("OfflineAuth", "+ downloadLicense");
      int i = EmbeddedSynthesizerEngine.bdTTSGetLicense(localContext, this.a, (String)localObject, "0", "", this.b);
      LoggerProxy.d("OfflineAuth", "- downloadLicense ret = " + i);
      locala.a(i);
      if (i < 0)
        locala.a(c.a().a(n.t, i, "appCode=" + this.a + "--licensePath=" + this.b));
    }
    else
    {
      return locala;
    }
    locala.g();
    return (b.a)locala;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.b
 * JD-Core Version:    0.6.0
 */