package xyz.wolf.hongbao.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import java.io.File;

public class b
  implements SpeechSynthesizerListener
{
  private static b f = null;
  Context a;
  private SpeechSynthesizer b;
  private String c;
  private LoggerProxy d;
  private SharedPreferences e;

  private b(Context paramContext)
  {
    this.a = paramContext;
    this.d = new LoggerProxy();
    b();
    c();
    paramContext = this.d;
    LoggerProxy.printable(true);
  }

  public static b a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (f == null)
        f = new b(paramContext);
      return f;
    }
    finally
    {
      monitorexit;
    }
    throw paramContext;
  }

  // ERROR //
  private void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 52	java/io/File
    //   3: dup
    //   4: aload_3
    //   5: invokespecial 55	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore 5
    //   10: iload_1
    //   11: ifne +15 -> 26
    //   14: iload_1
    //   15: ifne +110 -> 125
    //   18: aload 5
    //   20: invokevirtual 59	java/io/File:exists	()Z
    //   23: ifne +102 -> 125
    //   26: aconst_null
    //   27: astore 7
    //   29: aconst_null
    //   30: astore 6
    //   32: aload 7
    //   34: astore 5
    //   36: aload_0
    //   37: getfield 29	xyz/wolf/hongbao/services/b:a	Landroid/content/Context;
    //   40: invokevirtual 65	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   43: invokevirtual 71	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   46: aload_2
    //   47: invokevirtual 77	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   50: astore 8
    //   52: aload 7
    //   54: astore 5
    //   56: new 79	java/io/FileOutputStream
    //   59: dup
    //   60: aload_3
    //   61: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   64: astore_2
    //   65: aload_2
    //   66: astore_3
    //   67: sipush 1024
    //   70: newarray byte
    //   72: astore 5
    //   74: aload_2
    //   75: astore_3
    //   76: aload 8
    //   78: aload 5
    //   80: iconst_0
    //   81: sipush 1024
    //   84: invokevirtual 86	java/io/InputStream:read	([BII)I
    //   87: istore 4
    //   89: iload 4
    //   91: iflt +35 -> 126
    //   94: aload_2
    //   95: astore_3
    //   96: aload_2
    //   97: aload 5
    //   99: iconst_0
    //   100: iload 4
    //   102: invokevirtual 90	java/io/FileOutputStream:write	([BII)V
    //   105: goto -31 -> 74
    //   108: astore 5
    //   110: aload_2
    //   111: astore_3
    //   112: aload 5
    //   114: invokevirtual 93	java/io/FileNotFoundException:printStackTrace	()V
    //   117: aload_2
    //   118: ifnull +7 -> 125
    //   121: aload_2
    //   122: invokevirtual 96	java/io/FileOutputStream:close	()V
    //   125: return
    //   126: aload_2
    //   127: ifnull -2 -> 125
    //   130: aload_2
    //   131: invokevirtual 96	java/io/FileOutputStream:close	()V
    //   134: return
    //   135: astore_2
    //   136: aload_2
    //   137: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   140: return
    //   141: astore_2
    //   142: aload_2
    //   143: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   146: return
    //   147: astore_3
    //   148: aload 6
    //   150: astore_2
    //   151: aload_2
    //   152: astore 5
    //   154: aload_3
    //   155: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   158: aload_2
    //   159: ifnull -34 -> 125
    //   162: aload_2
    //   163: invokevirtual 96	java/io/FileOutputStream:close	()V
    //   166: return
    //   167: astore_2
    //   168: aload_2
    //   169: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   172: return
    //   173: astore_2
    //   174: aload 5
    //   176: ifnull +8 -> 184
    //   179: aload 5
    //   181: invokevirtual 96	java/io/FileOutputStream:close	()V
    //   184: aload_2
    //   185: athrow
    //   186: astore_3
    //   187: aload_3
    //   188: invokevirtual 97	java/io/IOException:printStackTrace	()V
    //   191: goto -7 -> 184
    //   194: astore_2
    //   195: aload_3
    //   196: astore 5
    //   198: goto -24 -> 174
    //   201: astore_3
    //   202: goto -51 -> 151
    //   205: astore 5
    //   207: aconst_null
    //   208: astore_2
    //   209: goto -99 -> 110
    //
    // Exception table:
    //   from	to	target	type
    //   67	74	108	java/io/FileNotFoundException
    //   76	89	108	java/io/FileNotFoundException
    //   96	105	108	java/io/FileNotFoundException
    //   130	134	135	java/io/IOException
    //   121	125	141	java/io/IOException
    //   36	52	147	java/io/IOException
    //   56	65	147	java/io/IOException
    //   162	166	167	java/io/IOException
    //   36	52	173	finally
    //   56	65	173	finally
    //   154	158	173	finally
    //   179	184	186	java/io/IOException
    //   67	74	194	finally
    //   76	89	194	finally
    //   96	105	194	finally
    //   112	117	194	finally
    //   67	74	201	java/io/IOException
    //   76	89	201	java/io/IOException
    //   96	105	201	java/io/IOException
    //   36	52	205	java/io/FileNotFoundException
    //   56	65	205	java/io/FileNotFoundException
  }

  private void b()
  {
    if (this.c == null)
    {
      String str = Environment.getExternalStorageDirectory().toString();
      this.c = (str + "/" + "VoiceTest");
    }
    this.e = PreferenceManager.getDefaultSharedPreferences(this.a);
    b(this.c);
    a(false, "bd_etts_speech_female.dat", this.c + "/" + "bd_etts_speech_female.dat");
    a(false, "bd_etts_speech_male.dat", this.c + "/" + "bd_etts_speech_male.dat");
    a(false, "bd_etts_text.dat", this.c + "/" + "bd_etts_text.dat");
  }

  private void b(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists())
      paramString.mkdirs();
  }

  private void c()
  {
    this.b = SpeechSynthesizer.getInstance();
    this.b.setContext(this.a);
    this.b.setSpeechSynthesizerListener(this);
    new String(new byte[] { 100, 53, 87, 111, 119, 49, 122, 113, 51, 65, 78, 73, 120, 85, 80, 70, 98, 102, 121, 77, 115, 53, 122, 88 });
    new String(new byte[] { 49, 51, 55, 53, 101, 48, 54, 48, 100, 54, 99, 100, 50, 57, 55, 56, 48, 99, 98, 53, 50, 101, 54, 56, 51, 51, 50, 57, 50, 100, 101, 102 });
    this.b.setApiKey("ZzZyQCcHVsuBV8H3OktUkGLX", "263d45ea5a150baaa435cebb7984465b");
    new String(new byte[] { 56, 54, 55, 49, 48, 52, 48 });
    this.b.setAppId("8788811");
    this.b.setParam(SpeechSynthesizer.PARAM_MIX_MODE, SpeechSynthesizer.MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI);
    this.b.setParam(SpeechSynthesizer.PARAM_TTS_TEXT_MODEL_FILE, this.c + "/" + "bd_etts_text.dat");
    this.b.setParam(SpeechSynthesizer.PARAM_TTS_SPEECH_MODEL_FILE, this.c + "/" + "bd_etts_speech_female.dat");
    this.b.setParam(SpeechSynthesizer.PARAM_VOLUME, "9");
    this.b.setParam(SpeechSynthesizer.PARAM_SPEED, "9");
    if (this.b.auth(TtsMode.MIX).isSuccess())
      this.b.initTts(TtsMode.MIX);
  }

  public void a()
  {
    if (this.b == null)
      c();
    this.b.speak("");
  }

  public void a(String paramString)
  {
    if (this.b == null)
      c();
    this.b.speak(paramString);
  }

  public void onError(String paramString, SpeechError paramSpeechError)
  {
  }

  public void onSpeechFinish(String paramString)
  {
  }

  public void onSpeechProgressChanged(String paramString, int paramInt)
  {
  }

  public void onSpeechStart(String paramString)
  {
  }

  public void onSynthesizeDataArrived(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
  }

  public void onSynthesizeFinish(String paramString)
  {
  }

  public void onSynthesizeStart(String paramString)
  {
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.services.b
 * JD-Core Version:    0.6.0
 */