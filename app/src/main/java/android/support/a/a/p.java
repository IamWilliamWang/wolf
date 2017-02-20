package android.support.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class p extends Drawable.ConstantState
{
  int a;
  o b;
  ColorStateList c = null;
  PorterDuff.Mode d = j.b;
  boolean e;
  Bitmap f;
  ColorStateList g;
  PorterDuff.Mode h;
  int i;
  boolean j;
  boolean k;
  Paint l;

  public p()
  {
    this.b = new o();
  }

  public p(p paramp)
  {
    if (paramp != null)
    {
      this.a = paramp.a;
      this.b = new o(paramp.b);
      if (o.b(paramp.b) != null)
        o.a(this.b, new Paint(o.b(paramp.b)));
      if (o.c(paramp.b) != null)
        o.b(this.b, new Paint(o.c(paramp.b)));
      this.c = paramp.c;
      this.d = paramp.d;
      this.e = paramp.e;
    }
  }

  public Paint a(ColorFilter paramColorFilter)
  {
    if ((!a()) && (paramColorFilter == null))
      return null;
    if (this.l == null)
    {
      this.l = new Paint();
      this.l.setFilterBitmap(true);
    }
    this.l.setAlpha(this.b.a());
    this.l.setColorFilter(paramColorFilter);
    return this.l;
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.f.eraseColor(0);
    Canvas localCanvas = new Canvas(this.f);
    this.b.a(localCanvas, paramInt1, paramInt2, null);
  }

  public void a(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    paramColorFilter = a(paramColorFilter);
    paramCanvas.drawBitmap(this.f, null, paramRect, paramColorFilter);
  }

  public boolean a()
  {
    return this.b.a() < 255;
  }

  public void b(int paramInt1, int paramInt2)
  {
    if ((this.f == null) || (!c(paramInt1, paramInt2)))
    {
      this.f = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      this.k = true;
    }
  }

  public boolean b()
  {
    return (!this.k) && (this.g == this.c) && (this.h == this.d) && (this.j == this.e) && (this.i == this.b.a());
  }

  public void c()
  {
    this.g = this.c;
    this.h = this.d;
    this.i = this.b.a();
    this.j = this.e;
    this.k = false;
  }

  public boolean c(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.f.getWidth()) && (paramInt2 == this.f.getHeight());
  }

  public int getChangingConfigurations()
  {
    return this.a;
  }

  public Drawable newDrawable()
  {
    return new j(this, null);
  }

  public Drawable newDrawable(Resources paramResources)
  {
    return new j(this, null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.p
 * JD-Core Version:    0.6.0
 */