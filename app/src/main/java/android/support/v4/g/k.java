package android.support.v4.g;

import java.util.Iterator;
import java.util.Map.Entry;

final class k
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  int a;
  int b;
  boolean c = false;

  k(g paramg)
  {
    this.a = (paramg.a() - 1);
    this.b = -1;
  }

  public Map.Entry<K, V> a()
  {
    this.b += 1;
    this.c = true;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    int i = 1;
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    if (!(paramObject instanceof Map.Entry))
      return false;
    paramObject = (Map.Entry)paramObject;
    if ((b.a(paramObject.getKey(), this.d.a(this.b, 0))) && (b.a(paramObject.getValue(), this.d.a(this.b, 1))));
    while (true)
    {
      return i;
      i = 0;
    }
  }

  public K getKey()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 0);
  }

  public V getValue()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 1);
  }

  public boolean hasNext()
  {
    return this.b < this.a;
  }

  public final int hashCode()
  {
    int j = 0;
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    if (localObject1 == null)
    {
      i = 0;
      if (localObject2 != null)
        break label69;
    }
    while (true)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69: j = localObject2.hashCode();
    }
  }

  public void remove()
  {
    if (!this.c)
      throw new IllegalStateException();
    this.d.a(this.b);
    this.b -= 1;
    this.a -= 1;
    this.c = false;
  }

  public V setValue(V paramV)
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, paramV);
  }

  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.k
 * JD-Core Version:    0.6.0
 */