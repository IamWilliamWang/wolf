package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class r
{
  private static final s a;
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new u();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new t();
      return;
    }
    a = new v();
  }

  public r()
  {
    this.b = a.a(this);
  }

  public r(Object paramObject)
  {
    this.b = paramObject;
  }

  public f a(int paramInt)
  {
    return null;
  }

  public Object a()
  {
    return this.b;
  }

  public List<f> a(String paramString, int paramInt)
  {
    return null;
  }

  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }

  public f b(int paramInt)
  {
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.r
 * JD-Core Version:    0.6.0
 */