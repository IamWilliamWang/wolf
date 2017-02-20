package android.support.v4.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

abstract class l extends k
{
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView2 = a(paramView, paramString, paramContext, paramAttributeSet);
    View localView1 = localView2;
    if (localView2 == null)
    {
      localView1 = localView2;
      if (Build.VERSION.SDK_INT >= 11)
        localView1 = super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.l
 * JD-Core Version:    0.6.0
 */