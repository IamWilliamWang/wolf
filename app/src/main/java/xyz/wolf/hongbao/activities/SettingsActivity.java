package xyz.wolf.hongbao.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.a.m;
import android.support.v4.a.o;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Set;
import xyz.wolf.hongbao.a.a;
import xyz.wolf.hongbao.a.b;
import xyz.wolf.hongbao.a.c;
import xyz.wolf.hongbao.services.MusicService;

public class SettingsActivity extends o
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  TextView A;
  TextView B;
  TextView C;
  TextView D;
  TextView E;
  TextView F;
  TextView G;
  TextView H;
  TextView I;
  TextView J;
  TextView K;
  int L;
  int M;
  int N;
  int O;
  boolean P;
  boolean Q;
  boolean R;
  boolean S;
  boolean T;
  boolean U;
  boolean V;
  boolean W;
  boolean X;
  boolean Y;
  boolean Z;
  boolean aa;
  boolean ab;
  boolean ac;
  String ad;
  String ae = "";
  EditText af;
  EditText ag;
  EditText ah;
  SharedPreferences ai;
  String[] aj = { "百位", "十位", "个位", "角位", "分位" };
  TextWatcher ak = new TextWatcher()
  {
    public void afterTextChanged(Editable paramEditable)
    {
    }

    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if (SettingsActivity.this.ae.equals(SettingsActivity.this.ag.getText().toString()))
        return;
      SettingsActivity.this.ae = SettingsActivity.this.ag.getText().toString();
      if (SettingsActivity.this.ae.isEmpty())
      {
        SettingsActivity.a(SettingsActivity.this, "pref_value_key", 0);
        return;
      }
      SettingsActivity.a(SettingsActivity.this, "pref_value_key", Integer.parseInt(SettingsActivity.this.ae));
    }
  };
  TextWatcher al = new TextWatcher()
  {
    public void afterTextChanged(Editable paramEditable)
    {
    }

    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if (SettingsActivity.this.ae.equals(SettingsActivity.this.af.getText().toString()))
        return;
      SettingsActivity.this.ae = SettingsActivity.this.af.getText().toString();
      if (SettingsActivity.this.ae.isEmpty())
      {
        SettingsActivity.a(SettingsActivity.this, "pref_num_key", 0);
        return;
      }
      SettingsActivity.a(SettingsActivity.this, "pref_num_key", Integer.parseInt(SettingsActivity.this.ae));
    }
  };
  TextWatcher am = new TextWatcher()
  {
    public void afterTextChanged(Editable paramEditable)
    {
    }

    public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      if (SettingsActivity.this.ae.equals(SettingsActivity.this.ah.getText().toString()))
        return;
      SettingsActivity.this.ae = SettingsActivity.this.ah.getText().toString();
      if (SettingsActivity.this.ae.isEmpty())
      {
        SettingsActivity.a(SettingsActivity.this, "pref_mq_time", 0);
        return;
      }
      SettingsActivity.a(SettingsActivity.this, "pref_mq_time", Integer.parseInt(SettingsActivity.this.ae));
    }
  };
  Handler an = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if (paramMessage.what == 0)
        SettingsActivity.a(SettingsActivity.this);
      do
      {
        return;
        if (paramMessage.what == 1)
        {
          paramMessage = new Intent(SettingsActivity.this, MusicService.class);
          SettingsActivity.this.startService(paramMessage);
          return;
        }
        if (paramMessage.what != 2)
          continue;
        paramMessage = new Intent(SettingsActivity.this, MusicService.class);
        SettingsActivity.this.stopService(paramMessage);
        return;
      }
      while (paramMessage.what != 3);
      SettingsActivity.this.f();
    }
  };
  private boolean ao = false;
  TextView m;
  TextView n;
  TextView o;
  TextView p;
  TextView q;
  TextView r;
  TextView s;
  TextView t;
  TextView u;
  TextView v;
  TextView w;
  TextView x;
  TextView y;
  TextView z;

  private void a(TextView paramTextView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramTextView.setBackgroundColor(Color.parseColor("#0000ff"));
      paramTextView.setTextColor(Color.parseColor("#ffffff"));
      return;
    }
    paramTextView.setBackgroundColor(Color.parseColor("#ffffff"));
    paramTextView.setTextColor(Color.parseColor("#0000ff"));
  }

  private void a(String paramString, int paramInt)
  {
    SharedPreferences.Editor localEditor = this.ai.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.commit();
  }

  private void a(String paramString, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.ai.edit();
    localEditor.putBoolean(paramString, paramBoolean);
    localEditor.commit();
  }

  private boolean a(String paramString)
  {
    if ((paramString.equals("pref_niuvalue_p1")) || (paramString.equals("pref_niuvalue_p2")) || (paramString.equals("pref_niuvalue_p3")) || (paramString.equals("pref_niuvalue_p4")) || (paramString.equals("pref_niuvalue_p5")))
      return this.ai.getBoolean(paramString, false);
    return this.ai.getBoolean(paramString, true);
  }

  private void g()
  {
  }

  private void h()
  {
    if (this.ai == null)
      this.ai = PreferenceManager.getDefaultSharedPreferences(this);
    Object localObject = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105 });
    String str1 = new String(new byte[] { 112, 114, 101, 102, 95, 98, 111, 98, 97, 111 });
    String str2 = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    this.M = this.ai.getInt((String)localObject, 1);
    this.L = this.ai.getInt(str1, 0);
    this.N = this.ai.getInt("pref_daxiao_p", 2);
    this.O = this.ai.getInt("pref_niuniu_p", 1);
    this.ac = this.ai.getBoolean(str2, false);
    this.P = this.ai.getBoolean("pref_niuvalue_p1", false);
    this.Q = this.ai.getBoolean("pref_niuvalue_p2", false);
    this.R = this.ai.getBoolean("pref_niuvalue_p3", false);
    this.S = this.ai.getBoolean("pref_niuvalue_p4", false);
    this.T = this.ai.getBoolean("pref_niuvalue_p5", false);
    this.U = this.ai.getBoolean("pref_niuvalue_p6", true);
    this.V = this.ai.getBoolean("pref_niuvalue_p7", true);
    this.W = this.ai.getBoolean("pref_niuvalue_p8", true);
    this.X = this.ai.getBoolean("pref_niuvalue_p9", true);
    this.Y = this.ai.getBoolean("pref_niuvalue_p10", true);
    this.Z = this.ai.getBoolean("pref_niuvalue_p11", true);
    this.aa = this.ai.getBoolean("pref_niuvalue_p12", true);
    this.ab = this.ai.getBoolean("pref_niuvalue_p13", true);
    localObject = this.ai.getStringSet("pref_pailei_lei", null);
    if ((localObject != null) && (((Set)localObject).size() != 0))
    {
      this.ad = localObject.toString();
      return;
    }
    this.ad = "分位";
  }

  private void i()
  {
    if (this.ai == null)
      this.ai = PreferenceManager.getDefaultSharedPreferences(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 98, 103, 95, 115, 111, 117, 110, 100, 95, 107, 101, 121 });
    this.ai.registerOnSharedPreferenceChangeListener(this);
    if (this.ai.getBoolean(str, true))
      this.an.sendEmptyMessage(1);
  }

  private void j()
  {
    ((TextView)findViewById(2131689576)).setText("狼王 贺岁版");
    FragmentTransaction localFragmentTransaction = getFragmentManager().beginTransaction();
    if ("GeneralSettingsFragment".equals("SpecialSettingsFragment"))
      localFragmentTransaction.replace(2131689578, new b());
    while (true)
    {
      localFragmentTransaction.commit();
      return;
      if ("CommentSettingsFragment".equals("SpecialSettingsFragment"))
      {
        localFragmentTransaction.replace(2131689578, new a());
        continue;
      }
      if (!"SpecialSettingsFragment".equals("SpecialSettingsFragment"))
        continue;
      localFragmentTransaction.replace(2131689578, new c());
    }
  }

  private void k()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < 5)
    {
      if (this.ad.contains(this.aj[i]))
        localStringBuilder.append(" " + this.aj[i] + " ,");
      i += 1;
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    this.K.setText(localStringBuilder);
  }

  private void l()
  {
    PreferenceManager.setDefaultValues(this, 2131099650, false);
  }

  public void a(m paramm)
  {
    super.a(paramm);
    Log.d("SettingsActivity", "onAttachFragment: ");
  }

  protected void b()
  {
    super.b();
  }

  public void boBaoP1Clicked(View paramView)
  {
    this.o.setBackgroundColor(Color.parseColor("#0000ff"));
    this.o.setTextColor(Color.parseColor("#ffffff"));
    this.p.setBackgroundColor(Color.parseColor("#ffffff"));
    this.p.setTextColor(Color.parseColor("#0000ff"));
  }

  public void boBaoP2Clicked(View paramView)
  {
    this.p.setBackgroundColor(Color.parseColor("#0000ff"));
    this.p.setTextColor(Color.parseColor("#ffffff"));
    this.o.setBackgroundColor(Color.parseColor("#ffffff"));
    this.o.setTextColor(Color.parseColor("#0000ff"));
  }

  public Object c()
  {
    return super.c();
  }

  public void daXiaoP1Clicked(View paramView)
  {
    if ((this.q == null) || (this.r == null) || (this.s == null))
      return;
    this.q.setBackgroundColor(Color.parseColor("#0000ff"));
    this.q.setTextColor(Color.parseColor("#ffffff"));
    this.r.setBackgroundColor(Color.parseColor("#ffffff"));
    this.r.setTextColor(Color.parseColor("#0000ff"));
    this.s.setBackgroundColor(Color.parseColor("#ffffff"));
    this.s.setTextColor(Color.parseColor("#0000ff"));
  }

  public void daXiaoP2Clicked(View paramView)
  {
    if ((this.q == null) || (this.r == null) || (this.s == null))
      return;
    this.r.setBackgroundColor(Color.parseColor("#0000ff"));
    this.r.setTextColor(Color.parseColor("#ffffff"));
    this.q.setBackgroundColor(Color.parseColor("#ffffff"));
    this.q.setTextColor(Color.parseColor("#0000ff"));
    this.s.setBackgroundColor(Color.parseColor("#ffffff"));
    this.s.setTextColor(Color.parseColor("#0000ff"));
  }

  public void daXiaoP3Clicked(View paramView)
  {
    if ((this.q == null) || (this.r == null) || (this.s == null))
      return;
    this.s.setBackgroundColor(Color.parseColor("#0000ff"));
    this.s.setTextColor(Color.parseColor("#ffffff"));
    this.q.setBackgroundColor(Color.parseColor("#ffffff"));
    this.q.setTextColor(Color.parseColor("#0000ff"));
    this.r.setBackgroundColor(Color.parseColor("#ffffff"));
    this.r.setTextColor(Color.parseColor("#0000ff"));
  }

  public void enterAccessibilityPage(View paramView)
  {
    startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
  }

  void f()
  {
    h();
    this.m = ((TextView)findViewById(2131689629));
    this.n = ((TextView)findViewById(2131689630));
    this.q = ((TextView)findViewById(2131689605));
    this.r = ((TextView)findViewById(2131689606));
    this.s = ((TextView)findViewById(2131689607));
    this.J = ((TextView)findViewById(2131689633));
    this.t = ((TextView)findViewById(2131689613));
    this.u = ((TextView)findViewById(2131689614));
    this.v = ((TextView)findViewById(2131689615));
    this.w = ((TextView)findViewById(2131689616));
    this.x = ((TextView)findViewById(2131689617));
    this.y = ((TextView)findViewById(2131689618));
    this.z = ((TextView)findViewById(2131689619));
    this.A = ((TextView)findViewById(2131689620));
    this.B = ((TextView)findViewById(2131689621));
    this.C = ((TextView)findViewById(2131689622));
    this.D = ((TextView)findViewById(2131689623));
    this.E = ((TextView)findViewById(2131689624));
    this.F = ((TextView)findViewById(2131689625));
    this.G = ((TextView)findViewById(2131689626));
    this.H = ((TextView)findViewById(2131689627));
    this.I = ((TextView)findViewById(2131689628));
    this.K = ((TextView)findViewById(2131689608));
    this.af = ((EditText)findViewById(2131689609));
    this.ag = ((EditText)findViewById(2131689604));
    this.ah = ((EditText)findViewById(2131689612));
    int i;
    String str;
    if (this.af != null)
    {
      i = this.ai.getInt("pref_num_key", 0);
      if (i == 0)
      {
        str = "";
        if (!this.af.getText().toString().equals(str))
          this.af.setText(str);
        this.af.removeTextChangedListener(this.al);
        this.af.addTextChangedListener(this.al);
      }
    }
    else
    {
      if (this.ag != null)
      {
        i = this.ai.getInt("pref_value_key", 0);
        if (i != 0)
          break label680;
        str = "";
        label471: if (!this.ag.getText().toString().equals(str))
          this.ag.setText(str);
        this.ag.removeTextChangedListener(this.ak);
        this.ag.addTextChangedListener(this.ak);
      }
      if (this.ah != null)
      {
        i = this.ai.getInt("pref_mq_time", 0);
        if (i != 0)
          break label688;
        str = "";
        label546: if (!this.ah.getText().toString().equals(str))
          this.ah.setText(str);
        this.ah.removeTextChangedListener(this.am);
        this.ah.addTextChangedListener(this.am);
      }
      if (!this.ac)
        break label696;
      if (this.J != null)
        this.J.setText("已授权");
      label617: if (this.L != 0)
        break label716;
      label624: if (this.M != 0)
        break label727;
      paiLeiP1Clicked(null);
      label636: if (this.N != 0)
        break label743;
      daXiaoP1Clicked(null);
    }
    while (true)
    {
      if (this.K != null)
        k();
      this.an.sendEmptyMessageDelayed(3, 100L);
      return;
      str = String.valueOf(i);
      break;
      label680: str = String.valueOf(i);
      break label471;
      label688: str = String.valueOf(i);
      break label546;
      label696: if (this.J == null)
        break label617;
      this.J.setText("已过期");
      break label617;
      label716: if (this.L != 1)
        break label624;
      break label624;
      label727: if (this.M != 1)
        break label636;
      paiLeiP2Clicked(null);
      break label636;
      label743: if (this.N == 1)
      {
        daXiaoP2Clicked(null);
        continue;
      }
      if (this.N != 2)
        continue;
      daXiaoP3Clicked(null);
    }
  }

  public void niuniuP1Clicked(View paramView)
  {
    if ((this.t == null) || (this.u == null) || (this.v == null))
      return;
    this.t.setBackgroundColor(Color.parseColor("#00ddff"));
    this.t.setTextColor(Color.parseColor("#450470"));
    this.u.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.u.setTextColor(Color.parseColor("#450470"));
    this.v.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.v.setTextColor(Color.parseColor("#450470"));
  }

  public void niuniuP2Clicked(View paramView)
  {
    if ((this.t == null) || (this.u == null) || (this.v == null))
      return;
    this.u.setBackgroundColor(Color.parseColor("#00ddff"));
    this.u.setTextColor(Color.parseColor("#450470"));
    this.v.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.v.setTextColor(Color.parseColor("#450470"));
    this.t.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.t.setTextColor(Color.parseColor("#450470"));
  }

  public void niuniuP3Clicked(View paramView)
  {
    if ((this.t == null) || (this.u == null) || (this.v == null))
      return;
    this.v.setBackgroundColor(Color.parseColor("#00ddff"));
    this.v.setTextColor(Color.parseColor("#450470"));
    this.t.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.t.setTextColor(Color.parseColor("#450470"));
    this.u.setBackgroundColor(Color.parseColor("#f8d6c6b1"));
    this.u.setTextColor(Color.parseColor("#450470"));
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968608);
    j();
    h();
    i();
    if (!this.ac);
    this.an.sendEmptyMessageDelayed(3, 0L);
    l();
  }

  protected void onPostResume()
  {
    super.onPostResume();
  }

  protected void onRestart()
  {
    super.onRestart();
    Log.d("SettingsActivity", "onRestart: ");
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    Log.d("SettingsActivity", "onRestoreInstanceState: ");
    super.onRestoreInstanceState(paramBundle);
  }

  protected void onResume()
  {
    super.onResume();
    TextView localTextView = (TextView)findViewById(2131689630);
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (paramString.equals(new String(new byte[] { 112, 114, 101, 102, 95, 98, 103, 95, 115, 111, 117, 110, 100, 95, 107, 101, 121 })))
    {
      if (Boolean.valueOf(paramSharedPreferences.getBoolean(paramString, false)).booleanValue())
        this.an.sendEmptyMessage(1);
    }
    else
      return;
    this.an.sendEmptyMessage(2);
  }

  protected void onStart()
  {
    super.onStart();
    TextView localTextView = (TextView)findViewById(2131689630);
  }

  public void paiLeiP1Clicked(View paramView)
  {
    if ((this.m == null) || (this.n == null))
      return;
    this.m.setBackgroundColor(Color.parseColor("#0000ff"));
    this.m.setTextColor(Color.parseColor("#ffffff"));
    this.n.setBackgroundColor(Color.parseColor("#ffffff"));
    this.n.setTextColor(Color.parseColor("#0000ff"));
  }

  public void paiLeiP2Clicked(View paramView)
  {
    if ((this.m == null) || (this.n == null))
      return;
    this.n.setBackgroundColor(Color.parseColor("#0000ff"));
    this.n.setTextColor(Color.parseColor("#ffffff"));
    this.m.setBackgroundColor(Color.parseColor("#ffffff"));
    this.m.setTextColor(Color.parseColor("#0000ff"));
  }

  public void performBack(View paramView)
  {
    super.onBackPressed();
  }

  public void setClicked(View paramView)
  {
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool5 = true;
    boolean bool6 = true;
    boolean bool7 = true;
    boolean bool8 = true;
    boolean bool9 = true;
    boolean bool10 = true;
    boolean bool11 = true;
    boolean bool12 = true;
    boolean bool13 = true;
    boolean bool14 = true;
    boolean bool2 = true;
    int i = paramView.getId();
    String str1 = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105 });
    String str2 = new String(new byte[] { 112, 114, 101, 102, 95, 98, 111, 98, 97, 111 });
    switch (i)
    {
    case 2131689604:
    case 2131689608:
    case 2131689609:
    case 2131689610:
    case 2131689611:
    case 2131689612:
    default:
      return;
    case 2131689629:
      paiLeiP1Clicked(paramView);
      a(str1, 0);
      return;
    case 2131689630:
      paiLeiP2Clicked(paramView);
      a(str1, 1);
      return;
    case 2131689602:
      boBaoP1Clicked(paramView);
      a(str2, 0);
      return;
    case 2131689603:
      boBaoP2Clicked(paramView);
      a(str2, 1);
      return;
    case 2131689605:
      daXiaoP1Clicked(paramView);
      a("pref_daxiao_p", 0);
      return;
    case 2131689606:
      daXiaoP2Clicked(paramView);
      a("pref_daxiao_p", 1);
      return;
    case 2131689607:
      daXiaoP3Clicked(paramView);
      a("pref_daxiao_p", 2);
      return;
    case 2131689613:
      niuniuP1Clicked(paramView);
      a("pref_niuniu_p", 0);
      return;
    case 2131689614:
      niuniuP2Clicked(paramView);
      a("pref_niuniu_p", 1);
      return;
    case 2131689615:
      niuniuP3Clicked(paramView);
      a("pref_niuniu_p", 2);
      return;
    case 2131689616:
      bool3 = a("pref_niuvalue_p1");
      paramView = this.w;
      if (!bool3)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool3)
          break label494;
      }
      for (bool1 = bool2; ; bool1 = false)
      {
        a("pref_niuvalue_p1", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689617:
      bool2 = a("pref_niuvalue_p2");
      paramView = this.x;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label546;
      }
      for (bool1 = bool3; ; bool1 = false)
      {
        a("pref_niuvalue_p2", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689618:
      bool2 = a("pref_niuvalue_p3");
      paramView = this.y;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label598;
      }
      for (bool1 = bool4; ; bool1 = false)
      {
        a("pref_niuvalue_p3", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689619:
      bool2 = a("pref_niuvalue_p4");
      paramView = this.z;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label650;
      }
      for (bool1 = bool5; ; bool1 = false)
      {
        a("pref_niuvalue_p4", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689620:
      bool2 = a("pref_niuvalue_p5");
      paramView = this.A;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label702;
      }
      for (bool1 = bool6; ; bool1 = false)
      {
        a("pref_niuvalue_p5", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689621:
      bool2 = a("pref_niuvalue_p6");
      paramView = this.B;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label754;
      }
      for (bool1 = bool7; ; bool1 = false)
      {
        a("pref_niuvalue_p6", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689622:
      bool2 = a("pref_niuvalue_p7");
      paramView = this.C;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label806;
      }
      for (bool1 = bool8; ; bool1 = false)
      {
        a("pref_niuvalue_p7", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689623:
      bool2 = a("pref_niuvalue_p8");
      paramView = this.D;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label858;
      }
      for (bool1 = bool9; ; bool1 = false)
      {
        a("pref_niuvalue_p8", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689624:
      bool2 = a("pref_niuvalue_p9");
      paramView = this.E;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label910;
      }
      for (bool1 = bool10; ; bool1 = false)
      {
        a("pref_niuvalue_p9", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689625:
      bool2 = a("pref_niuvalue_p10");
      paramView = this.F;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label962;
      }
      for (bool1 = bool11; ; bool1 = false)
      {
        a("pref_niuvalue_p10", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689626:
      label910: bool2 = a("pref_niuvalue_p11");
      paramView = this.G;
      if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label1016;
      }
      for (bool1 = bool12; ; bool1 = false)
      {
        a("pref_niuvalue_p11", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689627:
      label494: label754: label1016: bool2 = a("pref_niuvalue_p12");
      label546: label598: label858: paramView = this.H;
      label650: label702: label962: if (!bool2)
      {
        bool1 = true;
        a(paramView, bool1);
        if (bool2)
          break label1070;
      }
      label806: label1070: for (bool1 = bool13; ; bool1 = false)
      {
        a("pref_niuvalue_p12", bool1);
        return;
        bool1 = false;
        break;
      }
    case 2131689628:
    }
    bool2 = a("pref_niuvalue_p13");
    paramView = this.I;
    if (!bool2)
    {
      bool1 = true;
      a(paramView, bool1);
      if (bool2)
        break label1124;
    }
    label1124: for (boolean bool1 = bool14; ; bool1 = false)
    {
      a("pref_niuvalue_p13", bool1);
      return;
      bool1 = false;
      break;
    }
  }

  public void toOpenAccessibillty(View paramView)
  {
    try
    {
      startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.SettingsActivity
 * JD-Core Version:    0.6.0
 */