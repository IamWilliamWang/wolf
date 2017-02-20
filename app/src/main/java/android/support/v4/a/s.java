package android.support.v4.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.List<Landroid.support.v4.a.m;>;

public class s
{
  private final t<?> a;

  private s(t<?> paramt)
  {
    this.a = paramt;
  }

  public static final s a(t<?> paramt)
  {
    return new s(paramt);
  }

  m a(String paramString)
  {
    return this.a.d.b(paramString);
  }

  public u a()
  {
    return this.a.i();
  }

  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }

  public List<m> a(List<m> paramList)
  {
    if (this.a.d.f == null)
      return null;
    Object localObject = paramList;
    if (paramList == null)
      localObject = new ArrayList(b());
    ((List)localObject).addAll(this.a.d.f);
    return (List<m>)localObject;
  }

  public void a(Configuration paramConfiguration)
  {
    this.a.d.a(paramConfiguration);
  }

  public void a(Parcelable paramParcelable, List<m> paramList)
  {
    this.a.d.a(paramParcelable, paramList);
  }

  public void a(m paramm)
  {
    this.a.d.a(this.a, this.a, paramm);
  }

  public void a(android.support.v4.g.m<String, af> paramm)
  {
    this.a.a(paramm);
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.b(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }

  public boolean a(Menu paramMenu)
  {
    return this.a.d.a(paramMenu);
  }

  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return this.a.d.a(paramMenu, paramMenuInflater);
  }

  public boolean a(MenuItem paramMenuItem)
  {
    return this.a.d.a(paramMenuItem);
  }

  public int b()
  {
    ArrayList localArrayList = this.a.d.f;
    if (localArrayList == null)
      return 0;
    return localArrayList.size();
  }

  public void b(Menu paramMenu)
  {
    this.a.d.b(paramMenu);
  }

  public boolean b(MenuItem paramMenuItem)
  {
    return this.a.d.b(paramMenuItem);
  }

  public void c()
  {
    this.a.d.h();
  }

  public Parcelable d()
  {
    return this.a.d.g();
  }

  public List<m> e()
  {
    return this.a.d.f();
  }

  public void f()
  {
    this.a.d.i();
  }

  public void g()
  {
    this.a.d.j();
  }

  public void h()
  {
    this.a.d.k();
  }

  public void i()
  {
    this.a.d.l();
  }

  public void j()
  {
    this.a.d.m();
  }

  public void k()
  {
    this.a.d.n();
  }

  public void l()
  {
    this.a.d.o();
  }

  public void m()
  {
    this.a.d.q();
  }

  public void n()
  {
    this.a.d.r();
  }

  public boolean o()
  {
    return this.a.d.d();
  }

  public void p()
  {
    this.a.k();
  }

  public void q()
  {
    this.a.l();
  }

  public void r()
  {
    this.a.m();
  }

  public android.support.v4.g.m<String, af> s()
  {
    return this.a.n();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.s
 * JD-Core Version:    0.6.0
 */