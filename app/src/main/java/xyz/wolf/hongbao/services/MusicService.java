package xyz.wolf.hongbao.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service
{
  private static String a = "MusicService";
  private MediaPlayer b;

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    this.b = MediaPlayer.create(getApplicationContext(), 2131165184);
    this.b.setLooping(true);
    super.onCreate();
  }

  public void onDestroy()
  {
    this.b.stop();
    super.onDestroy();
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    this.b.start();
    super.onStart(paramIntent, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.services.MusicService
 * JD-Core Version:    0.6.0
 */