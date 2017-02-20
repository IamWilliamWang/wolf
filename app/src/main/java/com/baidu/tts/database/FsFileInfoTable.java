package com.baidu.tts.database;

import com.baidu.tts.tools.SqlTool;

public class FsFileInfoTable
{
  public static String a()
  {
    return SqlTool.sqlCreateTable("fsFileInfo", FsFileInfoTable.Field.values());
  }

  public static String b()
  {
    return SqlTool.sqlDropTable("fsFileInfo");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.FsFileInfoTable
 * JD-Core Version:    0.6.0
 */