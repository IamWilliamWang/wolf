package com.baidu.tts.loopj;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public abstract interface ResponseHandlerInterface
{
  public native abstract Header[] getRequestHeaders();

  public native abstract URI getRequestURI();

  public native abstract Object getTag();

  public native abstract boolean getUsePoolThread();

  public native abstract boolean getUseSynchronousMode();

  public native abstract void onPostProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, HttpResponse paramHttpResponse);

  public native abstract void onPreProcessResponse(ResponseHandlerInterface paramResponseHandlerInterface, HttpResponse paramHttpResponse);

  public native abstract void sendCancelMessage();

  public native abstract void sendFailureMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);

  public native abstract void sendFinishMessage();

  public native abstract void sendProgressMessage(long paramLong1, long paramLong2);

  public native abstract void sendResponseMessage(HttpResponse paramHttpResponse);

  public native abstract void sendRetryMessage(int paramInt);

  public native abstract void sendStartMessage();

  public native abstract void sendSuccessMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte);

  public native abstract void setRequestHeaders(Header[] paramArrayOfHeader);

  public native abstract void setRequestURI(URI paramURI);

  public native abstract void setTag(Object paramObject);

  public native abstract void setUsePoolThread(boolean paramBoolean);

  public native abstract void setUseSynchronousMode(boolean paramBoolean);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.ResponseHandlerInterface
 * JD-Core Version:    0.6.0
 */