package com.baidu.tts.chainofresponsibility.logger;

import java.util.Iterator;
import java.util.List;

class d$b
  implements Runnable
{
  private c b;

  public d$b(d paramd, c paramc)
  {
    this.b = paramc;
  }

  public void run()
  {
    Iterator localIterator = d.a(this.a).iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).a(this.b, null, d.f());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.chainofresponsibility.logger.d.b
 * JD-Core Version:    0.6.0
 */