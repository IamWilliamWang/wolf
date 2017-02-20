package com.baidu.tts.loopj;

import org.apache.http.Header;

public abstract class TextHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "TextHttpRH";

  public TextHttpResponseHandler()
  {
    this("UTF-8");
  }

  public TextHttpResponseHandler(String paramString)
  {
    setCharset(paramString);
  }

  public static String getResponseString(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null)
      paramArrayOfByte = null;
    while (paramArrayOfByte != null)
      try
      {
        if (!paramArrayOfByte.startsWith("﻿"))
          break;
        return paramArrayOfByte.substring(1);
        paramArrayOfByte = new String(paramArrayOfByte, paramString);
      }
      catch (java.io.UnsupportedEncodingException paramArrayOfByte)
      {
        AsyncHttpClient.log.e("TextHttpRH", "Encoding response into string failed", paramArrayOfByte);
        return null;
      }
    return paramArrayOfByte;
  }

  public native abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable);

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    onFailure(paramInt, paramArrayOfHeader, getResponseString(paramArrayOfByte, getCharset()), paramThrowable);
  }

  public native abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString);

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    onSuccess(paramInt, paramArrayOfHeader, getResponseString(paramArrayOfByte, getCharset()));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.TextHttpResponseHandler
 * JD-Core Version:    0.6.0
 */