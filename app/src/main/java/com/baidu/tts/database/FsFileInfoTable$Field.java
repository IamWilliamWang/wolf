package com.baidu.tts.database;

public enum FsFileInfoTable$Field
{
  private final String c;
  private final String d;

  private FsFileInfoTable$Field(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }

  public String getColumnName()
  {
    return this.c;
  }

  public String getDataType()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.FsFileInfoTable.Field
 * JD-Core Version:    0.6.0
 */