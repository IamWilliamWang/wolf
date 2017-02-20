package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class bz extends Resources
{
  private final WeakReference<Context> a;

  public bz(Context paramContext, Resources paramResources)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.a = new WeakReference(paramContext);
  }

  final Drawable a(int paramInt)
  {
    return super.getDrawable(paramInt);
  }

  public Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)this.a.get();
    if (localContext != null)
      return ac.a().a(localContext, this, paramInt);
    return super.getDrawable(paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bz
 * JD-Core Version:    0.6.0
 */