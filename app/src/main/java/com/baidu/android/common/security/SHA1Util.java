package com.baidu.android.common.security;

import java.security.MessageDigest;

public final class SHA1Util
{
  public static byte[] sha1(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = MessageDigest.getInstance("SHA-1").digest(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (java.security.NoSuchAlgorithmException paramArrayOfByte)
    {
    }
    throw new RuntimeException(paramArrayOfByte);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.security.SHA1Util
 * JD-Core Version:    0.6.0
 */