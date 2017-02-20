package android.support.v4.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

class x
  implements LayoutInflater.Factory
{
  final ab a;

  x(ab paramab)
  {
    this.a = paramab;
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.a(null, paramString, paramContext, paramAttributeSet);
  }

  public String toString()
  {
    return getClass().getName() + "{" + this.a + "}";
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.x
 * JD-Core Version:    0.6.0
 */