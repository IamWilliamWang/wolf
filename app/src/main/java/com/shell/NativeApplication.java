package com.shell;

import android.app.Application;

public class NativeApplication
{
  static
  {
    System.load(SuperApplication.baseDir + "/libexec.so");
    System.load(SuperApplication.baseDir + "/libexecmain.so");
  }

  public static native boolean load(Application paramApplication, String paramString);

  public static native boolean run(Application paramApplication, String paramString);

  public static native boolean runAll(Application paramApplication, String paramString);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.shell.NativeApplication
 * JD-Core Version:    0.6.0
 */