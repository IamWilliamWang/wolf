package xyz.wolf.hongbao.activities;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.baidu.tts.loopj.TextHttpResponseHandler;
import com.baidu.tts.tools.MD5;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import xyz.wolf.hongbao.a.c;
import xyz.wolf.hongbao.services.MusicService;

public class ZhActivity extends Activity
  implements SharedPreferences.OnSharedPreferenceChangeListener, AccessibilityManager.AccessibilityStateChangeListener
{
  private Button a;
  private ImageView b;
  private AccessibilityManager c;
  private SharedPreferences d;
  private AlertDialog e;
  private EditText f;
  private String g;
  private boolean h = false;
  private Handler i = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if (paramMessage.what == 0)
        ZhActivity.a(ZhActivity.this);
      do
      {
        return;
        if (paramMessage.what != 1)
          continue;
        paramMessage = new Intent(ZhActivity.this, MusicService.class);
        ZhActivity.this.startService(paramMessage);
        return;
      }
      while (paramMessage.what != 2);
      paramMessage = new Intent(ZhActivity.this, MusicService.class);
      ZhActivity.this.stopService(paramMessage);
    }
  };

  private void a(boolean paramBoolean)
  {
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    SharedPreferences.Editor localEditor = this.d.edit();
    localEditor.putBoolean(str, paramBoolean);
    if (paramBoolean)
      localEditor.putString(new String(new byte[] { 122, 104, 117, 95, 109, 97 }), this.g);
    localEditor.commit();
  }

  public static boolean b()
  {
    return Build.VERSION.SDK_INT >= 23;
  }

  private void d()
  {
    this.d = PreferenceManager.getDefaultSharedPreferences(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    if (!this.d.getBoolean(str, false))
      a();
  }

  private void e()
  {
    if (this.d == null)
      this.d = PreferenceManager.getDefaultSharedPreferences(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 98, 103, 95, 115, 111, 117, 110, 100, 95, 107, 101, 121 });
    this.d.registerOnSharedPreferenceChangeListener(this);
    if (this.d.getBoolean(str, true))
      this.i.sendEmptyMessage(1);
  }

  private void f()
  {
    PreferenceManager.setDefaultValues(this, 2131099650, false);
  }

  @TargetApi(21)
  private void g()
  {
    if (Build.VERSION.SDK_INT < 21)
      return;
    Window localWindow = getWindow();
    localWindow.clearFlags(67108864);
    localWindow.addFlags(-2147483648);
    localWindow.setStatusBarColor(-1807262);
  }

  private void h()
  {
    boolean bool1 = false;
    if (!j())
    {
      toOpenAccessibillty();
      return;
    }
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 112, 108, 117, 103, 95, 107, 101, 121 });
    boolean bool2 = this.d.getBoolean(str, false);
    SharedPreferences.Editor localEditor = this.d.edit();
    if (!bool2)
      bool1 = true;
    localEditor.putBoolean(str, bool1);
    localEditor.commit();
    if (!bool2)
    {
      this.a.setText(2131230747);
      this.b.setBackgroundResource(2130903052);
      return;
    }
    this.a.setText(2131230748);
    this.b.setBackgroundResource(2130903051);
  }

  private void i()
  {
    if (k())
    {
      this.a.setText(2131230747);
      this.b.setBackgroundResource(2130903052);
      return;
    }
    this.a.setText(2131230748);
    this.b.setBackgroundResource(2130903051);
  }

  private boolean j()
  {
    Iterator localIterator = this.c.getEnabledAccessibilityServiceList(16).iterator();
    while (localIterator.hasNext())
    {
      AccessibilityServiceInfo localAccessibilityServiceInfo = (AccessibilityServiceInfo)localIterator.next();
      String str = new String(new byte[] { 47, 46, 115, 101, 114, 118, 105, 99, 101, 115, 46, 72, 111, 110, 103, 98, 97, 111, 83, 101, 114, 118, 105, 99, 101 });
      if (localAccessibilityServiceInfo.getId().equals(getPackageName() + str))
        return true;
    }
    return false;
  }

  private boolean k()
  {
    if (this.d == null)
      this.d = PreferenceManager.getDefaultSharedPreferences(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 112, 108, 117, 103, 95, 107, 101, 121 });
    return this.d.getBoolean(str, false);
  }

  private void l()
  {
  }

  private void toOpenAccessibillty()
  {
    try
    {
      startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  void a()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle(2131230750);
    this.f = new EditText(this);
    localBuilder.setView(this.f);
    localBuilder.setPositiveButton(2131230752, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        if (ZhActivity.b(ZhActivity.this).getText().toString().length() == 0)
          Toast.makeText(ZhActivity.this, 2131230753, 1).show();
        try
        {
          while (true)
          {
            Field localField = paramDialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
            localField.setAccessible(true);
            localField.set(paramDialogInterface, Boolean.valueOf(false));
            paramDialogInterface.dismiss();
            return;
            if (ZhActivity.c(ZhActivity.this))
            {
              Toast.makeText(ZhActivity.this, 2131230754, 0).show();
              continue;
            }
            ZhActivity.a(ZhActivity.this, ZhActivity.b(ZhActivity.this).getText().toString());
            if (!ZhActivity.d(ZhActivity.this).substring(0, 3).equals("TZB"))
            {
              Toast.makeText(ZhActivity.this, "注册码不正确 ，请输入正版狼王注册码", 0).show();
              try
              {
                localField = paramDialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                localField.setAccessible(true);
                localField.set(paramDialogInterface, Boolean.valueOf(false));
                paramDialogInterface.dismiss();
                return;
              }
              catch (Exception paramDialogInterface)
              {
                paramDialogInterface.printStackTrace();
                return;
              }
            }
            ZhActivity.a(ZhActivity.this, ZhActivity.d(ZhActivity.this).substring(3));
            ZhActivity.b(ZhActivity.this).setCursorVisible(false);
            ZhActivity.a(ZhActivity.this, true);
            ZhActivity.this.c();
          }
        }
        catch (Exception paramDialogInterface)
        {
          paramDialogInterface.printStackTrace();
        }
      }
    });
    localBuilder.setNegativeButton("退出", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramDialogInterface, int paramInt)
      {
        try
        {
          Field localField = paramDialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
          localField.setAccessible(true);
          localField.set(paramDialogInterface, Boolean.valueOf(true));
          paramDialogInterface.dismiss();
          ZhActivity.this.finish();
          return;
        }
        catch (Exception paramDialogInterface)
        {
          while (true)
            paramDialogInterface.printStackTrace();
        }
      }
    });
    localBuilder.setCancelable(false);
    this.e = localBuilder.show();
  }

  void c()
  {
    Object localObject = Settings.Secure.getString(getBaseContext().getContentResolver(), "android_id");
    new String(new byte[] { 104, 116, 116, 112, 58, 47, 47, 112, 111, 115, 116, 46, 98, 97, 105, 98, 97, 111, 121, 117, 110, 46, 99, 111, 109, 47, 97, 112, 105, 47, 101, 50, 55, 57, 52, 55, 102, 99, 101, 53, 48, 56, 98, 102, 53, 102, 49, 97, 53, 54, 98, 49, 55, 54, 98, 99, 53, 49, 49, 49, 56, 102 });
    String str1 = "http://lw.ysdsw.net/km/index.php?key=" + this.k + "&uid=" + (String)localObject;
    String str2 = new String(new byte[] { 102, 117, 99, 107 });
    localObject = ((String)localObject + str2).getBytes();
    localObject = MD5.getInstance().getMD5(localObject);
    str2 = new String(new byte[] { 102, 97, 110, 116, 97, 115, 121, 49, 57, 56, 56 });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(new String(new byte[] { 102, 108, 97, 103 }), "注册码登录");
      localJSONObject.put("机器码", localObject);
      localJSONObject.put("注册码", this.g);
      localJSONObject.put("项目名称", str2);
      new StringEntity(localJSONObject.toString(), "UTF-8");
      localObject = new StringEntity(localJSONObject.toString(), "utf-8");
      new AsyncHttpClient().post(this, str1, (HttpEntity)localObject, new String(new byte[] { 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 106, 115, 111, 110 }), new TextHttpResponseHandler()
      {
        public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
        {
          ZhActivity.b(ZhActivity.this).setCursorVisible(true);
          Toast.makeText(ZhActivity.this, "网络异常 ，验证失败 ,请稍候再试 ！", 0).show();
          ZhActivity.a(ZhActivity.this, false);
        }

        public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
        {
          ZhActivity.b(ZhActivity.this).setCursorVisible(true);
          ZhActivity.a(ZhActivity.this, false);
          if (paramString.startsWith("1"))
          {
            paramString.split("\\|");
            ZhActivity.b(ZhActivity.this, true);
            Toast.makeText(ZhActivity.this, "授权成功 !", 0).show();
            try
            {
              paramArrayOfHeader = ZhActivity.e(ZhActivity.this).getClass().getSuperclass().getDeclaredField("mShowing");
              paramArrayOfHeader.setAccessible(true);
              paramArrayOfHeader.set(ZhActivity.e(ZhActivity.this), Boolean.valueOf(true));
              ZhActivity.e(ZhActivity.this).dismiss();
              ZhActivity.f(ZhActivity.this).sendEmptyMessage(0);
              return;
            }
            catch (Exception paramArrayOfHeader)
            {
              paramArrayOfHeader.printStackTrace();
              return;
            }
          }
          if (paramString.startsWith("操作失败:注册码"))
          {
            paramArrayOfHeader = paramString.split(":");
            ZhActivity.b(ZhActivity.this, false);
            Toast.makeText(ZhActivity.this, paramArrayOfHeader[1], 0).show();
            return;
          }
          Toast.makeText(ZhActivity.this, "网络异常 ，无法连接到服务器，请稍候再试 ！", 0).show();
        }
      });
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      this.h = false;
      localUnsupportedEncodingException.printStackTrace();
      return;
    }
    catch (JSONException localJSONException)
    {
      this.h = false;
      localJSONException.printStackTrace();
    }
  }

  public void onAccessibilityStateChanged(boolean paramBoolean)
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968604);
    this.a = ((Button)findViewById(2131689566));
    this.b = ((ImageView)findViewById(2131689565));
    g();
    f();
    e();
    this.c = ((AccessibilityManager)getSystemService("accessibility"));
    this.c.addAccessibilityStateChangeListener(this);
    i();
    d();
  }

  protected void onDestroy()
  {
    this.c.removeAccessibilityStateChangeListener(this);
    this.d.unregisterOnSharedPreferenceChangeListener(this);
    this.i.sendEmptyMessage(2);
    super.onDestroy();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    }
    do
      return;
    while ((paramArrayOfString.length <= 0) || (paramArrayOfInt[0] != 0));
    h();
  }

  protected void onResume()
  {
    super.onResume();
    i();
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (paramString.equals(new String(new byte[] { 112, 114, 101, 102, 95, 98, 103, 95, 115, 111, 117, 110, 100, 95, 107, 101, 121 })))
    {
      if (Boolean.valueOf(paramSharedPreferences.getBoolean(paramString, false)).booleanValue())
        this.i.sendEmptyMessage(1);
    }
    else
      return;
    this.i.sendEmptyMessage(2);
  }

  public void openAccessibility(View paramView)
  {
    if ((b()) && (android.support.v4.b.a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0))
    {
      android.support.v4.a.a.a(this, new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 1);
      return;
    }
    h();
  }

  public void openGitHub(View paramView)
  {
  }

  public void openSettings(View paramView)
  {
    if (!j())
    {
      toOpenAccessibillty();
      return;
    }
    paramView = new Intent(this, SettingsActivity.class);
    paramView.putExtra("title", "狼王V8.0");
    paramView.putExtra("frag_id", "SpecialSettingsFragment");
    startActivity(paramView);
  }

  public void openUber(View paramView)
  {
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.ZhActivity
 * JD-Core Version:    0.6.0
 */