package xyz.wolf.hongbao.b;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

public class c
  implements SurfaceHolder.Callback
{
  private static c c = null;
  MediaPlayer a;
  SurfaceHolder b;

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.a = new MediaPlayer();
    this.a.setAudioStreamType(3);
    this.a.setDisplay(this.b);
    try
    {
      this.a.setDataSource("/sdcard/LuPingDaShi/Rec/42.mp4");
      this.a.prepare();
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      paramSurfaceHolder.printStackTrace();
    }
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.b.c
 * JD-Core Version:    0.6.0
 */