package com.baidu.tts.database;

public enum SpeechModelTable$Field
{
  private final String l;
  private final String m;

  private SpeechModelTable$Field(String paramString1, String paramString2)
  {
    this.l = paramString1;
    this.m = paramString2;
  }

  public String getColumnName()
  {
    return this.l;
  }

  public String getDataType()
  {
    return this.m;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.SpeechModelTable.Field
 * JD-Core Version:    0.6.0
 */