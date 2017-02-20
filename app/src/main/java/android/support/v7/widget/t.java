package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class t
  implements Comparable<t>
{
  public final ResolveInfo a;
  public float b;

  public t(s params, ResolveInfo paramResolveInfo)
  {
    this.a = paramResolveInfo;
  }

  public int a(t paramt)
  {
    return Float.floatToIntBits(paramt.b) - Float.floatToIntBits(this.b);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      paramObject = (t)paramObject;
    }
    while (Float.floatToIntBits(this.b) == Float.floatToIntBits(paramObject.b));
    return false;
  }

  public int hashCode()
  {
    return Float.floatToIntBits(this.b) + 31;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.a.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.b));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.t
 * JD-Core Version:    0.6.0
 */