package com.baidu.tts.auth;

import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

class c$b extends org.apache.http.conn.ssl.SSLSocketFactory
{
  SSLContext a = SSLContext.getInstance("TLS");

  public c$b(c paramc, KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    paramc = new X509TrustManager(paramc)
    {
      public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
      {
      }

      public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
      {
      }

      public X509Certificate[] getAcceptedIssuers()
      {
        return null;
      }
    };
    this.a.init(null, new TrustManager[] { paramc }, null);
  }

  public Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }

  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.auth.c.b
 * JD-Core Version:    0.6.0
 */