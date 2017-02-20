package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V> extends m<K, V>
  implements Map<K, V>
{
  g<K, V> a;

  public a()
  {
  }

  public a(int paramInt)
  {
    super(paramInt);
  }

  private g<K, V> b()
  {
    if (this.a == null)
      this.a = new g()
      {
        protected int a()
        {
          return a.this.h;
        }

        protected int a(Object paramObject)
        {
          return a.this.a(paramObject);
        }

        protected Object a(int paramInt1, int paramInt2)
        {
          return a.this.g[((paramInt1 << 1) + paramInt2)];
        }

        protected V a(int paramInt, V paramV)
        {
          return a.this.a(paramInt, paramV);
        }

        protected void a(int paramInt)
        {
          a.this.d(paramInt);
        }

        protected void a(K paramK, V paramV)
        {
          a.this.put(paramK, paramV);
        }

        protected int b(Object paramObject)
        {
          return a.this.b(paramObject);
        }

        protected Map<K, V> b()
        {
          return a.this;
        }

        protected void c()
        {
          a.this.clear();
        }
      };
    return this.a;
  }

  public boolean a(Collection<?> paramCollection)
  {
    return g.c(this, paramCollection);
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    return b().d();
  }

  public Set<K> keySet()
  {
    return b().e();
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.h + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection<V> values()
  {
    return b().f();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.a
 * JD-Core Version:    0.6.0
 */