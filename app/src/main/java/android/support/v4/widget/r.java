package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class r
{
  public static void a(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      t.a(paramListView, paramInt);
      return;
    }
    s.a(paramListView, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.r
 * JD-Core Version:    0.6.0
 */