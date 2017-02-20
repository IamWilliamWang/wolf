package com.baidu.tts.loopj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class RangeFileAsyncHttpResponseHandler extends FileAsyncHttpResponseHandler
{
  private static final String LOG_TAG = "RangeFileAsyncHttpRH";
  private boolean append = false;
  private long current = 0L;

  public RangeFileAsyncHttpResponseHandler(File paramFile)
  {
    super(paramFile);
  }

  protected byte[] getResponseData(HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      long l = paramHttpEntity.getContentLength() + this.current;
      paramHttpEntity = new FileOutputStream(getTargetFile(), this.append);
      if (localInputStream != null)
      {
        try
        {
          byte[] arrayOfByte = new byte[4096];
          while (this.current < l)
          {
            int i = localInputStream.read(arrayOfByte);
            if ((i == -1) || (Thread.currentThread().isInterrupted()))
              break;
            this.current += i;
            paramHttpEntity.write(arrayOfByte, 0, i);
            sendProgressMessage(this.current, l);
          }
        }
        finally
        {
          localInputStream.close();
          paramHttpEntity.flush();
          paramHttpEntity.close();
        }
        localInputStream.close();
        paramHttpEntity.flush();
        paramHttpEntity.close();
      }
    }
    return null;
  }

  public void sendResponseMessage(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine;
    if (!Thread.currentThread().isInterrupted())
    {
      localStatusLine = paramHttpResponse.getStatusLine();
      if (localStatusLine.getStatusCode() != 416)
        break label55;
      if (!Thread.currentThread().isInterrupted())
        sendSuccessMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null);
    }
    label55: 
    do
      while (true)
      {
        return;
        if (localStatusLine.getStatusCode() < 300)
          break;
        if (Thread.currentThread().isInterrupted())
          continue;
        sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()));
        return;
      }
    while (Thread.currentThread().isInterrupted());
    Header localHeader = paramHttpResponse.getFirstHeader("Content-Range");
    if (localHeader == null)
    {
      this.append = false;
      this.current = 0L;
    }
    while (true)
    {
      sendSuccessMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), getResponseData(paramHttpResponse.getEntity()));
      return;
      AsyncHttpClient.log.v("RangeFileAsyncHttpRH", "Content-Range: " + localHeader.getValue());
    }
  }

  public void updateRequestHeaders(HttpUriRequest paramHttpUriRequest)
  {
    if ((this.file.exists()) && (this.file.canWrite()))
      this.current = this.file.length();
    if (this.current > 0L)
    {
      this.append = true;
      paramHttpUriRequest.setHeader("Range", "bytes=" + this.current + "-");
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.RangeFileAsyncHttpResponseHandler
 * JD-Core Version:    0.6.0
 */