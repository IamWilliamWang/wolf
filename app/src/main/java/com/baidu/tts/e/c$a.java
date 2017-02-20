package com.baidu.tts.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class c$a extends SQLiteOpenHelper
{
  public c$a(c paramc, Context paramContext)
  {
    super(paramContext, "ttsdata", null, 1);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table result (_id integer primary key autoincrement, time text, code integer, cmd_type integer, cmd_id integer, result text);");
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS result");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.e.c.a
 * JD-Core Version:    0.6.0
 */