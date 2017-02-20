package com.baidu.tts.loopj;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AsyncHttpResponseHandler$ResponderHandler extends Handler
{
  private final AsyncHttpResponseHandler mResponder;

  AsyncHttpResponseHandler$ResponderHandler(AsyncHttpResponseHandler paramAsyncHttpResponseHandler, Looper paramLooper)
  {
    super(paramLooper);
    this.mResponder = paramAsyncHttpResponseHandler;
  }

  public void handleMessage(Message paramMessage)
  {
    this.mResponder.handleMessage(paramMessage);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.AsyncHttpResponseHandler.ResponderHandler
 * JD-Core Version:    0.6.0
 */