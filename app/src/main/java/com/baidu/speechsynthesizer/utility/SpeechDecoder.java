package com.baidu.speechsynthesizer.utility;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;

public class SpeechDecoder
{
  static
  {
    try
    {
      LoggerProxy.d("SpeechDecoder", "before load gnustl_shared");
      System.loadLibrary("gnustl_shared");
    }
    catch (Throwable localThrowable2)
    {
      try
      {
        while (true)
        {
          LoggerProxy.d("SpeechDecoder", "before load BDSpeechDecoder_V1");
          System.loadLibrary("BDSpeechDecoder_V1");
          LoggerProxy.d("SpeechDecoder", "after load BDSpeechDecoder_V1");
          return;
          localThrowable1 = localThrowable1;
          LoggerProxy.e("SpeechDecoder", "so file gnustl_shared load fail");
        }
      }
      catch (Throwable localThrowable2)
      {
        LoggerProxy.e("SpeechDecoder", "so file BDSpeechDecoder_V1 load fail");
      }
    }
  }

  public native int decode(byte[] paramArrayOfByte, int paramInt1, short[] paramArrayOfShort, int[] paramArrayOfInt, int paramInt2, int paramInt3);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.speechsynthesizer.utility.SpeechDecoder
 * JD-Core Version:    0.6.0
 */