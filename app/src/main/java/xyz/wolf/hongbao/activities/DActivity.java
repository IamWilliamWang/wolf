package xyz.wolf.hongbao.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.widget.TextView;
import xyz.wolf.hongbao.services.b;

public class DActivity extends Activity
{
  TextView a;
  TextView b;
  TextView c;
  TextView d;
  SharedPreferences e;
  Handler f = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 0);
    }
  };

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    this.a = ((TextView)findViewById(2131689558));
    this.b = ((TextView)findViewById(2131689557));
    this.c = ((TextView)findViewById(2131689559));
    this.d = ((TextView)findViewById(2131689556));
    this.e = PreferenceManager.getDefaultSharedPreferences(this);
    int j = this.e.getInt("pref_num_key", 0);
    int k = this.e.getInt("pref_value_key", 0);
    int m = (int)(Math.random() * 10.0D);
    for (int i = (int)(Math.random() * 10.0D); m == i; i = (int)(Math.random() * 10.0D));
    if ((j != 0) && (k != 0))
    {
      this.d.setText("--- 分析成功 ---");
      b.a(this).a("分析成功");
      this.b.setText(String.valueOf(k));
      this.a.setText(String.valueOf(j));
      this.c.setText(String.valueOf(m) + " , " + String.valueOf(i));
    }
    do
    {
      return;
      if (j != 0)
        continue;
      b.a(this).a("分析失败");
      this.d.setText("--- 分析失败 ---\n\n ：红包数过少");
      this.b.setText(String.valueOf(k));
      this.a.setText(String.valueOf(j));
      return;
    }
    while (k != 0);
    b.a(this).a("分析失败");
    this.d.setText("--- 分析失败 ---\n\n ：金额过少");
    this.b.setText(String.valueOf(k));
    this.a.setText(String.valueOf(j));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.DActivity
 * JD-Core Version:    0.6.0
 */