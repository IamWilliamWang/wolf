package xyz.wolf.hongbao.b;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;

public class a
{
  public void a(String paramString, Context paramContext)
  {
    paramString = new DownloadManager.Request(Uri.parse(paramString));
    paramString.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Uber.apk");
    paramString.allowScanningByMediaScanner();
    paramString.setNotificationVisibility(1);
    ((DownloadManager)paramContext.getSystemService("download")).enqueue(paramString);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.b.a
 * JD-Core Version:    0.6.0
 */