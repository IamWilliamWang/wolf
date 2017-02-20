package com.baidu.tts.n;

public abstract class a<T>
  implements b<T>
{
  public T y()
  {
    try
    {
      Object localObject = super.clone();
      return localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      localCloneNotSupportedException.printStackTrace();
    }
    return null;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.n.a
 * JD-Core Version:    0.6.0
 */