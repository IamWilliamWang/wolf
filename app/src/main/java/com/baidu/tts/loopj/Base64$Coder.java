package com.baidu.tts.loopj;

abstract class Base64$Coder
{
  public int op;
  public byte[] output;

  public native abstract int maxOutputSize(int paramInt);

  public native abstract boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.Base64.Coder
 * JD-Core Version:    0.6.0
 */