package android.support.v4.e;

import android.os.AsyncTask;

class b
{
  static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> paramAsyncTask, Params[] paramArrayOfParams)
  {
    paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramArrayOfParams);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.e.b
 * JD-Core Version:    0.6.0
 */