package com.baidu.tts.e;

import android.content.Context;

public class b extends Thread
{
  private Context a;
  private String b;

  public b(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }

  public void run()
  {
    a.a(this.a, this.b);
    this.a = null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.e.b
 * JD-Core Version:    0.6.0
 */