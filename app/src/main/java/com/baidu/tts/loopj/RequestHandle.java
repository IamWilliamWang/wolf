package com.baidu.tts.loopj;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class RequestHandle
{
  private final WeakReference<AsyncHttpRequest> request;

  public RequestHandle(AsyncHttpRequest paramAsyncHttpRequest)
  {
    this.request = new WeakReference(paramAsyncHttpRequest);
  }

  public boolean cancel(boolean paramBoolean)
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    if (localAsyncHttpRequest != null)
    {
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        new Thread(new Runnable(localAsyncHttpRequest, paramBoolean)
        {
          public void run()
          {
            this.val$_request.cancel(this.val$mayInterruptIfRunning);
          }
        }).start();
        return true;
      }
      return localAsyncHttpRequest.cancel(paramBoolean);
    }
    return false;
  }

  public Object getTag()
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    if (localAsyncHttpRequest == null)
      return null;
    return localAsyncHttpRequest.getTag();
  }

  public boolean isCancelled()
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    return (localAsyncHttpRequest == null) || (localAsyncHttpRequest.isCancelled());
  }

  public boolean isFinished()
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    return (localAsyncHttpRequest == null) || (localAsyncHttpRequest.isDone());
  }

  public RequestHandle setTag(Object paramObject)
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    if (localAsyncHttpRequest != null)
      localAsyncHttpRequest.setRequestTag(paramObject);
    return this;
  }

  public boolean shouldBeGarbageCollected()
  {
    if ((isCancelled()) || (isFinished()));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.request.clear();
      return i;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.RequestHandle
 * JD-Core Version:    0.6.0
 */