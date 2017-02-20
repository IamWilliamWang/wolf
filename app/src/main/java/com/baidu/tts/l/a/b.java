package com.baidu.tts.l.a;

import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.database.a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class b
  implements Callable<ModelFileBags>
{
  private Set<String> a;
  private a b;

  public b(a parama, Set<String> paramSet)
  {
    this.a = paramSet;
    this.b = parama;
  }

  public ModelFileBags a()
  {
    List localList = this.b.a(this.a);
    ModelFileBags localModelFileBags = new ModelFileBags();
    localModelFileBags.setList(localList);
    return localModelFileBags;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a.b
 * JD-Core Version:    0.6.0
 */