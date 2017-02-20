package com.baidu.tts.f;

public enum n
{
  private final n.a am;
  private final int an;
  private final String ao;

  static
  {
    A = new n("OFFLINE_ENGINE_CALL_EXCEPTION", 26, n.a.c, -110, "offline engine call synthesize exception");
    B = new n("OFFLINE_ENGINE_SYNTHESIZE_ERROR", 27, n.a.c, -111, "offline engine synthesize result not 0");
    C = new n("OFFLINE_ENGINE_AUTH_EXPIRED", 28, n.a.c, -112, "offline engine auth verify expired,formal expired or temp expired");
    D = new n("OFFLINE_ENGINE_AUTH_PACKAGE_UNMATCH", 29, n.a.c, -113, "package name is unmatch");
    E = new n("OFFLINE_ENGINE_AUTH_SIGN_UNMATCH", 30, n.a.c, -114, "app sign is unmatch");
    F = new n("OFFLINE_ENGINE_AUTH_CUID_UNMATCH", 31, n.a.c, -115, "devices cuid is unmatch");
    G = new n("OFFLINE_ENGINE_AUTH_PLATFORM_ERROR", 32, n.a.c, -116, "platform is unmatch");
    H = new n("OFFLINE_ENGINE_AUTH_LICENSE_FILE_INVALID", 33, n.a.c, -117, "license file not exist or file length is 0 (download license fail)");
    I = new n("OFFLINE_AUTH_CANCELLATION_EXCEPTION", 34, n.a.b, -118, "CancellationException");
    J = new n("MIX_ENGINE_AUTH_FAILURE", 35, n.a.a, -200, "both online and offline engine auth failue");
    K = new n("MIX_AUTH_INTERRUPTED_EXCEPTION", 36, n.a.a, -201, "InterruptedException");
    L = new n("MIX_AUTH_EXECUTION_EXCEPTION", 37, n.a.a, -202, "ExecutionException");
    M = new n("MIX_AUTH_TIMEOUT_EXCEPTION", 38, n.a.a, -203, "TimeoutException");
    N = new n("MIX_ENGINE_OFFLINE_INIT_FAILURE", 39, n.a.a, -204, "mix engine initTTS, the offline init failure");
    O = new n("MIX_AUTH_CANCELLATION_EXCEPTION", 40, n.a.a, -205, "CancellationException");
    P = new n("TEXT_IS_EMPTY", 41, n.a.d, -300, "text is null or empty double quotation marks");
    Q = new n("TEXT_IS_TOO_LONG", 42, n.a.d, -301, "text length in gbk is more than 1024, the text is too long, cut it short than 1024");
    R = new n("TEXT_ENCODE_IS_WRONG", 43, n.a.d, -302, "text encode is not gbk, please use gbk text");
    S = new n("TTS_UNINITIAL", 44, n.a.e, -400, "tts has not been initialized,invoke in a wrong state");
    T = new n("TTS_MODE_ILLEGAL", 45, n.a.e, -401, "tts mode unset or not the spechified value");
    U = new n("TTS_QUEUE_IS_FULL", 46, n.a.e, -402, "队列长度小于MAX_QUEUE_SIZE时才能加入合成队列");
    V = new n("TTS_LIST_IS_TOO_LONG", 47, n.a.e, -403, "list的size小于MAX_LIST_SIZE时才有效");
    W = new n("TTS_ENGINE_STOP_FAILURE", 48, n.a.e, -404, "引擎停止失败");
    X = new n("TTS_APP_ID_IS_INVALID", 49, n.a.e, -405, "app id is invalid,must be less than int(11)");
    Y = new n("TTS_PARAMETER_INVALID", 50, n.a.e, -406, "arguments of the method is invalid");
    Z = new n("APP_RESOURCE_IS_NULL", 51, n.a.f, -500, "context was released or persistent app value is null");
    aa = new n("PLAYER_IS_NULL", 52, n.a.g, -600, "player is null");
    ab = new n("MODEL_PARAMS_ERROR", 53, n.a.h, -1000, "params is wrong");
    ac = new n("MODEL_REQUEST_ERROR", 54, n.a.h, -1001, "request error");
    ad = new n("MODEL_SERVER_ERROR", 55, n.a.h, -1002, "server error");
    ae = new n("MODEL_DB_MODEL_INVALID", 56, n.a.h, -1003, "model item in db is invalid(fileids is empty)");
    af = new n("MODEL_DB_MODEL_FILE_PATHS_INVALID", 57, n.a.h, -1004, "model file in db is invalid(abspath is empty)");
    ag = new n("MODEL_EXISTS", 58, n.a.h, -1005, "this model exists(have downloaded success ever)");
    ah = new n("MODEL_BAGS_EMPTY", 59, n.a.h, -1006, "can't get server model info,maybe modelid invalid or request failure");
    ai = new n("MODEL_FILE_BAG_EMPTY", 60, n.a.h, -1007, "can't get server file info,maybe fileid invalid or request failure");
    aj = new n("MODEL_CHECK_EXCEPTION", 61, n.a.h, -1008, "CheckWork exception happened");
    ak = new n("MODEL_FILE_DOWNLOAD_EXCEPTION", 62, n.a.h, -1009, "exception happens when file downloadwork execute");
    al = new n("TTS_ERROR_UNKNOW", 63, n.a.i, -9999, "unknow");
    ap = new n[] { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, aa, ab, ac, ad, ae, af, ag, ah, ai, aj, ak, al };
  }

  private n(n.a parama, int paramInt, String paramString)
  {
    this.am = parama;
    this.an = paramInt;
    this.ao = paramString;
  }

  public n.a a()
  {
    return this.am;
  }

  public int b()
  {
    return this.an;
  }

  public String c()
  {
    return this.ao;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.f.n
 * JD-Core Version:    0.6.0
 */