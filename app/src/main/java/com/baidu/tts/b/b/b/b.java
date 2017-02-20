package com.baidu.tts.b.b.b;

import android.media.AudioTrack;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.h;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b extends a
{
  protected final Lock b = new ReentrantLock();
  protected final Condition c = this.b.newCondition();
  private volatile AudioTrack d;
  private b.a e;
  private com.baidu.tts.i.a.b f = new com.baidu.tts.i.a.b();
  private boolean g = false;
  private int h;

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 2;
    int j = AudioTrack.getMinBufferSize(paramInt1, paramInt2, paramInt3) * 2;
    switch (paramInt2)
    {
    default:
      paramInt1 = Integer.bitCount(paramInt2);
    case 1:
    case 2:
    case 4:
    case 3:
    case 12:
    }
    while (true)
    {
      paramInt2 = i;
      if (paramInt3 == 3)
        paramInt2 = 1;
      if ((j % (paramInt2 * paramInt1) == 0) && (j >= 1))
        break;
      return 5120;
      paramInt1 = 1;
      continue;
      paramInt1 = 2;
    }
    return j;
  }

  private int b(int paramInt)
  {
    if (paramInt > this.h)
      this.h = paramInt;
    return this.h;
  }

  private void b(h paramh)
  {
    this.f.a(h());
    this.f.a();
    this.h = 0;
    d(paramh);
  }

  private void c(h paramh)
  {
    this.f.b();
    f(paramh);
  }

  private void d(h paramh)
  {
    if (this.a != null)
      this.a.a(paramh);
  }

  private void e(h paramh)
  {
    if (this.a != null)
      this.a.b(paramh);
  }

  private void f(h paramh)
  {
    if (this.a != null)
      this.a.c(paramh);
  }

  private void g()
  {
    try
    {
      this.b.lock();
      this.c.signalAll();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    finally
    {
      this.b.unlock();
    }
    throw localObject;
  }

  private int h()
  {
    int i = this.e.h();
    return this.e.a() * 2 / i;
  }

  public int a(float paramFloat1, float paramFloat2)
  {
    int i = this.d.setStereoVolume(paramFloat1, paramFloat2);
    this.e.a(paramFloat1);
    this.e.b(paramFloat2);
    return i;
  }

  public int a(int paramInt)
  {
    if (paramInt != this.e.g())
    {
      int i = this.e.a();
      int j = this.e.b();
      int k = this.e.c();
      int m = this.e.d();
      this.d = new AudioTrack(paramInt, i, j, k, a(i, j, k), m);
      this.e.a(paramInt);
      float f1 = this.e.e();
      float f2 = this.e.f();
      this.d.setStereoVolume(f1, f2);
      this.d.play();
    }
    return 0;
  }

  public TtsError a()
  {
    int i = this.e.a();
    int j = this.e.b();
    int k = this.e.c();
    int m = this.e.g();
    int n = this.e.d();
    this.d = new AudioTrack(m, i, j, k, a(i, j, k), n);
    float f1 = this.e.e();
    float f2 = this.e.f();
    this.d.setStereoVolume(f1, f2);
    return null;
  }

  public TtsError a(h paramh)
  {
    LoggerProxy.d("AudioTrackPlayer", "enter put");
    if (paramh != null)
    {
      int j = paramh.b();
      if ((j == 1) || (j == -1))
        b(paramh);
      Object localObject1 = paramh.d();
      if (localObject1 != null)
        this.f.b(localObject1.length);
      int i;
      while (this.f.hasNext())
      {
        Object localObject2 = this.f.c();
        i = 0;
        int k = ((com.baidu.tts.i.a.a)localObject2).a();
        int m = ((com.baidu.tts.i.a.a)localObject2).b();
        while ((i < m) && (this.d.getPlayState() != 1))
        {
          LoggerProxy.d("AudioTrackPlayer", "before write");
          int n = this.d.write(localObject1, i + k, m - i);
          LoggerProxy.d("AudioTrackPlayer", "writtenbytes=" + n + "--offset=" + i + "--dataLength=" + m);
          while (this.g)
            try
            {
              this.b.lock();
              LoggerProxy.d("AudioTrackPlayer", "await before" + System.currentTimeMillis());
              this.c.await();
              LoggerProxy.d("AudioTrackPlayer", "await after" + System.currentTimeMillis());
              this.b.unlock();
              continue;
            }
            catch (Exception localException)
            {
              localException.printStackTrace();
              this.b.unlock();
              continue;
            }
            finally
            {
              this.b.unlock();
            }
          i = n + i;
        }
        if (this.d.getPlayState() == 1)
          return null;
        if (!((com.baidu.tts.i.a.a)localObject2).c())
          continue;
        i = paramh.c();
        float f1 = ((com.baidu.tts.i.a.a)localObject2).d();
        i = Math.round(i * f1);
        k = b(i);
        LoggerProxy.d("AudioTrackPlayer", "percent=" + f1 + "--currentProgress=" + i + "--progress=" + k);
        localObject2 = (h)paramh.y();
        ((h)localObject2).c(k);
        e((h)localObject2);
      }
      if (j < 0)
      {
        i = paramh.c();
        localObject1 = (h)paramh.y();
        ((h)localObject1).c(i);
        e((h)localObject1);
        c(paramh);
      }
    }
    while (true)
    {
      LoggerProxy.d("AudioTrackPlayer", "end put");
      return null;
      LoggerProxy.d("AudioTrackPlayer", "put responseBag=null");
    }
  }

  public void a(com.baidu.tts.b.b.a parama)
  {
    this.a = parama;
  }

  public <AudioTrackPlayerParams> void a(AudioTrackPlayerParams paramAudioTrackPlayerParams)
  {
    this.e = ((b.a)paramAudioTrackPlayerParams);
  }

  public void b()
  {
    this.d.play();
  }

  public void c()
  {
    this.g = true;
    this.d.pause();
  }

  public void d()
  {
    this.g = false;
    this.d.play();
    g();
  }

  public void e()
  {
    if (this.g)
    {
      this.g = false;
      g();
    }
    this.d.pause();
    this.d.flush();
    this.d.stop();
  }

  public TtsError f()
  {
    e();
    this.d.release();
    this.d = null;
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.b.b.b
 * JD-Core Version:    0.6.0
 */