package android.support.v4.h;

import android.view.View;
import java.util.WeakHashMap;

class ct
  implements db
{
  WeakHashMap<View, Runnable> a = null;

  private void b(cs paramcs, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof de));
    for (localObject = (de)localObject; ; localObject = null)
    {
      Runnable localRunnable1 = cs.a(paramcs);
      Runnable localRunnable2 = cs.b(paramcs);
      cs.b(paramcs, null);
      cs.a(paramcs, null);
      if (localRunnable1 != null)
        localRunnable1.run();
      if (localObject != null)
      {
        ((de)localObject).a(paramView);
        ((de)localObject).b(paramView);
      }
      if (localRunnable2 != null)
        localRunnable2.run();
      if (this.a != null)
        this.a.remove(paramView);
      return;
    }
  }

  private void c(cs paramcs, View paramView)
  {
    if (this.a != null);
    for (Runnable localRunnable = (Runnable)this.a.get(paramView); ; localRunnable = null)
    {
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new cu(this, paramcs, paramView, null);
        if (this.a == null)
          this.a = new WeakHashMap();
        this.a.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
      return;
    }
  }

  public void a(cs paramcs, View paramView)
  {
    c(paramcs, paramView);
  }

  public void a(cs paramcs, View paramView, float paramFloat)
  {
    c(paramcs, paramView);
  }

  public void a(cs paramcs, View paramView, de paramde)
  {
    paramView.setTag(2113929216, paramde);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.ct
 * JD-Core Version:    0.6.0
 */