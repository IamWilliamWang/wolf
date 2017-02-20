package com.baidu.tts.aop.ttslistener;

import com.baidu.tts.m.h;

public abstract interface TtsListener
{
  public native abstract void onError(h paramh);

  public native abstract void onPlayFinished(h paramh);

  public native abstract void onPlayProgressUpdate(h paramh);

  public native abstract void onPlayStart(h paramh);

  public native abstract void onSynthesizeDataArrived(h paramh);

  public native abstract void onSynthesizeFinished(h paramh);

  public native abstract void onSynthesizeStart(h paramh);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.ttslistener.TtsListener
 * JD-Core Version:    0.6.0
 */