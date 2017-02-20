package com.baidu.tts.loopj;

import java.io.InputStream;

public class RequestParams$StreamWrapper
{
  public final boolean autoClose;
  public final String contentType;
  public final InputStream inputStream;
  public final String name;

  public RequestParams$StreamWrapper(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.inputStream = paramInputStream;
    this.name = paramString1;
    this.contentType = paramString2;
    this.autoClose = paramBoolean;
  }

  static StreamWrapper newInstance(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = paramString2;
    if (paramString2 == null)
      str = "application/octet-stream";
    return new StreamWrapper(paramInputStream, paramString1, str, paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.RequestParams.StreamWrapper
 * JD-Core Version:    0.6.0
 */