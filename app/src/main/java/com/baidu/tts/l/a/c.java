package com.baidu.tts.l.a;

import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class c
  implements Callable<ModelBags>
{
  private Conditions a;
  private com.baidu.tts.database.a b;
  private com.baidu.tts.l.a c;
  private boolean d;

  public c(com.baidu.tts.database.a parama, Conditions paramConditions, com.baidu.tts.l.a parama1, boolean paramBoolean)
  {
    this.a = paramConditions;
    this.b = parama;
    this.c = parama1;
    this.d = paramBoolean;
  }

  public ModelBags a()
  {
    Object localObject = this.b.a(this.a);
    ModelBags localModelBags = new ModelBags();
    localModelBags.setList((List)localObject);
    if ((localModelBags != null) && (this.d))
    {
      localObject = localModelBags.getModelInfos().iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = ((ModelInfo)((Iterator)localObject).next()).getServerId();
        if (this.c.b(str))
          continue;
        ((Iterator)localObject).remove();
      }
    }
    return (ModelBags)localModelBags;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a.c
 * JD-Core Version:    0.6.0
 */