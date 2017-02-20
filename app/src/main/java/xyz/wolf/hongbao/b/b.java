package xyz.wolf.hongbao.b;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import xyz.wolf.hongbao.services.HongbaoService;

public class b
{
  public String a;
  public String b;
  public String c;
  public String d = "";
  public String e;
  public boolean f;
  public boolean g = false;
  public String[] h;

  private String a(String[] paramArrayOfString)
  {
    int j = paramArrayOfString.length;
    String str1 = "";
    int i = 0;
    while (i < j)
    {
      String str2 = paramArrayOfString[i];
      if (str2 == null)
        return null;
      str1 = str1 + str2 + "|";
      i += 1;
    }
    return str1.substring(0, str1.length() - 1);
  }

  private String[] a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    int j = paramAccessibilityNodeInfo.getChildCount();
    byte[] arrayOfByte1 = new byte[13];
    byte[] tmp13_11 = arrayOfByte1;
    tmp13_11[0] = 117;
    byte[] tmp18_13 = tmp13_11;
    tmp18_13[1] = 110;
    byte[] tmp23_18 = tmp18_13;
    tmp23_18[2] = 107;
    byte[] tmp28_23 = tmp23_18;
    tmp28_23[3] = 110;
    byte[] tmp33_28 = tmp28_23;
    tmp33_28[4] = 111;
    byte[] tmp38_33 = tmp33_28;
    tmp38_33[5] = 119;
    byte[] tmp43_38 = tmp38_33;
    tmp43_38[6] = 110;
    byte[] tmp49_43 = tmp43_38;
    tmp49_43[7] = 83;
    byte[] tmp55_49 = tmp49_43;
    tmp55_49[8] = 101;
    byte[] tmp61_55 = tmp55_49;
    tmp61_55[9] = 110;
    byte[] tmp67_61 = tmp61_55;
    tmp67_61[10] = 100;
    byte[] tmp73_67 = tmp67_61;
    tmp73_67[11] = 101;
    byte[] tmp79_73 = tmp73_67;
    tmp79_73[12] = 114;
    tmp79_73;
    byte[] arrayOfByte2 = new byte[11];
    byte[] tmp94_92 = arrayOfByte2;
    tmp94_92[0] = 117;
    byte[] tmp99_94 = tmp94_92;
    tmp99_94[1] = 110;
    byte[] tmp104_99 = tmp99_94;
    tmp104_99[2] = 107;
    byte[] tmp109_104 = tmp104_99;
    tmp109_104[3] = 110;
    byte[] tmp114_109 = tmp109_104;
    tmp114_109[4] = 111;
    byte[] tmp119_114 = tmp114_109;
    tmp119_114[5] = 119;
    byte[] tmp124_119 = tmp119_114;
    tmp124_119[6] = 110;
    byte[] tmp130_124 = tmp124_119;
    tmp130_124[7] = 84;
    byte[] tmp136_130 = tmp130_124;
    tmp136_130[8] = 105;
    byte[] tmp142_136 = tmp136_130;
    tmp142_136[9] = 109;
    byte[] tmp148_142 = tmp142_136;
    tmp148_142[10] = 101;
    tmp148_142;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = new String(arrayOfByte1);
    arrayOfString[1] = new String(arrayOfByte2);
    int i = 0;
    if (i < j)
    {
      Object localObject = paramAccessibilityNodeInfo.getChild(i);
      if ((new String(new byte[] { 97, 110, 100, 114, 111, 105, 100, 46, 119, 105, 100, 103, 101, 116, 46, 73, 109, 97, 103, 101, 86, 105, 101, 119 }).equals(((AccessibilityNodeInfo)localObject).getClassName())) && (new String(arrayOfByte1).equals(arrayOfString[0])))
      {
        localObject = ((AccessibilityNodeInfo)localObject).getContentDescription();
        if (localObject != null)
          arrayOfString[0] = ((CharSequence)localObject).toString().replaceAll("头像$", "");
      }
      while (true)
      {
        i += 1;
        break;
        if ((!new String(new byte[] { 97, 110, 100, 114, 111, 105, 100, 46, 119, 105, 100, 103, 101, 116, 46, 84, 101, 120, 116, 86, 105, 101, 119 }).equals(((AccessibilityNodeInfo)localObject).getClassName())) || (!new String(arrayOfByte2).equals(arrayOfString[1])))
          continue;
        localObject = ((AccessibilityNodeInfo)localObject).getText();
        if (localObject == null)
          continue;
        arrayOfString[1] = ((CharSequence)localObject).toString();
      }
    }
    return (String)arrayOfString;
  }

  public String a()
  {
    return this.d;
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }

  public boolean a(HongbaoService paramHongbaoService, AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = new byte[27];
      Object tmp8_6 = localObject1;
      tmp8_6[0] = 97;
      Object tmp13_8 = tmp8_6;
      tmp13_8[1] = 110;
      Object tmp18_13 = tmp13_8;
      tmp18_13[2] = 100;
      Object tmp23_18 = tmp18_13;
      tmp23_18[3] = 114;
      Object tmp28_23 = tmp23_18;
      tmp28_23[4] = 111;
      Object tmp33_28 = tmp28_23;
      tmp33_28[5] = 105;
      Object tmp38_33 = tmp33_28;
      tmp38_33[6] = 100;
      Object tmp44_38 = tmp38_33;
      tmp44_38[7] = 46;
      Object tmp50_44 = tmp44_38;
      tmp50_44[8] = 119;
      Object tmp56_50 = tmp50_44;
      tmp56_50[9] = 105;
      Object tmp62_56 = tmp56_50;
      tmp62_56[10] = 100;
      Object tmp68_62 = tmp62_56;
      tmp68_62[11] = 103;
      Object tmp74_68 = tmp68_62;
      tmp74_68[12] = 101;
      Object tmp80_74 = tmp74_68;
      tmp80_74[13] = 116;
      Object tmp86_80 = tmp80_74;
      tmp86_80[14] = 46;
      Object tmp92_86 = tmp86_80;
      tmp92_86[15] = 76;
      Object tmp98_92 = tmp92_86;
      tmp98_92[16] = 105;
      Object tmp104_98 = tmp98_92;
      tmp104_98[17] = 110;
      Object tmp110_104 = tmp104_98;
      tmp110_104[18] = 101;
      Object tmp116_110 = tmp110_104;
      tmp116_110[19] = 97;
      Object tmp122_116 = tmp116_110;
      tmp122_116[20] = 114;
      Object tmp128_122 = tmp122_116;
      tmp128_122[21] = 76;
      Object tmp134_128 = tmp128_122;
      tmp134_128[22] = 97;
      Object tmp140_134 = tmp134_128;
      tmp140_134[23] = 121;
      Object tmp146_140 = tmp140_134;
      tmp146_140[24] = 111;
      Object tmp152_146 = tmp146_140;
      tmp152_146[25] = 117;
      Object tmp158_152 = tmp152_146;
      tmp158_152[26] = 116;
      tmp158_152;
      new String(localObject1);
      paramAccessibilityNodeInfo = paramAccessibilityNodeInfo.getParent();
      if (!new String(localObject1).equals(paramAccessibilityNodeInfo.getClassName()))
        return false;
      localObject1 = paramAccessibilityNodeInfo.getChild(0).getText().toString();
      if ((localObject1 != null) && (!"查看红包".equals(localObject1)))
      {
        paramString = paramString.split(" +");
        int j = paramString.length;
        int i = 0;
        while (true)
        {
          Object localObject2;
          if (i < j)
          {
            localObject2 = paramString[i];
            if (((((String)localObject2).length() > 0) && (((String)localObject1).contains((CharSequence)localObject2))) || (!paramHongbaoService.m))
              break;
            i += 1;
            continue;
          }
          else
          {
            paramString = paramAccessibilityNodeInfo.getParent();
            localObject2 = new Rect();
            paramString.getBoundsInScreen((Rect)localObject2);
            Rect localRect = new Rect();
            paramAccessibilityNodeInfo.getBoundsInScreen(localRect);
            if (paramHongbaoService.a(((Rect)localObject2).top, ((Rect)localObject2).bottom, localRect.bottom))
              break;
            this.h = a(paramString);
            if (this.g)
            {
              if (a(new String[] { this.h[0], localObject1, this.h[1] }).equals(toString()))
                break;
            }
            else
            {
              if ((!paramHongbaoService.f(paramHongbaoService.getApplicationContext(), (String)localObject1)) && (paramHongbaoService.a))
                break;
              if (!paramBoolean)
              {
                this.a = this.h[0];
                this.c = this.h[1];
                this.b = ((String)localObject1);
              }
              paramAccessibilityNodeInfo.recycle();
              paramString.recycle();
              return true;
            }
          }
        }
      }
    }
    catch (Exception paramHongbaoService)
    {
      paramHongbaoService.printStackTrace();
    }
    return false;
  }

  public void b()
  {
    this.b = "";
    this.c = "";
    this.a = "";
  }

  public String toString()
  {
    return a(new String[] { this.a, this.b, this.c });
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.b.b
 * JD-Core Version:    0.6.0
 */