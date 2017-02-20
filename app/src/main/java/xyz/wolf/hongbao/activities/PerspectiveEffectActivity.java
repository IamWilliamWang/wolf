package xyz.wolf.hongbao.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;

public class PerspectiveEffectActivity extends Activity
  implements SurfaceHolder.Callback
{
  TextView a;
  SoundPool b;
  HashMap<Integer, Integer> c;
  boolean d;
  int e;
  Handler f = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 0)
      {
        PerspectiveEffectActivity.this.sendBroadcast(new Intent("com.specialtroop.perspective.finished.action"));
        PerspectiveEffectActivity.this.f.removeMessages(1);
        PerspectiveEffectActivity.this.b.stop(PerspectiveEffectActivity.this.e);
        PerspectiveEffectActivity.this.finish();
      }
      do
      {
        return;
        if (paramMessage.what != 1)
          continue;
        paramMessage = new StringBuilder();
        paramMessage.append("计算中\n\n");
        int i = 0;
        while (i < 15)
        {
          paramMessage.append("线程：" + String.valueOf(Math.random()) + "\n");
          i += 1;
        }
        PerspectiveEffectActivity.this.a.setText(paramMessage.toString());
        PerspectiveEffectActivity.this.f.sendEmptyMessageDelayed(1, 100L);
        return;
      }
      while (paramMessage.what != 2);
      if (PerspectiveEffectActivity.this.d)
      {
        PerspectiveEffectActivity.this.a(1, 4);
        return;
      }
      PerspectiveEffectActivity.this.f.sendEmptyMessageDelayed(2, 20L);
    }
  };
  private SharedPreferences g;
  private boolean h = false;
  private boolean i = false;

  public void a()
  {
    this.b = new SoundPool(5, 3, 0);
    this.c = new HashMap();
    this.c.put(Integer.valueOf(1), Integer.valueOf(this.b.load(this, 2131165187, 1)));
    this.b.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener()
    {
      public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
      {
        PerspectiveEffectActivity.this.d = true;
      }
    });
  }

  public void a(int paramInt1, int paramInt2)
  {
    AudioManager localAudioManager = (AudioManager)getSystemService("audio");
    float f1 = localAudioManager.getStreamMaxVolume(3);
    f1 = localAudioManager.getStreamVolume(3) * 2.0F / f1;
    this.e = this.b.play(((Integer)this.c.get(Integer.valueOf(paramInt1))).intValue(), f1, f1, 1, paramInt2, 1.6F);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(67108864);
    getWindow().addFlags(134217728);
    requestWindowFeature(1);
    setContentView(2130968607);
    paramBundle = (LinearLayout)findViewById(2131689575);
    this.g = PreferenceManager.getDefaultSharedPreferences(this);
    this.h = this.g.getBoolean("pref_daxiao_key", false);
    this.i = this.g.getBoolean("pref_pailei_key", false);
    this.a = new TextView(this);
    if (this.i)
      this.a.setTextColor(Color.parseColor("#00ff00"));
    StringBuilder localStringBuilder;
    while (true)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("计算中\n\n");
      int j = 0;
      while (j < 15)
      {
        localStringBuilder.append("线程：" + String.valueOf(Math.random()) + "\n");
        j += 1;
      }
      this.a.setTextColor(Color.parseColor("#ff0000"));
    }
    this.a.setText(localStringBuilder.toString());
    paramBundle.addView(this.a);
    a();
    this.f.sendEmptyMessage(2);
    this.f.sendEmptyMessageDelayed(1, 0L);
    this.f.sendEmptyMessageDelayed(0, 1200L);
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    Log.d("Perspective", "surfaceDestroyed: ");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.PerspectiveEffectActivity
 * JD-Core Version:    0.6.0
 */