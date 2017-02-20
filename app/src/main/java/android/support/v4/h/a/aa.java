package android.support.v4.h.a;

import android.os.Build.VERSION;

public class aa
{
  private static final ad a;
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ae();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new ac();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new ab();
      return;
    }
    a = new af();
  }

  public aa(Object paramObject)
  {
    this.b = paramObject;
  }

  public void a(int paramInt)
  {
    a.a(this.b, paramInt);
  }

  public void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }

  public void b(int paramInt)
  {
    a.b(this.b, paramInt);
  }

  public void c(int paramInt)
  {
    a.c(this.b, paramInt);
  }

  public void d(int paramInt)
  {
    a.d(this.b, paramInt);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    do
      while (true)
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        paramObject = (aa)paramObject;
        if (this.b != null)
          break;
        if (paramObject.b != null)
          return false;
      }
    while (this.b.equals(paramObject.b));
    return false;
  }

  public int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.aa
 * JD-Core Version:    0.6.0
 */