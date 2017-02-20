package com.baidu.tts.l;

import android.content.Context;
import com.baidu.tts.client.model.BasicHandler;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.DownloadHandler;
import com.baidu.tts.client.model.LibEngineParams;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.d.b;
import com.baidu.tts.d.d;
import com.baidu.tts.f.g;
import com.baidu.tts.l.a.h;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.MD5;
import java.io.File;
import java.util.Map;
import java.util.Set;

public class a
{
  private Context a;
  private com.baidu.tts.database.a b;
  private h c;
  private d d;

  public a(Context paramContext)
  {
    this.a = paramContext;
    f();
  }

  private void f()
  {
    this.b = new com.baidu.tts.database.a(this);
    this.c = new h(this);
    this.d = new d();
    this.d.a(this);
    this.d.a();
  }

  public BasicHandler<ModelBags> a(Conditions paramConditions)
  {
    return this.c.a(paramConditions);
  }

  public BasicHandler<ModelBags> a(Conditions paramConditions, boolean paramBoolean)
  {
    return this.c.a(paramConditions, paramBoolean);
  }

  public BasicHandler<ModelFileBags> a(Set<String> paramSet)
  {
    return this.c.a(paramSet);
  }

  public DownloadHandler a(b paramb)
  {
    return this.d.a(paramb);
  }

  public LibEngineParams a()
  {
    return this.c.a();
  }

  public String a(String paramString1, String paramString2)
  {
    return this.b.a(paramString1, paramString2);
  }

  public boolean a(String paramString)
  {
    Object localObject2 = this.b.d(paramString);
    if (DataTool.isMapEmpty((Map)localObject2))
      return false;
    Object localObject1 = (String)((Map)localObject2).get(g.h.b());
    paramString = (String)((Map)localObject2).get(g.g.b());
    localObject2 = (String)((Map)localObject2).get(g.f.b());
    localObject1 = new File((String)localObject1);
    if (((File)localObject1).exists())
    {
      if (((File)localObject1).length() != Long.parseLong(paramString))
        return false;
      return MD5.getInstance().getBigFileMd5((File)localObject1).equalsIgnoreCase((String)localObject2);
    }
    return false;
  }

  public BasicHandler<ModelBags> b()
  {
    return this.c.b();
  }

  public BasicHandler<ModelFileBags> b(Set<String> paramSet)
  {
    return this.c.b(paramSet);
  }

  public boolean b(String paramString)
  {
    Object localObject = this.b.e(paramString);
    if (DataTool.isMapEmpty((Map)localObject))
      return false;
    paramString = (String)((Map)localObject).get(g.r.b());
    localObject = (String)((Map)localObject).get(g.s.b());
    boolean bool1 = a(paramString);
    boolean bool2 = a((String)localObject);
    return (bool1) && (bool2);
  }

  public void c()
  {
    this.d.b();
  }

  public Context d()
  {
    return this.a;
  }

  public com.baidu.tts.database.a e()
  {
    return this.b;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a
 * JD-Core Version:    0.6.0
 */