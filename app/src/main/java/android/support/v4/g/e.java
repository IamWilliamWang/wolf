package android.support.v4.g;

public class e<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private long[] c;
  private Object[] d;
  private int e;

  public e()
  {
    this(10);
  }

  public e(int paramInt)
  {
    if (paramInt == 0)
      this.c = b.b;
    for (this.d = b.c; ; this.d = new Object[paramInt])
    {
      this.e = 0;
      return;
      paramInt = b.b(paramInt);
      this.c = new long[paramInt];
    }
  }

  private void c()
  {
    int m = this.e;
    long[] arrayOfLong = this.c;
    Object[] arrayOfObject = this.d;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      Object localObject = arrayOfObject[i];
      k = j;
      if (localObject != a)
      {
        if (i != j)
        {
          arrayOfLong[j] = arrayOfLong[i];
          arrayOfObject[j] = localObject;
          arrayOfObject[i] = null;
        }
        k = j + 1;
      }
      i += 1;
    }
    this.b = false;
    this.e = j;
  }

  public long a(int paramInt)
  {
    if (this.b)
      c();
    return this.c[paramInt];
  }

  // ERROR //
  public e<E> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 55	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	android/support/v4/g/e
    //   7: astore_1
    //   8: aload_1
    //   9: aload_0
    //   10: getfield 36	android/support/v4/g/e:c	[J
    //   13: invokevirtual 57	[J:clone	()Ljava/lang/Object;
    //   16: checkcast 56	[J
    //   19: putfield 36	android/support/v4/g/e:c	[J
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 40	android/support/v4/g/e:d	[Ljava/lang/Object;
    //   27: invokevirtual 59	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 58	[Ljava/lang/Object;
    //   33: putfield 40	android/support/v4/g/e:d	[Ljava/lang/Object;
    //   36: aload_1
    //   37: areturn
    //   38: astore_1
    //   39: aconst_null
    //   40: areturn
    //   41: astore_2
    //   42: aload_1
    //   43: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	38	java/lang/CloneNotSupportedException
    //   8	36	41	java/lang/CloneNotSupportedException
  }

  public E a(long paramLong)
  {
    return a(paramLong, null);
  }

  public E a(long paramLong, E paramE)
  {
    int i = b.a(this.c, this.e, paramLong);
    if ((i < 0) || (this.d[i] == a))
      return paramE;
    return this.d[i];
  }

  public int b()
  {
    if (this.b)
      c();
    return this.e;
  }

  public E b(int paramInt)
  {
    if (this.b)
      c();
    return this.d[paramInt];
  }

  public void b(long paramLong)
  {
    int i = b.a(this.c, this.e, paramLong);
    if ((i >= 0) && (this.d[i] != a))
    {
      this.d[i] = a;
      this.b = true;
    }
  }

  public void b(long paramLong, E paramE)
  {
    int i = b.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramLong;
      this.d[j] = paramE;
      return;
    }
    i = j;
    if (this.b)
    {
      i = j;
      if (this.e >= this.c.length)
      {
        c();
        i = b.a(this.c, this.e, paramLong) ^ 0xFFFFFFFF;
      }
    }
    if (this.e >= this.c.length)
    {
      j = b.b(this.e + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.c, 0, arrayOfLong, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfLong;
      this.d = arrayOfObject;
    }
    if (this.e - i != 0)
    {
      System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
      System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
    }
    this.c[i] = paramLong;
    this.d[i] = paramE;
    this.e += 1;
  }

  public String toString()
  {
    if (b() <= 0)
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(this.e * 28);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.e)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      localStringBuilder.append(a(i));
      localStringBuilder.append('=');
      Object localObject = b(i);
      if (localObject != this)
        localStringBuilder.append(localObject);
      while (true)
      {
        i += 1;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.e
 * JD-Core Version:    0.6.0
 */