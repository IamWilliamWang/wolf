package xyz.wolf.hongbao.b;

import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class d
{
  private PowerManager.WakeLock a;
  private KeyguardManager.KeyguardLock b;

  public d(Context paramContext)
  {
    this.a = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(268435462, "HongbaoWakelock");
    this.b = ((KeyguardManager)paramContext.getSystemService("keyguard")).newKeyguardLock("HongbaoKeyguardLock");
  }

  private void a()
  {
    this.a.acquire(1800000L);
    this.b.disableKeyguard();
  }

  private void b()
  {
    if (this.a.isHeld())
    {
      this.a.release();
      this.b.reenableKeyguard();
    }
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a();
      return;
    }
    b();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.b.d
 * JD-Core Version:    0.6.0
 */