package com.baidu.tts.aop.ttslistener;

import com.baidu.tts.aop.AInterceptorHandler;

public class TtsListenerInterceptorHandler extends AInterceptorHandler
{
  public void registerMethods()
  {
    registerMethod("onSynthesizeDataArrived");
    registerMethod("onPlayProgressUpdate");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.ttslistener.TtsListenerInterceptorHandler
 * JD-Core Version:    0.6.0
 */