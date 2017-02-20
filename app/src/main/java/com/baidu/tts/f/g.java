package com.baidu.tts.f;

public enum g
{
  private final String aj;
  private final String ak;
  private final String al;

  static
  {
    A = new g("PACKAGE_NAME", 26, "pn", "packageName", "app_name");
    B = new g("PLATFORM", 27, "", "platform", "");
    C = new g("SPEED", 28, "spd", "speed", "");
    D = new g("VOLUME", 29, "vol", "volume", "");
    E = new g("PITCH", 30, "pit", "pitch", "");
    F = new g("LANGUAGE", 31, "lan", "language", "");
    G = new g("TEXT_ENCODE", 32, "cod", "textEncode", "");
    H = new g("STREAM_TYPE", 33, "st", "streamType", "");
    I = new g("AUDIO_ENCODE", 34, "aue", "audioEncode", "");
    J = new g("BITRATE", 35, "rate", "audioRate", "");
    K = new g("SPEAKER", 36, "per", "speaker", "");
    L = new g("STYLE", 37, "sty", "style", "");
    M = new g("BACKGROUND", 38, "bcg", "background", "");
    N = new g("PRODUCT_ID", 39, "pdt", "productId", "");
    O = new g("TEXT_DAT_PATH", 40, "tdp", "textDatPath", "");
    P = new g("SPEECH_DAT_PATH", 41, "sdp", "speechDatPath", "");
    Q = new g("TTS_LICENSE_FILE_PATH", 42, "tlfp", "ttsLicenseFilePath", "");
    R = new g("CUSTOM_SYNTH", 43, "cs", "custom_synth", "");
    S = new g("OPEN_XML", 44, "ox", "open_xml", "");
    T = new g("TTS_VOCODER_OPTIMIZATION", 45, "tvo", "ttsVocoderOptimzation", "");
    U = new g("SAMPLE_RATE", 46, "sr", "sampleRate", "");
    V = new g("SERIAL_NUMBER", 47, "sn", "serialNumber", "");
    W = new g("INDEX", 48, "idx", "index", "");
    X = new g("TEXT", 49, "tex", "text", "");
    Y = new g("CTP", 50, "ctp", "clientPath", "");
    Z = new g("CUID", 51, "cuid", "deviceId", "wise_cuid");
    aa = new g("VERSION", 52, "ver", "version", "sdk_version");
    ab = new g("NUMBER", 53, "num", "number", "");
    ac = new g("ENGINE", 54, "en", "engine", "");
    ad = new g("TERRITORY", 55, "ter", "territory", "");
    ae = new g("PUNCTUATION", 56, "puc", "punctuation", "");
    af = new g("CONTEXT", 57, "ctx", "context", "");
    ag = new g("API_KEY", 58, "", "apiKey", "");
    ah = new g("SECRET_KEY", 59, "", "secretKey", "");
    ai = new g("TOKEN", 60, "tok", "token", "");
    am = new g[] { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, aa, ab, ac, ad, ae, af, ag, ah, ai };
  }

  private g(String paramString1, String paramString2, String paramString3)
  {
    this.aj = paramString1;
    this.ak = paramString2;
    this.al = paramString3;
  }

  public static String a(g paramg)
  {
    if (paramg == null)
      return null;
    return paramg.name();
  }

  public String a()
  {
    return this.aj;
  }

  public String b()
  {
    return this.ak;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.f.g
 * JD-Core Version:    0.6.0
 */