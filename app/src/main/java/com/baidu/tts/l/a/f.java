package com.baidu.tts.l.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.g;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.tools.JsonTool;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f
  implements Callable<ModelFileBags>
{
  private RequestHandle a;
  private Set<String> b;

  public f(Set<String> paramSet)
  {
    this.b = paramSet;
  }

  private StringEntity b()
  {
    try
    {
      Object localObject = new JSONObject();
      ((JSONObject)localObject).put(g.t.a(), "getURL");
      ((JSONObject)localObject).put(g.d.b(), "1");
      JSONArray localJSONArray = JsonTool.fromSetToJson(this.b);
      ((JSONObject)localObject).put(g.i.b(), localJSONArray);
      localObject = ((JSONObject)localObject).toString();
      LoggerProxy.d("GetServerModelFileInfosWork", "geturl params=" + (String)localObject);
      localObject = new StringEntity((String)localObject);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return (StringEntity)null;
  }

  public ModelFileBags a()
  {
    SyncHttpClient localSyncHttpClient = new SyncHttpClient();
    String str = o.b.a();
    StringEntity localStringEntity = b();
    d locald = new d();
    this.a = localSyncHttpClient.post(null, str, localStringEntity, "application/json", locald);
    return locald.a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a.f
 * JD-Core Version:    0.6.0
 */