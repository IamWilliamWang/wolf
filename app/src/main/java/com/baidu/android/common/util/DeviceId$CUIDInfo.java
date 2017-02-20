package com.baidu.android.common.util;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceId$CUIDInfo
{
  private static final int VERSION = 2;
  public String deviceId;
  public String imei;
  public int version = 2;

  public static CUIDInfo createFromJson(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return null;
      try
      {
        Object localObject = new JSONObject(paramString);
        paramString = ((JSONObject)localObject).getString("deviceid");
        String str = ((JSONObject)localObject).getString("imei");
        int i = ((JSONObject)localObject).getInt("ver");
        if ((TextUtils.isEmpty(paramString)) || (str == null))
          continue;
        localObject = new CUIDInfo();
        ((CUIDInfo)localObject).deviceId = paramString;
        ((CUIDInfo)localObject).imei = str;
        ((CUIDInfo)localObject).version = i;
        return localObject;
      }
      catch (JSONException paramString)
      {
        DeviceId.access$100(paramString);
      }
    }
    return (CUIDInfo)null;
  }

  public String getFinalCUID()
  {
    String str2 = this.imei;
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = "0";
    str1 = new StringBuffer(str1).reverse().toString();
    return this.deviceId + "|" + str1;
  }

  public String toPersitString()
  {
    try
    {
      String str = new JSONObject().put("deviceid", this.deviceId).put("imei", this.imei).put("ver", this.version).toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      DeviceId.access$100(localJSONException);
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.util.DeviceId.CUIDInfo
 * JD-Core Version:    0.6.0
 */