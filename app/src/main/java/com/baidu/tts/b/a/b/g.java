package com.baidu.tts.b.a.b;

import com.baidu.tts.loopj.AsyncHttpResponseHandler;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public abstract class g extends AsyncHttpResponseHandler
{
  private String a;
  private HttpEntity b;

  String a(HttpEntity paramHttpEntity)
  {
    paramHttpEntity = paramHttpEntity.getContentType();
    if ((paramHttpEntity != null) && ("application/json".equals(paramHttpEntity.getValue())))
      return "application/json";
    return null;
  }

  public native abstract void a(int paramInt, Header[] paramArrayOfHeader, String paramString, HttpEntity paramHttpEntity);

  public native abstract void a(int paramInt, Header[] paramArrayOfHeader, String paramString, HttpEntity paramHttpEntity, Throwable paramThrowable);

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    a(paramInt, paramArrayOfHeader, this.a, this.b, paramThrowable);
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    a(paramInt, paramArrayOfHeader, this.a, this.b);
  }

  public void sendResponseMessage(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine;
    if (!Thread.currentThread().isInterrupted())
    {
      localStatusLine = paramHttpResponse.getStatusLine();
      this.b = paramHttpResponse.getEntity();
      this.a = a(this.b);
      if (!Thread.currentThread().isInterrupted())
      {
        if (localStatusLine.getStatusCode() < 300)
          break label96;
        sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()));
      }
    }
    return;
    label96: sendSuccessMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.g
 * JD-Core Version:    0.6.0
 */