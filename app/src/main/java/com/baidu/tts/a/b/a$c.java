package com.baidu.tts.a.b;

import com.baidu.tts.aop.tts.ITts;
import java.util.concurrent.Callable;

class a$c
  implements Callable<Void>
{
  private String b;
  private String c;

  public a$c(a parama, String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }

  public Void a()
  {
    com.baidu.tts.m.i locali = new com.baidu.tts.m.i(this.b, this.c);
    locali.a(com.baidu.tts.f.i.a);
    a.a(this.a).synthesize(locali);
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.a.b.a.c
 * JD-Core Version:    0.6.0
 */