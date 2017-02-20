package android.support.v4.g;

public class c
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("null");
      return;
    }
    String str2 = paramObject.getClass().getSimpleName();
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() > 0);
    }
    else
    {
      str2 = paramObject.getClass().getName();
      int i = str2.lastIndexOf('.');
      str1 = str2;
      if (i > 0)
        str1 = str2.substring(i + 1);
    }
    paramStringBuilder.append(str1);
    paramStringBuilder.append('{');
    paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.c
 * JD-Core Version:    0.6.0
 */