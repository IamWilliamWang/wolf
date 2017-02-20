package com.baidu.tts.d;

import com.baidu.tts.client.model.OnDownloadListener;
import com.baidu.tts.tools.StringTool;

public class b
{
  private String a;
  private OnDownloadListener b;

  public String a()
  {
    return this.a;
  }

  public void a(OnDownloadListener paramOnDownloadListener)
  {
    this.b = paramOnDownloadListener;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public boolean b()
  {
    return !StringTool.isEmpty(this.a);
  }

  public OnDownloadListener c()
  {
    return this.b;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.d.b
 * JD-Core Version:    0.6.0
 */