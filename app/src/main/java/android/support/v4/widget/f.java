package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class f extends ContentObserver
{
  public f(e parame)
  {
    super(new Handler());
  }

  public boolean deliverSelfNotifications()
  {
    return true;
  }

  public void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.f
 * JD-Core Version:    0.6.0
 */