package com.baidu.android.common.logging;

import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Log
{
  public static final int FILE_LIMETE = 10485760;
  public static final int FILE_NUMBER = 2;
  private static Logger sFilelogger;
  private static boolean sLog2File;
  private static boolean sLogEnabled = true;

  static
  {
    sLog2File = false;
  }

  public static void d(String paramString1, String paramString2)
  {
    if (sLogEnabled)
    {
      if ((sLog2File) && (sFilelogger != null))
        sFilelogger.log(Level.INFO, paramString1 + ": " + paramString2);
    }
    else
      return;
    android.util.Log.d(paramString1, paramString2);
  }

  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    d(paramString1, paramString2 + '\n' + getStackTraceString(paramThrowable));
  }

  public static void e(String paramString1, String paramString2)
  {
    if (sLogEnabled)
    {
      if ((sLog2File) && (sFilelogger != null))
        sFilelogger.log(Level.SEVERE, paramString1 + ": " + paramString2);
    }
    else
      return;
    android.util.Log.e(paramString1, paramString2);
  }

  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    e(paramString1, paramString2 + '\n' + getStackTraceString(paramThrowable));
  }

  public static void e(String paramString, Throwable paramThrowable)
  {
    e(paramString, getStackTraceString(paramThrowable));
  }

  private static String getLogFileName()
  {
    String str2 = getProcessNameForPid(Process.myPid());
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = "BaiduFileLog";
    return str1.replace(':', '_');
  }

  // ERROR //
  private static String getProcessNameForPid(int paramInt)
  {
    // Byte code:
    //   0: new 36	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   7: ldc 106
    //   9: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: iload_0
    //   13: invokevirtual 109	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   16: ldc 111
    //   18: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: new 36	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   32: ldc 106
    //   34: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: iload_0
    //   38: invokevirtual 109	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   41: ldc 113
    //   43: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_1
    //   50: new 115	java/io/BufferedReader
    //   53: dup
    //   54: new 117	java/io/FileReader
    //   57: dup
    //   58: new 119	java/io/File
    //   61: dup
    //   62: aload_2
    //   63: invokespecial 122	java/io/File:<init>	(Ljava/lang/String;)V
    //   66: invokespecial 125	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   69: invokespecial 128	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   72: astore_2
    //   73: aload_2
    //   74: invokevirtual 131	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   77: astore_3
    //   78: aload_3
    //   79: invokestatic 94	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   82: ifne +20 -> 102
    //   85: aload_3
    //   86: iconst_0
    //   87: aload_3
    //   88: iconst_0
    //   89: invokevirtual 135	java/lang/String:indexOf	(I)I
    //   92: invokevirtual 139	java/lang/String:substring	(II)Ljava/lang/String;
    //   95: astore_1
    //   96: aload_2
    //   97: invokevirtual 142	java/io/BufferedReader:close	()V
    //   100: aload_1
    //   101: areturn
    //   102: new 115	java/io/BufferedReader
    //   105: dup
    //   106: new 117	java/io/FileReader
    //   109: dup
    //   110: new 119	java/io/File
    //   113: dup
    //   114: aload_1
    //   115: invokespecial 122	java/io/File:<init>	(Ljava/lang/String;)V
    //   118: invokespecial 125	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   121: invokespecial 128	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   124: astore_1
    //   125: aload_1
    //   126: invokevirtual 131	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   129: astore_2
    //   130: aload_2
    //   131: ifnull +60 -> 191
    //   134: aload_2
    //   135: ldc 144
    //   137: invokevirtual 148	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   140: ifeq +29 -> 169
    //   143: aload_2
    //   144: ldc 150
    //   146: invokevirtual 153	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   149: istore_0
    //   150: iload_0
    //   151: iflt +40 -> 191
    //   154: aload_2
    //   155: iload_0
    //   156: iconst_1
    //   157: iadd
    //   158: invokevirtual 155	java/lang/String:substring	(I)Ljava/lang/String;
    //   161: astore_3
    //   162: aload_1
    //   163: astore_2
    //   164: aload_3
    //   165: astore_1
    //   166: goto -70 -> 96
    //   169: aload_1
    //   170: invokevirtual 131	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   173: astore_2
    //   174: goto -44 -> 130
    //   177: astore_2
    //   178: ldc 157
    //   180: astore_1
    //   181: aload_2
    //   182: invokevirtual 160	java/lang/Exception:printStackTrace	()V
    //   185: aload_1
    //   186: areturn
    //   187: astore_2
    //   188: goto -7 -> 181
    //   191: ldc 157
    //   193: astore_3
    //   194: aload_1
    //   195: astore_2
    //   196: aload_3
    //   197: astore_1
    //   198: goto -102 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   50	96	177	java/lang/Exception
    //   102	130	177	java/lang/Exception
    //   134	150	177	java/lang/Exception
    //   154	162	177	java/lang/Exception
    //   169	174	177	java/lang/Exception
    //   96	100	187	java/lang/Exception
  }

  public static String getStackTraceString(Throwable paramThrowable)
  {
    if (paramThrowable == null)
      return "";
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  public static void i(String paramString1, String paramString2)
  {
    if (sLogEnabled)
    {
      if ((sLog2File) && (sFilelogger != null))
        sFilelogger.log(Level.INFO, paramString1 + ": " + paramString2);
    }
    else
      return;
    android.util.Log.i(paramString1, paramString2);
  }

  public static void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    i(paramString1, paramString2 + '\n' + getStackTraceString(paramThrowable));
  }

  public static void setLog2File(boolean paramBoolean)
  {
    sLog2File = paramBoolean;
    String str;
    Object localObject;
    if ((sLog2File) && (sFilelogger == null))
    {
      str = getLogFileName();
      localObject = new File(Environment.getExternalStorageDirectory(), str).getAbsolutePath();
    }
    try
    {
      localObject = new FileHandler((String)localObject + "_%g.log", 10485760, 2, true);
      ((FileHandler)localObject).setFormatter(new SimpleFormatter());
      sFilelogger = Logger.getLogger(str);
      sFilelogger.setLevel(Level.ALL);
      sFilelogger.addHandler((Handler)localObject);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      localSecurityException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public static void setLogEnabled(boolean paramBoolean)
  {
    sLogEnabled = paramBoolean;
  }

  public static void v(String paramString1, String paramString2)
  {
    if (sLogEnabled)
    {
      if ((sLog2File) && (sFilelogger != null))
        sFilelogger.log(Level.INFO, paramString1 + ": " + paramString2);
    }
    else
      return;
    android.util.Log.v(paramString1, paramString2);
  }

  public static void v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    v(paramString1, paramString2 + '\n' + getStackTraceString(paramThrowable));
  }

  public static void w(String paramString1, String paramString2)
  {
    if (sLogEnabled)
    {
      if ((sLog2File) && (sFilelogger != null))
        sFilelogger.log(Level.WARNING, paramString1 + ": " + paramString2);
    }
    else
      return;
    android.util.Log.w(paramString1, paramString2);
  }

  public static void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    w(paramString1, paramString2 + '\n' + getStackTraceString(paramThrowable));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.logging.Log
 * JD-Core Version:    0.6.0
 */