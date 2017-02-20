package android.support.v4.a;

import android.support.v4.g.c;
import android.support.v4.g.n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class ah extends af
{
  static boolean a = false;
  final n<ai> b = new n();
  final n<ai> c = new n();
  final String d;
  boolean e;
  boolean f;
  private t g;

  ah(String paramString, t paramt, boolean paramBoolean)
  {
    this.d = paramString;
    this.g = paramt;
    this.e = paramBoolean;
  }

  void a(t paramt)
  {
    this.g = paramt;
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str;
    int i;
    ai localai;
    if (this.b.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      str = paramString + "    ";
      i = 0;
      while (i < this.b.b())
      {
        localai = (ai)this.b.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localai.toString());
        localai.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
    if (this.c.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      str = paramString + "    ";
      i = j;
      while (i < this.c.b())
      {
        localai = (ai)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localai.toString());
        localai.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
  }

  public boolean a()
  {
    int k = this.b.b();
    int i = 0;
    int m = 0;
    if (i < k)
    {
      ai localai = (ai)this.b.e(i);
      if ((localai.h) && (!localai.f));
      for (int j = 1; ; j = 0)
      {
        m |= j;
        i += 1;
        break;
      }
    }
    return m;
  }

  void b()
  {
    if (a)
      Log.v("LoaderManager", "Starting in " + this);
    if (this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
    }
    while (true)
    {
      return;
      this.e = true;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((ai)this.b.e(i)).a();
        i -= 1;
      }
    }
  }

  void c()
  {
    if (a)
      Log.v("LoaderManager", "Stopping in " + this);
    if (!this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((ai)this.b.e(i)).e();
      i -= 1;
    }
    this.e = false;
  }

  void d()
  {
    if (a)
      Log.v("LoaderManager", "Retaining in " + this);
    if (!this.e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, localRuntimeException);
    }
    while (true)
    {
      return;
      this.f = true;
      this.e = false;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((ai)this.b.e(i)).b();
        i -= 1;
      }
    }
  }

  void e()
  {
    if (this.f)
    {
      if (a)
        Log.v("LoaderManager", "Finished Retaining in " + this);
      this.f = false;
      int i = this.b.b() - 1;
      while (i >= 0)
      {
        ((ai)this.b.e(i)).c();
        i -= 1;
      }
    }
  }

  void f()
  {
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((ai)this.b.e(i)).k = true;
      i -= 1;
    }
  }

  void g()
  {
    int i = this.b.b() - 1;
    while (i >= 0)
    {
      ((ai)this.b.e(i)).d();
      i -= 1;
    }
  }

  void h()
  {
    if (!this.f)
    {
      if (a)
        Log.v("LoaderManager", "Destroying Active in " + this);
      i = this.b.b() - 1;
      while (i >= 0)
      {
        ((ai)this.b.e(i)).f();
        i -= 1;
      }
      this.b.c();
    }
    if (a)
      Log.v("LoaderManager", "Destroying Inactive in " + this);
    int i = this.c.b() - 1;
    while (i >= 0)
    {
      ((ai)this.c.e(i)).f();
      i -= 1;
    }
    this.c.c();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    c.a(this.g, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.ah
 * JD-Core Version:    0.6.0
 */