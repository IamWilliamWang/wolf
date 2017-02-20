package com.baidu.tts.b.a.b;

import com.baidu.tts.f.n;
import com.baidu.tts.m.d;
import com.baidu.tts.tools.DataTool;

public class e$b extends d<b>
{
  private String a = "0";
  private String b = "0";
  private String c = "0";
  private String d = "0";
  private String e;
  private String f;
  private String g;
  private String h;

  public int a(String paramString)
  {
    if (DataTool.isLong(paramString))
    {
      this.a = paramString;
      return 0;
    }
    return n.Y.b();
  }

  public long a()
  {
    try
    {
      long l = Long.parseLong(this.a);
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public long b()
  {
    try
    {
      long l = Long.parseLong(this.b);
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public int c(String paramString)
  {
    if (DataTool.isLong(paramString))
    {
      this.c = paramString;
      return 0;
    }
    return n.Y.b();
  }

  public long c()
  {
    try
    {
      long l = Long.parseLong(this.c);
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public int d(String paramString)
  {
    if (DataTool.isLong(paramString))
    {
      this.d = paramString;
      return 0;
    }
    return n.Y.b();
  }

  public long d()
  {
    try
    {
      long l = Long.parseLong(this.d);
      return l;
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public String e()
  {
    return this.e;
  }

  public void e(String paramString)
  {
    this.e = paramString;
  }

  public String f()
  {
    return this.f;
  }

  public void f(String paramString)
  {
    this.f = paramString;
  }

  public String g()
  {
    return this.g;
  }

  public void g(String paramString)
  {
    this.g = paramString;
  }

  public String h()
  {
    return this.h;
  }

  public void h(String paramString)
  {
    this.h = paramString;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.e.b
 * JD-Core Version:    0.6.0
 */