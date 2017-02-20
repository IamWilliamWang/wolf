package android.support.v7.widget;

class bj
{
  private int a = 0;
  private int b = 0;
  private int c = -2147483648;
  private int d = -2147483648;
  private int e = 0;
  private int f = 0;
  private boolean g = false;
  private boolean h = false;

  public int a()
  {
    return this.a;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = true;
    if (this.g)
    {
      if (paramInt2 != -2147483648)
        this.a = paramInt2;
      if (paramInt1 != -2147483648)
        this.b = paramInt1;
    }
    do
    {
      return;
      if (paramInt1 == -2147483648)
        continue;
      this.a = paramInt1;
    }
    while (paramInt2 == -2147483648);
    this.b = paramInt2;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean == this.g)
      return;
    this.g = paramBoolean;
    if (this.h)
    {
      if (paramBoolean)
      {
        if (this.d != -2147483648)
        {
          i = this.d;
          this.a = i;
          if (this.c == -2147483648)
            break label72;
        }
        label72: for (i = this.c; ; i = this.f)
        {
          this.b = i;
          return;
          i = this.e;
          break;
        }
      }
      if (this.c != -2147483648)
      {
        i = this.c;
        this.a = i;
        if (this.d == -2147483648)
          break label127;
      }
      label127: for (int i = this.d; ; i = this.f)
      {
        this.b = i;
        return;
        i = this.e;
        break;
      }
    }
    this.a = this.e;
    this.b = this.f;
  }

  public int b()
  {
    return this.b;
  }

  public void b(int paramInt1, int paramInt2)
  {
    this.h = false;
    if (paramInt1 != -2147483648)
    {
      this.e = paramInt1;
      this.a = paramInt1;
    }
    if (paramInt2 != -2147483648)
    {
      this.f = paramInt2;
      this.b = paramInt2;
    }
  }

  public int c()
  {
    if (this.g)
      return this.b;
    return this.a;
  }

  public int d()
  {
    if (this.g)
      return this.a;
    return this.b;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bj
 * JD-Core Version:    0.6.0
 */