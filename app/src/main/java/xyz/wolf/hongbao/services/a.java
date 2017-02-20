package xyz.wolf.hongbao.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class a
{
  AccessibilityNodeInfo a;
  ArrayList<String> b;
  String c;
  String d = null;
  String e = null;
  String f;
  Context g;
  String[] h = { "分位", "角位", "个位", "十位", "百位" };
  int i = 1;
  int j = 1;
  SharedPreferences k;

  public a(Context paramContext, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.a = paramAccessibilityNodeInfo;
    this.b = new ArrayList();
    this.g = paramContext;
    this.k = PreferenceManager.getDefaultSharedPreferences(this.g);
    b();
  }

  private void b()
  {
    if (this.a == null);
    label154: 
    do
    {
      return;
      Object localObject = this.a.findAccessibilityNodeInfosByText("元");
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        localObject = ((List)localObject).iterator();
        if (((Iterator)localObject).hasNext())
        {
          AccessibilityNodeInfo localAccessibilityNodeInfo1 = (AccessibilityNodeInfo)((Iterator)localObject).next();
          AccessibilityNodeInfo localAccessibilityNodeInfo2 = localAccessibilityNodeInfo1.getParent();
          int m = localAccessibilityNodeInfo2.getChildCount();
          if (m > 4)
          {
            localAccessibilityNodeInfo3 = localAccessibilityNodeInfo2.getChild(2);
            this.c = localAccessibilityNodeInfo3.getText().toString();
            if (m >= 5)
            {
              str = localAccessibilityNodeInfo2.getChild(5).getText().toString();
              if (!str.equals("留言"))
                break label154;
              this.j = 1;
              this.i = 1;
            }
            while (true)
            {
              localAccessibilityNodeInfo3.recycle();
              localAccessibilityNodeInfo2.recycle();
              localAccessibilityNodeInfo1.recycle();
              break;
              if (str.indexOf("/") >= 0)
              {
                this.j = Integer.valueOf(str.substring("领取".length(), str.indexOf("/"))).intValue();
                this.i = Integer.valueOf(str.substring(str.indexOf("/") + 1, str.indexOf("个"))).intValue();
                continue;
              }
              this.j = Integer.valueOf(str.substring(0, str.indexOf("个红包"))).intValue();
            }
          }
          AccessibilityNodeInfo localAccessibilityNodeInfo3 = localAccessibilityNodeInfo2.getChild(2);
          String str = localAccessibilityNodeInfo3.getText().toString();
          if (str.endsWith("元"))
            this.b.add(str.substring(0, str.length() - "元".length()));
          while (true)
          {
            localAccessibilityNodeInfo3.recycle();
            localAccessibilityNodeInfo2.recycle();
            localAccessibilityNodeInfo1.recycle();
            break;
            this.b.add(str);
          }
        }
      }
      if (this.b.size() > 1)
        Collections.sort(this.b, new Comparator()
        {
          public int a(String paramString1, String paramString2)
          {
            int j = 0;
            double d = Double.parseDouble(paramString1.toString());
            d = Double.parseDouble(paramString2.toString()) - d;
            int i;
            if (d > 0.0D)
              i = 1;
            do
            {
              do
              {
                return i;
                i = j;
              }
              while (d == 0.0D);
              i = j;
            }
            while (d >= 0.0D);
            return -1;
          }
        });
      if (this.b.size() < 2)
        continue;
      this.f = ((String)this.b.get(this.b.size() - 2));
    }
    while (this.b.size() < 1);
    this.d = ((String)this.b.get(0));
    this.e = ((String)this.b.get(this.b.size() - 1));
  }

  public String a()
  {
    return this.c;
  }

  public void a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.a = paramAccessibilityNodeInfo;
    b();
  }

  protected boolean a(String[] paramArrayOfString)
  {
    int i3 = paramArrayOfString.length;
    if (this.c == null)
      return false;
    Object localObject = this.k.getStringSet("pref_pailei_lei", null);
    int i4;
    int m;
    label62: int i1;
    if ((localObject != null) && (((Set)localObject).size() != 0))
    {
      localObject = localObject.toString();
      i4 = this.c.length();
      n = 0;
      m = 0;
      if (n >= 4)
        break label170;
      i1 = m;
      if (((String)localObject).contains(this.h[n]))
        if (n < 2)
          break label159;
    }
    label159: for (int i2 = i4 - 2 - n; ; i2 = i4 - 1 - n)
    {
      i1 = m;
      if (i2 >= 0)
        i1 = m + Integer.valueOf("" + this.c.charAt(i2)).intValue();
      n += 1;
      m = i1;
      break label62;
      localObject = "分位";
      break;
    }
    label170: int n = 0;
    while (n < i3)
    {
      if (m % 10 == Integer.valueOf(paramArrayOfString[n]).intValue())
        return true;
      n += 1;
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.services.a
 * JD-Core Version:    0.6.0
 */