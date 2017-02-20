package com.baidu.tts.loopj;

import B;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHttpResponseHandler extends TextHttpResponseHandler
{
  private static final String LOG_TAG = "JsonHttpRH";
  private boolean useRFC5179CompatibilityMode = true;

  public JsonHttpResponseHandler()
  {
    super("UTF-8");
  }

  public JsonHttpResponseHandler(String paramString)
  {
    super(paramString);
  }

  public JsonHttpResponseHandler(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.useRFC5179CompatibilityMode = paramBoolean;
  }

  public JsonHttpResponseHandler(boolean paramBoolean)
  {
    super("UTF-8");
    this.useRFC5179CompatibilityMode = paramBoolean;
  }

  public boolean isUseRFC5179CompatibilityMode()
  {
    return this.useRFC5179CompatibilityMode;
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], String, Throwable) was not overriden, but callback was received", paramThrowable);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, JSONArray paramJSONArray)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONArray) was not overriden, but callback was received", paramThrowable);
  }

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, Throwable paramThrowable, JSONObject paramJSONObject)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onFailure(int, Header[], Throwable, JSONObject) was not overriden, but callback was received", paramThrowable);
  }

  public final void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    if (paramArrayOfByte != null)
    {
      paramArrayOfHeader = new Runnable(paramArrayOfByte, paramInt, paramArrayOfHeader, paramThrowable)
      {
        public void run()
        {
          try
          {
            Object localObject = JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes);
            JsonHttpResponseHandler.this.postRunnable(new Runnable(localObject)
            {
              public void run()
              {
                if ((!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) && (this.val$jsonResponse == null))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, (String)null, JsonHttpResponseHandler.2.this.val$throwable);
                  return;
                }
                if ((this.val$jsonResponse instanceof JSONObject))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONObject)this.val$jsonResponse);
                  return;
                }
                if ((this.val$jsonResponse instanceof JSONArray))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, JsonHttpResponseHandler.2.this.val$throwable, (JSONArray)this.val$jsonResponse);
                  return;
                }
                if ((this.val$jsonResponse instanceof String))
                {
                  JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, (String)this.val$jsonResponse, JsonHttpResponseHandler.2.this.val$throwable);
                  return;
                }
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject)null);
              }
            });
            return;
          }
          catch (JSONException localJSONException)
          {
            JsonHttpResponseHandler.this.postRunnable(new Runnable(localJSONException)
            {
              public void run()
              {
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.2.this.val$statusCode, JsonHttpResponseHandler.2.this.val$headers, this.val$ex, (JSONObject)null);
              }
            });
          }
        }
      };
      if ((!getUseSynchronousMode()) && (!getUsePoolThread()))
      {
        new Thread(paramArrayOfHeader).start();
        return;
      }
      paramArrayOfHeader.run();
      return;
    }
    AsyncHttpClient.log.v("JsonHttpRH", "response body is null, calling onFailure(Throwable, JSONObject)");
    onFailure(paramInt, paramArrayOfHeader, paramThrowable, (JSONObject)null);
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], String) was not overriden, but callback was received");
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, JSONArray paramJSONArray)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONArray) was not overriden, but callback was received");
  }

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, JSONObject paramJSONObject)
  {
    AsyncHttpClient.log.w("JsonHttpRH", "onSuccess(int, Header[], JSONObject) was not overriden, but callback was received");
  }

  public final void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    if (paramInt != 204)
    {
      paramArrayOfHeader = new Runnable(paramArrayOfByte, paramInt, paramArrayOfHeader)
      {
        public void run()
        {
          try
          {
            Object localObject = JsonHttpResponseHandler.this.parseResponse(this.val$responseBytes);
            JsonHttpResponseHandler.this.postRunnable(new Runnable(localObject)
            {
              public void run()
              {
                if ((!JsonHttpResponseHandler.this.useRFC5179CompatibilityMode) && (this.val$jsonResponse == null))
                {
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (String)null);
                  return;
                }
                if ((this.val$jsonResponse instanceof JSONObject))
                {
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONObject)this.val$jsonResponse);
                  return;
                }
                if ((this.val$jsonResponse instanceof JSONArray))
                {
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (JSONArray)this.val$jsonResponse);
                  return;
                }
                if ((this.val$jsonResponse instanceof String))
                {
                  if (JsonHttpResponseHandler.this.useRFC5179CompatibilityMode)
                  {
                    JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (String)this.val$jsonResponse, new JSONException("Response cannot be parsed as JSON data"));
                    return;
                  }
                  JsonHttpResponseHandler.this.onSuccess(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, (String)this.val$jsonResponse);
                  return;
                }
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, new JSONException("Unexpected response type " + this.val$jsonResponse.getClass().getName()), (JSONObject)null);
              }
            });
            return;
          }
          catch (JSONException localJSONException)
          {
            JsonHttpResponseHandler.this.postRunnable(new Runnable(localJSONException)
            {
              public void run()
              {
                JsonHttpResponseHandler.this.onFailure(JsonHttpResponseHandler.1.this.val$statusCode, JsonHttpResponseHandler.1.this.val$headers, this.val$ex, (JSONObject)null);
              }
            });
          }
        }
      };
      if ((!getUseSynchronousMode()) && (!getUsePoolThread()))
      {
        new Thread(paramArrayOfHeader).start();
        return;
      }
      paramArrayOfHeader.run();
      return;
    }
    onSuccess(paramInt, paramArrayOfHeader, new JSONObject());
  }

  protected Object parseResponse(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    if (paramArrayOfByte == null)
      paramArrayOfByte = (B)localObject1;
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = getResponseString(paramArrayOfByte, getCharset());
      localObject1 = paramArrayOfByte;
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = paramArrayOfByte.trim();
        if (this.useRFC5179CompatibilityMode)
        {
          if (!paramArrayOfByte.startsWith("{"))
          {
            localObject1 = paramArrayOfByte;
            if (!paramArrayOfByte.startsWith("["))
              break label163;
          }
          localObject1 = new JSONTokener(paramArrayOfByte).nextValue();
        }
      }
      while (localObject1 != null)
      {
        return localObject1;
        if (((paramArrayOfByte.startsWith("{")) && (paramArrayOfByte.endsWith("}"))) || ((paramArrayOfByte.startsWith("[")) && (paramArrayOfByte.endsWith("]"))))
        {
          localObject1 = new JSONTokener(paramArrayOfByte).nextValue();
          continue;
        }
        localObject1 = paramArrayOfByte;
        if (paramArrayOfByte.startsWith("\""))
        {
          localObject1 = paramArrayOfByte;
          if (paramArrayOfByte.endsWith("\""))
          {
            localObject1 = paramArrayOfByte.substring(1, paramArrayOfByte.length() - 1);
            continue;
          }
        }
        label163: Object localObject2 = null;
        paramArrayOfByte = (B)localObject1;
        localObject1 = localObject2;
      }
    }
  }

  public void setUseRFC5179CompatibilityMode(boolean paramBoolean)
  {
    this.useRFC5179CompatibilityMode = paramBoolean;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.JsonHttpResponseHandler
 * JD-Core Version:    0.6.0
 */