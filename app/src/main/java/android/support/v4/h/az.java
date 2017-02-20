package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

public class az
{
  private final View a;
  private ViewParent b;
  private boolean c;
  private int[] d;

  public az(View paramView)
  {
    this.a = paramView;
  }

  public void a(boolean paramBoolean)
  {
    if (this.c)
      bi.p(this.a);
    this.c = paramBoolean;
  }

  public boolean a()
  {
    return this.c;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    if ((a()) && (this.b != null))
      return cl.a(this.b, this.a, paramFloat1, paramFloat2);
    return false;
  }

  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((a()) && (this.b != null))
      return cl.a(this.b, this.a, paramFloat1, paramFloat2, paramBoolean);
    return false;
  }

  public boolean a(int paramInt)
  {
    if (b())
      return true;
    if (a())
    {
      ViewParent localViewParent = this.a.getParent();
      View localView = this.a;
      while (localViewParent != null)
      {
        if (cl.a(localViewParent, localView, this.a, paramInt))
        {
          this.b = localViewParent;
          cl.b(localViewParent, localView, this.a, paramInt);
          return true;
        }
        if ((localViewParent instanceof View))
          localView = (View)localViewParent;
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }

  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int m = 0;
    int k = m;
    int j;
    int i;
    if (a())
    {
      k = m;
      if (this.b != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
          break label126;
        if (paramArrayOfInt == null)
          break label147;
        this.a.getLocationInWindow(paramArrayOfInt);
        j = paramArrayOfInt[0];
        i = paramArrayOfInt[1];
      }
    }
    while (true)
    {
      cl.a(this.b, this.a, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfInt != null)
      {
        this.a.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= j;
        paramArrayOfInt[1] -= i;
      }
      k = 1;
      label126: 
      do
      {
        return k;
        k = m;
      }
      while (paramArrayOfInt == null);
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return false;
      label147: i = 0;
      j = 0;
    }
  }

  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int m = 0;
    int k = m;
    int j;
    int i;
    if (a())
    {
      k = m;
      if (this.b != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
          break label171;
        if (paramArrayOfInt2 == null)
          break label192;
        this.a.getLocationInWindow(paramArrayOfInt2);
        j = paramArrayOfInt2[0];
        i = paramArrayOfInt2[1];
      }
    }
    while (true)
    {
      int[] arrayOfInt = paramArrayOfInt1;
      if (paramArrayOfInt1 == null)
      {
        if (this.d == null)
          this.d = new int[2];
        arrayOfInt = this.d;
      }
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      cl.a(this.b, this.a, paramInt1, paramInt2, arrayOfInt);
      if (paramArrayOfInt2 != null)
      {
        this.a.getLocationInWindow(paramArrayOfInt2);
        paramArrayOfInt2[0] -= j;
        paramArrayOfInt2[1] -= i;
      }
      if (arrayOfInt[0] == 0)
      {
        k = m;
        if (arrayOfInt[1] == 0);
      }
      else
      {
        k = 1;
      }
      label171: 
      do
      {
        return k;
        k = m;
      }
      while (paramArrayOfInt2 == null);
      paramArrayOfInt2[0] = 0;
      paramArrayOfInt2[1] = 0;
      return false;
      label192: i = 0;
      j = 0;
    }
  }

  public boolean b()
  {
    return this.b != null;
  }

  public void c()
  {
    if (this.b != null)
    {
      cl.a(this.b, this.a);
      this.b = null;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.az
 * JD-Core Version:    0.6.0
 */