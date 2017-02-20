package xyz.wolf.hongbao.a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.provider.Settings.Secure;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.baidu.tts.loopj.TextHttpResponseHandler;
import com.baidu.tts.tools.MD5;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import xyz.wolf.hongbao.activities.SettingsActivity;

public class c extends PreferenceFragment
  implements Preference.OnPreferenceChangeListener, Preference.OnPreferenceClickListener
{
  String[] a = { "百位", "十位", "个位", "角位", "分位" };
  private SwitchPreference b = null;
  private SwitchPreference c = null;
  private SwitchPreference d = null;
  private SwitchPreference e = null;
  private SwitchPreference f = null;
  private Preference g = null;
  private SharedPreferences h;
  private AccessibilityManager i;
  private EditText j;
  private String k;
  private boolean l = false;
  private boolean m = false;
  private AlertDialog n;
  private Handler o = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if (paramMessage.what == 0)
        c.a(c.this);
    }
  };

  private void a(boolean paramBoolean)
  {
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    SharedPreferences.Editor localEditor = this.h.edit();
    localEditor.putBoolean(str, paramBoolean);
    this.m = paramBoolean;
    if (paramBoolean)
      localEditor.putString(new String(new byte[] { 122, 104, 117, 95, 109, 97 }), this.k.trim());
    localEditor.commit();
  }

  public static boolean c()
  {
    return Build.VERSION.SDK_INT >= 23;
  }

  private void d()
  {
  }

  private void e()
  {
    this.h = PreferenceManager.getDefaultSharedPreferences(getActivity());
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    this.m = this.h.getBoolean(str, false);
  }

  private void f()
  {
    Object localObject = new AlertDialog.Builder(getActivity());
    ((AlertDialog.Builder)localObject).setView(LayoutInflater.from(getActivity()).inflate(2130968612, null));
    this.n = ((AlertDialog.Builder)localObject).create();
    this.n.show();
    localObject = (Button)this.n.findViewById(2131689588);
    this.j = ((EditText)this.n.findViewById(2131689587));
    ((Button)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramView)
      {
        c.this.a();
        c.b(c.this).dismiss();
      }
    });
  }

  private boolean g()
  {
    Iterator localIterator = this.i.getEnabledAccessibilityServiceList(16).iterator();
    while (localIterator.hasNext())
    {
      AccessibilityServiceInfo localAccessibilityServiceInfo = (AccessibilityServiceInfo)localIterator.next();
      String str = new String(new byte[] { 47, 46, 115, 101, 114, 118, 105, 99, 101, 115, 46, 72, 111, 110, 103, 98, 97, 111, 83, 101, 114, 118, 105, 99, 101 });
      if (localAccessibilityServiceInfo.getId().equals(getActivity().getPackageName() + str))
        return true;
    }
    return false;
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
    if (this.j.getText().toString().length() == 0)
    {
      Toast.makeText(getActivity(), 2131230753, 1).show();
      return;
    }
    if (this.l)
    {
      Toast.makeText(getActivity(), 2131230754, 0).show();
      return;
    }
    this.k = this.j.getText().toString();
    this.k.substring(0, 3);
    this.j.setCursorVisible(false);
    this.l = true;
    b();
  }

  void b()
  {
    Object localObject1 = Settings.Secure.getString(getActivity().getContentResolver(), "android_id");
    new String(new byte[] { 104, 116, 116, 112, 58, 47, 47, 112, 111, 115, 116, 46, 98, 97, 105, 98, 97, 111, 121, 117, 110, 46, 99, 111, 109, 47, 97, 112, 105, 47, 101, 50, 55, 57, 52, 55, 102, 99, 101, 53, 48, 56, 98, 102, 53, 102, 49, 97, 53, 54, 98, 49, 55, 54, 98, 99, 53, 49, 49, 49, 56, 102 });
    String str1 = "http://lw.ysdsw.net/km/index.php?key=" + this.k + "&uid=" + (String)localObject1;
    Object localObject2 = new String(new byte[] { 102, 117, 99, 107 });
    localObject1 = ((String)localObject1 + (String)localObject2).getBytes();
    localObject1 = MD5.getInstance().getMD5(localObject1);
    new String(new byte[] { 102, 97, 110, 116, 97, 115, 121, 49, 57, 56, 56 });
    localObject2 = new JSONObject();
    try
    {
      ((JSONObject)localObject2).put(new String(new byte[] { 102, 108, 97, 103 }), "注册码登录");
      ((JSONObject)localObject2).put("机器码", localObject1);
      ((JSONObject)localObject2).put("注册码", this.k);
      ((JSONObject)localObject2).put("项目名称", "fantasy1989");
      new StringEntity(((JSONObject)localObject2).toString(), "UTF-8");
      localObject1 = new StringEntity(((JSONObject)localObject2).toString(), "utf-8");
      localObject2 = new AsyncHttpClient();
      String str2 = new String(new byte[] { 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 106, 115, 111, 110 });
      ((AsyncHttpClient)localObject2).post(getActivity(), str1, (HttpEntity)localObject1, str2, new TextHttpResponseHandler()
      {
        public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
        {
          c.c(c.this).setCursorVisible(true);
          Toast.makeText(c.this.getActivity(), "网络异常 ，验证失败 ,请稍候再试 ！", 0).show();
          c.a(c.this, false);
        }

        public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
        {
          c.c(c.this).setCursorVisible(true);
          c.a(c.this, false);
          if (paramString.startsWith("1"))
          {
            paramString.split("\\|");
            c.b(c.this, true);
            c.d(c.this).setChecked(true);
            Toast.makeText(c.this.getActivity(), "授权成功 !", 0).show();
            c.e(c.this).sendEmptyMessage(0);
            return;
          }
          if (paramString.startsWith("操作失败:注册码"))
          {
            paramArrayOfHeader = paramString.split(":");
            c.b(c.this, false);
            Toast.makeText(c.this.getActivity(), paramArrayOfHeader[1], 0).show();
            return;
          }
          Toast.makeText(c.this.getActivity(), "网络异常 ，无法连接到服务器，请稍候再试 ！", 0).show();
        }
      });
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      this.l = false;
      localUnsupportedEncodingException.printStackTrace();
      return;
    }
    catch (JSONException localJSONException)
    {
      this.l = false;
      localJSONException.printStackTrace();
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    Log.d("SpecialSettingsFragment", "onActivityCreated: ");
    super.onActivityCreated(paramBundle);
    paramBundle = (TextView)getView().findViewById(2131689630);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131099652);
    this.h = PreferenceManager.getDefaultSharedPreferences(getActivity());
    e();
    this.b = ((SwitchPreference)findPreference("pref_pailei_key"));
    this.c = ((SwitchPreference)findPreference("pref_daxiao_key"));
    this.d = ((SwitchPreference)findPreference("pref_niuniu_key"));
    this.f = ((SwitchPreference)findPreference("pref_quick_key"));
    this.e = ((SwitchPreference)findPreference("pref_auth"));
    this.g = findPreference("pref_pailei_lei");
    this.b.setOnPreferenceChangeListener(this);
    this.c.setOnPreferenceChangeListener(this);
    this.e.setOnPreferenceChangeListener(this);
    this.g.setOnPreferenceChangeListener(this);
    this.f.setOnPreferenceChangeListener(this);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Log.d("SpecialSettingsFragment", "onCreateView: ");
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    int i3 = 1;
    int i1 = 0;
    boolean bool1 = this.h.getBoolean("pref_pailei_key", false);
    boolean bool2 = this.h.getBoolean("pref_daxiao_key", false);
    boolean bool3 = this.h.getBoolean("pref_niuniu_key", false);
    boolean bool4 = this.h.getBoolean("pref_quick_key", false);
    boolean bool5 = this.h.getBoolean("pref_auth", false);
    int i2;
    if (paramPreference == this.b)
      if (!this.m)
      {
        Toast.makeText(getActivity(), "先授权 ，再开启", 0).show();
        i2 = 0;
      }
    do
    {
      do
      {
        do
        {
          while (true)
          {
            return i2;
            i2 = i3;
            if (bool1)
              continue;
            if ((!bool2) && (!bool3))
            {
              i2 = i3;
              if (!bool4)
                continue;
            }
            Toast.makeText(getActivity(), "秒抢或大小开关已开启， 请先关闭秒抢或大小开关", 0).show();
            return false;
            if (paramPreference == this.c)
            {
              if (!this.m)
              {
                Toast.makeText(getActivity(), "先授权 ，再开启", 0).show();
                return false;
              }
              if ((!bool1) && (!bool3))
              {
                i2 = i3;
                if (!bool4)
                  continue;
              }
              i2 = i3;
              if (bool2)
                continue;
              Toast.makeText(getActivity(), "秒抢或排雷开关已开启， 请先关闭秒抢或排雷开关", 0).show();
              return false;
            }
            if (paramPreference == this.d)
            {
              if (!this.m)
              {
                Toast.makeText(getActivity(), "先授权 ，再开启", 0).show();
                return false;
              }
              if ((!bool1) && (!bool2))
              {
                i2 = i3;
                if (!bool4)
                  continue;
              }
              i2 = i3;
              if (bool3)
                continue;
              Toast.makeText(getActivity(), "排雷或大小开关已开启， 请先关闭排雷或大小开关", 0).show();
              return false;
            }
            if (paramPreference != this.e)
              break;
            i2 = i3;
            if (bool5)
              continue;
            i2 = i3;
            if (this.m)
              continue;
            f();
            return false;
          }
          if (paramPreference == this.g)
          {
            paramPreference = paramObject.toString();
            if (((Set)paramObject).size() == 0)
            {
              paramPreference = new HashSet(1);
              paramPreference.add("分位");
              ((MultiSelectListPreference)this.g).setValues(paramPreference);
              paramObject = this.h.edit();
              paramObject.putStringSet("pref_pailei_lei", paramPreference);
              paramObject.commit();
              return false;
            }
            paramObject = new StringBuilder();
            while (i1 < 5)
            {
              if (paramPreference.contains(this.a[i1]))
                paramObject.append(" " + this.a[i1] + " ,");
              i1 += 1;
            }
            paramObject.deleteCharAt(paramObject.length() - 1);
            this.g.setSummary(paramObject);
            return true;
          }
          i2 = i3;
        }
        while (paramPreference != this.f);
        if (!this.m)
        {
          Toast.makeText(getActivity(), "先授权 ，再开启", 0).show();
          return false;
        }
        i2 = i3;
      }
      while (bool4);
      if ((bool2) || (bool3))
        break;
      i2 = i3;
    }
    while (!bool1);
    Toast.makeText(getActivity(), "大小或排雷开关已开启， 请先关闭大小或排雷开关", 0).show();
    return false;
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    return false;
  }

  public void onResume()
  {
    Log.d("SpecialSettingsFragment", "onResume: ");
    super.onResume();
    TextView localTextView = (TextView)getActivity().findViewById(2131689630);
  }

  public void onStart()
  {
    super.onStart();
    TextView localTextView = (TextView)getActivity().findViewById(2131689630);
    Log.d("SpecialSettingsFragment", "onStart: ");
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    Log.d("SpecialSettingsFragment", "onViewCreated: ");
    super.onViewCreated(paramView, paramBundle);
    paramBundle = (TextView)getView().findViewById(2131689630);
    paramView.setBackgroundResource(2130903059);
  }

  public void openAccessibility(View paramView)
  {
    if ((c()) && (android.support.v4.b.a.a(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0))
      android.support.v4.a.a.a(getActivity(), new String[] { "android.permission.WRITE_EXTERNAL_STORAGE" }, 1);
  }

  public void openSettings(View paramView)
  {
    if (!g())
    {
      toOpenAccessibillty();
      return;
    }
    paramView = new Intent(getActivity(), SettingsActivity.class);
    paramView.putExtra("title", "狼王 V8.0");
    paramView.putExtra("frag_id", "SpecialSettingsFragment");
    startActivity(paramView);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.a.c
 * JD-Core Version:    0.6.0
 */