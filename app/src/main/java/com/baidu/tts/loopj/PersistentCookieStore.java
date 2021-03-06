package com.baidu.tts.loopj;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

public class PersistentCookieStore
  implements CookieStore
{
  private static final String COOKIE_NAME_PREFIX = "cookie_";
  private static final String COOKIE_NAME_STORE = "names";
  private static final String COOKIE_PREFS = "CookiePrefsFile";
  private static final String LOG_TAG = "PersistentCookieStore";
  private final SharedPreferences cookiePrefs;
  private final ConcurrentHashMap<String, Cookie> cookies;
  private boolean omitNonPersistentCookies = false;

  public PersistentCookieStore(Context paramContext)
  {
    this.cookiePrefs = paramContext.getSharedPreferences("CookiePrefsFile", 0);
    this.cookies = new ConcurrentHashMap();
    paramContext = this.cookiePrefs.getString("names", null);
    if (paramContext != null)
    {
      paramContext = TextUtils.split(paramContext, ",");
      int j = paramContext.length;
      while (i < j)
      {
        String str = paramContext[i];
        Object localObject = this.cookiePrefs.getString("cookie_" + str, null);
        if (localObject != null)
        {
          localObject = decodeCookie((String)localObject);
          if (localObject != null)
            this.cookies.put(str, localObject);
        }
        i += 1;
      }
      clearExpired(new Date());
    }
  }

  public void addCookie(Cookie paramCookie)
  {
    if ((this.omitNonPersistentCookies) && (!paramCookie.isPersistent()))
      return;
    String str = paramCookie.getName() + paramCookie.getDomain();
    if (!paramCookie.isExpired(new Date()))
      this.cookies.put(str, paramCookie);
    while (true)
    {
      SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
      localEditor.putString("names", TextUtils.join(",", this.cookies.keySet()));
      localEditor.putString("cookie_" + str, encodeCookie(new SerializableCookie(paramCookie)));
      localEditor.commit();
      return;
      this.cookies.remove(str);
    }
  }

  protected String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfByte[i] & 0xFF;
      if (k < 16)
        localStringBuilder.append('0');
      localStringBuilder.append(Integer.toHexString(k));
      i += 1;
    }
    return localStringBuilder.toString().toUpperCase(Locale.US);
  }

  public void clear()
  {
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Iterator localIterator = this.cookies.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localEditor.remove("cookie_" + str);
    }
    localEditor.remove("names");
    localEditor.commit();
    this.cookies.clear();
  }

  public boolean clearExpired(Date paramDate)
  {
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Iterator localIterator = this.cookies.entrySet().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if (!((Cookie)localEntry.getValue()).isExpired(paramDate))
        break label155;
      this.cookies.remove(str);
      localEditor.remove("cookie_" + str);
      i = 1;
    }
    label155: 
    while (true)
    {
      break;
      if (i != 0)
        localEditor.putString("names", TextUtils.join(",", this.cookies.keySet()));
      localEditor.commit();
      return i;
    }
  }

  protected Cookie decodeCookie(String paramString)
  {
    paramString = new ByteArrayInputStream(hexStringToByteArray(paramString));
    try
    {
      paramString = ((SerializableCookie)new ObjectInputStream(paramString).readObject()).getCookie();
      return paramString;
    }
    catch (java.io.IOException paramString)
    {
      AsyncHttpClient.log.d("PersistentCookieStore", "IOException in decodeCookie", paramString);
      return null;
    }
    catch (java.lang.ClassNotFoundException paramString)
    {
      AsyncHttpClient.log.d("PersistentCookieStore", "ClassNotFoundException in decodeCookie", paramString);
    }
    return null;
  }

  public void deleteCookie(Cookie paramCookie)
  {
    paramCookie = paramCookie.getName() + paramCookie.getDomain();
    this.cookies.remove(paramCookie);
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    localEditor.remove("cookie_" + paramCookie);
    localEditor.commit();
  }

  protected String encodeCookie(SerializableCookie paramSerializableCookie)
  {
    if (paramSerializableCookie == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramSerializableCookie);
      return byteArrayToHexString(localByteArrayOutputStream.toByteArray());
    }
    catch (java.io.IOException paramSerializableCookie)
    {
      AsyncHttpClient.log.d("PersistentCookieStore", "IOException in encodeCookie", paramSerializableCookie);
    }
    return null;
  }

  public List<Cookie> getCookies()
  {
    return new ArrayList(this.cookies.values());
  }

  protected byte[] hexStringToByteArray(String paramString)
  {
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int i = 0;
    while (i < j)
    {
      arrayOfByte[(i / 2)] = (byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16));
      i += 2;
    }
    return arrayOfByte;
  }

  public void setOmitNonPersistentCookies(boolean paramBoolean)
  {
    this.omitNonPersistentCookies = paramBoolean;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.loopj.PersistentCookieStore
 * JD-Core Version:    0.6.0
 */