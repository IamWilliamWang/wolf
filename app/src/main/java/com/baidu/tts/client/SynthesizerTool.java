package com.baidu.tts.client;

import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.tools.ResourceTools;
import com.baidu.tts.tools.StringTool;

public class SynthesizerTool
{
  public static boolean verifyModelFile(String paramString)
  {
    if (StringTool.isEmpty(paramString));
    while (true)
    {
      return false;
      paramString = ResourceTools.stringToByteArrayAddNull(paramString);
      try
      {
        int i = EmbeddedSynthesizerEngine.bdTTSVerifyDataFile(paramString);
        if (i >= 0)
          return true;
      }
      catch (java.lang.Exception paramString)
      {
      }
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.SynthesizerTool
 * JD-Core Version:    0.6.0
 */