package android.support.v4.a;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;

public class a extends android.support.v4.b.a
{
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      c.a(paramActivity);
      return;
    }
    paramActivity.finish();
  }

  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23)
      d.a(paramActivity, paramArrayOfString, paramInt);
    do
      return;
    while (!(paramActivity instanceof b));
    new Handler(Looper.getMainLooper()).post(new Runnable(paramArrayOfString, paramActivity, paramInt)
    {
      public void run()
      {
        int[] arrayOfInt = new int[a.this.length];
        PackageManager localPackageManager = this.b.getPackageManager();
        String str = this.b.getPackageName();
        int j = a.this.length;
        int i = 0;
        while (i < j)
        {
          arrayOfInt[i] = localPackageManager.checkPermission(a.this[i], str);
          i += 1;
        }
        ((b)this.b).onRequestPermissionsResult(this.c, a.this, arrayOfInt);
      }
    });
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.a
 * JD-Core Version:    0.6.0
 */