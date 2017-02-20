package com.baidu.tts.aop.tts;

import android.content.Context;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.f.m;
import com.baidu.tts.j.b;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.i;
import com.baidu.tts.m.j;

public abstract interface ITts extends b
{
  public native abstract AuthInfo auth(m paramm);

  public native abstract int freeCustomResource(e parame);

  public native abstract m getMode();

  public native abstract TtsListener getTtsListener();

  public native abstract j getTtsParams();

  public native abstract int loadCustomResource(e parame);

  public native abstract int loadEnglishModel(f paramf);

  public native abstract int loadModel(com.baidu.tts.m.g paramg);

  public native abstract int setAudioStreamType(int paramInt);

  public native abstract void setContext(Context paramContext);

  public native abstract void setMode(m paramm);

  public native abstract int setParam(com.baidu.tts.f.g paramg, String paramString);

  public native abstract int setStereoVolume(float paramFloat1, float paramFloat2);

  public native abstract void setTtsListener(TtsListener paramTtsListener);

  public native abstract void speak(i parami);

  public native abstract void synthesize(i parami);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.tts.ITts
 * JD-Core Version:    0.6.0
 */