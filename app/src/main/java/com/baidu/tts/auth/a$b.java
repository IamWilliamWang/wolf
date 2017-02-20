package com.baidu.tts.auth;

import com.baidu.tts.b.a.b.f.b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.concurrent.Callable;

class a$b
  implements Callable<c.a>
{
  private f.b b;

  public a$b(a parama, f.b paramb)
  {
    this.b = paramb;
  }

  public c.a a()
  {
    String str1 = this.b.d();
    String str2 = this.b.a();
    String str3 = this.b.b();
    LoggerProxy.d("AuthClient", "pid=" + str1);
    LoggerProxy.d("AuthClient", "ak=" + str2);
    LoggerProxy.d("AuthClient", "sk=" + str3);
    c localc = new c();
    localc.a(str1);
    localc.b(str2);
    localc.c(str3);
    return (c.a)a.a(this.a).a(localc);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.a.b
 * JD-Core Version:    0.6.0
 */