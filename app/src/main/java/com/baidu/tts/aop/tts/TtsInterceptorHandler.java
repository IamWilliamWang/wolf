package com.baidu.tts.aop.tts;

import com.baidu.tts.aop.AInterceptorHandler;

public class TtsInterceptorHandler extends AInterceptorHandler
{
  public void registerMethods()
  {
    registerMethod("speak");
    registerMethod("synthesize");
    registerMethod("setTtsListener");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.TtsInterceptorHandler
 * JD-Core Version:    0.6.0
 */