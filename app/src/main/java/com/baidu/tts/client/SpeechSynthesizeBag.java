package com.baidu.tts.client;

import com.baidu.tts.f.n;
import com.baidu.tts.tools.ResourceTools;

public class SpeechSynthesizeBag
{
  private String a;
  private String b;

  public String getText()
  {
    return this.a;
  }

  public String getUtteranceId()
  {
    return this.b;
  }

  public int setText(String paramString)
  {
    n localn = ResourceTools.isTextValid(paramString);
    if (localn == null)
    {
      this.a = paramString;
      return 0;
    }
    return localn.b();
  }

  public void setUtteranceId(String paramString)
  {
    this.b = paramString;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.SpeechSynthesizeBag
 * JD-Core Version:    0.6.0
 */