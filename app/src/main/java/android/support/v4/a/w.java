package android.support.v4.a;

import I;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.g.c;
import android.support.v4.g.d;
import android.support.v4.h.ab;
import android.support.v4.h.bi;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.ArrayList<Landroid.support.v4.a.m;>;
import java.util.Arrays;
import java.util.List;

final class w extends u
  implements ab
{
  static final Interpolator A;
  static final Interpolator B;
  static final Interpolator C;
  static final Interpolator D;
  static boolean a;
  static final boolean b;
  static Field r;
  ArrayList<Runnable> c;
  Runnable[] d;
  boolean e;
  ArrayList<m> f;
  ArrayList<m> g;
  ArrayList<Integer> h;
  ArrayList<g> i;
  ArrayList<m> j;
  ArrayList<g> k;
  ArrayList<Integer> l;
  ArrayList<v> m;
  int n = 0;
  t o;
  r p;
  m q;
  boolean s;
  boolean t;
  boolean u;
  String v;
  boolean w;
  Bundle x = null;
  SparseArray<Parcelable> y = null;
  Runnable z = new Runnable()
  {
    public void run()
    {
      w.this.d();
    }
  };

  static
  {
    boolean bool = false;
    a = false;
    if (Build.VERSION.SDK_INT >= 11)
      bool = true;
    b = bool;
    r = null;
    A = new DecelerateInterpolator(2.5F);
    B = new DecelerateInterpolator(1.5F);
    C = new AccelerateInterpolator(2.5F);
    D = new AccelerateInterpolator(1.5F);
  }

  static Animation a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    paramContext = new AlphaAnimation(paramFloat1, paramFloat2);
    paramContext.setInterpolator(B);
    paramContext.setDuration(220L);
    return paramContext;
  }

  static Animation a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramContext = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(A);
    ((ScaleAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(B);
    ((AlphaAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    return (Animation)paramContext;
  }

  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new d("FragmentManager"));
    if (this.o != null);
    while (true)
    {
      try
      {
        this.o.a("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
        continue;
      }
      try
      {
        a("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
  }

  static boolean a(View paramView, Animation paramAnimation)
  {
    return (Build.VERSION.SDK_INT >= 19) && (bi.c(paramView) == 0) && (bi.m(paramView)) && (a(paramAnimation));
  }

  static boolean a(Animation paramAnimation)
  {
    int i3 = 0;
    int i2;
    if ((paramAnimation instanceof AlphaAnimation))
      i2 = 1;
    do
    {
      return i2;
      i2 = i3;
    }
    while (!(paramAnimation instanceof AnimationSet));
    paramAnimation = ((AnimationSet)paramAnimation).getAnimations();
    int i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 >= paramAnimation.size())
        break;
      if ((paramAnimation.get(i1) instanceof AlphaAnimation))
        return true;
      i1 += 1;
    }
  }

  public static int b(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default:
      return -1;
    case 4097:
      if (paramBoolean)
        return 1;
      return 2;
    case 8194:
      if (paramBoolean)
        return 3;
      return 4;
    case 4099:
    }
    if (paramBoolean)
      return 5;
    return 6;
  }

  private void b(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null));
    do
      return;
    while (!a(paramView, paramAnimation));
    try
    {
      if (r == null)
      {
        r = Animation.class.getDeclaredField("mListener");
        r.setAccessible(true);
      }
      Animation.AnimationListener localAnimationListener = (Animation.AnimationListener)r.get(paramAnimation);
      paramAnimation.setAnimationListener(new x(paramView, paramAnimation, localAnimationListener));
      return;
    }
    catch (NoSuchFieldException localObject1)
    {
      while (true)
      {
        Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
        Object localObject1 = null;
      }
    }
    catch (IllegalAccessException localObject2)
    {
      while (true)
      {
        Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
        Object localObject2 = null;
      }
    }
  }

  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 0;
    case 4097:
      return 8194;
    case 8194:
      return 4097;
    case 4099:
    }
    return 4099;
  }

  private void t()
  {
    if (this.t)
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    if (this.v != null)
      throw new IllegalStateException("Can not perform this action inside of " + this.v);
  }

  public m a(int paramInt)
  {
    int i1;
    Object localObject;
    if (this.g != null)
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (m)this.g.get(i1);
        if ((localObject != null) && (((m)localObject).w == paramInt))
          return localObject;
        i1 -= 1;
      }
    }
    if (this.f != null)
    {
      i1 = this.f.size() - 1;
      while (true)
      {
        if (i1 < 0)
          break label112;
        m localm = (m)this.f.get(i1);
        if (localm != null)
        {
          localObject = localm;
          if (localm.w == paramInt)
            break;
        }
        i1 -= 1;
      }
    }
    label112: return (m)null;
  }

  public m a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1)
      paramBundle = null;
    m localm;
    do
    {
      return paramBundle;
      if (i1 >= this.f.size())
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      localm = (m)this.f.get(i1);
      paramBundle = localm;
    }
    while (localm != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return localm;
  }

  public m a(String paramString)
  {
    int i1;
    Object localObject;
    if ((this.g != null) && (paramString != null))
    {
      i1 = this.g.size() - 1;
      while (i1 >= 0)
      {
        localObject = (m)this.g.get(i1);
        if ((localObject != null) && (paramString.equals(((m)localObject).y)))
          return localObject;
        i1 -= 1;
      }
    }
    if ((this.f != null) && (paramString != null))
    {
      i1 = this.f.size() - 1;
      while (true)
      {
        if (i1 < 0)
          break label126;
        m localm = (m)this.f.get(i1);
        if (localm != null)
        {
          localObject = localm;
          if (paramString.equals(localm.y))
            break;
        }
        i1 -= 1;
      }
    }
    label126: return (m)null;
  }

  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
      return null;
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, y.a);
    if (str1 == null)
      str1 = paramString.getString(0);
    while (true)
    {
      int i3 = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!m.b(this.o.g(), str1))
        return null;
      if (paramView != null);
      for (int i1 = paramView.getId(); (i1 == -1) && (i3 == -1) && (str2 == null); i1 = 0)
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      int i2;
      if (i3 != -1)
      {
        paramString = a(i3);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null)
            paramView = a(str2);
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i1 != -1)
            paramString = a(i1);
        }
        if (a)
          Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(i3) + " fname=" + str1 + " existing=" + paramString);
        if (paramString != null)
          break label428;
        paramView = m.a(paramContext, str1);
        paramView.o = true;
        if (i3 == 0)
          break label421;
        i2 = i3;
        label291: paramView.w = i2;
        paramView.x = i1;
        paramView.y = str2;
        paramView.p = true;
        paramView.s = this;
        paramView.t = this.o;
        paramView.a(this.o.g(), paramAttributeSet, paramView.e);
        a(paramView, true);
        label350: if ((this.n >= 1) || (!paramView.o))
          break label555;
        a(paramView, 1, 0, 0, false);
      }
      while (true)
      {
        if (paramView.I != null)
          break label563;
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label421: i2 = i1;
        break label291;
        label428: if (paramString.p)
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i3) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
        paramString.p = true;
        paramString.t = this.o;
        if (!paramString.C)
          paramString.a(this.o.g(), paramAttributeSet, paramString.e);
        paramView = paramString;
        break label350;
        label555: b(paramView);
      }
      label563: if (i3 != 0)
        paramView.I.setId(i3);
      if (paramView.I.getTag() == null)
        paramView.I.setTag(str2);
      return paramView.I;
    }
  }

  Animation a(m paramm, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Animation localAnimation = paramm.a(paramInt1, paramBoolean, paramm.G);
    if (localAnimation != null)
      paramm = localAnimation;
    do
    {
      return paramm;
      if (paramm.G == 0)
        break;
      localAnimation = AnimationUtils.loadAnimation(this.o.g(), paramm.G);
      paramm = localAnimation;
    }
    while (localAnimation != null);
    if (paramInt1 == 0)
      return null;
    paramInt1 = b(paramInt1, paramBoolean);
    if (paramInt1 < 0)
      return null;
    switch (paramInt1)
    {
    default:
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (this.o.d())
          paramInt1 = this.o.e();
      }
      if (paramInt1 != 0)
        break;
      return null;
    case 1:
      return a(this.o.g(), 1.125F, 1.0F, 0.0F, 1.0F);
    case 2:
      return a(this.o.g(), 1.0F, 0.975F, 1.0F, 0.0F);
    case 3:
      return a(this.o.g(), 0.975F, 1.0F, 0.0F, 1.0F);
    case 4:
      return a(this.o.g(), 1.0F, 1.075F, 1.0F, 0.0F);
    case 5:
      return a(this.o.g(), 0.0F, 1.0F);
    case 6:
      return a(this.o.g(), 1.0F, 0.0F);
    }
    return null;
  }

  void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.o == null) && (paramInt1 != 0))
      throw new IllegalStateException("No host");
    if ((!paramBoolean) && (this.n == paramInt1));
    do
    {
      return;
      this.n = paramInt1;
    }
    while (this.f == null);
    int i1 = 0;
    boolean bool = false;
    label54: if (i1 < this.f.size())
    {
      m localm = (m)this.f.get(i1);
      if (localm == null)
        break label169;
      a(localm, paramInt1, paramInt2, paramInt3, false);
      if (localm.M == null)
        break label169;
      bool |= localm.M.a();
    }
    label169: 
    while (true)
    {
      i1 += 1;
      break label54;
      if (!bool)
        c();
      if ((!this.s) || (this.o == null) || (this.n != 5))
        break;
      this.o.c();
      this.s = false;
      return;
    }
  }

  public void a(int paramInt, g paramg)
  {
    monitorenter;
    try
    {
      if (this.k == null)
        this.k = new ArrayList();
      int i2 = this.k.size();
      int i1 = i2;
      if (paramInt < i2)
      {
        if (a)
          Log.v("FragmentManager", "Setting back stack index " + paramInt + " to " + paramg);
        this.k.set(paramInt, paramg);
      }
      while (true)
      {
        return;
        while (i1 < paramInt)
        {
          this.k.add(null);
          if (this.l == null)
            this.l = new ArrayList();
          if (a)
            Log.v("FragmentManager", "Adding available back stack index " + i1);
          this.l.add(Integer.valueOf(i1));
          i1 += 1;
        }
        if (a)
          Log.v("FragmentManager", "Adding back stack index " + paramInt + " with " + paramg);
        this.k.add(paramg);
      }
    }
    finally
    {
      monitorexit;
    }
    throw paramg;
  }

  void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, paramBoolean);
  }

  public void a(Configuration paramConfiguration)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        m localm = (m)this.g.get(i1);
        if (localm != null)
          localm.a(paramConfiguration);
        i1 += 1;
      }
    }
  }

  public void a(Bundle paramBundle, String paramString, m paramm)
  {
    if (paramm.g < 0)
      a(new IllegalStateException("Fragment " + paramm + " is not currently in the FragmentManager"));
    paramBundle.putInt(paramString, paramm.g);
  }

  void a(Parcelable paramParcelable, List<m> paramList)
  {
    if (paramParcelable == null);
    while (true)
    {
      return;
      paramParcelable = (z)paramParcelable;
      if (paramParcelable.a == null)
        continue;
      Object localObject1;
      Object localObject2;
      if (paramList != null)
      {
        i1 = 0;
        while (i1 < paramList.size())
        {
          localObject1 = (m)paramList.get(i1);
          if (a)
            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localObject1);
          localObject2 = paramParcelable.a[localObject1.g];
          ((aa)localObject2).k = ((m)localObject1);
          ((m)localObject1).f = null;
          ((m)localObject1).r = 0;
          ((m)localObject1).p = false;
          ((m)localObject1).m = false;
          ((m)localObject1).j = null;
          if (((aa)localObject2).j != null)
          {
            ((aa)localObject2).j.setClassLoader(this.o.g().getClassLoader());
            ((m)localObject1).f = ((aa)localObject2).j.getSparseParcelableArray("android:view_state");
            ((m)localObject1).e = ((aa)localObject2).j;
          }
          i1 += 1;
        }
      }
      this.f = new ArrayList(paramParcelable.a.length);
      if (this.h != null)
        this.h.clear();
      int i1 = 0;
      if (i1 < paramParcelable.a.length)
      {
        localObject1 = paramParcelable.a[i1];
        if (localObject1 != null)
        {
          localObject2 = ((aa)localObject1).a(this.o, this.q);
          if (a)
            Log.v("FragmentManager", "restoreAllState: active #" + i1 + ": " + localObject2);
          this.f.add(localObject2);
          ((aa)localObject1).k = null;
        }
        while (true)
        {
          i1 += 1;
          break;
          this.f.add(null);
          if (this.h == null)
            this.h = new ArrayList();
          if (a)
            Log.v("FragmentManager", "restoreAllState: avail #" + i1);
          this.h.add(Integer.valueOf(i1));
        }
      }
      if (paramList != null)
      {
        i1 = 0;
        if (i1 < paramList.size())
        {
          localObject1 = (m)paramList.get(i1);
          if (((m)localObject1).k >= 0)
            if (((m)localObject1).k >= this.f.size())
              break label473;
          for (((m)localObject1).j = ((m)this.f.get(((m)localObject1).k)); ; ((m)localObject1).j = null)
          {
            i1 += 1;
            break;
            label473: Log.w("FragmentManager", "Re-attaching retained fragment " + localObject1 + " target no longer exists: " + ((m)localObject1).k);
          }
        }
      }
      if (paramParcelable.b != null)
      {
        this.g = new ArrayList(paramParcelable.b.length);
        i1 = 0;
        while (i1 < paramParcelable.b.length)
        {
          paramList = (m)this.f.get(paramParcelable.b[i1]);
          if (paramList == null)
            a(new IllegalStateException("No instantiated fragment for index #" + paramParcelable.b[i1]));
          paramList.m = true;
          if (a)
            Log.v("FragmentManager", "restoreAllState: added #" + i1 + ": " + paramList);
          if (this.g.contains(paramList))
            throw new IllegalStateException("Already added!");
          this.g.add(paramList);
          i1 += 1;
        }
      }
      this.g = null;
      if (paramParcelable.c == null)
        break;
      this.i = new ArrayList(paramParcelable.c.length);
      i1 = 0;
      while (i1 < paramParcelable.c.length)
      {
        paramList = paramParcelable.c[i1].a(this);
        if (a)
        {
          Log.v("FragmentManager", "restoreAllState: back stack #" + i1 + " (index " + paramList.p + "): " + paramList);
          paramList.a("  ", new PrintWriter(new d("FragmentManager")), false);
        }
        this.i.add(paramList);
        if (paramList.p >= 0)
          a(paramList.p, paramList);
        i1 += 1;
      }
    }
    this.i = null;
  }

  void a(g paramg)
  {
    if (this.i == null)
      this.i = new ArrayList();
    this.i.add(paramg);
    e();
  }

  public void a(m paramm)
  {
    if (paramm.K)
    {
      if (this.e)
        this.w = true;
    }
    else
      return;
    paramm.K = false;
    a(paramm, this.n, 0, 0, false);
  }

  public void a(m paramm, int paramInt1, int paramInt2)
  {
    if (a)
      Log.v("FragmentManager", "remove: " + paramm + " nesting=" + paramm.r);
    if (!paramm.a())
    {
      i1 = 1;
      if ((!paramm.A) || (i1 != 0))
      {
        if (this.g != null)
          this.g.remove(paramm);
        if ((paramm.D) && (paramm.E))
          this.s = true;
        paramm.m = false;
        paramm.n = true;
        if (i1 == 0)
          break label137;
      }
    }
    label137: for (int i1 = 0; ; i1 = 1)
    {
      a(paramm, i1, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
    }
  }

  void a(m paramm, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1;
    if (paramm.m)
    {
      i1 = paramInt1;
      if (!paramm.A);
    }
    else
    {
      i1 = paramInt1;
      if (paramInt1 > 1)
        i1 = 1;
    }
    int i2 = i1;
    if (paramm.n)
    {
      i2 = i1;
      if (i1 > paramm.b)
        i2 = paramm.b;
    }
    paramInt1 = i2;
    if (paramm.K)
    {
      paramInt1 = i2;
      if (paramm.b < 4)
      {
        paramInt1 = i2;
        if (i2 > 3)
          paramInt1 = 3;
      }
    }
    int i3;
    label615: Object localObject2;
    if (paramm.b < paramInt1)
    {
      if ((paramm.o) && (!paramm.p));
      do
      {
        return;
        if (paramm.c != null)
        {
          paramm.c = null;
          a(paramm, paramm.d, 0, 0, true);
        }
        i1 = paramInt1;
        i3 = paramInt1;
        i2 = paramInt1;
        switch (paramm.b)
        {
        default:
          i1 = paramInt1;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
      while (paramm.b == i1);
      Log.w("FragmentManager", "moveToState: Fragment state for " + paramm + " not updated inline; " + "expected state " + i1 + " found " + paramm.b);
      paramm.b = i1;
      return;
      if (a)
        Log.v("FragmentManager", "moveto CREATED: " + paramm);
      i2 = paramInt1;
      if (paramm.e != null)
      {
        paramm.e.setClassLoader(this.o.g().getClassLoader());
        paramm.f = paramm.e.getSparseParcelableArray("android:view_state");
        paramm.j = a(paramm.e, "android:target_state");
        if (paramm.j != null)
          paramm.l = paramm.e.getInt("android:target_req_state", 0);
        paramm.L = paramm.e.getBoolean("android:user_visible_hint", true);
        i2 = paramInt1;
        if (!paramm.L)
        {
          paramm.K = true;
          i2 = paramInt1;
          if (paramInt1 > 3)
            i2 = 3;
        }
      }
      paramm.t = this.o;
      paramm.v = this.q;
      if (this.q != null);
      for (localObject1 = this.q.u; ; localObject1 = this.o.i())
      {
        paramm.s = ((w)localObject1);
        paramm.F = false;
        paramm.a(this.o.g());
        if (paramm.F)
          break;
        throw new al("Fragment " + paramm + " did not call through to super.onAttach()");
      }
      if (paramm.v == null)
        this.o.b(paramm);
      if (!paramm.C)
        paramm.g(paramm.e);
      paramm.C = false;
      i1 = i2;
      if (paramm.o)
      {
        paramm.I = paramm.b(paramm.b(paramm.e), null, paramm.e);
        if (paramm.I == null)
          break label1105;
        paramm.J = paramm.I;
        if (Build.VERSION.SDK_INT >= 11)
        {
          bi.a(paramm.I, false);
          if (paramm.z)
            paramm.I.setVisibility(8);
          paramm.a(paramm.I, paramm.e);
          i1 = i2;
        }
      }
      else
      {
        label647: i3 = i1;
        if (i1 > 1)
        {
          if (a)
            Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + paramm);
          if (!paramm.o)
          {
            if (paramm.x == 0)
              break label1718;
            localObject2 = (ViewGroup)this.p.a(paramm.x);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = localObject2;
              if (!paramm.q)
                a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramm.x) + " (" + paramm.c().getResourceName(paramm.x) + ") for fragment " + paramm));
            }
          }
        }
      }
    }
    label1194: label1712: label1718: for (Object localObject1 = localObject2; ; localObject1 = null)
    {
      paramm.H = ((ViewGroup)localObject1);
      paramm.I = paramm.b(paramm.b(paramm.e), (ViewGroup)localObject1, paramm.e);
      if (paramm.I != null)
      {
        paramm.J = paramm.I;
        if (Build.VERSION.SDK_INT >= 11)
        {
          bi.a(paramm.I, false);
          label869: if (localObject1 != null)
          {
            localObject2 = a(paramm, paramInt2, true, paramInt3);
            if (localObject2 != null)
            {
              b(paramm.I, (Animation)localObject2);
              paramm.I.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramm.I);
          }
          if (paramm.z)
            paramm.I.setVisibility(8);
          paramm.a(paramm.I, paramm.e);
        }
      }
      while (true)
      {
        paramm.h(paramm.e);
        if (paramm.I != null)
          paramm.a(paramm.e);
        paramm.e = null;
        i3 = i1;
        i2 = i3;
        if (i3 > 3)
        {
          if (a)
            Log.v("FragmentManager", "moveto STARTED: " + paramm);
          paramm.z();
          i2 = i3;
        }
        i1 = i2;
        if (i2 <= 4)
          break;
        if (a)
          Log.v("FragmentManager", "moveto RESUMED: " + paramm);
        paramm.A();
        paramm.e = null;
        paramm.f = null;
        i1 = i2;
        break;
        paramm.I = aj.a(paramm.I);
        break label615;
        label1105: paramm.J = null;
        i1 = i2;
        break label647;
        paramm.I = aj.a(paramm.I);
        break label869;
        paramm.J = null;
      }
      i1 = paramInt1;
      if (paramm.b <= paramInt1)
        break;
      switch (paramm.b)
      {
      default:
        i1 = paramInt1;
        break;
      case 1:
      case 5:
      case 4:
      case 3:
      case 2:
        do
        {
          i1 = paramInt1;
          if (paramInt1 >= 1)
            break;
          if ((this.u) && (paramm.c != null))
          {
            localObject1 = paramm.c;
            paramm.c = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramm.c == null)
            break label1559;
          paramm.d = paramInt1;
          i1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (a)
              Log.v("FragmentManager", "movefrom RESUMED: " + paramm);
            paramm.C();
          }
          if (paramInt1 < 4)
          {
            if (a)
              Log.v("FragmentManager", "movefrom STARTED: " + paramm);
            paramm.D();
          }
          if (paramInt1 >= 3)
            continue;
          if (a)
            Log.v("FragmentManager", "movefrom STOPPED: " + paramm);
          paramm.E();
        }
        while (paramInt1 >= 2);
        if (a)
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + paramm);
        if ((paramm.I != null) && (this.o.a(paramm)) && (paramm.f == null))
          e(paramm);
        paramm.F();
        if ((paramm.I != null) && (paramm.H != null))
          if ((this.n <= 0) || (this.u))
            break label1712;
        for (localObject1 = a(paramm, paramInt2, false, paramInt3); ; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramm.c = paramm.I;
            paramm.d = paramInt1;
            ((Animation)localObject1).setAnimationListener(new x(paramm.I, (Animation)localObject1, paramm)
            {
              public void onAnimationEnd(Animation paramAnimation)
              {
                super.onAnimationEnd(paramAnimation);
                if (this.a.c != null)
                {
                  this.a.c = null;
                  w.this.a(this.a, this.a.d, 0, 0, false);
                }
              }
            });
            paramm.I.startAnimation((Animation)localObject1);
          }
          paramm.H.removeView(paramm.I);
          paramm.H = null;
          paramm.I = null;
          paramm.J = null;
          break label1194;
          if (a)
            Log.v("FragmentManager", "movefrom CREATED: " + paramm);
          if (!paramm.C)
            paramm.G();
          while (true)
          {
            paramm.F = false;
            paramm.o();
            if (paramm.F)
              break;
            throw new al("Fragment " + paramm + " did not call through to super.onDetach()");
            paramm.b = 0;
          }
          i1 = paramInt1;
          if (paramBoolean)
            break;
          if (!paramm.C)
          {
            d(paramm);
            i1 = paramInt1;
            break;
          }
          paramm.t = null;
          paramm.v = null;
          paramm.s = null;
          paramm.u = null;
          i1 = paramInt1;
          break;
        }
      }
    }
  }

  public void a(m paramm, boolean paramBoolean)
  {
    if (this.g == null)
      this.g = new ArrayList();
    if (a)
      Log.v("FragmentManager", "add: " + paramm);
    c(paramm);
    if (!paramm.A)
    {
      if (this.g.contains(paramm))
        throw new IllegalStateException("Fragment already added: " + paramm);
      this.g.add(paramm);
      paramm.m = true;
      paramm.n = false;
      if ((paramm.D) && (paramm.E))
        this.s = true;
      if (paramBoolean)
        b(paramm);
    }
  }

  public void a(t paramt, r paramr, m paramm)
  {
    if (this.o != null)
      throw new IllegalStateException("Already attached");
    this.o = paramt;
    this.p = paramr;
    this.q = paramm;
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i2 = 0;
    String str = paramString + "    ";
    int i3;
    int i1;
    Object localObject;
    if (this.f != null)
    {
      i3 = this.f.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (m)this.f.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject);
          if (localObject != null)
            ((m)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i1 += 1;
        }
      }
    }
    if (this.g != null)
    {
      i3 = this.g.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (m)this.g.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((m)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.j != null)
    {
      i3 = this.j.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (m)this.j.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((m)localObject).toString());
          i1 += 1;
        }
      }
    }
    if (this.i != null)
    {
      i3 = this.i.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i1 = 0;
        while (i1 < i3)
        {
          localObject = (g)this.i.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((g)localObject).toString());
          ((g)localObject).a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i1 += 1;
        }
      }
    }
    monitorenter;
    try
    {
      if (this.k != null)
      {
        i3 = this.k.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i1 = 0;
          while (i1 < i3)
          {
            paramFileDescriptor = (g)this.k.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      if ((this.l != null) && (this.l.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.l.toArray()));
      }
      monitorexit;
      if (this.c != null)
      {
        i3 = this.c.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i1 = i2;
          while (i1 < i3)
          {
            paramFileDescriptor = (Runnable)this.c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
    }
    finally
    {
      monitorexit;
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.o);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.p);
    if (this.q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.q);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.n);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.t);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.u);
    if (this.s)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.s);
    }
    if (this.v != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.v);
    }
    if ((this.h != null) && (this.h.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.h.toArray()));
    }
  }

  public boolean a()
  {
    t();
    b();
    return a(this.o.h(), null, -1, 0);
  }

  boolean a(Handler paramHandler, String paramString, int paramInt1, int paramInt2)
  {
    if (this.i == null)
      break label145;
    label7: SparseArray localSparseArray1;
    while (true)
    {
      return false;
      if ((paramString != null) || (paramInt1 >= 0) || ((paramInt2 & 0x1) != 0))
        break;
      paramInt1 = this.i.size() - 1;
      if (paramInt1 < 0)
        continue;
      paramHandler = (g)this.i.remove(paramInt1);
      paramString = new SparseArray();
      localSparseArray1 = new SparseArray();
      paramHandler.a(paramString, localSparseArray1);
      paramHandler.a(true, null, paramString, localSparseArray1);
      e();
    }
    while (true)
    {
      return true;
      int i1 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        int i2 = this.i.size() - 1;
        while (true)
        {
          if (i2 >= 0)
          {
            paramHandler = (g)this.i.get(i2);
            if ((paramString == null) || (!paramString.equals(paramHandler.a())));
          }
          else
          {
            label145: if (i2 < 0)
              break label7;
            i1 = i2;
            if ((paramInt2 & 0x1) == 0)
              break label254;
            paramInt2 = i2 - 1;
            while (true)
            {
              i1 = paramInt2;
              if (paramInt2 < 0)
                break;
              paramHandler = (g)this.i.get(paramInt2);
              if ((paramString == null) || (!paramString.equals(paramHandler.a())))
              {
                i1 = paramInt2;
                if (paramInt1 < 0)
                  break;
                i1 = paramInt2;
                if (paramInt1 != paramHandler.p)
                  break;
              }
              paramInt2 -= 1;
            }
          }
          if ((paramInt1 >= 0) && (paramInt1 == paramHandler.p))
            break;
          i2 -= 1;
        }
      }
      label254: if (i1 == this.i.size() - 1)
        break label7;
      paramString = new ArrayList();
      paramInt1 = this.i.size() - 1;
      while (paramInt1 > i1)
      {
        paramString.add(this.i.remove(paramInt1));
        paramInt1 -= 1;
      }
      paramInt2 = paramString.size() - 1;
      localSparseArray1 = new SparseArray();
      SparseArray localSparseArray2 = new SparseArray();
      paramInt1 = 0;
      while (paramInt1 <= paramInt2)
      {
        ((g)paramString.get(paramInt1)).a(localSparseArray1, localSparseArray2);
        paramInt1 += 1;
      }
      paramHandler = null;
      paramInt1 = 0;
      if (paramInt1 <= paramInt2)
      {
        if (a)
          Log.v("FragmentManager", "Popping back stack state: " + paramString.get(paramInt1));
        g localg = (g)paramString.get(paramInt1);
        if (paramInt1 == paramInt2);
        for (boolean bool = true; ; bool = false)
        {
          paramHandler = localg.a(bool, paramHandler, localSparseArray1, localSparseArray2);
          paramInt1 += 1;
          break;
        }
      }
      e();
    }
  }

  public boolean a(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      for (int i2 = 0; ; i2 = i3)
      {
        i3 = i2;
        if (i1 >= this.g.size())
          break;
        m localm = (m)this.g.get(i1);
        i3 = i2;
        if (localm != null)
        {
          i3 = i2;
          if (localm.c(paramMenu))
            i3 = 1;
        }
        i1 += 1;
      }
    }
    int i3 = 0;
    return i3;
  }

  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i2 = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i1;
    if (this.g != null)
    {
      i1 = 0;
      int i3 = 0;
      while (true)
      {
        localObject2 = localObject1;
        i4 = i3;
        if (i1 >= this.g.size())
          break;
        m localm = (m)this.g.get(i1);
        localObject2 = localObject1;
        i4 = i3;
        if (localm != null)
        {
          localObject2 = localObject1;
          i4 = i3;
          if (localm.b(paramMenu, paramMenuInflater))
          {
            i4 = 1;
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(localm);
          }
        }
        i1 += 1;
        i3 = i4;
        localObject1 = localObject2;
      }
    }
    int i4 = 0;
    if (this.j != null)
    {
      i1 = i2;
      while (i1 < this.j.size())
      {
        paramMenu = (m)this.j.get(i1);
        if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu)))
          paramMenu.p();
        i1 += 1;
      }
    }
    this.j = ((ArrayList)localObject2);
    return i4;
  }

  public boolean a(MenuItem paramMenuItem)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (this.g != null)
      i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 < this.g.size())
      {
        m localm = (m)this.g.get(i1);
        if ((localm != null) && (localm.c(paramMenuItem)))
          i2 = 1;
      }
      else
      {
        return i2;
      }
      i1 += 1;
    }
  }

  public m b(String paramString)
  {
    if ((this.f != null) && (paramString != null))
    {
      int i1 = this.f.size() - 1;
      while (i1 >= 0)
      {
        m localm = (m)this.f.get(i1);
        if (localm != null)
        {
          localm = localm.a(paramString);
          if (localm != null)
            return localm;
        }
        i1 -= 1;
      }
    }
    return null;
  }

  public void b(int paramInt)
  {
    monitorenter;
    try
    {
      this.k.set(paramInt, null);
      if (this.l == null)
        this.l = new ArrayList();
      if (a)
        Log.v("FragmentManager", "Freeing back stack index " + paramInt);
      this.l.add(Integer.valueOf(paramInt));
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void b(m paramm)
  {
    a(paramm, this.n, 0, 0, false);
  }

  public void b(m paramm, int paramInt1, int paramInt2)
  {
    if (a)
      Log.v("FragmentManager", "hide: " + paramm);
    if (!paramm.z)
    {
      paramm.z = true;
      if (paramm.I != null)
      {
        Animation localAnimation = a(paramm, paramInt1, false, paramInt2);
        if (localAnimation != null)
        {
          b(paramm.I, localAnimation);
          paramm.I.startAnimation(localAnimation);
        }
        paramm.I.setVisibility(8);
      }
      if ((paramm.m) && (paramm.D) && (paramm.E))
        this.s = true;
      paramm.a(true);
    }
  }

  public void b(Menu paramMenu)
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        m localm = (m)this.g.get(i1);
        if (localm != null)
          localm.d(paramMenu);
        i1 += 1;
      }
    }
  }

  public boolean b()
  {
    return d();
  }

  public boolean b(MenuItem paramMenuItem)
  {
    int i3 = 0;
    int i2 = i3;
    int i1;
    if (this.g != null)
      i1 = 0;
    while (true)
    {
      i2 = i3;
      if (i1 < this.g.size())
      {
        m localm = (m)this.g.get(i1);
        if ((localm != null) && (localm.d(paramMenuItem)))
          i2 = 1;
      }
      else
      {
        return i2;
      }
      i1 += 1;
    }
  }

  void c()
  {
    if (this.f == null);
    while (true)
    {
      return;
      int i1 = 0;
      while (i1 < this.f.size())
      {
        m localm = (m)this.f.get(i1);
        if (localm != null)
          a(localm);
        i1 += 1;
      }
    }
  }

  void c(m paramm)
  {
    if (paramm.g >= 0);
    while (true)
    {
      return;
      if ((this.h == null) || (this.h.size() <= 0))
      {
        if (this.f == null)
          this.f = new ArrayList();
        paramm.a(this.f.size(), this.q);
        this.f.add(paramm);
      }
      while (a)
      {
        Log.v("FragmentManager", "Allocated fragment index " + paramm);
        return;
        paramm.a(((Integer)this.h.remove(this.h.size() - 1)).intValue(), this.q);
        this.f.set(paramm.g, paramm);
      }
    }
  }

  public void c(m paramm, int paramInt1, int paramInt2)
  {
    if (a)
      Log.v("FragmentManager", "show: " + paramm);
    if (paramm.z)
    {
      paramm.z = false;
      if (paramm.I != null)
      {
        Animation localAnimation = a(paramm, paramInt1, true, paramInt2);
        if (localAnimation != null)
        {
          b(paramm.I, localAnimation);
          paramm.I.startAnimation(localAnimation);
        }
        paramm.I.setVisibility(0);
      }
      if ((paramm.m) && (paramm.D) && (paramm.E))
        this.s = true;
      paramm.a(false);
    }
  }

  void d(m paramm)
  {
    if (paramm.g < 0)
      return;
    if (a)
      Log.v("FragmentManager", "Freeing fragment index " + paramm);
    this.f.set(paramm.g, null);
    if (this.h == null)
      this.h = new ArrayList();
    this.h.add(Integer.valueOf(paramm.g));
    this.o.a(paramm.h);
    paramm.n();
  }

  public void d(m paramm, int paramInt1, int paramInt2)
  {
    if (a)
      Log.v("FragmentManager", "detach: " + paramm);
    if (!paramm.A)
    {
      paramm.A = true;
      if (paramm.m)
      {
        if (this.g != null)
        {
          if (a)
            Log.v("FragmentManager", "remove from detach: " + paramm);
          this.g.remove(paramm);
        }
        if ((paramm.D) && (paramm.E))
          this.s = true;
        paramm.m = false;
        a(paramm, 1, paramInt1, paramInt2, false);
      }
    }
  }

  public boolean d()
  {
    if (this.e)
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    if (Looper.myLooper() != this.o.h().getLooper())
      throw new IllegalStateException("Must be called from main thread of process");
    int i5 = 0;
    while (true)
    {
      monitorenter;
      int i2;
      try
      {
        if ((this.c == null) || (this.c.size() == 0))
        {
          monitorexit;
          if (!this.w)
            break;
          i1 = 0;
          int i4;
          for (i2 = 0; i1 < this.f.size(); i2 = i4)
          {
            m localm = (m)this.f.get(i1);
            int i3 = i2;
            if (localm != null)
            {
              i3 = i2;
              if (localm.M != null)
                i4 = i2 | localm.M.a();
            }
            i1 += 1;
          }
        }
        i2 = this.c.size();
        if ((this.d == null) || (this.d.length < i2))
          this.d = new Runnable[i2];
        this.c.toArray(this.d);
        this.c.clear();
        this.o.h().removeCallbacks(this.z);
        monitorexit;
        this.e = true;
        int i1 = 0;
        while (i1 < i2)
        {
          this.d[i1].run();
          this.d[i1] = null;
          i1 += 1;
        }
      }
      finally
      {
        monitorexit;
      }
      this.e = false;
      i5 = 1;
      continue;
      if (i2 != 0)
        break;
      this.w = false;
      c();
    }
    return i5;
  }

  void e()
  {
    if (this.m != null)
    {
      int i1 = 0;
      while (i1 < this.m.size())
      {
        ((v)this.m.get(i1)).a();
        i1 += 1;
      }
    }
  }

  void e(m paramm)
  {
    if (paramm.J == null)
      return;
    if (this.y == null)
      this.y = new SparseArray();
    while (true)
    {
      paramm.J.saveHierarchyState(this.y);
      if (this.y.size() <= 0)
        break;
      paramm.f = this.y;
      this.y = null;
      return;
      this.y.clear();
    }
  }

  public void e(m paramm, int paramInt1, int paramInt2)
  {
    if (a)
      Log.v("FragmentManager", "attach: " + paramm);
    if (paramm.A)
    {
      paramm.A = false;
      if (!paramm.m)
      {
        if (this.g == null)
          this.g = new ArrayList();
        if (this.g.contains(paramm))
          throw new IllegalStateException("Fragment already added: " + paramm);
        if (a)
          Log.v("FragmentManager", "add from attach: " + paramm);
        this.g.add(paramm);
        paramm.m = true;
        if ((paramm.D) && (paramm.E))
          this.s = true;
        a(paramm, this.n, paramInt1, paramInt2, false);
      }
    }
  }

  Bundle f(m paramm)
  {
    if (this.x == null)
      this.x = new Bundle();
    paramm.i(this.x);
    Object localObject2;
    if (!this.x.isEmpty())
    {
      localObject2 = this.x;
      this.x = null;
    }
    while (true)
    {
      if (paramm.I != null)
        e(paramm);
      Object localObject1 = localObject2;
      if (paramm.f != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = new Bundle();
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramm.f);
      }
      localObject2 = localObject1;
      if (!paramm.L)
      {
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new Bundle();
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramm.L);
      }
      return localObject2;
      localObject2 = null;
    }
  }

  ArrayList<m> f()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.f != null)
    {
      int i1 = 0;
      localObject2 = localObject1;
      if (i1 < this.f.size())
      {
        m localm = (m)this.f.get(i1);
        Object localObject3 = localObject1;
        if (localm != null)
        {
          localObject3 = localObject1;
          if (localm.B)
          {
            localObject2 = localObject1;
            if (localObject1 == null)
              localObject2 = new ArrayList();
            ((ArrayList)localObject2).add(localm);
            localm.C = true;
            if (localm.j == null)
              break label164;
          }
        }
        label164: for (int i2 = localm.j.g; ; i2 = -1)
        {
          localm.k = i2;
          localObject3 = localObject2;
          if (a)
          {
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + localm);
            localObject3 = localObject2;
          }
          i1 += 1;
          localObject1 = localObject3;
          break;
        }
      }
    }
    return (ArrayList<m>)localObject2;
  }

  Parcelable g()
  {
    Object localObject3 = null;
    d();
    if (b)
      this.t = true;
    if ((this.f == null) || (this.f.size() <= 0))
      return null;
    int i3 = this.f.size();
    aa[] arrayOfaa = new aa[i3];
    int i2 = 0;
    int i1 = 0;
    label56: Object localObject1;
    Object localObject2;
    if (i2 < i3)
    {
      localObject1 = (m)this.f.get(i2);
      if (localObject1 == null)
        break label718;
      if (((m)localObject1).g < 0)
        a(new IllegalStateException("Failure saving state: active " + localObject1 + " has cleared index: " + ((m)localObject1).g));
      localObject2 = new aa((m)localObject1);
      arrayOfaa[i2] = localObject2;
      if ((((m)localObject1).b > 0) && (((aa)localObject2).j == null))
      {
        ((aa)localObject2).j = f((m)localObject1);
        if (((m)localObject1).j != null)
        {
          if (((m)localObject1).j.g < 0)
            a(new IllegalStateException("Failure saving state: " + localObject1 + " has target not in fragment manager: " + ((m)localObject1).j));
          if (((aa)localObject2).j == null)
            ((aa)localObject2).j = new Bundle();
          a(((aa)localObject2).j, "android:target_state", ((m)localObject1).j);
          if (((m)localObject1).l != 0)
            ((aa)localObject2).j.putInt("android:target_req_state", ((m)localObject1).l);
        }
        label303: if (a)
          Log.v("FragmentManager", "Saved state of " + localObject1 + ": " + ((aa)localObject2).j);
        i1 = 1;
      }
    }
    label718: 
    while (true)
    {
      i2 += 1;
      break label56;
      ((aa)localObject2).j = ((m)localObject1).e;
      break label303;
      if (i1 == 0)
      {
        if (!a)
          break;
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return null;
      }
      if (this.g != null)
      {
        i2 = this.g.size();
        if (i2 > 0)
        {
          localObject2 = new int[i2];
          i1 = 0;
          while (true)
          {
            localObject1 = localObject2;
            if (i1 >= i2)
              break;
            localObject2[i1] = ((m)this.g.get(i1)).g;
            if (localObject2[i1] < 0)
              a(new IllegalStateException("Failure saving state: active " + this.g.get(i1) + " has cleared index: " + localObject2[i1]));
            if (a)
              Log.v("FragmentManager", "saveAllState: adding fragment #" + i1 + ": " + this.g.get(i1));
            i1 += 1;
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.i != null)
      {
        i2 = this.i.size();
        localObject2 = localObject3;
        if (i2 > 0)
        {
          localObject3 = new j[i2];
          i1 = 0;
          while (true)
          {
            localObject2 = localObject3;
            if (i1 >= i2)
              break;
            localObject3[i1] = new j((g)this.i.get(i1));
            if (a)
              Log.v("FragmentManager", "saveAllState: adding back stack #" + i1 + ": " + this.i.get(i1));
            i1 += 1;
          }
        }
      }
      localObject3 = new z();
      ((z)localObject3).a = arrayOfaa;
      ((z)localObject3).b = ((I)localObject1);
      ((z)localObject3).c = ((j)localObject2);
      return localObject3;
    }
  }

  public void h()
  {
    this.t = false;
  }

  public void i()
  {
    this.t = false;
    a(1, false);
  }

  public void j()
  {
    this.t = false;
    a(2, false);
  }

  public void k()
  {
    this.t = false;
    a(4, false);
  }

  public void l()
  {
    this.t = false;
    a(5, false);
  }

  public void m()
  {
    a(4, false);
  }

  public void n()
  {
    this.t = true;
    a(3, false);
  }

  public void o()
  {
    a(2, false);
  }

  public void p()
  {
    a(1, false);
  }

  public void q()
  {
    this.u = true;
    d();
    a(0, false);
    this.o = null;
    this.p = null;
    this.q = null;
  }

  public void r()
  {
    if (this.g != null)
    {
      int i1 = 0;
      while (i1 < this.g.size())
      {
        m localm = (m)this.g.get(i1);
        if (localm != null)
          localm.B();
        i1 += 1;
      }
    }
  }

  ab s()
  {
    return this;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.q != null)
      c.a(this.q, localStringBuilder);
    while (true)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      c.a(this.o, localStringBuilder);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.w
 * JD-Core Version:    0.6.0
 */