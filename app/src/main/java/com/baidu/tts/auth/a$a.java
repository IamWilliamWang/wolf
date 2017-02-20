package com.baidu.tts.auth;

import com.baidu.tts.b.a.b.e.b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.tools.StringTool;
import java.util.concurrent.Callable;

class a$a
  implements Callable<b.a>
{
  private e.b b;

  public a$a(a parama, e.b paramb)
  {
    this.b = paramb;
  }

  public b.a a()
  {
    Object localObject1 = new b.a();
    com.baidu.tts.h.b.a locala = com.baidu.tts.h.b.b.a().g();
    if (locala == null)
    {
      ((b.a)localObject1).a(com.baidu.tts.h.a.c.a().b(n.Z));
      return localObject1;
    }
    String str = this.b.h();
    Object localObject2 = this.b.g();
    localObject1 = localObject2;
    if (StringTool.isEmpty((String)localObject2))
      localObject1 = locala.b();
    LoggerProxy.d("AuthClient", "appCode=" + str);
    LoggerProxy.d("AuthClient", "licenseFilePath=" + (String)localObject1);
    localObject2 = new b();
    ((b)localObject2).a(str);
    ((b)localObject2).b((String)localObject1);
    return (b.a)(b.a)(b.a)a.b(this.a).a((com.baidu.tts.k.b)localObject2);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.a.a
 * JD-Core Version:    0.6.0
 */