package android.support.v4.a;

import android.os.Build.VERSION;
import android.support.v4.g.a;
import android.support.v4.g.d;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseArray<Landroid.support.v4.a.m;>;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class g extends ab
  implements Runnable
{
  static final boolean a;
  final w b;
  h c;
  h d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  boolean m = true;
  String n;
  boolean o;
  int p = -1;
  int q;
  CharSequence r;
  int s;
  CharSequence t;
  ArrayList<String> u;
  ArrayList<String> v;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public g(w paramw)
  {
    this.b = paramw;
  }

  private i a(SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2, boolean paramBoolean)
  {
    int i5 = 0;
    a(paramSparseArray2);
    i locali = new i(this);
    locali.d = new View(this.b.o.g());
    int i2 = 0;
    int i1 = 0;
    int i3 = i5;
    int i4 = i1;
    if (i2 < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(i2), locali, paramBoolean, paramSparseArray1, paramSparseArray2))
        break label169;
      i1 = 1;
    }
    label169: 
    while (true)
    {
      i2 += 1;
      break;
      while (i3 < paramSparseArray2.size())
      {
        i2 = paramSparseArray2.keyAt(i3);
        i1 = i4;
        if (paramSparseArray1.get(i2) == null)
        {
          i1 = i4;
          if (a(i2, locali, paramBoolean, paramSparseArray1, paramSparseArray2))
            i1 = 1;
        }
        i3 += 1;
        i4 = i1;
      }
      paramSparseArray1 = locali;
      if (i4 == 0)
        paramSparseArray1 = null;
      return paramSparseArray1;
    }
  }

  private a<String, View> a(i parami, m paramm, boolean paramBoolean)
  {
    a locala2 = new a();
    a locala1 = locala2;
    if (this.u != null)
    {
      ac.a(locala2, paramm.g());
      if (!paramBoolean)
        break label82;
      locala2.a(this.v);
    }
    label82: for (locala1 = locala2; paramBoolean; locala1 = a(this.u, this.v, locala2))
    {
      if (paramm.X != null)
        paramm.X.a(this.v, locala1);
      a(parami, locala1, false);
      return locala1;
    }
    if (paramm.Y != null)
      paramm.Y.a(this.v, locala1);
    b(parami, locala1, false);
    return locala1;
  }

  private a<String, View> a(i parami, boolean paramBoolean, m paramm)
  {
    a locala = b(parami, paramm, paramBoolean);
    if (paramBoolean)
    {
      if (paramm.Y != null)
        paramm.Y.a(this.v, locala);
      a(parami, locala, true);
      return locala;
    }
    if (paramm.X != null)
      paramm.X.a(this.v, locala);
    b(parami, locala, true);
    return locala;
  }

  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama)
  {
    if (parama.isEmpty())
      return parama;
    a locala = new a();
    int i2 = paramArrayList1.size();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = (View)parama.get(paramArrayList1.get(i1));
      if (localView != null)
        locala.put(paramArrayList2.get(i1), localView);
      i1 += 1;
    }
    return locala;
  }

  private static Object a(m paramm1, m paramm2, boolean paramBoolean)
  {
    if ((paramm1 == null) || (paramm2 == null))
      return null;
    if (paramBoolean);
    for (paramm1 = paramm2.v(); ; paramm1 = paramm1.u())
      return ac.b(paramm1);
  }

  private static Object a(m paramm, boolean paramBoolean)
  {
    if (paramm == null)
      return null;
    if (paramBoolean);
    for (paramm = paramm.t(); ; paramm = paramm.q())
      return ac.a(paramm);
  }

  private static Object a(Object paramObject, m paramm, ArrayList<View> paramArrayList, a<String, View> parama, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null)
      localObject = ac.a(paramObject, paramm.g(), paramArrayList, parama, paramView);
    return localObject;
  }

  private void a(i parami, int paramInt, Object paramObject)
  {
    if (this.b.g != null)
    {
      int i1 = 0;
      if (i1 < this.b.g.size())
      {
        m localm = (m)this.b.g.get(i1);
        if ((localm.I != null) && (localm.H != null) && (localm.x == paramInt))
        {
          if (!localm.z)
            break label125;
          if (!parami.b.contains(localm.I))
          {
            ac.a(paramObject, localm.I, true);
            parami.b.add(localm.I);
          }
        }
        while (true)
        {
          i1 += 1;
          break;
          label125: ac.a(paramObject, localm.I, false);
          parami.b.remove(localm.I);
        }
      }
    }
  }

  private void a(i parami, m paramm1, m paramm2, boolean paramBoolean, a<String, View> parama)
  {
    if (paramBoolean);
    for (parami = paramm2.X; ; parami = paramm1.X)
    {
      if (parami != null)
        parami.b(new ArrayList(parama.keySet()), new ArrayList(parama.values()), null);
      return;
    }
  }

  private void a(i parami, a<String, View> parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13: String str;
    Object localObject;
    if (this.v == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1)
        return;
      str = (String)this.u.get(i2);
      localObject = (View)parama.get((String)this.v.get(i2));
      if (localObject != null)
      {
        localObject = ac.a((View)localObject);
        if (!paramBoolean)
          break label103;
        a(parami.a, str, (String)localObject);
      }
    }
    while (true)
    {
      i2 += 1;
      break label13;
      i1 = this.v.size();
      break;
      label103: a(parami.a, (String)localObject, str);
    }
  }

  private void a(i parami, View paramView, Object paramObject, m paramm1, m paramm2, boolean paramBoolean, ArrayList<View> paramArrayList)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(paramView, paramObject, paramArrayList, parami, paramBoolean, paramm1, paramm2)
    {
      public boolean onPreDraw()
      {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.b != null)
        {
          ac.a(this.b, this.c);
          this.c.clear();
          a locala = g.a(g.this, this.d, this.e, this.f);
          ac.a(this.b, this.d.d, locala, this.c);
          g.a(g.this, locala, this.d);
          g.a(g.this, this.d, this.f, this.g, this.e, locala);
        }
        return true;
      }
    });
  }

  private static void a(i parami, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if (paramArrayList1 != null)
    {
      int i1 = 0;
      while (i1 < paramArrayList1.size())
      {
        String str1 = (String)paramArrayList1.get(i1);
        String str2 = (String)paramArrayList2.get(i1);
        a(parami.a, str1, str2);
        i1 += 1;
      }
    }
  }

  private void a(a<String, View> parama, i parami)
  {
    if ((this.v != null) && (!parama.isEmpty()))
    {
      parama = (View)parama.get(this.v.get(0));
      if (parama != null)
        parami.c.a = parama;
    }
  }

  private static void a(a<String, String> parama, String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString2 != null))
      i1 = 0;
    while (i1 < parama.size())
    {
      if (paramString1.equals(parama.c(i1)))
      {
        parama.a(i1, paramString2);
        return;
      }
      i1 += 1;
    }
    parama.put(paramString1, paramString2);
  }

  private void a(SparseArray<m> paramSparseArray)
  {
    int i2 = paramSparseArray.size();
    int i1 = 0;
    while (i1 < i2)
    {
      m localm = (m)paramSparseArray.valueAt(i1);
      if (localm.b < 1)
      {
        this.b.c(localm);
        this.b.a(localm, 1, 0, 0, false);
      }
      i1 += 1;
    }
  }

  private static void a(SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2, m paramm)
  {
    if (paramm != null)
    {
      int i1 = paramm.x;
      if ((i1 != 0) && (!paramm.f()))
      {
        if ((paramm.e()) && (paramm.g() != null) && (paramSparseArray1.get(i1) == null))
          paramSparseArray1.put(i1, paramm);
        if (paramSparseArray2.get(i1) == paramm)
          paramSparseArray2.remove(i1);
      }
    }
  }

  private void a(View paramView, i parami, int paramInt, Object paramObject)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(paramView, parami, paramInt, paramObject)
    {
      public boolean onPreDraw()
      {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        g.a(g.this, this.b, this.c, this.d);
        return true;
      }
    });
  }

  private boolean a(int paramInt, i parami, boolean paramBoolean, SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.b.p.a(paramInt);
    if (localViewGroup == null)
      return false;
    Object localObject2 = (m)paramSparseArray2.get(paramInt);
    Object localObject4 = (m)paramSparseArray1.get(paramInt);
    Object localObject3 = a((m)localObject2, paramBoolean);
    paramSparseArray2 = a((m)localObject2, (m)localObject4, paramBoolean);
    Object localObject5 = b((m)localObject4, paramBoolean);
    paramSparseArray1 = null;
    ArrayList localArrayList1 = new ArrayList();
    if (paramSparseArray2 != null)
    {
      localObject1 = a(parami, (m)localObject4, paramBoolean);
      if (((a)localObject1).isEmpty())
      {
        paramSparseArray1 = null;
        paramSparseArray2 = null;
        if ((localObject3 != null) || (paramSparseArray2 != null) || (localObject5 != null))
          break label208;
        return false;
      }
      if (!paramBoolean)
        break label198;
    }
    label198: for (paramSparseArray1 = ((m)localObject4).X; ; paramSparseArray1 = ((m)localObject2).X)
    {
      if (paramSparseArray1 != null)
        paramSparseArray1.a(new ArrayList(((a)localObject1).keySet()), new ArrayList(((a)localObject1).values()), null);
      a(parami, localViewGroup, paramSparseArray2, (m)localObject2, (m)localObject4, paramBoolean, localArrayList1);
      paramSparseArray1 = (SparseArray<m>)localObject1;
      break;
    }
    label208: Object localObject1 = new ArrayList();
    localObject4 = a(localObject5, (m)localObject4, (ArrayList)localObject1, paramSparseArray1, parami.d);
    if ((this.v != null) && (paramSparseArray1 != null))
    {
      localObject5 = (View)paramSparseArray1.get(this.v.get(0));
      if (localObject5 != null)
      {
        if (localObject4 != null)
          ac.a(localObject4, (View)localObject5);
        if (paramSparseArray2 != null)
          ac.a(paramSparseArray2, (View)localObject5);
      }
    }
    localObject5 = new ae((m)localObject2)
    {
      public View a()
      {
        return this.a.g();
      }
    };
    ArrayList localArrayList2 = new ArrayList();
    a locala = new a();
    boolean bool = true;
    if (localObject2 != null)
      if (!paramBoolean)
        break label462;
    label462: for (bool = ((m)localObject2).x(); ; bool = ((m)localObject2).w())
    {
      localObject2 = ac.a(localObject3, localObject4, paramSparseArray2, bool);
      if (localObject2 != null)
      {
        ac.a(localObject3, paramSparseArray2, localViewGroup, (ae)localObject5, parami.d, parami.c, parami.a, localArrayList2, paramSparseArray1, locala, localArrayList1);
        a(localViewGroup, parami, paramInt, localObject2);
        ac.a(localObject2, parami.d, true);
        a(parami, paramInt, localObject2);
        ac.a(localViewGroup, localObject2);
        ac.a(localViewGroup, parami.d, localObject3, localArrayList2, localObject4, (ArrayList)localObject1, paramSparseArray2, localArrayList1, localObject2, parami.b, locala);
      }
      if (localObject2 == null)
        break;
      return true;
    }
    return false;
  }

  private a<String, View> b(i parami, m paramm, boolean paramBoolean)
  {
    a locala = new a();
    paramm = paramm.g();
    parami = locala;
    if (paramm != null)
    {
      parami = locala;
      if (this.u != null)
      {
        ac.a(locala, paramm);
        if (!paramBoolean)
          break label57;
        parami = a(this.u, this.v, locala);
      }
    }
    return parami;
    label57: locala.a(this.v);
    return locala;
  }

  private static Object b(m paramm, boolean paramBoolean)
  {
    if (paramm == null)
      return null;
    if (paramBoolean);
    for (paramm = paramm.r(); ; paramm = paramm.s())
      return ac.a(paramm);
  }

  private void b(i parami, a<String, View> parama, boolean paramBoolean)
  {
    int i2 = parama.size();
    int i1 = 0;
    if (i1 < i2)
    {
      String str1 = (String)parama.b(i1);
      String str2 = ac.a((View)parama.c(i1));
      if (paramBoolean)
        a(parami.a, str1, str2);
      while (true)
      {
        i1 += 1;
        break;
        a(parami.a, str2, str1);
      }
    }
  }

  private void b(SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2)
  {
    if (!this.b.p.a());
    h localh;
    do
    {
      return;
      localh = this.c;
    }
    while (localh == null);
    switch (localh.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localh = localh.a;
      break;
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      Object localObject1 = localh.d;
      if (this.b.g != null)
      {
        int i1 = 0;
        if (i1 < this.b.g.size())
        {
          m localm = (m)this.b.g.get(i1);
          Object localObject2;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localm.x != ((m)localObject1).x);
          }
          else
          {
            if (localm != localObject1)
              break label197;
            localObject2 = null;
            paramSparseArray2.remove(localm.x);
          }
          while (true)
          {
            i1 += 1;
            localObject1 = localObject2;
            break;
            label197: a(paramSparseArray1, paramSparseArray2, localm);
            localObject2 = localObject1;
          }
        }
      }
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localh.d);
    }
  }

  private void b(SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2, m paramm)
  {
    if (paramm != null)
    {
      int i1 = paramm.x;
      if (i1 != 0)
      {
        if (!paramm.e())
          paramSparseArray2.put(i1, paramm);
        if (paramSparseArray1.get(i1) == paramm)
          paramSparseArray1.remove(i1);
      }
    }
  }

  public i a(boolean paramBoolean, i parami, SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2)
  {
    if (w.a)
    {
      Log.v("FragmentManager", "popFromBackStack: " + this);
      a("  ", null, new PrintWriter(new d("FragmentManager")), null);
    }
    i locali = parami;
    if (a)
    {
      if (parami != null)
        break label223;
      if (paramSparseArray1.size() == 0)
      {
        locali = parami;
        if (paramSparseArray2.size() == 0);
      }
      else
      {
        locali = a(paramSparseArray1, paramSparseArray2, true);
      }
    }
    label100: a(-1);
    int i1;
    label113: int i2;
    label121: int i3;
    if (locali != null)
    {
      i1 = 0;
      if (locali == null)
        break label257;
      i2 = 0;
      parami = this.d;
      if (parami == null)
        break label546;
      if (locali == null)
        break label266;
      i3 = 0;
      label138: if (locali == null)
        break label275;
    }
    label257: label266: label275: for (int i4 = 0; ; i4 = parami.h)
      switch (parami.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + parami.c);
        label223: locali = parami;
        if (paramBoolean)
          break label100;
        a(parami, this.v, this.u);
        locali = parami;
        break label100;
        i1 = this.k;
        break label113;
        i2 = this.j;
        break label121;
        i3 = parami.g;
        break label138;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    paramSparseArray1 = parami.d;
    paramSparseArray1.G = i4;
    this.b.a(paramSparseArray1, w.c(i2), i1);
    while (true)
    {
      parami = parami.b;
      break;
      paramSparseArray1 = parami.d;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.G = i4;
        this.b.a(paramSparseArray1, w.c(i2), i1);
      }
      if (parami.i == null)
        continue;
      i4 = 0;
      while (i4 < parami.i.size())
      {
        paramSparseArray1 = (m)parami.i.get(i4);
        paramSparseArray1.G = i3;
        this.b.a(paramSparseArray1, false);
        i4 += 1;
      }
      paramSparseArray1 = parami.d;
      paramSparseArray1.G = i3;
      this.b.a(paramSparseArray1, false);
      continue;
      paramSparseArray1 = parami.d;
      paramSparseArray1.G = i3;
      this.b.c(paramSparseArray1, w.c(i2), i1);
      continue;
      paramSparseArray1 = parami.d;
      paramSparseArray1.G = i4;
      this.b.b(paramSparseArray1, w.c(i2), i1);
      continue;
      paramSparseArray1 = parami.d;
      paramSparseArray1.G = i3;
      this.b.e(paramSparseArray1, w.c(i2), i1);
      continue;
      paramSparseArray1 = parami.d;
      paramSparseArray1.G = i3;
      this.b.d(paramSparseArray1, w.c(i2), i1);
    }
    label546: if (paramBoolean)
    {
      this.b.a(this.b.n, w.c(i2), i1, true);
      locali = null;
    }
    if (this.p >= 0)
    {
      this.b.b(this.p);
      this.p = -1;
    }
    return locali;
  }

  public String a()
  {
    return this.n;
  }

  void a(int paramInt)
  {
    if (!this.l);
    while (true)
    {
      return;
      if (w.a)
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      for (h localh = this.c; localh != null; localh = localh.a)
      {
        m localm;
        if (localh.d != null)
        {
          localm = localh.d;
          localm.r += paramInt;
          if (w.a)
            Log.v("FragmentManager", "Bump nesting of " + localh.d + " to " + localh.d.r);
        }
        if (localh.i == null)
          continue;
        int i1 = localh.i.size() - 1;
        while (i1 >= 0)
        {
          localm = (m)localh.i.get(i1);
          localm.r += paramInt;
          if (w.a)
            Log.v("FragmentManager", "Bump nesting of " + localm + " to " + localm.r);
          i1 -= 1;
        }
      }
    }
  }

  void a(h paramh)
  {
    if (this.c == null)
    {
      this.d = paramh;
      this.c = paramh;
    }
    while (true)
    {
      paramh.e = this.f;
      paramh.f = this.g;
      paramh.g = this.h;
      paramh.h = this.i;
      this.e += 1;
      return;
      paramh.b = this.d;
      this.d.a = paramh;
      this.d = paramh;
    }
  }

  public void a(SparseArray<m> paramSparseArray1, SparseArray<m> paramSparseArray2)
  {
    if (!this.b.p.a());
    h localh;
    do
    {
      return;
      localh = this.d;
    }
    while (localh == null);
    switch (localh.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localh = localh.b;
      break;
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      if (localh.i != null)
      {
        int i1 = localh.i.size() - 1;
        while (i1 >= 0)
        {
          b(paramSparseArray1, paramSparseArray2, (m)localh.i.get(i1));
          i1 -= 1;
        }
      }
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      b(paramSparseArray1, paramSparseArray2, localh.d);
      continue;
      a(paramSparseArray1, paramSparseArray2, localh.d);
    }
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a(paramString, paramPrintWriter, true);
  }

  public void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.n);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.o);
      if (this.j != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.k));
      }
      if ((this.f != 0) || (this.g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      }
      if ((this.h != 0) || (this.i != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.h));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.i));
      }
      if ((this.q != 0) || (this.r != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.q));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.r);
      }
      if ((this.s != 0) || (this.t != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.s));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.t);
      }
    }
    if (this.c != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      h localh = this.c;
      int i1 = 0;
      while (localh != null)
      {
        String str1;
        int i2;
        switch (localh.c)
        {
        default:
          str1 = "cmd=" + localh.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localh.d);
          if (paramBoolean)
          {
            if ((localh.e != 0) || (localh.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localh.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localh.f));
            }
            if ((localh.g != 0) || (localh.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localh.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localh.h));
            }
          }
          if ((localh.i == null) || (localh.i.size() <= 0))
            break label807;
          i2 = 0;
          label641: if (i2 >= localh.i.size())
            break label807;
          paramPrintWriter.print(str2);
          if (localh.i.size() != 1)
            break;
          paramPrintWriter.print("Removed: ");
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
        while (true)
        {
          paramPrintWriter.println(localh.i.get(i2));
          i2 += 1;
          break label641;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (i2 == 0)
            paramPrintWriter.println("Removed:");
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label807: localh = localh.a;
        i1 += 1;
      }
    }
  }

  public void run()
  {
    if (w.a)
      Log.v("FragmentManager", "Run: " + this);
    if ((this.l) && (this.p < 0))
      throw new IllegalStateException("addToBackStack() called after commit()");
    a(1);
    Object localObject1;
    if (a)
    {
      localObject1 = new SparseArray();
      localObject2 = new SparseArray();
      b((SparseArray)localObject1, (SparseArray)localObject2);
    }
    for (Object localObject2 = a((SparseArray)localObject1, (SparseArray)localObject2, false); ; localObject2 = null)
    {
      int i1;
      label113: int i2;
      label120: h localh;
      int i3;
      if (localObject2 != null)
      {
        i1 = 0;
        if (localObject2 == null)
          break label232;
        i2 = 0;
        localh = this.c;
        if (localh == null)
          break label721;
        if (localObject2 == null)
          break label240;
        i3 = 0;
        label138: if (localObject2 == null)
          break label249;
      }
      label232: label240: label249: for (int i4 = 0; ; i4 = localh.f)
        switch (localh.c)
        {
        default:
          throw new IllegalArgumentException("Unknown cmd: " + localh.c);
          i1 = this.k;
          break label113;
          i2 = this.j;
          break label120;
          i3 = localh.e;
          break label138;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      localObject1 = localh.d;
      ((m)localObject1).G = i3;
      this.b.a((m)localObject1, false);
      while (true)
      {
        localh = localh.a;
        break;
        localObject1 = localh.d;
        int i6 = ((m)localObject1).x;
        Object localObject3 = localObject1;
        if (this.b.g != null)
        {
          int i5 = this.b.g.size() - 1;
          localObject3 = localObject1;
          if (i5 >= 0)
          {
            localObject3 = (m)this.b.g.get(i5);
            if (w.a)
              Log.v("FragmentManager", "OP_REPLACE: adding=" + localObject1 + " old=" + localObject3);
            if (((m)localObject3).x == i6)
              if (localObject3 == localObject1)
              {
                localObject1 = null;
                localh.d = null;
              }
            while (true)
            {
              i5 -= 1;
              break;
              if (localh.i == null)
                localh.i = new ArrayList();
              localh.i.add(localObject3);
              ((m)localObject3).G = i4;
              if (this.l)
              {
                ((m)localObject3).r += 1;
                if (w.a)
                  Log.v("FragmentManager", "Bump nesting of " + localObject3 + " to " + ((m)localObject3).r);
              }
              this.b.a((m)localObject3, i2, i1);
            }
          }
        }
        if (localObject3 == null)
          continue;
        ((m)localObject3).G = i3;
        this.b.a((m)localObject3, false);
        continue;
        localObject1 = localh.d;
        ((m)localObject1).G = i4;
        this.b.a((m)localObject1, i2, i1);
        continue;
        localObject1 = localh.d;
        ((m)localObject1).G = i4;
        this.b.b((m)localObject1, i2, i1);
        continue;
        localObject1 = localh.d;
        ((m)localObject1).G = i3;
        this.b.c((m)localObject1, i2, i1);
        continue;
        localObject1 = localh.d;
        ((m)localObject1).G = i4;
        this.b.d((m)localObject1, i2, i1);
        continue;
        localObject1 = localh.d;
        ((m)localObject1).G = i3;
        this.b.e((m)localObject1, i2, i1);
      }
      label721: this.b.a(this.b.n, i2, i1, true);
      if (this.l)
        this.b.a(this);
      return;
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.p);
    }
    if (this.n != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.n);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.g
 * JD-Core Version:    0.6.0
 */