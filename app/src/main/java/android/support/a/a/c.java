package android.support.a.a;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.g.a;
import java.util.ArrayList;

class c extends Drawable.ConstantState
{
  int a;
  j b;
  ArrayList<Animator> c;
  a<Animator, String> d;

  public c(Context paramContext, c paramc, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (paramc != null)
    {
      this.a = paramc.a;
      if (paramc.b != null)
      {
        paramContext = paramc.b.getConstantState();
        if (paramResources == null)
          break label215;
      }
      label215: for (this.b = ((j)paramContext.newDrawable(paramResources)); ; this.b = ((j)paramContext.newDrawable()))
      {
        this.b = ((j)this.b.mutate());
        this.b.setCallback(paramCallback);
        this.b.setBounds(paramc.b.getBounds());
        this.b.a(false);
        if (paramc.c == null)
          break;
        int j = paramc.c.size();
        this.c = new ArrayList(j);
        this.d = new a(j);
        while (i < j)
        {
          paramCallback = (Animator)paramc.c.get(i);
          paramContext = paramCallback.clone();
          paramCallback = (String)paramc.d.get(paramCallback);
          paramContext.setTarget(this.b.a(paramCallback));
          this.c.add(paramContext);
          this.d.put(paramContext, paramCallback);
          i += 1;
        }
      }
    }
  }

  public int getChangingConfigurations()
  {
    return this.a;
  }

  public Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 21.");
  }

  public Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 21.");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.c
 * JD-Core Version:    0.6.0
 */