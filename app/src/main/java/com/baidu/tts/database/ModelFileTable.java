package com.baidu.tts.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.client.model.ModelFileInfo;
import com.baidu.tts.tools.SqlTool;
import java.util.Iterator;
import java.util.List;

public class ModelFileTable
{
  public static int a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return paramSQLiteDatabase.delete("modelFile", "id=?", new String[] { paramString });
  }

  public static String a()
  {
    return SqlTool.sqlCreateTable("modelFile", ModelFileTable.Field.values());
  }

  public static void a(SQLiteDatabase paramSQLiteDatabase, ModelFileBags paramModelFileBags)
  {
    new c(paramSQLiteDatabase, new c.a(paramModelFileBags)
    {
      public boolean a(SQLiteDatabase paramSQLiteDatabase)
      {
        try
        {
          paramSQLiteDatabase = paramSQLiteDatabase.compileStatement("insert into modelFile (id, length, md5, name, absPath) values (?, ?, ?, ?, ?)");
          Iterator localIterator = ModelFileTable.this.getModelFileInfos().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (ModelFileInfo)localIterator.next();
            String str1 = ((ModelFileInfo)localObject).getServerid();
            String str2 = ((ModelFileInfo)localObject).getLength();
            String str3 = ((ModelFileInfo)localObject).getMd5();
            String str4 = ((ModelFileInfo)localObject).getName();
            localObject = ((ModelFileInfo)localObject).getAbsPath();
            paramSQLiteDatabase.bindString(1, str1);
            paramSQLiteDatabase.bindString(2, str2);
            paramSQLiteDatabase.bindString(3, str3);
            paramSQLiteDatabase.bindString(4, str4);
            paramSQLiteDatabase.bindString(5, (String)localObject);
            paramSQLiteDatabase.executeInsert();
          }
        }
        catch (java.lang.Exception paramSQLiteDatabase)
        {
          return false;
        }
        return true;
      }
    }).a();
  }

  public static String b()
  {
    return SqlTool.sqlDropTable("modelFile");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.ModelFileTable
 * JD-Core Version:    0.6.0
 */