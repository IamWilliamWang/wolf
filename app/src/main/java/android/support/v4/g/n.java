package android.support.v4.g;

public class n<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;

  public n()
  {
    this(10);
  }

  public n(int paramInt)
  {
    if (paramInt == 0)
      this.c = b.a;
    for (this.d = b.c; ; this.d = new Object[paramInt])
    {
      this.e = 0;
      return;
      paramInt = b.a(paramInt);
      this.c = new int[paramInt];
    }
  }

  private void d()
  {
    int m = this.e;
    int[] arrayOfInt = this.c;
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
          arrayOfInt[j] = arrayOfInt[i];
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

  // ERROR //
  public n<E> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 52	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	android/support/v4/g/n
    //   7: astore_1
    //   8: aload_1
    //   9: aload_0
    //   10: getfield 36	android/support/v4/g/n:c	[I
    //   13: invokevirtual 54	[I:clone	()Ljava/lang/Object;
    //   16: checkcast 53	[I
    //   19: putfield 36	android/support/v4/g/n:c	[I
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 40	android/support/v4/g/n:d	[Ljava/lang/Object;
    //   27: invokevirtual 56	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 55	[Ljava/lang/Object;
    //   33: putfield 40	android/support/v4/g/n:d	[Ljava/lang/Object;
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

  public E a(int paramInt)
  {
    return a(paramInt, null);
  }

  public E a(int paramInt, E paramE)
  {
    paramInt = b.a(this.c, this.e, paramInt);
    if ((paramInt < 0) || (this.d[paramInt] == a))
      return paramE;
    return this.d[paramInt];
  }

  public int b()
  {
    if (this.b)
      d();
    return this.e;
  }

  public void b(int paramInt)
  {
    paramInt = b.a(this.c, this.e, paramInt);
    if ((paramInt >= 0) && (this.d[paramInt] != a))
    {
      this.d[paramInt] = a;
      this.b = true;
    }
  }

  public void b(int paramInt, E paramE)
  {
    int i = b.a(this.c, this.e, paramInt);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramE;
      return;
    }
    i = j;
    if (this.b)
    {
      i = j;
      if (this.e >= this.c.length)
      {
        d();
        i = b.a(this.c, this.e, paramInt) ^ 0xFFFFFFFF;
      }
    }
    if (this.e >= this.c.length)
    {
      j = b.a(this.e + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    if (this.e - i != 0)
    {
      System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
      System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
    }
    this.c[i] = paramInt;
    this.d[i] = paramE;
    this.e += 1;
  }

  public void c()
  {
    int j = this.e;
    Object[] arrayOfObject = this.d;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    this.e = 0;
    this.b = false;
  }

  public void c(int paramInt)
  {
    b(paramInt);
  }

  public int d(int paramInt)
  {
    if (this.b)
      d();
    return this.c[paramInt];
  }

  public E e(int paramInt)
  {
    if (this.b)
      d();
    return this.d[paramInt];
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
      localStringBuilder.append(d(i));
      localStringBuilder.append('=');
      Object localObject = e(i);
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
 * Qualified Name:     android.support.v4.g.n
 * JD-Core Version:    0.6.0
 */