package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

class d extends OvalShape
{
  private RadialGradient b;
  private Paint c = new Paint();
  private int d;

  public d(CircleImageView paramCircleImageView, int paramInt1, int paramInt2)
  {
    CircleImageView.a(paramCircleImageView, paramInt1);
    this.d = paramInt2;
    float f1 = this.d / 2;
    float f2 = this.d / 2;
    float f3 = CircleImageView.a(paramCircleImageView);
    paramCircleImageView = Shader.TileMode.CLAMP;
    this.b = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, paramCircleImageView);
    this.c.setShader(this.b);
  }

  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.a.getWidth();
    int j = this.a.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2 + CircleImageView.a(this.a), this.c);
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2, paramPaint);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.0
 */