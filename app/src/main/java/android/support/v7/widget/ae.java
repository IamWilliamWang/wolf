package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.g.f;

class ae extends f<Integer, PorterDuffColorFilter>
{
  public ae(int paramInt)
  {
    super(paramInt);
  }

  private static int b(int paramInt, PorterDuff.Mode paramMode)
  {
    return (paramInt + 31) * 31 + paramMode.hashCode();
  }

  PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)));
  }

  PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ae
 * JD-Core Version:    0.6.0
 */