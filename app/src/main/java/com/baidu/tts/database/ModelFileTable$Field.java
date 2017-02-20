package com.baidu.tts.database;

public enum ModelFileTable$Field
{
  private final String f;
  private final String g;

  private ModelFileTable$Field(String paramString1, String paramString2)
  {
    this.f = paramString1;
    this.g = paramString2;
  }

  public String getColumnName()
  {
    return this.f;
  }

  public String getDataType()
  {
    return this.g;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.ModelFileTable.Field
 * JD-Core Version:    0.6.0
 */