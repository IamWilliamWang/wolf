package com.baidu.tts.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelInfo;
import com.baidu.tts.tools.SqlTool;
import java.util.Iterator;
import java.util.List;

public class SpeechModelTable
{
  public static int a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    return paramSQLiteDatabase.delete("speechModel", "id=?", new String[] { paramString });
  }

  public static String a()
  {
    return SqlTool.sqlCreateTable("speechModel", SpeechModelTable.Field.values());
  }

  public static void a(SQLiteDatabase paramSQLiteDatabase, ModelBags paramModelBags)
  {
    new c(paramSQLiteDatabase, new c.a(paramModelBags)
    {
      public boolean a(SQLiteDatabase paramSQLiteDatabase)
      {
        try
        {
          paramSQLiteDatabase = paramSQLiteDatabase.compileStatement("insert into speechModel (name, version_min, version_max, language, gender, speaker, domain, quality, text_data_id, speech_data_id, id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
          Iterator localIterator = SpeechModelTable.this.getModelInfos().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (ModelInfo)localIterator.next();
            String str1 = ((ModelInfo)localObject).getName();
            String str2 = ((ModelInfo)localObject).getVersionMin();
            String str3 = ((ModelInfo)localObject).getVersionMax();
            String str4 = ((ModelInfo)localObject).getLanguage();
            String str5 = ((ModelInfo)localObject).getGender();
            String str6 = ((ModelInfo)localObject).getSpeaker();
            String str7 = ((ModelInfo)localObject).getDomain();
            String str8 = ((ModelInfo)localObject).getQuality();
            String str9 = ((ModelInfo)localObject).getTextDataId();
            String str10 = ((ModelInfo)localObject).getSpeechDataId();
            localObject = ((ModelInfo)localObject).getServerId();
            paramSQLiteDatabase.bindString(1, str1);
            paramSQLiteDatabase.bindString(2, str2);
            paramSQLiteDatabase.bindString(3, str3);
            paramSQLiteDatabase.bindString(4, str4);
            paramSQLiteDatabase.bindString(5, str5);
            paramSQLiteDatabase.bindString(6, str6);
            paramSQLiteDatabase.bindString(7, str7);
            paramSQLiteDatabase.bindString(8, str8);
            paramSQLiteDatabase.bindString(9, str9);
            paramSQLiteDatabase.bindString(10, str10);
            paramSQLiteDatabase.bindString(11, (String)localObject);
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
    return SqlTool.sqlDropTable("speechModel");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.SpeechModelTable
 * JD-Core Version:    0.6.0
 */