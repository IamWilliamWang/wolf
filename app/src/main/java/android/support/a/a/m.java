package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class m
{
  final ArrayList<Object> a = new ArrayList();
  private final Matrix b = new Matrix();
  private float c = 0.0F;
  private float d = 0.0F;
  private float e = 0.0F;
  private float f = 1.0F;
  private float g = 1.0F;
  private float h = 0.0F;
  private float i = 0.0F;
  private final Matrix j = new Matrix();
  private int k;
  private int[] l;
  private String m = null;

  public m()
  {
  }

  public m(m paramm, android.support.v4.g.a<String, Object> parama)
  {
    this.c = paramm.c;
    this.d = paramm.d;
    this.e = paramm.e;
    this.f = paramm.f;
    this.g = paramm.g;
    this.h = paramm.h;
    this.i = paramm.i;
    this.l = paramm.l;
    this.m = paramm.m;
    this.k = paramm.k;
    if (this.m != null)
      parama.put(this.m, this);
    this.j.set(paramm.j);
    ArrayList localArrayList = paramm.a;
    int n = 0;
    while (n < localArrayList.size())
    {
      paramm = localArrayList.get(n);
      if ((paramm instanceof m))
      {
        paramm = (m)paramm;
        this.a.add(new m(paramm, parama));
        n += 1;
        continue;
      }
      if ((paramm instanceof l));
      for (paramm = new l((l)paramm); ; paramm = new k((k)paramm))
      {
        this.a.add(paramm);
        if (paramm.n == null)
          break;
        parama.put(paramm.n, paramm);
        break;
        if (!(paramm instanceof k))
          break label315;
      }
      label315: throw new IllegalStateException("Unknown object in the tree!");
    }
  }

  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.l = null;
    this.c = h.a(paramTypedArray, paramXmlPullParser, "rotation", 5, this.c);
    this.d = paramTypedArray.getFloat(1, this.d);
    this.e = paramTypedArray.getFloat(2, this.e);
    this.f = h.a(paramTypedArray, paramXmlPullParser, "scaleX", 3, this.f);
    this.g = h.a(paramTypedArray, paramXmlPullParser, "scaleY", 4, this.g);
    this.h = h.a(paramTypedArray, paramXmlPullParser, "translateX", 6, this.h);
    this.i = h.a(paramTypedArray, paramXmlPullParser, "translateY", 7, this.i);
    paramTypedArray = paramTypedArray.getString(0);
    if (paramTypedArray != null)
      this.m = paramTypedArray;
    b();
  }

  private void b()
  {
    this.j.reset();
    this.j.postTranslate(-this.d, -this.e);
    this.j.postScale(this.f, this.g);
    this.j.postRotate(this.c, 0.0F, 0.0F);
    this.j.postTranslate(this.h + this.d, this.i + this.e);
  }

  public String a()
  {
    return this.m;
  }

  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = i.b(paramResources, paramTheme, paramAttributeSet, a.b);
    a(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.m
 * JD-Core Version:    0.6.0
 */