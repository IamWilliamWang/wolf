package com.baidu.android.common.util;

import android.content.Context;

public class CommonParam
{
  private static final boolean DEBUG = false;
  private static final String TAG = CommonParam.class.getSimpleName();

  public static String getCUID(Context paramContext)
  {
    return DeviceId.getCUID(paramContext);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.util.CommonParam
 * JD-Core Version:    0.6.0
 */