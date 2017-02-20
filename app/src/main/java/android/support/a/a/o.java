package android.support.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region.Op;
import android.support.v4.g.a;
import java.util.ArrayList;

class o
{
  private static final Matrix j = new Matrix();
  float a = 0.0F;
  float b = 0.0F;
  float c = 0.0F;
  float d = 0.0F;
  int e = 255;
  String f = null;
  final a<String, Object> g = new a();
  private final Path h;
  private final Path i;
  private final Matrix k = new Matrix();
  private Paint l;
  private Paint m;
  private PathMeasure n;
  private int o;
  private final m p;

  public o()
  {
    this.p = new m();
    this.h = new Path();
    this.i = new Path();
  }

  public o(o paramo)
  {
    this.p = new m(paramo.p, this.g);
    this.h = new Path(paramo.h);
    this.i = new Path(paramo.i);
    this.a = paramo.a;
    this.b = paramo.b;
    this.c = paramo.c;
    this.d = paramo.d;
    this.o = paramo.o;
    this.e = paramo.e;
    this.f = paramo.f;
    if (paramo.f != null)
      this.g.put(paramo.f, this);
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
  }

  private float a(Matrix paramMatrix)
  {
    float f1 = 0.0F;
    float[] arrayOfFloat = new float[4];
    float[] tmp9_7 = arrayOfFloat;
    tmp9_7[0] = 0.0F;
    float[] tmp13_9 = tmp9_7;
    tmp13_9[1] = 1.0F;
    float[] tmp17_13 = tmp13_9;
    tmp17_13[2] = 1.0F;
    float[] tmp21_17 = tmp17_13;
    tmp21_17[3] = 0.0F;
    tmp21_17;
    paramMatrix.mapVectors(arrayOfFloat);
    float f3 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
    float f4 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
    float f2 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
    f3 = Math.max(f3, f4);
    if (f3 > 0.0F)
      f1 = Math.abs(f2) / f3;
    return f1;
  }

  private void a(m paramm, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    m.b(paramm).set(paramMatrix);
    m.b(paramm).preConcat(m.c(paramm));
    int i1 = 0;
    if (i1 < paramm.a.size())
    {
      paramMatrix = paramm.a.get(i1);
      if ((paramMatrix instanceof m))
        a((m)paramMatrix, m.b(paramm), paramCanvas, paramInt1, paramInt2, paramColorFilter);
      while (true)
      {
        i1 += 1;
        break;
        if (!(paramMatrix instanceof n))
          continue;
        a(paramm, (n)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
    }
  }

  private void a(m paramm, n paramn, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f2 = paramInt1 / this.c;
    float f3 = paramInt2 / this.d;
    float f1 = Math.min(f2, f3);
    paramm = m.b(paramm);
    this.k.set(paramm);
    this.k.postScale(f2, f3);
    f2 = a(paramm);
    if (f2 == 0.0F)
      return;
    paramn.a(this.h);
    Path localPath = this.h;
    this.i.reset();
    if (paramn.a())
    {
      this.i.addPath(localPath, this.k);
      paramCanvas.clipPath(this.i, Region.Op.REPLACE);
      return;
    }
    paramm = (l)paramn;
    float f6;
    float f4;
    if ((paramm.g != 0.0F) || (paramm.h != 1.0F))
    {
      f6 = paramm.g;
      float f7 = paramm.i;
      f4 = paramm.h;
      float f5 = paramm.i;
      if (this.n == null)
        this.n = new PathMeasure();
      this.n.setPath(this.h, false);
      f3 = this.n.getLength();
      f6 = (f6 + f7) % 1.0F * f3;
      f4 = (f4 + f5) % 1.0F * f3;
      localPath.reset();
      if (f6 <= f4)
        break label506;
      this.n.getSegment(f6, f3, localPath, true);
      this.n.getSegment(0.0F, f4, localPath, true);
    }
    while (true)
    {
      localPath.rLineTo(0.0F, 0.0F);
      this.i.addPath(localPath, this.k);
      if (paramm.c != 0)
      {
        if (this.m == null)
        {
          this.m = new Paint();
          this.m.setStyle(Paint.Style.FILL);
          this.m.setAntiAlias(true);
        }
        paramn = this.m;
        paramn.setColor(j.a(paramm.c, paramm.f));
        paramn.setColorFilter(paramColorFilter);
        paramCanvas.drawPath(this.i, paramn);
      }
      if (paramm.a == 0)
        break;
      if (this.l == null)
      {
        this.l = new Paint();
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setAntiAlias(true);
      }
      paramn = this.l;
      if (paramm.k != null)
        paramn.setStrokeJoin(paramm.k);
      if (paramm.j != null)
        paramn.setStrokeCap(paramm.j);
      paramn.setStrokeMiter(paramm.l);
      paramn.setColor(j.a(paramm.a, paramm.d));
      paramn.setColorFilter(paramColorFilter);
      paramn.setStrokeWidth(f2 * f1 * paramm.b);
      paramCanvas.drawPath(this.i, paramn);
      return;
      label506: this.n.getSegment(f6, f4, localPath, true);
    }
  }

  public int a()
  {
    return this.e;
  }

  public void a(float paramFloat)
  {
    a((int)(255.0F * paramFloat));
  }

  public void a(int paramInt)
  {
    this.e = paramInt;
  }

  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    a(this.p, j, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }

  public float b()
  {
    return a() / 255.0F;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.o
 * JD-Core Version:    0.6.0
 */