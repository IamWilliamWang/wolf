package xyz.wolf.hongbao.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends AsyncTask<String, String, String>
{
  public static int a = 0;
  private Context b;
  private boolean c;

  public e(Context paramContext, boolean paramBoolean)
  {
    this.b = paramContext;
    this.c = paramBoolean;
    if (this.c)
      Toast.makeText(paramContext, " ", 0).show();
  }

  protected String a(String[] paramArrayOfString)
  {
    Object localObject = new DefaultHttpClient();
    try
    {
      paramArrayOfString = ((HttpClient)localObject).execute(new HttpGet(paramArrayOfString[0]));
      localObject = paramArrayOfString.getStatusLine();
      if (((StatusLine)localObject).getStatusCode() == 200)
      {
        localObject = new ByteArrayOutputStream();
        paramArrayOfString.getEntity().writeTo((OutputStream)localObject);
        paramArrayOfString = ((ByteArrayOutputStream)localObject).toString();
        ((ByteArrayOutputStream)localObject).close();
        return paramArrayOfString;
      }
      paramArrayOfString.getEntity().getContent().close();
      throw new IOException(((StatusLine)localObject).getReasonPhrase());
    }
    catch (Exception paramArrayOfString)
    {
    }
    return (String)null;
  }

  public void a()
  {
    super.execute(new String[] { " " });
  }

  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    try
    {
      a += 1;
      localObject = new JSONObject(paramString);
      String str = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName;
      paramString = ((JSONObject)localObject).getString("tag_name");
      if ((!((JSONObject)localObject).getBoolean("prerelease")) && (str.compareToIgnoreCase(paramString) >= 0))
      {
        if (this.c)
        {
          Toast.makeText(this.b, 2131230760, 0).show();
          return;
        }
      }
      else if (!this.c)
      {
        Toast.makeText(this.b, this.b.getString(2131230762) + paramString + this.b.getString(2131230764), 1).show();
        return;
      }
    }
    catch (Exception paramString)
    {
      Object localObject;
      paramString.printStackTrace();
      if (this.c)
      {
        Toast.makeText(this.b, 2131230761, 1).show();
        return;
        localObject = new Intent("android.intent.action.VIEW", Uri.parse(((JSONObject)localObject).getJSONArray("assets").getJSONObject(0).getString("browser_download_url")));
        ((Intent)localObject).setFlags(268435456);
        this.b.startActivity((Intent)localObject);
        Toast.makeText(this.b, this.b.getString(2131230762) + paramString + this.b.getString(2131230763), 1).show();
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.b.e
 * JD-Core Version:    0.6.0
 */