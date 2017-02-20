package com.baidu.tts.loopj;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpDelete extends HttpEntityEnclosingRequestBase
{
  public static final String METHOD_NAME = "DELETE";

  public HttpDelete()
  {
  }

  public HttpDelete(String paramString)
  {
    setURI(URI.create(paramString));
  }

  public HttpDelete(URI paramURI)
  {
    setURI(paramURI);
  }

  public String getMethod()
  {
    return "DELETE";
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.HttpDelete
 * JD-Core Version:    0.6.0
 */