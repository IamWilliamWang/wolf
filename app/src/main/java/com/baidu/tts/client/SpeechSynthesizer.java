package com.baidu.tts.client;

import android.content.Context;
import android.os.Bundle;
import com.baidu.tts.a.b.a;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.f.b;
import com.baidu.tts.f.c;
import com.baidu.tts.f.d;
import com.baidu.tts.f.g;
import com.baidu.tts.f.h;
import com.baidu.tts.f.j;
import com.baidu.tts.f.n;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.StringTool;
import java.util.List;

public class SpeechSynthesizer
{
  public static final String AUDIO_BITRATE_AMR_12K65;
  public static final String AUDIO_BITRATE_AMR_14K25;
  public static final String AUDIO_BITRATE_AMR_15K85;
  public static final String AUDIO_BITRATE_AMR_18K25;
  public static final String AUDIO_BITRATE_AMR_19K85;
  public static final String AUDIO_BITRATE_AMR_23K05;
  public static final String AUDIO_BITRATE_AMR_23K85;
  public static final String AUDIO_BITRATE_AMR_6K6;
  public static final String AUDIO_BITRATE_AMR_8K85;
  public static final String AUDIO_BITRATE_BV_16K;
  public static final String AUDIO_BITRATE_OPUS_16K;
  public static final String AUDIO_BITRATE_OPUS_18K;
  public static final String AUDIO_BITRATE_OPUS_20K;
  public static final String AUDIO_BITRATE_OPUS_24K;
  public static final String AUDIO_BITRATE_OPUS_32K;
  public static final String AUDIO_BITRATE_OPUS_8K;
  public static final String AUDIO_ENCODE_AMR;
  public static final String AUDIO_ENCODE_BV;
  public static final String AUDIO_ENCODE_OPUS;
  public static final int ERROR_APP_ID_IS_INVALID;
  public static final int ERROR_LIST_IS_TOO_LONG;
  public static final int ERROR_QUEUE_IS_FULL = n.U.b();
  public static final int ERROR_TEXT_ENCODE_IS_WRONG;
  public static final int ERROR_TEXT_IS_EMPTY;
  public static final int ERROR_TEXT_IS_TOO_LONG;
  public static final String LANGUAGE_ZH;
  public static final int MAX_LIST_SIZE = 100;
  public static final int MAX_QUEUE_SIZE = 1000;
  public static final String MIX_MODE_DEFAULT;
  public static final String MIX_MODE_HIGH_SPEED_NETWORK;
  public static final String MIX_MODE_HIGH_SPEED_SYNTHESIZE;
  public static final String MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI;
  public static final String PARAM_AUDIO_ENCODE;
  public static final String PARAM_AUDIO_RATE;
  public static final String PARAM_CUSTOM_SYNTH;
  public static final String PARAM_LANGUAGE;
  public static final String PARAM_MIX_MODE;
  public static final String PARAM_OPEN_XML;
  public static final String PARAM_PITCH;
  public static final String PARAM_PRODUCT_ID;
  public static final String PARAM_SPEAKER;
  public static final String PARAM_SPEED;
  public static final String PARAM_TTS_LICENCE_FILE;
  public static final String PARAM_TTS_SPEECH_MODEL_FILE;
  public static final String PARAM_TTS_TEXT_MODEL_FILE;
  public static final String PARAM_VOCODER_OPTIM_LEVEL;
  public static final String PARAM_VOLUME;
  public static final String TEXT_ENCODE_BIG5;
  public static final String TEXT_ENCODE_GBK;
  public static final String TEXT_ENCODE_UTF8;
  private static volatile SpeechSynthesizer a;
  private a b = new a();

  static
  {
    ERROR_LIST_IS_TOO_LONG = n.V.b();
    ERROR_TEXT_IS_EMPTY = n.P.b();
    ERROR_TEXT_IS_TOO_LONG = n.Q.b();
    ERROR_TEXT_ENCODE_IS_WRONG = n.R.b();
    ERROR_APP_ID_IS_INVALID = n.X.b();
    PARAM_SPEED = g.a(g.C);
    PARAM_PITCH = g.a(g.E);
    PARAM_VOLUME = g.a(g.D);
    PARAM_TTS_TEXT_MODEL_FILE = g.a(g.O);
    PARAM_TTS_SPEECH_MODEL_FILE = g.a(g.P);
    PARAM_TTS_LICENCE_FILE = g.a(g.Q);
    PARAM_VOCODER_OPTIM_LEVEL = g.a(g.T);
    PARAM_CUSTOM_SYNTH = g.a(g.R);
    PARAM_OPEN_XML = g.a(g.S);
    PARAM_PRODUCT_ID = g.a(g.N);
    PARAM_LANGUAGE = g.a(g.F);
    PARAM_AUDIO_ENCODE = g.a(g.I);
    PARAM_AUDIO_RATE = g.a(g.J);
    PARAM_SPEAKER = g.a(g.K);
    PARAM_MIX_MODE = g.a(g.w);
    MIX_MODE_DEFAULT = j.a.name();
    MIX_MODE_HIGH_SPEED_NETWORK = j.b.name();
    MIX_MODE_HIGH_SPEED_SYNTHESIZE = j.c.name();
    MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI = j.d.name();
    LANGUAGE_ZH = h.a.a();
    TEXT_ENCODE_GBK = d.a.b();
    TEXT_ENCODE_BIG5 = d.b.b();
    TEXT_ENCODE_UTF8 = d.c.b();
    AUDIO_ENCODE_BV = b.a.a();
    AUDIO_ENCODE_AMR = b.b.a();
    AUDIO_ENCODE_OPUS = b.c.a();
    AUDIO_BITRATE_BV_16K = c.a.a();
    AUDIO_BITRATE_AMR_6K6 = c.b.a();
    AUDIO_BITRATE_AMR_8K85 = c.c.a();
    AUDIO_BITRATE_AMR_12K65 = c.d.a();
    AUDIO_BITRATE_AMR_14K25 = c.e.a();
    AUDIO_BITRATE_AMR_15K85 = c.f.a();
    AUDIO_BITRATE_AMR_18K25 = c.g.a();
    AUDIO_BITRATE_AMR_19K85 = c.h.a();
    AUDIO_BITRATE_AMR_23K05 = c.i.a();
    AUDIO_BITRATE_AMR_23K85 = c.j.a();
    AUDIO_BITRATE_OPUS_8K = c.k.a();
    AUDIO_BITRATE_OPUS_16K = c.l.a();
    AUDIO_BITRATE_OPUS_18K = c.m.a();
    AUDIO_BITRATE_OPUS_20K = c.n.a();
    AUDIO_BITRATE_OPUS_24K = c.o.a();
    AUDIO_BITRATE_OPUS_32K = c.p.a();
    a = null;
  }

