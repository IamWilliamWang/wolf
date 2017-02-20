package android.support.v4.h;

import android.view.View;
import java.lang.ref.WeakReference;

class cu
  implements Runnable
{
  WeakReference<View> a;
  cs b;

  private cu(ct paramct, cs paramcs, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramcs;
  }

  public void run()
  {
    View localView = (View)this.a.get();
    if (localView != null)
      ct.a(this.c, this.b, localView);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cu
 * JD-Core Version:    0.6.0
 */