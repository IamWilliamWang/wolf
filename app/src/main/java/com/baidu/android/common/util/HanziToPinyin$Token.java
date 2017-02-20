package com.baidu.android.common.util;

public class HanziToPinyin$Token
{
  public static final int DIGIT = 3;
  public static final int LATIN = 1;
  public static final int PINYIN = 2;
  public static final String SEPARATOR = " ";
  public static final int SYMBOL = 4;
  public static final int UNKNOWN = 5;
  public boolean isPolyphonic;
  public String[] polyphonicPinyins;
  public String source;
  public String target;
  public int type;

  public HanziToPinyin$Token()
  {
  }

  public HanziToPinyin$Token(int paramInt, String paramString1, String paramString2)
  {
    this.type = paramInt;
    this.source = paramString1;
    this.target = paramString2;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.android.common.util.HanziToPinyin.Token
 * JD-Core Version:    0.6.0
 */