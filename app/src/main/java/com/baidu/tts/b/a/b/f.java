package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.c.a;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.h.b.b;
import com.baidu.tts.m.e;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.StringTool;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class f extends a
{
  private f.b b;

  private h a(int paramInt, f.c paramc, i parami)
  {
    h localh = h.b(parami);
    Object localObject = (f.b)this.b.y();
    paramc = new f.a(this, paramInt, paramc, parami, (f.b)localObject, localh);
    parami = new FutureTask(paramc);
    new Thread(parami).start();
    long l = ((f.b)localObject).o();
    try
    {
      localObject = (h)parami.get(l, TimeUnit.MILLISECONDS);
      return localObject;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      parami.cancel(true);
      paramc.b();
      throw localInterruptedException;
    }
    catch (ExecutionException paramc)
    {
      localInterruptedException.a(c.a().a(n.n, paramc.getCause()));
      return localInterruptedException;
    }
    catch (TimeoutException localTimeoutException)
    {
      LoggerProxy.d("OnlineSynthesizer", "startOnceHttpRequest timeout");
      parami.cancel(true);
      paramc.b();
      localInterruptedException.a(c.a().a(n.o, localTimeoutException));
    }
    return (h)localInterruptedException;
  }

  private HttpEntity a(int paramInt, String paramString, i parami, f.b paramb)
  {
    if (paramb == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.W.a(), String.valueOf(paramInt)));
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.V.a(), paramString));
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.B.b(), "Android"));
    Object localObject = b.a();
    paramString = ((b)localObject).j();
    localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.aa.a(), paramString));
    String str = paramb.d();
    if (!StringTool.isEmpty(str))
      localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.N.a(), str));
    parami.c(paramb.p());
    paramString = parami.d();
    if (paramInt == 1);
    try
    {
      parami = URLEncoder.encode(parami.c(), paramString);
      localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.X.a(), parami));
      parami = ((b)localObject).a(com.baidu.tts.f.g.Y.a());
      localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.Y.a(), parami));
      parami = ((b)localObject).i();
      if (parami != null)
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.Z.a(), parami));
      if (StringTool.isEmpty(str))
      {
        LoggerProxy.d("OnlineSynthesizer", "before online auth");
        parami = com.baidu.tts.auth.a.a().a(paramb);
        LoggerProxy.d("OnlineSynthesizer", "after online auth");
        if (parami.g())
        {
          parami = parami.a();
          localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ai.a(), parami));
        }
      }
      else
      {
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.G.a(), paramb.q()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.I.a(), paramb.c()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.J.a(), paramb.e()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.K.a(), paramb.f()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ab.a(), paramb.g()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ac.a(), paramb.h()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.L.a(), paramb.i()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.M.a(), paramb.j()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ad.a(), paramb.k()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.ae.a(), paramb.l()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.F.a(), paramb.r()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.C.a(), paramb.s()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.E.a(), paramb.t()));
        localArrayList.add(new BasicNameValuePair(com.baidu.tts.f.g.D.a(), paramb.u()));
        try
        {
          parami = new StringBuffer();
          paramb = localArrayList.iterator();
          while (paramb.hasNext())
          {
            localObject = (NameValuePair)paramb.next();
            parami.append(((NameValuePair)localObject).getName());
            parami.append("=");
            parami.append(((NameValuePair)localObject).getValue());
            parami.append(",");
          }
        }
        catch (UnsupportedEncodingException paramString)
        {
          paramString.printStackTrace();
          paramString = null;
        }
        return paramString;
      }
      throw new com.baidu.tts.p.a();
    }
    catch (UnsupportedEncodingException parami)
    {
      while (true)
      {
        parami.printStackTrace();
        continue;
        LoggerProxy.d("OnlineSynthesizer", "request params: " + parami);
        paramString = new UrlEncodedFormEntity(localArrayList, paramString);
      }
    }
  }

  public int a(e parame)
  {
    return n.k.b();
  }

  public int a(com.baidu.tts.m.f paramf)
  {
    return n.k.b();
  }

  public int a(com.baidu.tts.m.g paramg)
  {
    return n.k.b();
  }

  public TtsError a(i parami)
  {
    try
    {
      parami = new f.d(this, parami).a();
      return parami;
    }
    catch (InterruptedException parami)
    {
      throw parami;
    }
    catch (java.lang.Exception parami)
    {
    }
    return c.a().a(n.j, parami);
  }

  public <OnlineSynthesizerParams> void a(OnlineSynthesizerParams paramOnlineSynthesizerParams)
  {
    this.b = ((f.b)paramOnlineSynthesizerParams);
  }

  public int b(e parame)
  {
    return n.k.b();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.f
 * JD-Core Version:    0.6.0
 */