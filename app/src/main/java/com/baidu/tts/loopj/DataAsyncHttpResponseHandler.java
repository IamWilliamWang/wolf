package com.baidu.tts.loopj;

import B;
import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "DataAsyncHttpRH";
  protected static final int PROGRESS_DATA_MESSAGE = 7;

  public static byte[] copyOfRange(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException();
    int i = paramArrayOfByte.length;
    if ((paramInt1 < 0) || (paramInt1 > i))
      throw new ArrayIndexOutOfBoundsException();
    paramInt2 -= paramInt1;
    i = Math.min(paramInt2, i - paramInt1);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }

  byte[] getResponseData(HttpEntity paramHttpEntity)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramHttpEntity != null)
    {
      InputStream localInputStream = paramHttpEntity.getContent();
      localObject1 = localObject2;
      if (localInputStream != null)
      {
        long l2 = paramHttpEntity.getContentLength();
        if (l2 > 2147483647L)
          throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        long l1 = l2;
        if (l2 < 0L)
          l1 = 4096L;
        try
        {
          paramHttpEntity = new ByteArrayBuffer((int)l1);
          try
          {
            localObject1 = new byte[4096];
            while (true)
            {
              int i = localInputStream.read(localObject1);
              if ((i == -1) || (Thread.currentThread().isInterrupted()))
                break;
              paramHttpEntity.append(localObject1, 0, i);
              sendProgressDataMessage(copyOfRange(localObject1, 0, i));
              sendProgressMessage(0, l1);
            }
          }
          finally
          {
            AsyncHttpClient.silentCloseInputStream(localInputStream);
          }
        }
        catch (java.lang.OutOfMemoryError paramHttpEntity)
        {
          System.gc();
          throw new IOException("File too large to fit into available memory");
        }
        AsyncHttpClient.silentCloseInputStream(localInputStream);
        localObject1 = paramHttpEntity.toByteArray();
      }
    }
    return (B)localObject1;
  }

  protected void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      return;
    case 7:
    }
    paramMessage = (Object[])(Object[])paramMessage.obj;
    if ((paramMessage != null) && (paramMessage.length >= 1))
      try
      {
        onProgressData((byte[])(byte[])paramMessage[0]);
        return;
      }
      catch (java.lang.Throwable paramMessage)
      {
        AsyncHttpClient.log.e("DataAsyncHttpRH", "custom onProgressData contains an error", paramMessage);
        return;
      }
    AsyncHttpClient.log.e("DataAsyncHttpRH", "PROGRESS_DATA_MESSAGE didn't got enough params");
  }

  public void onProgressData(byte[] paramArrayOfByte)
  {
    AsyncHttpClient.log.d("DataAsyncHttpRH", "onProgressData(byte[]) was not overriden, but callback was received");
  }

  public final void sendProgressDataMessage(byte[] paramArrayOfByte)
  {
    sendMessage(obtainMessage(7, new Object[] { paramArrayOfByte }));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.DataAsyncHttpResponseHandler
 * JD-Core Version:    0.6.0
 */