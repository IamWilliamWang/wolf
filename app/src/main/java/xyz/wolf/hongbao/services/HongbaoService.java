package xyz.wolf.hongbao.services;

import android.accessibilityservice.AccessibilityService;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Toast;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.baidu.tts.loopj.TextHttpResponseHandler;
import com.baidu.tts.tools.MD5;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import xyz.wolf.hongbao.activities.MActivity;
import xyz.wolf.hongbao.activities.NpeActivity;
import xyz.wolf.hongbao.activities.PerspectiveEffectActivity;
import xyz.wolf.hongbao.activities.ReportResultActivity;
import xyz.wolf.hongbao.b.c;
import xyz.wolf.hongbao.b.d;

public class HongbaoService extends AccessibilityService
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  public static String k = null;
  private boolean A = false;
  private boolean B = false;
  private boolean C = false;
  private xyz.wolf.hongbao.b.b[] D = null;
  private d E;
  private SharedPreferences F;
  private boolean G = true;
  private c H = null;
  private boolean I = true;
  private boolean J = false;
  private boolean K = false;
  private String L = null;
  private b M = null;
  private boolean N = false;
  private BroadcastReceiver O = new BroadcastReceiver()
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if (paramIntent.getAction().equals("com.specialtroop.perspective.finished.action"))
      {
        HongbaoService.c(HongbaoService.this, false);
        HongbaoService.d(HongbaoService.this, false);
      }
      do
        return;
      while (!paramIntent.getAction().equals("com.wolf.mactivity.finished.action"));
      HongbaoService.c(HongbaoService.this, false);
    }
  };
  public boolean a = false;
  public boolean b = false;
  public boolean c = false;
  public boolean d = false;
  public boolean e = false;
  public boolean f = false;
  public boolean g = false;
  public boolean h = false;
  a i = null;
  protected boolean j = false;
  public boolean l = false;
  public boolean m = false;
  String n;
  String[] o = new String[13];
  protected Handler p = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if (paramMessage.what == 0)
        HongbaoService.this.a();
      do
      {
        return;
        if (paramMessage.what == 1)
        {
          HongbaoService.a(HongbaoService.this, false);
          HongbaoService.b(HongbaoService.this, false);
          HongbaoService.a(HongbaoService.this, 0);
          return;
        }
        if (paramMessage.what == 2)
        {
          b.a(HongbaoService.this.getApplicationContext()).a();
          return;
        }
        if (paramMessage.what != 3)
          continue;
        HongbaoService.this.a(HongbaoService.this.n);
        return;
      }
      while (paramMessage.what != 4);
      HongbaoService.a(HongbaoService.this, HongbaoService.a(HongbaoService.this));
    }
  };
  private String q = "LauncherUI";
  private String r = "LauncherUI";
  private String s = "LauncherUI";
  private AccessibilityNodeInfo t;
  private AccessibilityNodeInfo u;
  private AccessibilityNodeInfo v;
  private boolean w;
  private boolean x;
  private int y = 0;
  private String z;

  static
  {
    System.loadLibrary("oo");
  }

  private AccessibilityNodeInfo a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo;
    if (paramAccessibilityNodeInfo == null)
      localAccessibilityNodeInfo = null;
    while (true)
    {
      return localAccessibilityNodeInfo;
      if (paramAccessibilityNodeInfo.getChildCount() != 0)
        break;
      localAccessibilityNodeInfo = paramAccessibilityNodeInfo;
      if (new String(new byte[] { 97, 110, 100, 114, 111, 105, 100, 46, 119, 105, 100, 103, 101, 116, 46, 66, 117, 116, 116, 111, 110 }).equals(paramAccessibilityNodeInfo.getClassName()))
        continue;
      paramAccessibilityNodeInfo.recycle();
      return null;
    }
    int i1 = 0;
    while (i1 < paramAccessibilityNodeInfo.getChildCount())
    {
      localAccessibilityNodeInfo = a(paramAccessibilityNodeInfo.getChild(i1));
      if (localAccessibilityNodeInfo != null)
        return localAccessibilityNodeInfo;
      i1 += 1;
    }
    return null;
  }

  private void a(int paramInt)
  {
    if (this.t == null);
    boolean bool2;
    label743: 
    do
    {
      do
      {
        while (true)
        {
          return;
          if (this.D[1].e != null)
          {
            b();
            this.D[1].e = null;
          }
          new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 115, 101, 108, 102 });
          localAccessibilityNodeInfo = b(new String[] { "领取红包" });
          if ((localAccessibilityNodeInfo == null) || ((!this.q.contains("ChattingUI")) && (!this.q.contains("LauncherUI"))))
            break;
          str = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 101, 120, 99, 108, 117, 100, 101, 95, 119, 111, 114, 100, 115 });
          str = this.F.getString(str, "");
          if ((!this.D[1].a(this, localAccessibilityNodeInfo, str, this.I)) || (!this.j))
            continue;
          this.x = true;
          this.u = localAccessibilityNodeInfo;
          return;
        }
        AccessibilityNodeInfo localAccessibilityNodeInfo = a(this.t);
        String str = new String(new byte[] { 97, 110, 100, 114, 111, 105, 100, 46, 119, 105, 100, 103, 101, 116, 46, 66, 117, 116, 116, 111, 110 });
        if ((localAccessibilityNodeInfo == null) || (!str.equals(localAccessibilityNodeInfo.getClassName())) || (!this.q.contains("LuckyMoneyReceiveUI")))
          continue;
        this.v = localAccessibilityNodeInfo;
        this.y += 1;
        return;
      }
      while ((!this.A) || (paramInt != 32) || ((!this.q.contains("LuckyMoneyDetailUI")) && (!this.q.contains("LuckyMoneyReceiveUI"))));
      boolean bool1 = a(new String[] { "红包详情" });
      bool2 = a(new String[] { "手慢了", "已超过24小时" });
      if (bool2)
        this.D[1].g = true;
      while (true)
      {
        if ((this.a) || (this.b) || (this.c) || (!this.N))
          break label743;
        if ((!bool1) && (!bool2))
          break;
        this.A = false;
        this.w = false;
        this.y = 0;
        performGlobalAction(1);
        this.D[1].e = e();
        return;
        if (!bool1)
          continue;
        this.D[1].g = false;
      }
      if (!bool1)
        continue;
      performGlobalAction(1);
      this.D[1].e = e();
      this.i.a(this.t);
      this.p.sendEmptyMessageDelayed(4, 100L);
      this.p.sendEmptyMessageDelayed(1, 1500L);
    }
    while (!bool2);
    this.A = false;
    this.w = false;
    this.y = 0;
    performGlobalAction(1);
    this.D[1].e = e();
    f();
  }

  private void a(AccessibilityEvent paramAccessibilityEvent)
  {
    this.t = getRootInActiveWindow();
    if (this.t == null);
    do
    {
      do
      {
        return;
        this.u = null;
        this.v = null;
      }
      while (!this.G);
      a(paramAccessibilityEvent.getEventType());
    }
    while (((this.u != null) && (c(this.x, this.w, this.I, this.a, this.b, this.c))) || (this.y != 1) || (this.v == null));
    paramAccessibilityEvent = new String(new byte[] { 112, 114, 101, 102, 95, 109, 113, 95, 116, 105, 109, 101 });
    if (this.g);
    int i2;
    for (int i1 = this.F.getInt(paramAccessibilityEvent, 0); ; i2 = 0)
    {
      new Handler().postDelayed(new Runnable()
      {
        public void run()
        {
          try
          {
            HongbaoService.b(HongbaoService.this).performAction(16);
            return;
          }
          catch (Exception localException)
          {
            HongbaoService.a(HongbaoService.this, false);
            HongbaoService.b(HongbaoService.this, false);
            HongbaoService.a(HongbaoService.this, 0);
          }
        }
      }
      , i1);
      return;
    }
  }

  private void a(a parama, String paramString)
  {
    boolean bool = false;
    int i1 = 9;
    new StringBuilder();
    int i2 = this.F.getInt("pref_niuniu_p", 1);
    String str = parama.a();
    parama = null;
    if (i2 == 0)
    {
      parama = str.substring(str.length() - 1, str.length());
      i2 = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue();
      if (i2 != 0);
    }
    while (true)
    {
      if (b("pref_niuvalue_p" + String.valueOf(i1 + 1)))
        bool = true;
      a(bool, i1, parama);
      return;
      i1 = i2 - 1;
      continue;
      int i3;
      if (i2 == 1)
      {
        paramString = str.substring(str.length() - 2, str.length());
        i2 = Integer.valueOf(str.substring(str.length() - 2, str.length() - 1)).intValue();
        i3 = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue();
        if (i2 == i3)
        {
          i1 = 10;
          parama = paramString;
          continue;
        }
        i2 = (i2 + i3) % 10;
        parama = paramString;
        if (i2 == 0)
          continue;
        i1 = i2 - 1;
        parama = paramString;
        continue;
      }
      if (i2 == 2)
      {
        paramString = str.substring(str.length() - 4, str.length());
        i2 = Integer.valueOf(str.substring(str.length() - 4, str.length() - 3)).intValue();
        i3 = Integer.valueOf(str.substring(str.length() - 2, str.length() - 1)).intValue();
        int i4 = Integer.valueOf(str.substring(str.length() - 1, str.length())).intValue();
        if ((i2 == i3) && (i3 == i4))
        {
          i1 = 12;
          parama = paramString;
          continue;
        }
        if ((i4 - i3 == 1) && (i3 - i2 == 1) && (i2 != 0))
        {
          i1 = 11;
          parama = paramString;
          continue;
        }
        i2 = (i2 + i3 + i4) % 10;
        parama = paramString;
        if (i2 == 0)
          continue;
        i1 = i2 - 1;
        parama = paramString;
        continue;
      }
      i1 = 0;
    }
  }

  private void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.F.edit();
    localEditor.putBoolean(new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 }), paramBoolean);
    this.j = paramBoolean;
    localEditor.commit();
  }

  private boolean a(String[] paramArrayOfString)
  {
    int i4 = 0;
    int i2 = paramArrayOfString.length;
    int i1 = 0;
    int i3 = i4;
    if (i1 < i2)
    {
      Object localObject = paramArrayOfString[i1];
      if (localObject == null);
      do
      {
        i1 += 1;
        break;
        localObject = this.t.findAccessibilityNodeInfosByText((String)localObject);
      }
      while ((localObject == null) || (((List)localObject).isEmpty()));
      paramArrayOfString = ((List)localObject).iterator();
      while (paramArrayOfString.hasNext())
        ((AccessibilityNodeInfo)paramArrayOfString.next()).recycle();
      i3 = 1;
    }
    return i3;
  }

  private AccessibilityNodeInfo b(String[] paramArrayOfString)
  {
    Object localObject2 = this.t.findAccessibilityNodeInfosByText(",你领取了");
    Object localObject1 = this.t.findAccessibilityNodeInfosByText("你领取了");
    int i1 = 0;
    Object localObject3;
    while (i1 < ((List)localObject2).size())
    {
      localObject3 = (AccessibilityNodeInfo)((List)localObject2).get(i1);
      ((List)localObject1).remove(localObject3);
      ((AccessibilityNodeInfo)localObject3).recycle();
      i1 += 1;
    }
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      localObject3 = (AccessibilityNodeInfo)((List)localObject1).get(((List)localObject1).size() - 1);
      if (localObject3 != null)
      {
        localObject2 = new Rect();
        ((AccessibilityNodeInfo)localObject3).getBoundsInScreen((Rect)localObject2);
      }
    }
    while (true)
    {
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
        ((AccessibilityNodeInfo)((Iterator)localObject1).next()).recycle();
      int i3 = paramArrayOfString.length;
      int i2 = 0;
      i1 = 0;
      localObject1 = null;
      Object localObject4;
      if (i2 < i3)
      {
        localObject4 = paramArrayOfString[i2];
        if (localObject4 != null);
      }
      while (true)
      {
        i2 += 1;
        break;
        List localList = this.t.findAccessibilityNodeInfosByText((String)localObject4);
        if ((localList != null) && (!localList.isEmpty()))
        {
          localObject3 = (AccessibilityNodeInfo)localList.get(localList.size() - 1);
          if (localObject3 == null)
            return null;
          Rect localRect = new Rect();
          ((AccessibilityNodeInfo)localObject3).getBoundsInScreen(localRect);
          if ((localObject2 != null) && (b1(localRect.bottom, ((Rect)localObject2).bottom - 100)))
          {
            localObject3 = localList.iterator();
            while (((Iterator)localObject3).hasNext())
              ((AccessibilityNodeInfo)((Iterator)localObject3).next()).recycle();
            continue;
          }
          if (b2(localRect.bottom, i1))
          {
            i1 = localRect.bottom;
            this.D[1].f = ((String)localObject4).equals("领取红包");
            localObject1 = localList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject4 = (AccessibilityNodeInfo)((Iterator)localObject1).next();
              if (localObject4 == localObject3)
                continue;
              ((AccessibilityNodeInfo)localObject4).recycle();
            }
            localObject1 = localObject3;
            continue;
          }
          localObject3 = localList.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            ((AccessibilityNodeInfo)((Iterator)localObject3).next()).recycle();
            continue;
            return localObject1;
          }
        }
      }
      localObject2 = null;
    }
  }

  private void b()
  {
    try
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = getRootInActiveWindow().getChild(0).getChild(0);
      localAccessibilityNodeInfo = localAccessibilityNodeInfo.getChild(localAccessibilityNodeInfo.getChildCount() - 1).getChild(0).getChild(1);
      if (new String(new byte[] { 97, 110, 100, 114, 111, 105, 100, 46, 119, 105, 100, 103, 101, 116, 46, 69, 100, 105, 116, 84, 101, 120, 116 }).equals(localAccessibilityNodeInfo.getClassName()))
      {
        Bundle localBundle = new Bundle();
        localBundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", this.D[1].e);
        localAccessibilityNodeInfo.performAction(2097152, localBundle);
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void b(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() != 32)
      return;
    this.s = this.r;
    this.r = paramAccessibilityEvent.getClassName().toString();
    try
    {
      paramAccessibilityEvent = new ComponentName(paramAccessibilityEvent.getPackageName().toString(), paramAccessibilityEvent.getClassName().toString());
      getPackageManager().getActivityInfo(paramAccessibilityEvent, 0);
      this.q = paramAccessibilityEvent.flattenToShortString();
      event3(this.J, this.e, this.r, this.s);
      return;
    }
    catch (android.content.pm.PackageManager.NameNotFoundException paramAccessibilityEvent)
    {
      while (true)
        this.q = "LauncherUI";
    }
  }

  private void b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.F.getBoolean("", false);
    if (this.a)
      c(this.i, this.L);
    do
    {
      return;
      if (!this.b)
        continue;
      b(this.i, this.L);
      return;
    }
    while (!this.c);
    a(this.i, this.L);
  }

  private void b(a parama, String paramString)
  {
    new StringBuilder();
    int i1 = this.F.getInt("pref_daxiao_p", 2);
    parama.a();
    a(false, i1, parama);
  }

  private void b(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.F.edit();
    new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    if (!paramBoolean)
      localEditor.putBoolean("pref_auth", paramBoolean);
    localEditor.commit();
  }

  private boolean b(String paramString)
  {
    if ((paramString.equals("pref_niuvalue_p1")) || (paramString.equals("pref_niuvalue_p2")) || (paramString.equals("pref_niuvalue_p3")) || (paramString.equals("pref_niuvalue_p4")) || (paramString.equals("pref_niuvalue_p5")))
      return this.F.getBoolean(paramString, false);
    return this.F.getBoolean(paramString, true);
  }

  private native boolean b1(int paramInt1, int paramInt2);

  private native boolean b2(int paramInt1, int paramInt2);

  private native boolean b3(int paramInt1, int paramInt2, int paramInt3);

  private void c()
  {
    this.A = true;
    if ((this.I == true) && ((this.a) || (this.b) || (this.c)))
    {
      this.J = true;
      this.I = false;
      this.x = false;
      if (this.u != null)
      {
        this.u.recycle();
        this.u = null;
      }
      return;
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.u.getParent().getChild(0);
    this.L = localAccessibilityNodeInfo.getText().toString();
    localAccessibilityNodeInfo.recycle();
    this.u.getParent().performAction(16);
    this.x = false;
    this.w = true;
    if ((this.b) || (this.a) || (this.c))
    {
      this.I = true;
      return;
    }
    this.I = false;
  }

  private void c(a parama, String paramString)
  {
    String[] arrayOfString2 = new String[5];
    arrayOfString2[0] = "/";
    arrayOfString2[1] = "-";
    arrayOfString2[2] = "\\\\";
    arrayOfString2[3] = "\\|";
    arrayOfString2[4] = "\\*";
    parama.a();
    int i1 = 0;
    while (i1 < arrayOfString2.length)
    {
      String[] arrayOfString1 = paramString.split(arrayOfString2[i1]);
      if ((arrayOfString1.length == 2) && (this.j))
      {
        paramString = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105 });
        if (this.N);
        for (i1 = this.F.getInt(paramString, 1); parama.c == null; i1 = 0)
          return;
        if (this.f)
        {
          i1 = Integer.valueOf(arrayOfString1[0]).intValue();
          if (Integer.valueOf(arrayOfString1[1]).intValue() >= 10)
            break label249;
          i1 = 1;
        }
        while (true)
        {
          a(parama.a(new String[] { arrayOfString1[i1] }), new String[] { arrayOfString1[i1] });
          return;
          label249: if (i1 < 10)
          {
            i1 = 0;
            continue;
          }
          i1 = 1;
        }
      }
      if ((arrayOfString1.length == 3) && (this.j) && (this.h))
      {
        paramString = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105 });
        label377: int i2;
        if (this.N)
        {
          i1 = this.F.getInt(paramString, 1);
          if (parama.c == null)
            break label480;
          if (this.f)
          {
            i1 = Integer.valueOf(arrayOfString1[0]).intValue();
            i2 = Integer.valueOf(arrayOfString1[1]).intValue();
            int i3 = Integer.valueOf(arrayOfString1[2]).intValue();
            if ((i2 >= 10) || (i3 >= 10))
              break label482;
            i1 = 1;
          }
          label442: paramString = new String[2];
          if (i1 != 1)
            break label505;
          paramString[0] = arrayOfString1[1];
          paramString[1] = arrayOfString1[2];
        }
        while (true)
        {
          a(parama.a(paramString), paramString);
          return;
          i1 = 0;
          break label377;
          label480: break;
          label482: if ((i1 < 10) && (i2 < 10))
          {
            i1 = 0;
            break label442;
          }
          i1 = 1;
          break label442;
          label505: paramString[0] = arrayOfString1[0];
          paramString[1] = arrayOfString1[1];
        }
      }
      i1 += 1;
    }
    a(false, null);
  }

  private boolean c(AccessibilityEvent paramAccessibilityEvent)
  {
    if (this.B)
      return false;
    this.B = true;
    Object localObject = paramAccessibilityEvent.getSource();
    if ((paramAccessibilityEvent.getEventType() != 2048) || (localObject == null))
      return false;
    paramAccessibilityEvent = ((AccessibilityNodeInfo)localObject).findAccessibilityNodeInfosByText("[微信红包]");
    if ((!paramAccessibilityEvent.isEmpty()) && (this.q.contains("LauncherUI")))
    {
      paramAccessibilityEvent = (AccessibilityNodeInfo)paramAccessibilityEvent.get(0);
      if (paramAccessibilityEvent == null)
        return false;
      localObject = paramAccessibilityEvent.getContentDescription();
      if ((localObject != null) && (!this.D[0].a().equals(localObject)))
      {
        paramAccessibilityEvent.performAction(16);
        this.D[0].a(((CharSequence)localObject).toString());
        return true;
      }
    }
    return false;
  }

  private native boolean c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6);

  private void d()
  {
    this.F = PreferenceManager.getDefaultSharedPreferences(this);
    this.F.registerOnSharedPreferenceChangeListener(this);
    this.E = new d(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 111, 110, 95, 108, 111, 99, 107 });
    boolean bool = this.F.getBoolean(str, false);
    this.E.a(Boolean.valueOf(bool).booleanValue());
  }

  private boolean d(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() != 64)
      return false;
    if (!paramAccessibilityEvent.getText().toString().contains("[微信红包]"))
      return true;
    paramAccessibilityEvent = paramAccessibilityEvent.getParcelableData();
    if ((paramAccessibilityEvent instanceof Notification))
      paramAccessibilityEvent = (Notification)paramAccessibilityEvent;
    try
    {
      this.D[1].b();
      this.D[0].b();
      paramAccessibilityEvent.contentIntent.send();
      return true;
    }
    catch (PendingIntent.CanceledException paramAccessibilityEvent)
    {
      while (true)
        paramAccessibilityEvent.printStackTrace();
    }
  }

  private String e()
  {
    if (!this.D[1].f);
    String[] arrayOfString;
    do
    {
      do
        return null;
      while (!Boolean.valueOf(this.F.getBoolean("pref_comment_switch", false)).booleanValue());
      arrayOfString = this.F.getString("pref_comment_words", "").split(" +");
    }
    while (arrayOfString.length == 0);
    if (Boolean.valueOf(this.F.getBoolean("pref_comment_at", false)).booleanValue())
      return "@" + this.D[1].a + " " + arrayOfString[(int)(java.lang.Math.random() * arrayOfString.length)];
    return arrayOfString[(int)(java.lang.Math.random() * arrayOfString.length)];
  }

  private native boolean event1(int paramInt, String paramString);

  private native boolean event2(int paramInt1, int paramInt2);

  private native boolean event3(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2);

  private void f()
  {
    b.a(getApplicationContext()).a("网速异常 ，红包已被抢完");
  }

  private long g(String paramString)
  {
    if (this.F == null)
      this.F = PreferenceManager.getDefaultSharedPreferences(this);
    return this.F.getLong(paramString, 0L);
  }

  private void g()
  {
    this.F = PreferenceManager.getDefaultSharedPreferences(this);
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105, 95, 107, 101, 121 });
    this.a = this.F.getBoolean(str, false);
    this.c = this.F.getBoolean("pref_daxiao_key", false);
    this.c = this.F.getBoolean("pref_niuniu_key", false);
    this.e = this.F.getBoolean("pref_mailei_key", false);
    this.h = this.F.getBoolean("pref_pailei_shuang_key", false);
    this.f = this.F.getBoolean("pref_pailei_smart_p", false);
    this.g = this.F.getBoolean("pref_quick_key", false);
    str = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    this.j = this.F.getBoolean(str, false);
    str = new String(new byte[] { 122, 104, 117, 95, 109, 97 });
    this.z = this.F.getString(str, "");
    str = new String(new byte[] { 112, 114, 101, 102, 95, 112, 108, 117, 103, 95, 107, 101, 121 });
    this.d = this.F.getBoolean(str, false);
    if (this.j)
      a();
  }

  private native String[][] i();

  private native boolean init(Context paramContext);

  private void l()
  {
    this.J = true;
    Intent localIntent = new Intent();
    localIntent.setClass(getApplicationContext(), MActivity.class);
    new Bundle();
    localIntent.setFlags(268468224);
    startActivity(localIntent);
  }

  private String m()
  {
    if (this.D[1] != null)
      return this.D[1].h[0];
    return "";
  }

  private native int n(int paramInt);

  private void p(String paramString)
  {
    Intent localIntent = new Intent();
    Context localContext = getApplicationContext();
    if (this.c);
    for (Object localObject = NpeActivity.class; ; localObject = PerspectiveEffectActivity.class)
    {
      localIntent.setClass(localContext, (Class)localObject);
      localObject = new Bundle();
      ((Bundle)localObject).putString("s", paramString);
      localIntent.putExtra("bundle", (Bundle)localObject);
      localIntent.setFlags(268468224);
      startActivity(localIntent);
      return;
    }
  }

  private native boolean pan(int paramInt1, int paramInt2);

  private void s()
  {
    d();
    if (this.D == null)
    {
      this.D = new xyz.wolf.hongbao.b.b[2];
      this.D[0] = new xyz.wolf.hongbao.b.b();
      this.D[1] = new xyz.wolf.hongbao.b.b();
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.specialtroop.perspective.finished.action");
    localIntentFilter.addAction("com.wolf.mactivity.finished.action");
    registerReceiver(this.O, localIntentFilter);
    this.p.sendEmptyMessage(2);
    g();
    this.m = true;
  }

  private void t(String paramString)
  {
    Toast.makeText(this, paramString, 1).show();
  }

  private void w()
  {
    SharedPreferences.Editor localEditor = this.F.edit();
    localEditor.putBoolean(new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 110, 111, 116, 105, 102, 105, 99, 97, 116, 105, 111, 110 }), true);
    localEditor.putBoolean(new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 99, 104, 97, 116 }), true);
    localEditor.putBoolean(new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 108, 105, 115, 116 }), true);
    localEditor.commit();
  }

  private void w(String paramString, long paramLong)
  {
    this.F = PreferenceManager.getDefaultSharedPreferences(this);
    SharedPreferences.Editor localEditor = this.F.edit();
    localEditor.putLong(paramString, paramLong);
    localEditor.commit();
  }

  void a()
  {
    new String(new byte[] { 104, 116, 116, 112, 58, 47, 47, 112, 111, 115, 116, 46, 98, 97, 105, 98, 97, 111, 121, 117, 110, 46, 99, 111, 109, 47, 97, 112, 105, 47, 101, 50, 55, 57, 52, 55, 102, 99, 101, 53, 48, 56, 98, 102, 53, 102, 49, 97, 53, 54, 98, 49, 55, 54, 98, 99, 53, 49, 49, 49, 56, 102 });
    String str1 = new String(new byte[] { 122, 104, 117, 95, 109, 97 });
    String str2 = this.F.getString(str1, "");
    Object localObject3 = Settings.Secure.getString(getBaseContext().getContentResolver(), "android_id");
    str1 = "http://lw.ysdsw.net/km/index.php?key=" + this.z + "&uid=" + (String)localObject3;
    if (str2.equals(""))
    {
      a(false);
      return;
    }
    Object localObject1 = new JSONObject();
    try
    {
      str2 = new String(new byte[] { 102, 117, 99, 107 });
      Object localObject2 = new String(new byte[] { 102, 108, 97, 103 });
      new String(new byte[] { 102, 97, 110, 116, 97, 115, 121, 49, 57, 56, 56 });
      localObject3 = ((String)localObject3 + str2).getBytes();
      localObject3 = MD5.getInstance().getMD5(localObject3);
      ((JSONObject)localObject1).put((String)localObject2, "注册码登录");
      ((JSONObject)localObject1).put("机器码", localObject3);
      ((JSONObject)localObject1).put("注册码", this.z);
      ((JSONObject)localObject1).put("项目名称", "fantasy1989");
      new StringEntity(((JSONObject)localObject1).toString(), "UTF-8");
      localObject1 = new StringEntity(((JSONObject)localObject1).toString(), "utf-8");
      localObject2 = new AsyncHttpClient();
      new String(new byte[] { 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 106, 115, 111, 110 });
      ((AsyncHttpClient)localObject2).post(this, str1, (HttpEntity)localObject1, str2, new TextHttpResponseHandler()
      {
        public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
        {
          HongbaoService.this.p.sendEmptyMessageDelayed(0, 10000000L);
        }

        public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
        {
          if (paramString.startsWith("1"))
            return;
          do
            return;
          while (!paramString.startsWith("操作失败:注册码"));
          paramArrayOfHeader = paramString.split(":");
          HongbaoService.e(HongbaoService.this, false);
          HongbaoService.f(HongbaoService.this, false);
          Toast.makeText(HongbaoService.this, paramArrayOfHeader[1], 1).show();
        }
      });
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
  }

  void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return;
    String str1 = new String(new byte[] { 104, 116, 116, 112, 58, 47, 47, 112, 111, 115, 116, 46, 98, 97, 105, 98, 97, 111, 121, 117, 110, 46, 99, 111, 109, 47, 97, 112, 105, 47, 101, 50, 55, 57, 52, 55, 102, 99, 101, 53, 48, 56, 98, 102, 53, 102, 49, 97, 53, 54, 98, 49, 55, 54, 98, 99, 53, 49, 49, 49, 56, 102 });
    String str2 = new String(new byte[] { 122, 104, 117, 95, 109, 97 });
    if (this.F.getString(str2, "").equals(""))
    {
      a(false);
      return;
    }
    Object localObject = new JSONObject();
    try
    {
      str2 = new String(new byte[] { 102, 117, 99, 107 });
      String str3 = new String(new byte[] { 102, 108, 97, 103 });
      new String(new byte[] { 102, 97, 110, 116, 97, 115, 121, 49, 57, 56, 56 });
      ((JSONObject)localObject).put(str3, "注册码退出");
      ((JSONObject)localObject).put("访问令牌", paramString);
      ((JSONObject)localObject).put("注册码", this.z);
      new StringEntity(((JSONObject)localObject).toString(), "UTF-8");
      paramString = new StringEntity(((JSONObject)localObject).toString(), "utf-8");
      localObject = new AsyncHttpClient();
      new String(new byte[] { 97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 47, 106, 115, 111, 110 });
      ((AsyncHttpClient)localObject).post(this, str1, paramString, str2, new TextHttpResponseHandler()
      {
        public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
        {
          HongbaoService.this.p.sendEmptyMessageDelayed(3, 120000L);
        }

        public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
        {
        }
      });
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }

  void a(boolean paramBoolean, int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Bundle localBundle;
    if (paramBoolean)
    {
      localStringBuilder.append("=== 推算成功 ，" + paramString + "是 " + this.o[paramInt] + "  ===");
      paramString = new Intent(getApplicationContext(), ReportResultActivity.class);
      paramString.setFlags(335544320);
      localBundle = new Bundle();
      if (paramBoolean)
        break label195;
    }
    label195: for (paramBoolean = true; ; paramBoolean = false)
    {
      localBundle.putBoolean("isFailed", paramBoolean);
      localBundle.putString("resultText", localStringBuilder.toString());
      localBundle.putInt("type", 2);
      paramString.putExtra("bundle", localBundle);
      startActivity(paramString);
      return;
      localStringBuilder.append("=== 推算失败 ，" + paramString + "是 " + this.o[paramInt] + "  ===");
      break;
    }
  }

  void a(boolean paramBoolean, int paramInt, a parama)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("===主人 ，为你抢到红包 " + parama.c + "元 ===");
    parama = new Intent(getApplicationContext(), ReportResultActivity.class);
    parama.setFlags(335544320);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isFailed", true);
    localBundle.putString("resultText", localStringBuilder.toString());
    localBundle.putInt("type", 1);
    parama.putExtra("bundle", localBundle);
    startActivity(parama);
  }

  void a(boolean paramBoolean, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((!paramBoolean) && (paramArrayOfString == null))
      localStringBuilder.append("=== 没发现雷值 ");
    do
      while (true)
      {
        localStringBuilder.append(" ===");
        paramArrayOfString = new Intent(getApplicationContext(), ReportResultActivity.class);
        paramArrayOfString.setFlags(268435456);
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("isFailed", paramBoolean);
        localBundle.putString("resultText", localStringBuilder.toString());
        localBundle.putInt("type", 0);
        paramArrayOfString.putExtra("bundle", localBundle);
        startActivity(paramArrayOfString);
        return;
        if ((paramBoolean) || (paramArrayOfString.length <= 0))
          break;
        localStringBuilder.append("=== 透视成功！ ");
        int i1 = 0;
        while (i1 < paramArrayOfString.length)
        {
          localStringBuilder.append(" 雷值为 " + paramArrayOfString[i1] + ",");
          i1 += 1;
        }
        localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
      }
    while (!paramBoolean);
    localStringBuilder.append("=== 透视失败 ! ");
    b.a(this).a("网路异常");
  }

  public boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return b3(paramInt1, paramInt2, paramInt3);
  }

  public native boolean f(Context paramContext, String paramString);

  public void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if ((this.F == null) || (!this.d) || (!this.j));
    do
      while (true)
      {
        return;
        b(paramAccessibilityEvent);
        if ((!this.a) && (!this.b) && (!this.c) && (!this.g))
          continue;
        if (event1(paramAccessibilityEvent.getEventType(), this.q))
        {
          this.G = pan(paramAccessibilityEvent.getItemCount(), paramAccessibilityEvent.getToIndex());
          return;
        }
        if ((this.J) || (event2(paramAccessibilityEvent.getEventType(), paramAccessibilityEvent.getContentChangeTypes())))
          continue;
        if (this.A)
          break;
        str = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 110, 111, 116, 105, 102, 105, 99, 97, 116, 105, 111, 110 });
        if ((this.F.getBoolean(str, false)) && (d(paramAccessibilityEvent)))
          continue;
        str = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 108, 105, 115, 116 });
        if ((this.F.getBoolean(str, false)) && (c(paramAccessibilityEvent)))
          continue;
        this.B = false;
      }
    while (this.C);
    this.C = true;
    String str = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 99, 104, 97, 116 });
    if (this.F.getBoolean(str, false))
      a(paramAccessibilityEvent);
    this.C = false;
  }

  public void onDestroy()
  {
    if (this.E != null)
      this.E.a(false);
    super.onDestroy();
  }

  public void onInterrupt()
  {
  }

  public void onServiceConnected()
  {
    super.onServiceConnected();
    f(this, "给中文");
    this.N = init(getApplicationContext());
    String[][] arrayOfString = i();
    if (arrayOfString != null)
      this.o = arrayOfString[0];
    if (this.N)
      this.i = new a(getApplicationContext(), null);
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    String str1 = new String(new byte[] { 112, 114, 101, 102, 95, 119, 97, 116, 99, 104, 95, 111, 110, 95, 108, 111, 99, 107 });
    String str2 = new String(new byte[] { 112, 114, 101, 102, 95, 112, 97, 105, 108, 101, 105, 95, 107, 101, 121 });
    String str3 = new String(new byte[] { 112, 114, 101, 102, 95, 112, 108, 117, 103, 95, 107, 101, 121 });
    String str4 = new String(new byte[] { 112, 114, 101, 102, 95, 115, 104, 111, 117 });
    if (paramString.equals(str1))
    {
      boolean bool = paramSharedPreferences.getBoolean(paramString, false);
      this.E.a(Boolean.valueOf(bool).booleanValue());
    }
    do
    {
      return;
      if (paramString.equals(str2))
      {
        this.a = paramSharedPreferences.getBoolean(paramString, false);
        return;
      }
      if (paramString.equals(str3))
      {
        this.d = paramSharedPreferences.getBoolean(paramString, false);
        return;
      }
      if (paramString.equals(str4))
      {
        this.j = paramSharedPreferences.getBoolean(str4, false);
        return;
      }
      if (paramString.equals("pref_daxiao_key"))
      {
        this.b = paramSharedPreferences.getBoolean("pref_daxiao_key", false);
        return;
      }
      if (paramString.equals("pref_niuniu_key"))
      {
        this.c = paramSharedPreferences.getBoolean("pref_niuniu_key", false);
        return;
      }
      if (paramString.equals("pref_mailei_key"))
      {
        this.e = paramSharedPreferences.getBoolean("pref_mailei_key", false);
        return;
      }
      if (paramString.equals("pref_pailei_smart_p"))
      {
        this.f = paramSharedPreferences.getBoolean("pref_pailei_smart_p", false);
        return;
      }
      if (!paramString.equals("pref_quick_key"))
        continue;
      this.g = paramSharedPreferences.getBoolean("pref_quick_key", false);
      return;
    }
    while (!paramString.equals("pref_pailei_shuang_key"));
    this.h = paramSharedPreferences.getBoolean("pref_pailei_shuang_key", false);
  }

  public boolean onUnbind(Intent paramIntent)
  {
    if (this.N)
      unregisterReceiver(this.O);
    return super.onUnbind(paramIntent);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.services.HongbaoService
 * JD-Core Version:    0.6.0
 */