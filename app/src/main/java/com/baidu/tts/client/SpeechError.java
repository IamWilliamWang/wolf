package com.baidu.tts.client;

public class SpeechError
{
  public int code;
  public String description;

  public String toString()
  {
    return "(" + this.code + ")" + this.description;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.client.SpeechError
 * JD-Core Version:    0.6.0
 */