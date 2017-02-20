package com.baidu.tts.auth;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.android.common.net.ConnectManager;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.tools.StringTool;
import java.security.KeyStore;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class c
  implements com.baidu.tts.k.b<c, c.a>
{
  private String a;
  private String b;
  private String c;

  private HttpClient a(Context paramContext)
  {
    try
    {
      Object localObject1 = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject1).load(null, null);
      localObject1 = new c.b(this, (KeyStore)localObject1);
      ((SSLSocketFactory)localObject1).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      Object localObject2 = new ConnectManager(paramContext);
      paramContext = ((ConnectManager)localObject2).getProxy();
      localObject2 = ((ConnectManager)localObject2).getProxyPort();
      if (!TextUtils.isEmpty(paramContext))
        localBasicHttpParams.setParameter("http.route.default-proxy", new HttpHost(paramContext, Integer.valueOf((String)localObject2).intValue()));
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
      paramContext = new SchemeRegistry();
      paramContext.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      paramContext.register(new Scheme("https", (SocketFactory)localObject1, 443));
      paramContext = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, paramContext), localBasicHttpParams);
      return paramContext;
    }
    catch (Exception paramContext)
    {
    }
    return (HttpClient)(HttpClient)new DefaultHttpClient();
  }

  private boolean a(String paramString1, String paramString2)
  {
    return (!StringTool.isEmpty(paramString1)) && (!StringTool.isEmpty(paramString2));
  }

  private String b(String paramString1, String paramString2)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new BasicNameValuePair("grant_type", "client_credentials"));
    localLinkedList.add(new BasicNameValuePair("client_id", paramString1));
    localLinkedList.add(new BasicNameValuePair("client_secret", paramString2));
    paramString1 = URLEncodedUtils.format(localLinkedList, "utf-8");
    return "https://openapi.baidu.com/oauth/2.0/token?" + paramString1;
  }

  public int a(c paramc)
  {
    int j = 1;
    String str = paramc.a();
    int i;
    if (StringTool.isEmpty(this.a))
    {
      str = paramc.b();
      paramc = paramc.c();
      LoggerProxy.d("OnlineAuth", "mAK=" + this.b + "--mSK=" + this.c + "--ak2=" + str + "--sk2=" + paramc);
      i = j;
      if (StringTool.isEqual(this.b, str))
      {
        i = j;
        if (StringTool.isEqual(this.c, paramc))
          i = 0;
      }
    }
    do
    {
      return i;
      LoggerProxy.d("OnlineAuth", "mProductId=" + this.a + "--productId2=" + str);
      i = j;
    }
    while (str == null);
    return this.a.compareTo(str);
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public String b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public String c()
  {
    return this.c;
  }

  public void c(String paramString)
  {
    this.c = paramString;
  }

  public c.a d()
  {
    LoggerProxy.d("OnlineAuth", "enter online auth");
    c.a locala = new c.a();
    if (StringTool.isEmpty(this.a));
    while (true)
    {
      try
      {
        Object localObject = a(com.baidu.tts.h.b.b.a().h());
        if (!a(this.b, this.c))
          continue;
        String str = b(this.b, this.c);
        LoggerProxy.d("OnlineAuth", "url=" + str);
        localObject = ((HttpClient)localObject).execute(new HttpPost(str));
        str = EntityUtils.toString(((HttpResponse)localObject).getEntity());
        int i = ((HttpResponse)localObject).getStatusLine().getStatusCode();
        LoggerProxy.d("OnlineAuth", "body=" + str + "--code=" + i);
        if (i != 200)
          continue;
        localObject = new JSONObject(str);
        if (!((JSONObject)localObject).has("access_token"))
          continue;
        locala.b(((JSONObject)localObject).getString("access_token"));
        if (!((JSONObject)localObject).has("expires_in"))
          continue;
        i = ((JSONObject)localObject).getInt("expires_in");
        locala.a(System.nanoTime() + Math.min(i, 86400L) * 1000000000L);
        LoggerProxy.d("OnlineAuth", "end online auth");
        return locala;
        locala.a(com.baidu.tts.h.a.c.a().b(n.a));
        continue;
      }
      catch (Exception localException)
      {
        locala.a(com.baidu.tts.h.a.c.a().a(n.a, localException));
        continue;
        locala.a(com.baidu.tts.h.a.c.a().b(n.a));
        continue;
        locala.a(com.baidu.tts.h.a.c.a().b(n.Y));
        continue;
      }
      locala.a(this.a);
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.c
 * JD-Core Version:    0.6.0
 */