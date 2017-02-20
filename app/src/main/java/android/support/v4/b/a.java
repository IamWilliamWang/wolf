package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Process;

public class a
{
  public static int a(Context paramContext, String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("permission is null");
    return paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
  }

  public static final Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
      return b.a(paramContext, paramInt);
    return paramContext.getResources().getDrawable(paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.b.a
 * JD-Core Version:    0.6.0
 */