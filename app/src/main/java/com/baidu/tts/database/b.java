package com.baidu.tts.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class b extends SQLiteOpenHelper
{
  public b(Context paramContext)
  {
    this(paramContext, "ttsModel.db", null, 1);
  }

  public b(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(SpeechModelTable.a());
    paramSQLiteDatabase.execSQL(ModelFileTable.a());
    paramSQLiteDatabase.execSQL(FsFileInfoTable.a());
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL(SpeechModelTable.b());
    paramSQLiteDatabase.execSQL(ModelFileTable.b());
    paramSQLiteDatabase.execSQL(FsFileInfoTable.b());
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.b
 * JD-Core Version:    0.6.0
 */