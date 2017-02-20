package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
{
  private List<String> a = new ArrayList();
  private List<String> b = new ArrayList();

  public void a()
  {
    if (this.a != null)
      this.a.clear();
    if (this.b != null)
      this.b.clear();
  }

  public void a(c paramc, Void paramVoid, d paramd)
  {
    paramd = paramc.b();
    paramVoid = paramc.c();
    Object localObject = paramc.d();
    if (localObject != null)
      paramVoid = "(" + (String)localObject + ")" + paramVoid;
    while (true)
    {
      int i;
      if ((this.b != null) && (!this.b.isEmpty()))
        if (this.b.contains(paramd))
          i = 0;
      while (true)
      {
        int j = i;
        if (this.a != null)
        {
          j = i;
          if (!this.a.isEmpty())
          {
            if (!this.a.contains(paramd))
              break label231;
            j = 1;
          }
        }
        if (j != 0)
          Log.println(paramc.a(), "bdtts-" + paramd, paramVoid);
        return;
        localObject = this.b.iterator();
        j = 1;
        label177: i = j;
        if (!((Iterator)localObject).hasNext())
          continue;
        String str = (String)((Iterator)localObject).next();
        if ((str != null) && (paramVoid != null) && (paramVoid.contains(str)));
        for (i = 0; ; i = j)
        {
          j = i;
          break label177;
          label231: localObject = this.a.iterator();
          while (true)
          {
            j = i;
            if (!((Iterator)localObject).hasNext())
              break;
            str = (String)((Iterator)localObject).next();
            if ((str == null) || (paramVoid == null))
              continue;
            if (paramVoid.contains(str))
            {
              i = 1;
              continue;
            }
            i = 0;
          }
        }
        i = 1;
      }
    }
  }

  public void a(String paramString)
  {
    if ((this.a != null) && (!this.a.contains(paramString)))
      this.a.add(paramString);
  }

  public void a(List<String> paramList)
  {
    if (this.a != null)
      this.a.addAll(paramList);
  }

  public void b(String paramString)
  {
    if ((this.b != null) && (!this.b.contains(paramString)))
      this.b.add(paramString);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.chainofresponsibility.logger.e
 * JD-Core Version:    0.6.0
 */