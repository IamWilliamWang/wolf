package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;

final class l
  implements Collection<V>
{
  l(g paramg)
  {
  }

  public boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(Collection<? extends V> paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public void clear()
  {
    this.a.c();
  }

  public boolean contains(Object paramObject)
  {
    return this.a.b(paramObject) >= 0;
  }

  public boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
      if (!contains(paramCollection.next()))
        return false;
    return true;
  }

  public boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public Iterator<V> iterator()
  {
    return new h(this.a, 1);
  }

  public boolean remove(Object paramObject)
  {
    int i = this.a.b(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }

  public boolean removeAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    int n = 0;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        m = i - 1;
        k = j - 1;
        n = 1;
      }
      i = m + 1;
      j = k;
    }
    return n;
  }

  public boolean retainAll(Collection<?> paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    int n = 0;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (!paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        m = i - 1;
        k = j - 1;
        n = 1;
      }
      i = m + 1;
      j = k;
    }
    return n;
  }

  public int size()
  {
    return this.a.a();
  }

  public Object[] toArray()
  {
    return this.a.b(1);
  }

  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this.a.a(paramArrayOfT, 1);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.l
 * JD-Core Version:    0.6.0
 */