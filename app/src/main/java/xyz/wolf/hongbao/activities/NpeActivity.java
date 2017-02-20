package xyz.wolf.hongbao.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import xyz.wolf.hongbao.services.b;

public class NpeActivity extends Activity
  implements SurfaceHolder.Callback
{
  private static int k = 10;
  TableLayout a;
  String[] b;
  String[][] c;
  Random d;
  TextView e;
  TextView f;
  int g;
  Handler h;
  private boolean i;
  private boolean j;
  LinearLayout l;
  ScrollView s;

  static
  {
    System.loadLibrary("oo");
  }

  public NpeActivity()
  {
    String[] arrayOfString1 = { "6", "7", "8", "9", "牛牛" };
    String[] arrayOfString2 = { "对子", "顺子", "豹子" };
    this.c = new String[][] { { "1", "2", "3", "4", "5" }, arrayOfString1, arrayOfString2 };
    this.i = false;
    this.j = false;
    this.g = 0;
    this.h = new Handler()
    {
      public void handleMessage(Message paramMessage)
      {
        if (paramMessage.what == 0)
        {
          NpeActivity.this.sendBroadcast(new Intent("com.specialtroop.perspective.finished.action"));
          NpeActivity.this.h.removeMessages(1);
          NpeActivity.this.finish();
        }
        do
          return;
        while (paramMessage.what != 1);
        Object localObject;
        String[] arrayOfString;
        NpeActivity localNpeActivity;
        int i;
        label191: int j;
        if (NpeActivity.this.g % 7 == 4)
        {
          paramMessage = NpeActivity.this.e;
          localObject = new StringBuilder().append(NpeActivity.this.e.getText()).append("\n");
          arrayOfString = NpeActivity.this.b;
          localNpeActivity = NpeActivity.this;
          i = localNpeActivity.g;
          localNpeActivity.g = (i + 1);
          paramMessage.setText(arrayOfString[(i % 15)] + " value = " + String.valueOf(0.2D + Math.random()) + "\n");
          NpeActivity.a(NpeActivity.this);
          int m = NpeActivity.this.a.getChildCount();
          i = 0;
          if (i >= m)
            break label395;
          paramMessage = (TableRow)NpeActivity.this.a.getChildAt(i);
          int n = paramMessage.getChildCount();
          j = 0;
          label220: if (j >= n)
            break label388;
          localObject = (TextView)paramMessage.getChildAt(j);
          if (i % 2 != 0)
            if (i <= 3)
              break label411;
        }
        label388: label395: label411: for (int k = j + 2; ; k = 1)
        {
          ((TextView)localObject).setText(NpeActivity.this.d.nextInt(50 / k) + "%");
          j += 1;
          break label220;
          paramMessage = NpeActivity.this.e;
          localObject = new StringBuilder().append(NpeActivity.this.e.getText()).append("\n");
          arrayOfString = NpeActivity.this.b;
          localNpeActivity = NpeActivity.this;
          i = localNpeActivity.g;
          localNpeActivity.g = (i + 1);
          paramMessage.setText(arrayOfString[(i % 15)] + "\n");
          break;
          i += 1;
          break label191;
          NpeActivity.this.h.sendEmptyMessageDelayed(1, 80L);
          return;
        }
      }
    };
  }

  private long g(String paramString)
  {
    return PreferenceManager.getDefaultSharedPreferences(this).getLong(paramString, 0L);
  }

  private native String[][] i();

  private void t(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }

  private native void u();

  private void w(String paramString, long paramLong)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this).edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.commit();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(67108864);
    getWindow().addFlags(134217728);
    requestWindowFeature(1);
    paramBundle = getIntent().getBundleExtra("bundle");
    setContentView(2130968606);
    if (this.b == null)
      this.b = i()[0];
    this.e = ((TextView)findViewById(2131689560));
    this.f = ((TextView)findViewById(2131689570));
    this.f.setText(paramBundle.getString("s"));
    this.l = ((LinearLayout)findViewById(2131689573));
    this.s = ((ScrollView)findViewById(2131689572));
    this.h.sendEmptyMessage(1);
    this.d = new Random();
    this.a = ((TableLayout)findViewById(2131689574));
    this.a.setStretchAllColumns(true);
    int m = 0;
    while (m < 6)
    {
      paramBundle = new TableRow(this);
      int n = 5;
      if (m > 3)
        n = 3;
      int i1 = 0;
      if (i1 < n)
      {
        TextView localTextView = new TextView(this);
        if (m % 2 != 0)
        {
          localTextView.setTextColor(-65536);
          localTextView.setText(this.d.nextInt(100) + "%");
        }
        while (true)
        {
          paramBundle.addView(localTextView);
          i1 += 1;
          break;
          localTextView.setText(this.c[(m / 2)][i1]);
        }
      }
      this.a.addView(paramBundle, new TableLayout.LayoutParams(-1, -2));
      m += 1;
    }
    this.h.sendEmptyMessageDelayed(0, 2000L);
    new Thread()
    {
      public void run()
      {
        b.a(NpeActivity.this.getApplicationContext()).a("正在推算");
      }
    }
    .run();
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
 * Qualified Name:     xyz.wolf.hongbao.activities.NpeActivity
 * JD-Core Version:    0.6.0
 */