package com.baidu.tts.l.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.g;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.loopj.JsonHttpResponseHandler;
import org.apache.http.Header;
import org.json.JSONObject;

public class d extends JsonHttpResponseHandler
{
  private TtsError a;
  private ModelFileBags b;

  public ModelFileBags a()
  {
    return this.b;
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
  {
    LoggerProxy.d("GetModelFileInfosHttpHandler", "onFailure1");
    this.a = c.a().a(n.ac, paramInt, paramString, paramThrowable);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, JSONObject paramJSONObject)
  {
    LoggerProxy.d("GetModelFileInfosHttpHandler", "onFailure2");
    paramArrayOfHeader = null;
    if (paramJSONObject != null)
      paramArrayOfHeader = paramJSONObject.toString();
    this.a = c.a().a(n.ac, paramInt, paramArrayOfHeader, paramThrowable);
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, JSONObject paramJSONObject)
  {
    LoggerProxy.d("GetModelFileInfosHttpHandler", "onSuccess response=" + paramJSONObject);
    paramInt = paramJSONObject.optInt(g.u.a());
    paramArrayOfHeader = paramJSONObject.optString(g.v.a());
    if ((paramInt == 0) || (paramInt == -4005))
    {
      paramArrayOfHeader = paramJSONObject.optJSONArray(g.c.b());
      this.b = new ModelFileBags();
      this.b.parseJson(paramArrayOfHeader);
      return;
    }
    this.a = c.a().a(n.ad, paramInt, paramArrayOfHeader);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a.d
 * JD-Core Version:    0.6.0
 */