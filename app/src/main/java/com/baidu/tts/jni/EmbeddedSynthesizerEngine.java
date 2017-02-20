package com.baidu.tts.jni;

import android.content.Context;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;

public class EmbeddedSynthesizerEngine
{
  private static final String TAG = "EmbeddedSynthesizerEngine";
  private static EmbeddedSynthesizerEngine.OnNewDataListener mNewDataListener = null;

  static
  {
    try
    {
      LoggerProxy.d("EmbeddedSynthesizerEngine", "before load gnustl_shared");
      System.loadLibrary("gnustl_shared");
    }
    catch (Throwable localThrowable4)
    {
      try
      {
        LoggerProxy.d("EmbeddedSynthesizerEngine", "before load BDSpeechDecoder_V1");
        System.loadLibrary("BDSpeechDecoder_V1");
      }
      catch (Throwable localThrowable4)
      {
        try
        {
          LoggerProxy.d("EmbeddedSynthesizerEngine", "before load bd_etts");
          System.loadLibrary("bd_etts");
        }
        catch (Throwable localThrowable4)
        {
          try
          {
            while (true)
            {
              LoggerProxy.d("EmbeddedSynthesizerEngine", "before load bdtts");
              System.loadLibrary("bdtts");
              LoggerProxy.d("EmbeddedSynthesizerEngine", "after load bdtts");
              return;
              localThrowable1 = localThrowable1;
              LoggerProxy.e("EmbeddedSynthesizerEngine", "so file gnustl_shared load fail");
              continue;
              localThrowable2 = localThrowable2;
              LoggerProxy.e("EmbeddedSynthesizerEngine", "so file BDSpeechDecoder_V1 load fail");
              continue;
              localThrowable3 = localThrowable3;
              LoggerProxy.e("EmbeddedSynthesizerEngine", "so file bd_etts load fail");
            }
          }
          catch (Throwable localThrowable4)
          {
            LoggerProxy.e("EmbeddedSynthesizerEngine", "so file bdtts load fail");
          }
        }
      }
    }
  }

  public static native int bdTTSDomainDataInit(byte[] paramArrayOfByte, long paramLong);

  public static native int bdTTSDomainDataUninit(long paramLong);

  public static native int bdTTSEngineInit(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long[] paramArrayOfLong);

  public static native int bdTTSEngineUninit(long paramLong);

  public static native String bdTTSGetDatParam(String paramString);

  public static native int bdTTSGetDataFileParam(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2);

  public static synchronized native String bdTTSGetEngineParam();

  public static native int bdTTSGetLicense(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  public static native int bdTTSGetTestAuthorize();

  public static native int bdTTSReInitData(byte[] paramArrayOfByte, long paramLong);

  public static native int bdTTSSetParam(long paramLong1, int paramInt, long paramLong2);

  public static native int bdTTSSetParamFloat(long paramLong, int paramInt, float paramFloat);

  public static native int bdTTSSetText(long paramLong, byte[] paramArrayOfByte, int paramInt);

  public static synchronized native int bdTTSSynthesis(long paramLong, byte[] paramArrayOfByte, int paramInt);

  public static native int bdTTSVerifyDataFile(byte[] paramArrayOfByte);

  public static synchronized native int bdTTSVerifyLicense(Context paramContext, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte);

  public static native int getEngineMinVersion();

  public static native int loadEnglishEngine(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong);

  public static int newAudioDataCallback(byte[] paramArrayOfByte, int paramInt)
  {
    return mNewDataListener.onNewData(paramArrayOfByte, paramInt);
  }

  public static void setOnNewDataListener(EmbeddedSynthesizerEngine.OnNewDataListener paramOnNewDataListener)
  {
    mNewDataListener = paramOnNewDataListener;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.jni.EmbeddedSynthesizerEngine
 * JD-Core Version:    0.6.0
 */