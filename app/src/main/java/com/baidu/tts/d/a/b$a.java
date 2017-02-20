package com.baidu.tts.d.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.l.a;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.tools.FileTools;
import com.baidu.tts.tools.StringTool;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.Header;

public class b$a
  implements Callable<Void>
{
  private c b;
  private SyncHttpClient c;

  public b$a(b paramb, c paramc)
  {
    this.b = paramc;
  }

  public Void a()
  {
    this.b.d();
    Object localObject1 = this.b.a();
    LoggerProxy.d("DownloadEngine", "DownloadWork start fileId=" + (String)localObject1);
    if (StringTool.isEmpty((String)localObject1))
    {
      localObject1 = com.baidu.tts.h.a.c.a().a(n.ac, "fileId is null");
      this.b.a((TtsError)localObject1);
    }
    while (true)
    {
      LoggerProxy.d("DownloadEngine", "DownloadWork end");
      return null;
      Object localObject2 = new HashSet();
      ((Set)localObject2).add(localObject1);
      localObject2 = (ModelFileBags)b.a(this.a).a((Set)localObject2).get();
      if (localObject2 != null)
      {
        localObject2 = ((ModelFileBags)localObject2).getUrl(0);
        if (localObject2 != null)
        {
          this.c = new SyncHttpClient();
          this.c.setURLEncodingEnabled(false);
          this.c.setTimeout(l.a.b());
          this.c.setMaxRetriesAndTimeout(5, 1500);
          1 local1 = new g(FileTools.getFile(this.b.b()), this.b, (String)localObject1)
          {
            public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, File paramFile)
            {
              LoggerProxy.d("DownloadEngine", "1isInterrupted=" + Thread.currentThread().isInterrupted());
              if (b.a.this.a.C())
                super.onFailure(paramInt, paramArrayOfHeader, paramThrowable, paramFile);
            }

            public void onProgress(long paramLong1, long paramLong2)
            {
              if (b.a.this.a.C())
                super.onProgress(paramLong1, paramLong2);
            }

            public void onSuccess(int paramInt, Header[] paramArrayOfHeader, File paramFile)
            {
              LoggerProxy.d("DownloadEngine", "2isInterrupted=" + Thread.currentThread().isInterrupted() + "--fileId=" + this.a);
              if (b.a.this.a.C())
                super.onSuccess(paramInt, paramArrayOfHeader, paramFile);
            }
          };
          local1.setUseSynchronousMode(true);
          LoggerProxy.d("DownloadEngine", "before get fileId=" + (String)localObject1);
          this.c.get((String)localObject2, local1);
          continue;
        }
        localObject1 = com.baidu.tts.h.a.c.a().a(n.ac, "url is null");
        this.b.a((TtsError)localObject1);
        continue;
      }
      localObject1 = com.baidu.tts.h.a.c.a().a(n.ac, "urlbags is null");
      this.b.a((TtsError)localObject1);
    }
  }

  public void b()
  {
    if (this.c != null)
      this.c.stop();
  }

  public c c()
  {
    return this.b;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.a.b.a
 * JD-Core Version:    0.6.0
 */