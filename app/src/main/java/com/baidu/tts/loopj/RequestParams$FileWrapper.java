package com.baidu.tts.loopj;

import java.io.File;
import java.io.Serializable;

public class RequestParams$FileWrapper
  implements Serializable
{
  public final String contentType;
  public final String customFileName;
  public final File file;

  public RequestParams$FileWrapper(File paramFile, String paramString1, String paramString2)
  {
    this.file = paramFile;
    this.contentType = paramString1;
    this.customFileName = paramString2;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.RequestParams.FileWrapper
 * JD-Core Version:    0.6.0
 */