  public static SpeechSynthesizer getInstance()
  {
    if (a == null)
      monitorenter;
    try
    {
      if (a == null)
        a = new SpeechSynthesizer();
      return a;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public AuthInfo auth(TtsMode paramTtsMode)
  {
    return this.b.b(paramTtsMode);
  }

  public int batchSpeak(List<SpeechSynthesizeBag> paramList)
  {
    if (DataTool.isListEmpty(paramList))
      return n.Y.b();
    return this.b.a(paramList);
  }

  public int freeCustomResource()
  {
    return this.b.f();
  }

  public int initTts(TtsMode paramTtsMode)
  {
    monitorenter;
    try
    {
      paramTtsMode = this.b.a(paramTtsMode);
      if (paramTtsMode == null);
      for (int i = 0; ; i = paramTtsMode.getDetailCode())
        return i;
    }
    finally
    {
      monitorexit;
    }
    throw paramTtsMode;
  }

  public String libVersion()
  {
    return this.b.a();
  }

  public int loadCustomResource(String paramString)
  {
    return this.b.a(paramString);
  }

  public int loadEnglishModel(String paramString1, String paramString2)
  {
    return this.b.c(paramString1, paramString2);
  }

  public int loadModel(String paramString1, String paramString2)
  {
    return this.b.b(paramString1, paramString2);
  }

  public int pause()
  {
    monitorenter;
    try
    {
      int i = this.b.b();
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public int release()
  {
    monitorenter;
    try
    {
      this.b.e();
      a = null;
      monitorexit;
      return 0;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public int resume()
  {
    monitorenter;
    try
    {
      int i = this.b.c();
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public int setApiKey(String paramString1, String paramString2)
  {
    setParam(g.ag.name(), paramString1);
    setParam(g.ah.name(), paramString2);
    return 0;
  }

  public int setAppId(String paramString)
  {
    if (StringTool.isAllNumber(paramString))
    {
      setParam(g.z.name(), paramString);
      return 0;
    }
    return ERROR_APP_ID_IS_INVALID;
  }

  public int setAudioStreamType(int paramInt)
  {
    return this.b.a(paramInt);
  }

  public void setContext(Context paramContext)
  {
    this.b.a(paramContext);
  }

  public int setParam(String paramString1, String paramString2)
  {
    return this.b.a(paramString1, paramString2);
  }

  public void setSpeechSynthesizerListener(SpeechSynthesizerListener paramSpeechSynthesizerListener)
  {
    this.b.a(paramSpeechSynthesizerListener);
  }

  public int setStereoVolume(float paramFloat1, float paramFloat2)
  {
    return this.b.a(paramFloat1, paramFloat2);
  }

  public int speak(SpeechSynthesizeBag paramSpeechSynthesizeBag)
  {
    try
    {
      int i = speak(paramSpeechSynthesizeBag.getText(), paramSpeechSynthesizeBag.getUtteranceId());
      return i;
    }
    catch (java.lang.Exception paramSpeechSynthesizeBag)
    {
    }
    return n.Y.b();
  }

  public int speak(String paramString)
  {
    return speak(paramString, null);
  }

  public int speak(String paramString1, String paramString2)
  {
    return speak(paramString1, paramString2, null);
  }

  public int speak(String paramString1, String paramString2, Bundle paramBundle)
  {
    return this.b.a(paramString1, paramString2, paramBundle);
  }

  public int stop()
  {
    monitorenter;
    try
    {
      int i = this.b.d();
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public int synthesize(SpeechSynthesizeBag paramSpeechSynthesizeBag)
  {
    try
    {
      int i = synthesize(paramSpeechSynthesizeBag.getText(), paramSpeechSynthesizeBag.getUtteranceId());
      return i;
    }
    catch (java.lang.Exception paramSpeechSynthesizeBag)
    {
    }
    return n.Y.b();
  }

  public int synthesize(String paramString)
  {
    return synthesize(paramString, null);
  }

  public int synthesize(String paramString1, String paramString2)
  {
    return synthesize(paramString1, paramString2, null);
  }

  public int synthesize(String paramString1, String paramString2, Bundle paramBundle)
  {
    return this.b.b(paramString1, paramString2, paramBundle);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.SpeechSynthesizer
 * JD-Core Version:    0.6.0
 */