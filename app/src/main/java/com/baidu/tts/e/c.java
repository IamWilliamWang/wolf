package com.baidu.tts.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

public class c
{
  private static c e;
  private c.a a;
  private SQLiteDatabase b;
  private volatile boolean c = false;
  private Context d;

  private c(Context paramContext)
  {
    this.d = paramContext;
  }

  public static c a(Context paramContext)
  {
    if (e == null)
      monitorenter;
    try
    {
      if (e == null)
        e = new c(paramContext);
      return e;
    }
    finally
    {
      monitorexit;
    }
    throw paramContext;
  }

  public static void e()
  {
    if (e != null)
    {
      monitorenter;
      try
      {
        if (e != null)
          e = null;
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  public void a()
  {
    monitorenter;
    try
    {
      if (this.a == null)
        this.a = new c.a(this, this.d);
      try
      {
        this.b = this.a.getWritableDatabase();
        monitorexit;
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          this.c = true;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("time", Long.valueOf(paramLong));
    localContentValues.put("code", Integer.valueOf(paramInt1));
    localContentValues.put("cmd_type", Integer.valueOf(paramInt2));
    localContentValues.put("cmd_id", Integer.valueOf(paramInt3));
    localContentValues.put("result", paramString);
    this.b.insert("result", null, localContentValues);
  }

  public void a(List<Integer> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0));
    String str;
    do
    {
      return;
      str = "";
      int i = 0;
      while (i < paramList.size())
      {
        str = str + paramList.get(i) + ",";
        i += 1;
      }
    }
    while (str.length() <= 0);
    paramList = str.substring(0, str.length() - 1);
    this.b.delete("result", "_id in (" + paramList + ")", null);
  }

  public Cursor b()
  {
    Cursor localCursor = null;
    if (this.b != null)
      localCursor = this.b.query("result", new String[] { "_id", "time", "code", "cmd_type", "cmd_id", "result" }, null, null, null, null, null);
    return localCursor;
  }

  public void c()
  {
    monitorenter;
    try
    {
      if (this.d != null)
      {
        this.a.close();
        this.a = null;
        this.d = null;
        this.c = true;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public boolean d()
  {
    return this.c;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.e.c
 * JD-Core Version:    0.6.0
 */