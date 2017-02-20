package com.baidu.tts.client;

import com.baidu.tts.f.m;

public enum TtsMode
{
  private final m a;

  static
  {
    MIX = new TtsMode("MIX", 1, m.c);
    b = new TtsMode[] { ONLINE, MIX };
  }

  private TtsMode(m paramm)
  {
    this.a = paramm;
  }

  public String getDescription()
  {
    return this.a.b();
  }

  public int getMode()
  {
    return this.a.a();
  }

  public m getTtsEnum()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.TtsMode
 * JD-Core Version:    0.6.0
 */