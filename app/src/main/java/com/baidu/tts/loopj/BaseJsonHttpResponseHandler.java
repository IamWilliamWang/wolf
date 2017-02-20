package com.baidu.tts.loopj;

import org.apache.http.Header;

public abstract class BaseJsonHttpResponseHandler<JSON_TYPE> extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "BaseJsonHttpRH";

  public BaseJsonHttpResponseHandler()
  {
    this("UTF-8");
  }

  public BaseJsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }

  public final void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
  {
    if (paramString != null)
    {
      paramArrayOfHeader = new Runnable(paramString, paramInt, paramArrayOfHeader, paramThrowable)
      {
        public void run()
        {
          try
          {
            Object localObject = BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, true);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable(localObject)
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, this.val$jsonResponse);
              }
            });
            return;
          }
          catch (Throwable localThrowable)
          {
            AsyncHttpClient.log.d("BaseJsonHttpRH", "parseResponse thrown an problem", localThrowable);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable()
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.2.this.val$statusCode, BaseJsonHttpResponseHandler.2.this.val$headers, BaseJsonHttpResponseHandler.2.this.val$throwable, BaseJsonHttpResponseHandler.2.this.val$responseString, null);
              }
            });
          }
        }
      };
      if ((!getUseSynchronousMode()) && (!getUsePoolThread()))
      {
        new Thread(paramArrayOfHeader).start();
        return;
      }
      paramArrayOfHeader.run();
      return;
    }
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, null, null);
  }

  public native abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, String paramString, JSON_TYPE paramJSON_TYPE);

  public final void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
  {
    if (paramInt != 204)
    {
      paramArrayOfHeader = new Runnable(paramString, paramInt, paramArrayOfHeader)
      {
        public void run()
        {
          try
          {
            Object localObject = BaseJsonHttpResponseHandler.this.parseResponse(this.val$responseString, false);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable(localObject)
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onSuccess(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, BaseJsonHttpResponseHandler.1.this.val$responseString, this.val$jsonResponse);
              }
            });
            return;
          }
          catch (Throwable localThrowable)
          {
            AsyncHttpClient.log.d("BaseJsonHttpRH", "parseResponse thrown an problem", localThrowable);
            BaseJsonHttpResponseHandler.this.postRunnable(new Runnable(localThrowable)
            {
              public void run()
              {
                BaseJsonHttpResponseHandler.this.onFailure(BaseJsonHttpResponseHandler.1.this.val$statusCode, BaseJsonHttpResponseHandler.1.this.val$headers, this.val$t, BaseJsonHttpResponseHandler.1.this.val$responseString, null);
              }
            });
          }
        }
      };
      if ((!getUseSynchronousMode()) && (!getUsePoolThread()))
      {
        new Thread(paramArrayOfHeader).start();
        return;
      }
      paramArrayOfHeader.run();
      return;
    }
    onSuccess(paramInt, paramArrayOfHeader, null, null);
  }

  public native abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString, JSON_TYPE paramJSON_TYPE);

  protected native abstract JSON_TYPE parseResponse(String paramString, boolean paramBoolean);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.BaseJsonHttpResponseHandler
 * JD-Core Version:    0.6.0
 */