package com.baidu.tts.a.c;

import android.util.Log;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.b.a.a.d;
import com.baidu.tts.b.b.a.c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.j;

public class b
  implements a
{
  private d a;
  private c b;
  private TtsListener c;
  private com.baidu.tts.b.a.b d;
  private com.baidu.tts.b.b.a e;
  private com.baidu.tts.b.a.b f;

  public b(d paramd, c paramc, j paramj)
  {
    this.a = paramd;
    this.b = paramc;
  }

  private boolean a(h paramh)
  {
    paramh = paramh.e();
    if (paramh == null)
      return false;
    return com.baidu.tts.f.i.a(paramh.g());
  }

  public int a(float paramFloat1, float paramFloat2)
  {
    return this.b.a(paramFloat1, paramFloat2);
  }

  public int a(e parame)
  {
    return this.a.a(parame);
  }

  public int a(f paramf)
  {
    return this.a.a(paramf);
  }

  public int a(g paramg)
  {
    return this.a.a(paramg);
  }

  public c a()
  {
    return this.b;
  }

  public void a(TtsListener paramTtsListener)
  {
    this.c = paramTtsListener;
    a(this.a);
    a(this.b);
  }

  protected void a(d paramd)
  {
    if (this.d == null)
      this.d = new com.baidu.tts.b.a.b()
      {
        public void a(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onSynthesizeStart(paramh);
        }

        public void b(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onSynthesizeFinished(paramh);
        }

        public void c(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onSynthesizeDataArrived(paramh);
        }

        public void d(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onError(paramh);
        }

        public void e(h paramh)
        {
          LoggerProxy.d("TtsAdapter", "onSynthesizeStop");
        }
      };
    paramd.a(this.d);
  }

  protected void a(c paramc)
  {
    if (this.e == null)
      this.e = new com.baidu.tts.b.b.a()
      {
        public void a(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onPlayStart(paramh);
        }

        public void b(h paramh)
        {
          if (b.a(b.this) != null)
            b.a(b.this).onPlayProgressUpdate(paramh);
        }

        public void c(h paramh)
        {
          if (b.a(b.this) != null);
          try
          {
            b.a(b.this).onPlayFinished(paramh);
            return;
          }
          catch (Exception paramh)
          {
            Log.e("TtsAdapter", "onPlayFinished exception e=" + paramh.toString());
          }
        }
      };
    paramc.a(this.e);
  }

  public void a(com.baidu.tts.m.i parami)
  {
    this.a.a(parami);
  }

  public int b(e parame)
  {
    return this.a.b(parame);
  }

  public TtsError b()
  {
    TtsError localTtsError = this.a.b();
    this.b.b();
    g();
    return localTtsError;
  }

  public void b(com.baidu.tts.m.i parami)
  {
    this.b.o();
    this.a.a(parami);
  }

  public void c()
  {
    this.a.c();
    this.b.c();
  }

  public void d()
  {
    this.a.d();
    this.b.d();
  }

  public void e()
  {
    LoggerProxy.d("TtsAdapter", "before engine stop");
    this.a.e();
    LoggerProxy.d("TtsAdapter", "after engine stop");
    this.b.e();
    LoggerProxy.d("TtsAdapter", "after play stop");
  }

  public void f()
  {
    LoggerProxy.d("TtsAdapter", "before engine destroy");
    this.a.f();
    LoggerProxy.d("TtsAdapter", "after engine destroy");
    this.b.f();
    LoggerProxy.d("TtsAdapter", "after player destroy");
  }

  protected void g()
  {
    this.f = new com.baidu.tts.b.a.b()
    {
      public void a(h paramh)
      {
      }

      public void b(h paramh)
      {
      }

      public void c(h paramh)
      {
        if (b.a(b.this, paramh))
          b.b(b.this).a(paramh);
      }

      public void d(h paramh)
      {
      }

      public void e(h paramh)
      {
      }
    };
    this.a.a(this.f);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.a.c.b
 * JD-Core Version:    0.6.0
 */