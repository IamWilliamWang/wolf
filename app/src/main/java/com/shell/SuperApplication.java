package com.shell;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SuperApplication extends Application
{
  static String baseDir = null;

  private void copyLib(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile)
  {
    try
    {
      if (!paramFile.getParentFile().exists())
        paramFile.getParentFile().mkdirs();
      paramZipFile = paramZipFile.getInputStream(paramZipEntry);
      paramZipEntry = new FileOutputStream(paramFile);
      paramFile = new byte[1024];
      while (true)
      {
        int i = paramZipFile.read(paramFile);
        if (i == -1)
        {
          paramZipFile.close();
          paramZipEntry.close();
          return;
        }
        paramZipEntry.write(paramFile, 0, i);
      }
    }
    catch (IOException paramZipFile)
    {
      paramZipFile.printStackTrace();
    }
  }

  // ERROR //
  public static long getCRC32(File paramFile)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_1
    //   2: aconst_null
    //   3: astore 6
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_0
    //   9: invokevirtual 28	java/io/File:exists	()Z
    //   12: ifne +5 -> 17
    //   15: lload_1
    //   16: lreturn
    //   17: new 65	java/util/zip/CRC32
    //   20: dup
    //   21: invokespecial 66	java/util/zip/CRC32:<init>	()V
    //   24: astore 7
    //   26: new 68	java/io/FileInputStream
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 69	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   34: astore_0
    //   35: new 71	java/util/zip/CheckedInputStream
    //   38: dup
    //   39: aload_0
    //   40: aload 7
    //   42: invokespecial 74	java/util/zip/CheckedInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    //   45: astore 5
    //   47: sipush 1024
    //   50: newarray byte
    //   52: astore 6
    //   54: aload 5
    //   56: aload 6
    //   58: invokevirtual 75	java/util/zip/CheckedInputStream:read	([B)I
    //   61: iconst_m1
    //   62: if_icmpne -8 -> 54
    //   65: aload 7
    //   67: invokevirtual 79	java/util/zip/CRC32:getValue	()J
    //   70: lstore_3
    //   71: aload_0
    //   72: ifnull +7 -> 79
    //   75: aload_0
    //   76: invokevirtual 80	java/io/FileInputStream:close	()V
    //   79: lload_3
    //   80: lstore_1
    //   81: aload 5
    //   83: ifnull -68 -> 15
    //   86: aload 5
    //   88: invokevirtual 81	java/util/zip/CheckedInputStream:close	()V
    //   91: lload_3
    //   92: lreturn
    //   93: astore_0
    //   94: lload_3
    //   95: lreturn
    //   96: astore_0
    //   97: aconst_null
    //   98: astore_0
    //   99: aload 5
    //   101: ifnull +8 -> 109
    //   104: aload 5
    //   106: invokevirtual 80	java/io/FileInputStream:close	()V
    //   109: aload_0
    //   110: ifnull -95 -> 15
    //   113: aload_0
    //   114: invokevirtual 81	java/util/zip/CheckedInputStream:close	()V
    //   117: lconst_0
    //   118: lreturn
    //   119: astore_0
    //   120: lconst_0
    //   121: lreturn
    //   122: astore 5
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull +7 -> 134
    //   130: aload_0
    //   131: invokevirtual 80	java/io/FileInputStream:close	()V
    //   134: aload 6
    //   136: ifnull +8 -> 144
    //   139: aload 6
    //   141: invokevirtual 81	java/util/zip/CheckedInputStream:close	()V
    //   144: aload 5
    //   146: athrow
    //   147: astore 5
    //   149: goto -40 -> 109
    //   152: astore_0
    //   153: goto -19 -> 134
    //   156: astore_0
    //   157: goto -13 -> 144
    //   160: astore_0
    //   161: goto -82 -> 79
    //   164: astore 5
    //   166: goto -40 -> 126
    //   169: astore 7
    //   171: aload 5
    //   173: astore 6
    //   175: aload 7
    //   177: astore 5
    //   179: goto -53 -> 126
    //   182: astore 5
    //   184: aconst_null
    //   185: astore 6
    //   187: aload_0
    //   188: astore 5
    //   190: aload 6
    //   192: astore_0
    //   193: goto -94 -> 99
    //   196: astore 6
    //   198: aload_0
    //   199: astore 6
    //   201: aload 5
    //   203: astore_0
    //   204: aload 6
    //   206: astore 5
    //   208: goto -109 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   86	91	93	java/io/IOException
    //   26	35	96	java/lang/Exception
    //   113	117	119	java/io/IOException
    //   26	35	122	finally
    //   104	109	147	java/io/IOException
    //   130	134	152	java/io/IOException
    //   139	144	156	java/io/IOException
    //   75	79	160	java/io/IOException
    //   35	47	164	finally
    //   47	54	169	finally
    //   54	71	169	finally
    //   35	47	182	java/lang/Exception
    //   47	54	196	java/lang/Exception
    //   54	71	196	java/lang/Exception
  }

  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    loadLibs(paramContext);
    NativeApplication.load(this, "xyz.wolf.hongbao");
    NativeApplication.run(this, "android.app.Application");
  }

  protected void copyLib(String paramString)
    throws IOException
  {
    Object localObject2 = "assets/ijm_lib/armeabi/libexec.so";
    Object localObject1 = "assets/ijm_lib/armeabi/libexecmain.so";
    if (paramString.equals("x86"))
    {
      localObject2 = "assets/ijm_lib/x86/libexec.so";
      localObject1 = "assets/ijm_lib/x86/libexecmain.so";
    }
    File localFile = new File(baseDir, "libexec.so");
    paramString = new File(baseDir, "libexecmain.so");
    ZipFile localZipFile = new ZipFile(getPackageCodePath());
    localObject2 = localZipFile.getEntry((String)localObject2);
    if ((localObject2 != null) && (((ZipEntry)localObject2).getCrc() != getCRC32(localFile)))
      copyLib(localZipFile, (ZipEntry)localObject2, localFile);
    localObject1 = localZipFile.getEntry((String)localObject1);
    if ((localObject1 != null) && (((ZipEntry)localObject1).getCrc() != getCRC32(paramString)))
      copyLib(localZipFile, (ZipEntry)localObject1, paramString);
    localZipFile.close();
  }

  protected void loadLibs(Context paramContext)
  {
    try
    {
      baseDir = paramContext.getFilesDir().getAbsolutePath();
      paramContext = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
      if ((paramContext != null) && (paramContext.contains("x86")))
      {
        copyLib("x86");
        return;
      }
      copyLib("arm");
      return;
    }
    catch (IOException paramContext)
    {
      try
      {
        copyLib("arm");
        return;
      }
      catch (IOException paramContext)
      {
      }
    }
  }

  public void onCreate()
  {
    NativeApplication.runAll(this, "android.app.Application");
    super.onCreate();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.shell.SuperApplication
 * JD-Core Version:    0.6.0
 */