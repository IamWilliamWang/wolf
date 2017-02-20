package com.baidu.tts.d;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.d.b.d;
import com.baidu.tts.f.n;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

public class c$a
  implements Callable<a>
{
  private DownloadHandler b;

  public c$a(c paramc, DownloadHandler paramDownloadHandler)
  {
    this.b = paramDownloadHandler;
  }

  public a a()
  {
    a locala = new a();
    Object localObject2 = c.a(this.a).e();
    Object localObject1 = this.b.getModelId();
    d locald = c.b(this.a).b((String)localObject1);
    Object localObject4;
    Object localObject5;
    Object localObject6;
    try
    {
      locald.c(this.b);
      if (!locald.a((com.baidu.tts.database.a)localObject2))
      {
        localObject3 = new Conditions();
        ((Conditions)localObject3).appendId((String)localObject1);
        localObject3 = (ModelBags)c.a(this.a).a((Conditions)localObject3).get();
        if ((localObject3 == null) || (((ModelBags)localObject3).isEmpty()))
        {
          localObject2 = com.baidu.tts.h.a.c.a().a(n.ah, "modelId=" + (String)localObject1);
          locald.a(this.b, (TtsError)localObject2);
          return locala;
        }
        locald.a((ModelBags)localObject3, (com.baidu.tts.database.a)localObject2);
      }
      localObject3 = locald.f();
      if (DataTool.isSetEmpty((Set)localObject3))
      {
        localObject2 = com.baidu.tts.h.a.c.a().a(n.ae, "modelId=" + (String)localObject1);
        locald.a(this.b, (TtsError)localObject2);
        return locala;
      }
      localObject3 = ((Set)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        localObject5 = c.b(this.a).c((String)localObject4);
        if (((com.baidu.tts.d.b.c)localObject5).a((com.baidu.tts.database.a)localObject2))
          continue;
        localObject6 = new HashSet();
        ((Set)localObject6).add(localObject4);
        localObject6 = (ModelFileBags)c.a(this.a).a((Set)localObject6).get();
        if ((localObject6 == null) || (((ModelFileBags)localObject6).isEmpty()))
        {
          localObject2 = com.baidu.tts.h.a.c.a().a(n.ai, "fileId=" + (String)localObject4);
          locald.a(this.b, (TtsError)localObject2);
          return locala;
        }
        ((ModelFileBags)localObject6).generateAbsPath(c.a(this.a).d());
        ((com.baidu.tts.d.b.c)localObject5).a((ModelFileBags)localObject6, (com.baidu.tts.database.a)localObject2);
      }
    }
    catch (Exception localException)
    {
      LoggerProxy.d("Downloader", "exception=" + localException.toString());
      localObject1 = com.baidu.tts.h.a.c.a().a(n.aj, "modelId=" + (String)localObject1);
      locald.a(this.b, (TtsError)localObject1);
      return locala;
    }
    locald.d();
    Object localObject3 = locald.b();
    TtsError localTtsError;
    if (DataTool.isSetEmpty((Set)localObject3))
    {
      localTtsError = com.baidu.tts.h.a.c.a().a(n.af, "modelId=" + (String)localObject1);
      locald.a(this.b, localTtsError);
      return locala;
    }
    localObject3 = ((Set)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject6 = (String)((Iterator)localObject3).next();
      if (StringTool.isEmpty((String)localObject6))
        continue;
      localObject4 = c.b(this.a).a((String)localObject6);
      ((com.baidu.tts.d.b.b)localObject4).a((String)localObject1);
      boolean bool = ((com.baidu.tts.d.b.b)localObject4).a(localTtsError);
      localObject5 = ((com.baidu.tts.d.b.b)localObject4).c();
      LoggerProxy.d("Downloader", "isNeedDownload=" + bool + "--fileId=" + (String)localObject5);
      if (bool)
      {
        if (((com.baidu.tts.d.b.b)localObject4).e())
          ((com.baidu.tts.d.b.b)localObject4).f();
        localObject6 = new com.baidu.tts.d.a.c();
        ((com.baidu.tts.d.a.c)localObject6).a((com.baidu.tts.d.b.b)localObject4);
        if (Thread.currentThread().isInterrupted())
          return null;
        LoggerProxy.d("Downloader", "before download fileId=" + (String)localObject5);
        ((com.baidu.tts.d.b.b)localObject4).a(c.c(this.a).a((com.baidu.tts.d.a.c)localObject6));
        locala.a(true);
        continue;
      }
      locala.a((String)localObject6, ((com.baidu.tts.d.b.b)localObject4).d());
    }
    if ((!locala.a()) && (locala.b()))
    {
      this.b.updateProgress(locald);
      localTtsError = com.baidu.tts.h.a.c.a().a(n.ag, "modelId=" + (String)localObject1);
      locald.a(this.b, localTtsError);
    }
    return (a)(a)(a)(a)(a)(a)locala;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.c.a
 * JD-Core Version:    0.6.0
 */