package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ah
{
  private final ImageView a;
  private final ac b;

  public ah(ImageView paramImageView, ac paramac)
  {
    this.a = paramImageView;
    this.b = paramac;
  }

  public void a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.b != null);
      for (Drawable localDrawable = this.b.a(this.a.getContext(), paramInt); ; localDrawable = a.a(this.a.getContext(), paramInt))
      {
        if (localDrawable != null)
          as.a(localDrawable);
        this.a.setImageDrawable(localDrawable);
        return;
      }
    }
    this.a.setImageDrawable(null);
  }

  public void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = ca.a(this.a.getContext(), paramAttributeSet, k.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = paramAttributeSet.b(k.AppCompatImageView_android_src);
      if (localDrawable != null)
        this.a.setImageDrawable(localDrawable);
      paramInt = paramAttributeSet.g(k.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1)
      {
        localDrawable = this.b.a(this.a.getContext(), paramInt);
        if (localDrawable != null)
          this.a.setImageDrawable(localDrawable);
      }
      localDrawable = this.a.getDrawable();
      if (localDrawable != null)
        as.a(localDrawable);
      return;
    }
    finally
    {
      paramAttributeSet.a();
    }
    throw localObject;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ah
 * JD-Core Version:    0.6.0
 */