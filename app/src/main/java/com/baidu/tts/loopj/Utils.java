package com.baidu.tts.loopj;

class Utils
{
  public static void asserts(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
      throw new AssertionError(paramString);
  }

  public static <T> T notNull(T paramT, String paramString)
  {
    if (paramT == null)
      throw new IllegalArgumentException(paramString + " should not be null!");
    return paramT;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.Utils
 * JD-Core Version:    0.6.0
 */