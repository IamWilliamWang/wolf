package android.support.v4.a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

abstract class k extends Activity
{
  native abstract View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);

  protected void onCreate(Bundle paramBundle)
  {
    if ((Build.VERSION.SDK_INT < 11) && (getLayoutInflater().getFactory() == null))
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView2 = a(null, paramString, paramContext, paramAttributeSet);
    View localView1 = localView2;
    if (localView2 == null)
      localView1 = super.onCreateView(paramString, paramContext, paramAttributeSet);
    return localView1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.k
 * JD-Core Version:    0.6.0
 */