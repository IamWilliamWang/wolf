package com.baidu.tts.loopj;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.protocol.HttpContext;

class RetryHandler
  implements HttpRequestRetryHandler
{
  private static final HashSet<Class<?>> exceptionBlacklist;
  private static final HashSet<Class<?>> exceptionWhitelist = new HashSet();
  private final int maxRetries;
  private final int retrySleepTimeMS;

  static
  {
    exceptionBlacklist = new HashSet();
    exceptionWhitelist.add(NoHttpResponseException.class);
    exceptionWhitelist.add(UnknownHostException.class);
    exceptionWhitelist.add(SocketException.class);
    exceptionWhitelist.add(ConnectTimeoutException.class);
    exceptionWhitelist.add(SocketTimeoutException.class);
    exceptionBlacklist.add(InterruptedIOException.class);
    exceptionBlacklist.add(SSLException.class);
  }

  public RetryHandler(int paramInt1, int paramInt2)
  {
    this.maxRetries = paramInt1;
    this.retrySleepTimeMS = paramInt2;
  }

  static void addClassToBlacklist(Class<?> paramClass)
  {
    exceptionBlacklist.add(paramClass);
  }

  static void addClassToWhitelist(Class<?> paramClass)
  {
    exceptionWhitelist.add(paramClass);
  }

  protected boolean isInList(HashSet<Class<?>> paramHashSet, Throwable paramThrowable)
  {
    paramHashSet = paramHashSet.iterator();
    while (paramHashSet.hasNext())
      if (((Class)paramHashSet.next()).isInstance(paramThrowable))
        return true;
    return false;
  }

  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    int k = 1;
    paramHttpContext = (Boolean)paramHttpContext.getAttribute("http.request_sent");
    int i;
    int j;
    if ((paramHttpContext != null) && (paramHttpContext.booleanValue()))
    {
      i = 1;
      if (paramInt <= this.maxRetries)
        break label62;
      j = 0;
    }
    while (true)
    {
      if (j == 0)
        break label110;
      SystemClock.sleep(this.retrySleepTimeMS);
      return j;
      i = 0;
      break;
      label62: j = k;
      if (isInList(exceptionWhitelist, paramIOException))
        continue;
      if (isInList(exceptionBlacklist, paramIOException))
      {
        j = 0;
        continue;
      }
      j = k;
      if (i != 0)
        continue;
      j = k;
    }
    label110: paramIOException.printStackTrace();
    return j;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.RetryHandler
 * JD-Core Version:    0.6.0
 */