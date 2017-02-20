package com.baidu.tts.loopj;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpGet extends HttpEntityEnclosingRequestBase
{
  public static final String METHOD_NAME = "GET";

  public HttpGet()
  {
  }

  public HttpGet(String paramString)
  {
    setURI(URI.create(paramString));
  }

  public HttpGet(URI paramURI)
  {
    setURI(paramURI);
  }

  public String getMethod()
  {
    return "GET";
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.HttpGet
 * JD-Core Version:    0.6.0
 */