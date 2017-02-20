package android.support.v4.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class t<E> extends r
{
  private final Activity a;
  final Context b;
  final int c;
  final w d = new w();
  private final Handler e;
  private android.support.v4.g.m<String, af> f;
  private boolean g;
  private ah h;
  private boolean i;
  private boolean j;

  t(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }

  t(o paramo)
  {
    this(paramo, paramo, paramo.a, 0);
  }

  ah a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f == null)
      this.f = new android.support.v4.g.m();
    ah localah = (ah)this.f.get(paramString);
    if (localah == null)
    {
      if (paramBoolean2)
      {
        localah = new ah(paramString, this, paramBoolean1);
        this.f.put(paramString, localah);
      }
      return localah;
    }
    localah.a(this);
    return localah;
  }

  public View a(int paramInt)
  {
    return null;
  }

  void a(android.support.v4.g.m<String, af> paramm)
  {
    this.f = paramm;
  }

  void a(String paramString)
  {
    if (this.f != null)
    {
      ah localah = (ah)this.f.get(paramString);
      if ((localah != null) && (!localah.f))
      {
        localah.h();
        this.f.remove(paramString);
      }
    }
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
  }

  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.h == null);
    do
      return;
    while (!this.j);
    this.j = false;
    if (paramBoolean)
    {
      this.h.d();
      return;
    }
    this.h.c();
  }

  public boolean a()
  {
    return true;
  }

  public boolean a(m paramm)
  {
    return true;
  }

  public LayoutInflater b()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }

  void b(m paramm)
  {
  }

  void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.h != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
      paramPrintWriter.println(":");
      this.h.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }

  public void c()
  {
  }

  public boolean d()
  {
    return true;
  }

  public int e()
  {
    return this.c;
  }

  Activity f()
  {
    return this.a;
  }

  Context g()
  {
    return this.b;
  }

  Handler h()
  {
    return this.e;
  }

  w i()
  {
    return this.d;
  }

  boolean j()
  {
    return this.g;
  }

  void k()
  {
    if (this.j)
      return;
    this.j = true;
    if (this.h != null)
      this.h.b();
    while (true)
    {
      this.i = true;
      return;
      if (this.i)
        continue;
      this.h = a("(root)", this.j, false);
      if ((this.h == null) || (this.h.e))
        continue;
      this.h.b();
    }
  }

  void l()
  {
    if (this.h == null)
      return;
    this.h.h();
  }

  void m()
  {
    if (this.f != null)
    {
      int m = this.f.size();
      ah[] arrayOfah = new ah[m];
      int k = m - 1;
      while (k >= 0)
      {
        arrayOfah[k] = ((ah)this.f.c(k));
        k -= 1;
      }
      k = 0;
      while (k < m)
      {
        ah localah = arrayOfah[k];
        localah.e();
        localah.g();
        k += 1;
      }
    }
  }

  android.support.v4.g.m<String, af> n()
  {
    int m = 0;
    int n;
    if (this.f != null)
    {
      int i1 = this.f.size();
      ah[] arrayOfah = new ah[i1];
      int k = i1 - 1;
      while (k >= 0)
      {
        arrayOfah[k] = ((ah)this.f.c(k));
        k -= 1;
      }
      k = 0;
      n = k;
      if (m < i1)
      {
        ah localah = arrayOfah[m];
        if (localah.f)
          k = 1;
        while (true)
        {
          m += 1;
          break;
          localah.h();
          this.f.remove(localah.d);
        }
      }
    }
    else
    {
      n = 0;
    }
    if (n != 0)
      return this.f;
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.t
 * JD-Core Version:    0.6.0
 */