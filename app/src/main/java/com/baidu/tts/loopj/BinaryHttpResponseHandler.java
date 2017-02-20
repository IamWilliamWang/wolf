package com.baidu.tts.loopj;

import android.os.Looper;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public abstract class BinaryHttpResponseHandler extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "BinaryHttpRH";
  private String[] mAllowedContentTypes = { "application/octet-stream", "image/jpeg", "image/png", "image/gif" };

  public BinaryHttpResponseHandler()
  {
  }

  public BinaryHttpResponseHandler(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      this.mAllowedContentTypes = paramArrayOfString;
      return;
    }
    AsyncHttpClient.log.e("BinaryHttpRH", "Constructor passed allowedContentTypes was null !");
  }

  public BinaryHttpResponseHandler(String[] paramArrayOfString, Looper paramLooper)
  {
    super(paramLooper);
    if (paramArrayOfString != null)
    {
      this.mAllowedContentTypes = paramArrayOfString;
      return;
    }
    AsyncHttpClient.log.e("BinaryHttpRH", "Constructor passed allowedContentTypes was null !");
  }

  public String[] getAllowedContentTypes()
  {
    return this.mAllowedContentTypes;
  }

  public native abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);

  public native abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte);

  public final void sendResponseMessage(HttpResponse paramHttpResponse)
  {
    int j = 0;
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    Object localObject = paramHttpResponse.getHeaders("Content-Type");
    if (localObject.length != 1)
    {
      sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), "None, or more than one, Content-Type Header found!"));
      return;
    }
    localObject = localObject[0];
    String[] arrayOfString = getAllowedContentTypes();
    int k = arrayOfString.length;
    int i = 0;
    while (true)
      if (i < k)
      {
        String str = arrayOfString[i];
        try
        {
          boolean bool = Pattern.matches(str, ((Header)localObject).getValue());
          if (bool)
            j = 1;
          i += 1;
        }
        catch (PatternSyntaxException localPatternSyntaxException)
        {
          while (true)
            AsyncHttpClient.log.e("BinaryHttpRH", "Given pattern is not valid: " + str, localPatternSyntaxException);
        }
      }
    if (j == 0)
    {
      sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), null, new HttpResponseException(localStatusLine.getStatusCode(), "Content-Type (" + ((Header)localObject).getValue() + ") not allowed!"));
      return;
    }
    super.sendResponseMessage(paramHttpResponse);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.BinaryHttpResponseHandler
 * JD-Core Version:    0.6.0
 */