package com.baidu.tts.loopj;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class HttpPatch extends HttpEntityEnclosingRequestBase
{
  public static final String METHOD_NAME = "PATCH";

  public HttpPatch()
  {
  }

  public HttpPatch(String paramString)
  {
    setURI(URI.create(paramString));
  }

  public HttpPatch(URI paramURI)
  {
    setURI(paramURI);
  }

  public String getMethod()
  {
    return "PATCH";
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.HttpPatch
 * JD-Core Version:    0.6.0
 */