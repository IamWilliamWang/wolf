package com.baidu.tts.i.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.Iterator;

public class b
  implements Iterator<a>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;

  private int d()
  {
    return this.a + this.b - 1;
  }

  private int e()
  {
    return this.d + this.c - 1;
  }

  public void a()
  {
    this.a = 0;
    this.b = 0;
    this.d = 0;
    this.e = 0;
    this.f = 0;
  }

  public void a(int paramInt)
  {
    this.c = paramInt;
  }

  public void b()
  {
  }

  public void b(int paramInt)
  {
    this.b += paramInt;
    this.f = 0;
  }

  public a c()
  {
    a locala = new a();
    int i = e();
    if (i <= d())
    {
      int j = i - this.e + 1;
      locala.a(this.f);
      locala.b(j);
      this.e = (i + 1);
      this.d = this.e;
      this.f += j;
      float f1 = this.d / this.b;
      LoggerProxy.d("UtteranceSubpackager", "mCurrentProgressStartIndex=" + this.d + "--mCurrentAllUtteranceLenght=" + this.b + "--percent=" + f1);
      locala.a(f1);
      locala.a(true);
      return locala;
    }
    i = this.b - this.e;
    locala.a(this.f);
    locala.b(i);
    this.e += i;
    this.f = (i + this.f);
    return locala;
  }

  public boolean hasNext()
  {
    return this.e < d();
  }

  public void remove()
  {
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.i.a.b
 * JD-Core Version:    0.6.0
 */