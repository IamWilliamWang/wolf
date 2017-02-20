package com.baidu.tts.client;

public abstract interface SpeechSynthesizerListener
{
  public native abstract void onError(String paramString, SpeechError paramSpeechError);

  public native abstract void onSpeechFinish(String paramString);

  public native abstract void onSpeechProgressChanged(String paramString, int paramInt);

  public native abstract void onSpeechStart(String paramString);

  public native abstract void onSynthesizeDataArrived(String paramString, byte[] paramArrayOfByte, int paramInt);

  public native abstract void onSynthesizeFinish(String paramString);

  public native abstract void onSynthesizeStart(String paramString);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.SpeechSynthesizerListener
 * JD-Core Version:    0.6.0
 */