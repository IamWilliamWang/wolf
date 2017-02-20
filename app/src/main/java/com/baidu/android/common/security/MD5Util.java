package com.baidu.android.common.security;

import java.security.MessageDigest;

public final class MD5Util
{
  public static String toHexString(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str1 = str2;
      if (paramBoolean)
        str1 = str2.toUpperCase();
      if (str1.length() == 1)
        localStringBuilder.append("0");
      localStringBuilder.append(str1).append(paramString);
      i += 1;
    }
    return localStringBuilder.toString();
  }

  public static String toMd5(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.reset();
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = toHexString(localMessageDigest.digest(), "", paramBoolean);
      return paramArrayOfByte;
    }
    catch (java.security.NoSuchAlgorithmException paramArrayOfByte)
    {
    }
    throw new RuntimeException(paramArrayOfByte);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.security.MD5Util
 * JD-Core Version:    0.6.0
 */