package com.baidu.tts.loopj;

public class Base64
{
  public static final int CRLF = 4;
  public static final int DEFAULT = 0;
  public static final int NO_CLOSE = 16;
  public static final int NO_PADDING = 1;
  public static final int NO_WRAP = 2;
  public static final int URL_SAFE = 8;

  public static byte[] decode(String paramString, int paramInt)
  {
    return decode(paramString.getBytes(), paramInt);
  }

  public static byte[] decode(byte[] paramArrayOfByte, int paramInt)
  {
    return decode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Base64.Decoder localDecoder = new Base64.Decoder(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localDecoder.process(paramArrayOfByte, paramInt1, paramInt2, true))
      throw new IllegalArgumentException("bad base-64");
    if (localDecoder.op == localDecoder.output.length)
      return localDecoder.output;
    paramArrayOfByte = new byte[localDecoder.op];
    System.arraycopy(localDecoder.output, 0, paramArrayOfByte, 0, localDecoder.op);
    return paramArrayOfByte;
  }

  public static byte[] encode(byte[] paramArrayOfByte, int paramInt)
  {
    return encode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Base64.Encoder localEncoder = new Base64.Encoder(paramInt3, null);
    int i = paramInt2 / 3 * 4;
    int j;
    if (localEncoder.do_padding)
    {
      paramInt3 = i;
      if (paramInt2 % 3 > 0)
        paramInt3 = i + 4;
      i = paramInt3;
      if (localEncoder.do_newline)
      {
        i = paramInt3;
        if (paramInt2 > 0)
        {
          j = (paramInt2 - 1) / 57;
          if (!localEncoder.do_cr)
            break label166;
        }
      }
    }
    label166: for (i = 2; ; i = 1)
    {
      i = paramInt3 + i * (j + 1);
      localEncoder.output = new byte[i];
      localEncoder.process(paramArrayOfByte, paramInt1, paramInt2, true);
      return localEncoder.output;
      paramInt3 = i;
      switch (paramInt2 % 3)
      {
      case 0:
      default:
        paramInt3 = i;
        break;
      case 1:
        paramInt3 = i + 2;
        break;
      case 2:
        paramInt3 = i + 3;
        break;
      }
    }
  }

  public static String encodeToString(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(encode(paramArrayOfByte, paramInt), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (java.io.UnsupportedEncodingException paramArrayOfByte)
    {
    }
    throw new AssertionError(paramArrayOfByte);
  }

  public static String encodeToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramArrayOfByte = new String(encode(paramArrayOfByte, paramInt1, paramInt2, paramInt3), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (java.io.UnsupportedEncodingException paramArrayOfByte)
    {
    }
    throw new AssertionError(paramArrayOfByte);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.Base64
 * JD-Core Version:    0.6.0
 */