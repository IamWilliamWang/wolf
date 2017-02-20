package com.baidu.tts.database;

import android.database.sqlite.SQLiteDatabase;

public class c
{
  private SQLiteDatabase a;
  private c.a b;

  public c(SQLiteDatabase paramSQLiteDatabase, c.a parama)
  {
    this.a = paramSQLiteDatabase;
    this.b = parama;
  }

  public boolean a()
  {
    boolean bool = false;
    int j = 0;
    int i = j;
    if (this.b != null)
    {
      i = j;
      if (this.a != null)
        j = bool;
    }
    try
    {
      this.a.beginTransaction();
      j = bool;
      bool = this.b.a(this.a);
      if (bool)
      {
        j = bool;
        this.a.setTransactionSuccessful();
      }
      i = bool;
      if (this.a != null)
      {
        this.a.endTransaction();
        this.a.close();
        i = bool;
      }
      return i;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      i = j;
      return j;
    }
    finally
    {
      if (this.a != null)
      {
        this.a.endTransaction();
        this.a.close();
      }
    }
    throw localObject;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.database.c
 * JD-Core Version:    0.6.0
 */