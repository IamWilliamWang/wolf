package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;

class cw
  implements de
{
  cs a;
  boolean b;

  cw(cs paramcs)
  {
    this.a = paramcs;
  }

  public void a(View paramView)
  {
    this.b = false;
    if (cs.c(this.a) >= 0)
      bi.a(paramView, 2, null);
    if (cs.a(this.a) != null)
    {
      localObject = cs.a(this.a);
      cs.b(this.a, null);
      ((Runnable)localObject).run();
    }
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof de));
    for (localObject = (de)localObject; ; localObject = null)
    {
      if (localObject != null)
        ((de)localObject).a(paramView);
      return;
    }
  }

  public void b(View paramView)
  {
    if (cs.c(this.a) >= 0)
    {
      bi.a(paramView, cs.c(this.a), null);
      cs.a(this.a, -1);
    }
    if ((Build.VERSION.SDK_INT >= 16) || (!this.b))
    {
      if (cs.b(this.a) != null)
      {
        localObject = cs.b(this.a);
        cs.a(this.a, null);
        ((Runnable)localObject).run();
      }
      localObject = paramView.getTag(2113929216);
      if (!(localObject instanceof de))
        break label115;
    }
    label115: for (Object localObject = (de)localObject; ; localObject = null)
    {
      if (localObject != null)
        ((de)localObject).b(paramView);
      this.b = true;
      return;
    }
  }

  public void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof de));
    for (localObject = (de)localObject; ; localObject = null)
    {
      if (localObject != null)
        ((de)localObject).c(paramView);
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.cw
 * JD-Core Version:    0.6.0
 */