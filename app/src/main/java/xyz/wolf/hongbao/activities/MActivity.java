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
import android.view.Window;
import android.widget.TextView;
import java.util.HashMap;

public class MActivity extends Activity
{
  private static int l = 10;
  TextView a;
  String[][] b;
  SoundPool c;
  HashMap<Integer, Integer> d;
  boolean e;
  int f;
  int g;
  Handler h;
  private SharedPreferences i;
  private boolean j;
  private boolean k;

  static
  {
    System.loadLibrary("oo");
  }

  public MActivity()
  {
    String[] arrayOfString = { "6", "7", "8", "9", "牛牛" };
    this.b = new String[][] { { "1", "2", "3", "4", "5" }, arrayOfString, { "对子", "顺子", "豹子" } };
    this.j = false;
    this.k = false;
    this.g = 0;
    this.h = new Handler()
    {
      public void handleMessage(Message paramMessage)
      {
        if (paramMessage.what == 0)
        {
          MActivity.this.sendBroadcast(new Intent("com.wolf.mactivity.finished.action"));
          MActivity.this.h.removeMessages(1);
          MActivity.a(MActivity.this);
          MActivity.this.finish();
        }
        do
        {
          return;
          if (paramMessage.what != 1)
            continue;
          MActivity.this.a.setText(MActivity.this.a.getText() + "-" + String.valueOf((int)(Math.random() * 10.0D)));
          MActivity.this.h.sendEmptyMessageDelayed(1, 10L);
          return;
        }
        while (paramMessage.what != 2);
        if (MActivity.this.e)
        {
          MActivity.this.a(1, 4);
          return;
        }
        MActivity.this.h.sendEmptyMessageDelayed(2, 100L);
      }
    };
  }

  private void b()
  {
    Intent localIntent = new Intent();
    localIntent.setClass(getApplicationContext(), DActivity.class);
    new Bundle();
    localIntent.setFlags(268468224);
    startActivity(localIntent);
  }

  public void a()
  {
    this.c = new SoundPool(5, 3, 0);
    this.d = new HashMap();
    this.d.put(Integer.valueOf(1), Integer.valueOf(this.c.load(this, 2131165187, 1)));
    this.c.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener()
    {
      public void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2)
      {
        MActivity.this.e = true;
      }
    });
  }

  public void a(int paramInt1, int paramInt2)
  {
    AudioManager localAudioManager = (AudioManager)getSystemService("audio");
    float f1 = localAudioManager.getStreamMaxVolume(3);
    f1 = localAudioManager.getStreamVolume(3) * 2.0F / f1;
    this.f = this.c.play(((Integer)this.d.get(Integer.valueOf(paramInt1))).intValue(), f1, f1, 1, paramInt2, 1.6F);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(67108864);
    getWindow().addFlags(134217728);
    requestWindowFeature(1);
    getIntent().getBundleExtra("bundle");
    setContentView(2130968603);
    a();
    this.i = PreferenceManager.getDefaultSharedPreferences(this);
    int m = this.i.getInt("pref_num_key", 0);
    this.a = ((TextView)findViewById(2131689560));
    this.a.setTextColor(Color.parseColor("#00ff00"));
    paramBundle = new StringBuilder();
    paramBundle.append("个数：" + String.valueOf(m) + "      正在分析埋雷数据 \n\n");
    paramBundle.append(String.valueOf((int)(Math.random() * 10.0D)));
    this.a.setText(paramBundle.toString());
    this.h.sendEmptyMessageDelayed(1, 10L);
    this.h.sendEmptyMessageDelayed(0, 2000L);
    this.h.sendEmptyMessageDelayed(2, 50L);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.MActivity
 * JD-Core Version:    0.6.0
 */