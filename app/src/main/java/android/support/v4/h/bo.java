package android.support.v4.h;

import android.view.View;
import java.util.WeakHashMap;

class bo extends bm
{
  static boolean b = false;

  public void a(View paramView, a parama)
  {
    if (parama == null);
    for (parama = null; ; parama = parama.a())
    {
      bz.a(paramView, parama);
      return;
    }
  }

  public cs j(View paramView)
  {
    if (this.a == null)
      this.a = new WeakHashMap();
    cs localcs2 = (cs)this.a.get(paramView);
    cs localcs1 = localcs2;
    if (localcs2 == null)
    {
      localcs1 = new cs(paramView);
      this.a.put(paramView, localcs1);
    }
    return localcs1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.bo
 * JD-Core Version:    0.6.0
 */