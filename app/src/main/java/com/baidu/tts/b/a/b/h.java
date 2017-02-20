package com.baidu.tts.b.a.b;

import com.baidu.tts.a.a.b;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.d;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.tools.CommonUtility;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class h extends g
{
  private com.baidu.tts.a.a.a<byte[], byte[]> a;
  private f.b b;
  private com.baidu.tts.m.h c;

  public h(com.baidu.tts.m.h paramh)
  {
    this.c = paramh;
    this.a = new com.baidu.tts.a.a.a();
    paramh = new b();
    this.a.a(paramh);
    this.a.a();
  }

  private void a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      int i = paramString.optInt(com.baidu.tts.f.g.u.a());
      LoggerProxy.d("TtsResponseHandler", "parseJSON errNo=" + i);
      this.c.a(i);
      if (i != 0)
      {
        paramString = paramString.getString(com.baidu.tts.f.g.v.a());
        paramString = c.a().a(n.g, i, paramString);
        this.c.a(paramString);
        return;
      }
      String str = paramString.optString(com.baidu.tts.f.g.V.a());
      this.c.a(str);
      i = paramString.optInt(com.baidu.tts.f.g.W.a());
      this.c.b(i);
      i = paramString.optInt(com.baidu.tts.f.g.y.b());
      this.c.c(i);
      return;
    }
    catch (ParseException paramString)
    {
      paramString.printStackTrace();
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }

  private void b(HttpEntity paramHttpEntity)
  {
    byte[] arrayOfByte2 = null;
    Object localObject = "--" + "--BD**TTS++LIB";
    while (true)
    {
      int j;
      byte[] arrayOfByte1;
      int i;
      try
      {
        localObject = ((String)localObject).getBytes("utf-8");
      }
      catch (UnsupportedEncodingException arrayOfByte1)
      {
        try
        {
          paramHttpEntity = EntityUtils.toByteArray(paramHttpEntity);
          j = CommonUtility.indexOf(paramHttpEntity, localObject, 0);
          if (j >= 0)
            continue;
          paramHttpEntity = c.a().b(n.l);
          this.c.a(paramHttpEntity);
          return;
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
          localUnsupportedEncodingException1.printStackTrace();
          arrayOfByte1 = null;
          continue;
        }
        catch (IOException paramHttpEntity)
        {
          paramHttpEntity.printStackTrace();
          paramHttpEntity = arrayOfByte2;
          continue;
          i = CommonUtility.indexOf(paramHttpEntity, arrayOfByte1, arrayOfByte1.length + j);
          if (i >= 0)
            continue;
          paramHttpEntity = c.a().b(n.l);
          this.c.a(paramHttpEntity);
          return;
          arrayOfByte2 = CommonUtility.copyBytesOfRange(paramHttpEntity, j + arrayOfByte1.length, i);
        }
      }
      try
      {
        a(new String(arrayOfByte2, "utf-8"));
        j = CommonUtility.indexOf(paramHttpEntity, arrayOfByte1, arrayOfByte1.length + i);
        if (j < 0)
          continue;
        paramHttpEntity = CommonUtility.copyBytesOfRange(paramHttpEntity, arrayOfByte1.length + i, j);
        paramHttpEntity = (byte[])this.a.a(paramHttpEntity);
        this.c.a(paramHttpEntity);
        this.c.a(com.baidu.tts.f.a.a);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        while (true)
          localUnsupportedEncodingException2.printStackTrace();
      }
    }
  }

  private void c(HttpEntity paramHttpEntity)
  {
    Object localObject = null;
    try
    {
      paramHttpEntity = EntityUtils.toString(paramHttpEntity, d.c.a());
      a(paramHttpEntity);
      return;
    }
    catch (ParseException paramHttpEntity)
    {
      while (true)
      {
        paramHttpEntity.printStackTrace();
        paramHttpEntity = localObject;
      }
    }
    catch (IOException paramHttpEntity)
    {
      while (true)
      {
        paramHttpEntity.printStackTrace();
        paramHttpEntity = localObject;
      }
    }
  }

  public void a(int paramInt, Header[] paramArrayOfHeader, String paramString, HttpEntity paramHttpEntity)
  {
    if ("application/json".equals(paramString))
    {
      c(paramHttpEntity);
      return;
    }
    b(paramHttpEntity);
  }

  public void a(int paramInt, Header[] paramArrayOfHeader, String paramString, HttpEntity paramHttpEntity, Throwable paramThrowable)
  {
    LoggerProxy.d("TtsResponseHandler", "onFailure error = " + paramThrowable.getMessage());
    paramArrayOfHeader = c.a().a(n.b, paramInt, null, paramThrowable);
    this.c.a(paramArrayOfHeader);
  }

  public void a(f.b paramb)
  {
    this.b = paramb;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.b.a.b.h
 * JD-Core Version:    0.6.0
 */