package com.baidu.tts.client.model;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.d.b;
import com.baidu.tts.d.b.d;
import java.util.concurrent.Future;

public class DownloadHandler
{
  public static final int DOWNLOAD_SUCCESS = 0;
  private b a;
  private Future<com.baidu.tts.d.a> b;
  private TtsError c;
  private com.baidu.tts.d.b.a d = com.baidu.tts.d.b.a.a();
  private volatile boolean e = false;

  private OnDownloadListener a()
  {
    return this.a.c();
  }

  private void a(String paramString)
  {
    OnDownloadListener localOnDownloadListener = a();
    if (localOnDownloadListener != null)
    {
      monitorenter;
      try
      {
        if (!this.e)
          localOnDownloadListener.onStart(paramString);
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  private void a(String paramString, int paramInt)
  {
    OnDownloadListener localOnDownloadListener = a();
    if (localOnDownloadListener != null)
    {
      monitorenter;
      try
      {
        if (!this.e)
        {
          localOnDownloadListener.onFinish(paramString, paramInt);
          this.a.a(null);
        }
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  private void a(String paramString, long paramLong1, long paramLong2)
  {
    OnDownloadListener localOnDownloadListener = a();
    if (localOnDownloadListener != null)
    {
      monitorenter;
      try
      {
        if (!this.e)
          localOnDownloadListener.onProgress(paramString, paramLong1, paramLong2);
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  public b getDownloadParams()
  {
    return this.a;
  }

  public int getErrorCode()
  {
    return getErrorCode(this.c);
  }

  public int getErrorCode(TtsError paramTtsError)
  {
    if (paramTtsError != null)
      return paramTtsError.getDetailCode();
    return 0;
  }

  public String getErrorMessage()
  {
    return getErrorMessage(this.c);
  }

  public String getErrorMessage(TtsError paramTtsError)
  {
    if (paramTtsError != null)
      return paramTtsError.getDetailMessage();
    return null;
  }

  public String getModelId()
  {
    return this.a.a();
  }

  public TtsError getTtsError()
  {
    return this.c;
  }

  public void reset()
  {
    monitorenter;
    try
    {
      LoggerProxy.d("DownloadHandler", "reset");
      this.e = false;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void reset(b paramb)
  {
    setDownloadParams(paramb);
    reset();
  }

  public void setCheckFuture(Future<com.baidu.tts.d.a> paramFuture)
  {
    this.b = paramFuture;
  }

  public void setDownloadParams(b paramb)
  {
    this.a = paramb;
  }

  public void setTtsError(TtsError paramTtsError)
  {
    this.c = paramTtsError;
  }

  public void stop()
  {
    monitorenter;
    try
    {
      LoggerProxy.d("DownloadHandler", "stop");
      this.e = true;
      if (this.b != null)
      {
        this.b.cancel(true);
        this.b = null;
      }
      this.d.a(this);
      this.a.a(null);
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void updateFinish(d paramd, TtsError paramTtsError)
  {
    updateFinish(paramd.g(), paramTtsError);
  }

  public void updateFinish(String paramString, TtsError paramTtsError)
  {
    setTtsError(paramTtsError);
    a(paramString, getErrorCode());
  }

  public void updateProgress(d paramd)
  {
    long l1 = paramd.h();
    long l2 = paramd.c();
    a(paramd.g(), l1, l2);
  }

  public void updateStart(d paramd)
  {
    a(paramd.g());
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.model.DownloadHandler
 * JD-Core Version:    0.6.0
 */