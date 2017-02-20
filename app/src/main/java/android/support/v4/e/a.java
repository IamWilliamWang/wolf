package android.support.v4.e;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public final class a
{
  public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> a(AsyncTask<Params, Progress, Result> paramAsyncTask, Params[] paramArrayOfParams)
  {
    if (paramAsyncTask == null)
      throw new IllegalArgumentException("task can not be null");
    if (Build.VERSION.SDK_INT >= 11)
    {
      b.a(paramAsyncTask, paramArrayOfParams);
      return paramAsyncTask;
    }
    paramAsyncTask.execute(paramArrayOfParams);
    return paramAsyncTask;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.e.a
 * JD-Core Version:    0.6.0
 */