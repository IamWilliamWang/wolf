package android.support.v4.g;

import java.util.Iterator;

final class h<T>
  implements Iterator<T>
{
  final int a;
  int b;
  int c;
  boolean d = false;

  h(g paramg, int paramInt)
  {
    this.a = paramInt;
    this.b = paramg.a();
  }

  public boolean hasNext()
  {
    return this.c < this.b;
  }

  public T next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c += 1;
    this.d = true;
    return localObject;
  }

  public void remove()
  {
    if (!this.d)
      throw new IllegalStateException();
    this.c -= 1;
    this.b -= 1;
    this.d = false;
    this.e.a(this.c);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.h
 * JD-Core Version:    0.6.0
 */