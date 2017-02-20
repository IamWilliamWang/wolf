package com.baidu.tts.l.a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.RequestHandle;
import com.baidu.tts.loopj.SyncHttpClient;
import java.util.concurrent.Callable;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;

public class g
  implements Callable<ModelBags>
{
  private Conditions a;
  private RequestHandle b;

  public g(Conditions paramConditions)
  {
    this.a = paramConditions;
  }

  private StringEntity b()
  {
    Object localObject = this.a.getJSONConditions();
    try
    {
      ((JSONObject)localObject).put(com.baidu.tts.f.g.d.b(), "1");
      ((JSONObject)localObject).put(com.baidu.tts.f.g.t.a(), "getList");
      localObject = ((JSONObject)localObject).toString();
      LoggerProxy.d("GetServerModelsWork", "getlist params=" + (String)localObject);
      return new StringEntity((String)localObject);
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localJSONException.printStackTrace();
    }
  }

  public ModelBags a()
  {
    SyncHttpClient localSyncHttpClient = new SyncHttpClient();
    String str = o.b.a();
    StringEntity localStringEntity = b();
    a locala = new a();
    this.b = localSyncHttpClient.post(null, str, localStringEntity, "application/json", locala);
    return locala.a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.l.a.g
 * JD-Core Version:    0.6.0
 */