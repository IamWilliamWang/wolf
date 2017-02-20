package com.baidu.tts.h.b;

import android.content.Context;
import com.baidu.android.common.util.CommonParam;
import com.baidu.tts.tools.FileTools;
import com.baidu.tts.tools.ResourceTools;
import java.lang.ref.WeakReference;

public class a
{
  private WeakReference<Context> a;
  private String b;
  private String c;

  public a(WeakReference<Context> paramWeakReference)
  {
    this.a = paramWeakReference;
  }

  private Context c()
  {
    if (this.a == null)
      return null;
    return (Context)this.a.get();
  }

  public String a()
  {
    if (this.b == null)
      this.b = CommonParam.getCUID(c());
    return this.b;
  }

  public String b()
  {
    if (this.c == null)
      this.c = FileTools.jointPathAndName(ResourceTools.getAppFilesDirPath(c()), "baidu_tts_license");
    return this.c;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.h.b.a
 * JD-Core Version:    0.6.0
 */