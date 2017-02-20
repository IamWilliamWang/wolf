package com.baidu.tts.client.model;

public abstract interface OnDownloadListener
{
  public native abstract void onFinish(String paramString, int paramInt);

  public native abstract void onProgress(String paramString, long paramLong1, long paramLong2);

  public native abstract void onStart(String paramString);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.model.OnDownloadListener
 * JD-Core Version:    0.6.0
 */