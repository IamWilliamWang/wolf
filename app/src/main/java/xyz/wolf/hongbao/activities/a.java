package xyz.wolf.hongbao.activities;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class a extends Activity
{
  private WebView a;
  private String b;
  private String c;

  @TargetApi(21)
  private void a()
  {
    setContentView(2130968611);
    if (Build.VERSION.SDK_INT < 21)
      return;
    Window localWindow = getWindow();
    localWindow.clearFlags(67108864);
    localWindow.addFlags(-2147483648);
    localWindow.setStatusBarColor(-1807262);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
    paramBundle = getIntent().getExtras();
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      this.c = paramBundle.getString("title");
      this.b = paramBundle.getString("url");
      ((TextView)findViewById(2131689582)).setText(this.c);
      this.a = ((WebView)findViewById(2131689585));
      this.a.getSettings().setBuiltInZoomControls(false);
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.getSettings().setDomStorageEnabled(true);
      this.a.getSettings().setCacheMode(-1);
      this.a.setWebViewClient(new WebViewClient()
      {
        public void onPageFinished(WebView paramWebView, String paramString)
        {
          CookieSyncManager.getInstance().sync();
        }

        public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
        {
          if (paramString.indexOf("apk") > 0)
          {
            Toast.makeText(a.this.getApplicationContext(), "正在准备下载", 0).show();
            new xyz.wolf.hongbao.b.a().a(paramString, a.this.getApplicationContext());
            return true;
          }
          paramWebView.loadUrl(paramString);
          return false;
        }
      });
      this.a.loadUrl(this.b);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0);
    switch (paramInt)
    {
    default:
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 4:
    }
    if (this.a.canGoBack())
      this.a.goBack();
    while (true)
    {
      return true;
      finish();
    }
  }

  protected void onResume()
  {
    super.onResume();
  }

  public void openLink(View paramView)
  {
    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.b)));
  }

  public void performBack(View paramView)
  {
    super.onBackPressed();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.activities.a
 * JD-Core Version:    0.6.0
 */