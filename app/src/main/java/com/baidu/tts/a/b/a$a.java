package com.baidu.tts.a.b;

import android.text.TextUtils;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.client.SpeechSynthesizeBag;
import java.util.List;
import java.util.concurrent.Callable;

class a$a
  implements Callable<Void>
{
  List<SpeechSynthesizeBag> a;

  public a$a(List<SpeechSynthesizeBag> paramList)
  {
    Object localObject;
    this.a = localObject;
  }

  public Void a()
  {
    if (this.a != null)
    {
      int j = this.a.size();
      if (j > 0)
      {
        int i = 0;
        while (i < j)
        {
          SpeechSynthesizeBag localSpeechSynthesizeBag = (SpeechSynthesizeBag)this.a.get(i);
          if (localSpeechSynthesizeBag != null)
          {
            String str2 = localSpeechSynthesizeBag.getText();
            String str1 = localSpeechSynthesizeBag.getUtteranceId();
            Object localObject = str1;
            if (TextUtils.isEmpty(str1))
            {
              localObject = String.valueOf(i);
              localSpeechSynthesizeBag.setUtteranceId((String)localObject);
            }
            if (Thread.currentThread().isInterrupted())
              break;
            localObject = new com.baidu.tts.m.i(str2, (String)localObject);
            ((com.baidu.tts.m.i)localObject).a(com.baidu.tts.f.i.b);
            a.a(this.b).speak((com.baidu.tts.m.i)localObject);
          }
          i += 1;
        }
      }
    }
    return (Void)null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.a.b.a.a
 * JD-Core Version:    0.6.0
 */