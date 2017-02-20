package com.baidu.tts.tools;

import java.util.Set;
import org.json.JSONArray;

public class JsonTool
{
  public static JSONArray fromSetToJson(Set<String> paramSet)
  {
    if (paramSet != null)
      return new JSONArray(paramSet);
    return null;
  }

  public static String[] getStringarray(JSONArray paramJSONArray)
  {
    if (paramJSONArray != null)
    {
      int j = paramJSONArray.length();
      String[] arrayOfString2 = new String[j];
      int i = 0;
      while (true)
      {
        arrayOfString1 = arrayOfString2;
        if (i >= j)
          break;
        arrayOfString2[i] = paramJSONArray.optString(i);
        i += 1;
      }
    }
    String[] arrayOfString1 = null;
    return arrayOfString1;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.tools.JsonTool
 * JD-Core Version:    0.6.0
 */