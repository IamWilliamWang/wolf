package xyz.wolf.hongbao.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import xyz.wolf.hongbao.services.b;

public class ReportResultActivity extends Activity
{
  boolean a;
  String b;
  TextView c;
  int d;
  WebView e;
  Handler f = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      ReportResultActivity.this.finish();
    }
  };

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968609);
    this.e = ((WebView)findViewById(2131689580));
    this.e.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    this.e.setBackgroundColor(0);
    this.e.loadDataWithBaseURL(null, "<HTML><body bgcolor='#f3f3f3'>   <div align=center><IMG src='file:///android_asset/sucess2.gif'/></div></body></html>", "text/html", "UTF-8", null);
    paramBundle = (LinearLayout)findViewById(2131689579);
    paramBundle = getIntent().getBundleExtra("bundle");
    this.a = paramBundle.getBoolean("isFailed");
    this.b = paramBundle.getString("resultText");
    this.d = paramBundle.getInt("type");
    new Thread()
    {
      public void run()
      {
        if (ReportResultActivity.this.a)
          if (ReportResultActivity.this.d == 0)
          {
            b.a(ReportResultActivity.this.getApplicationContext()).a("透视失败");
            ReportResultActivity.this.c.setTextColor(Color.parseColor("#ff0000"));
          }
        do
        {
          do
          {
            return;
            if (ReportResultActivity.this.d != 1)
              continue;
            b.a(ReportResultActivity.this.getApplicationContext()).a(ReportResultActivity.this.b);
            return;
          }
          while (ReportResultActivity.this.d != 2);
          b.a(ReportResultActivity.this.getApplicationContext()).a(ReportResultActivity.this.b);
          return;
          if (ReportResultActivity.this.d == 0)
          {
            b.a(ReportResultActivity.this.getApplicationContext()).a("主人 ，已为你排雷成功");
            return;
          }
          if (ReportResultActivity.this.d != 1)
            continue;
          b.a(ReportResultActivity.this.getApplicationContext()).a(ReportResultActivity.this.b);
          return;
        }
        while (ReportResultActivity.this.d != 2);
        b.a(ReportResultActivity.this.getApplicationContext()).a(ReportResultActivity.this.b);
      }
    }
    .run();
    this.f.sendEmptyMessageDelayed(0, 1500L);
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.ReportResultActivity
 * JD-Core Version:    0.6.0
 */