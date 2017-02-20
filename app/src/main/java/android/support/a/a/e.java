package android.support.a.a;

import java.util.ArrayList;

class e
{
  private static int a(String paramString, int paramInt)
  {
    while (true)
    {
      if (paramInt < paramString.length())
      {
        int i = paramString.charAt(paramInt);
        if ((((i - 65) * (i - 90) > 0) && ((i - 97) * (i - 122) > 0)) || (i == 101) || (i == 69));
      }
      else
      {
        return paramInt;
      }
      paramInt += 1;
    }
  }

  private static void a(String paramString, int paramInt, f paramf)
  {
    paramf.b = false;
    int i = 0;
    int m = 0;
    int j = 0;
    int k = paramInt;
    while (true)
    {
      if (k < paramString.length())
        switch (paramString.charAt(k))
        {
        default:
          i = 0;
        case ' ':
        case ',':
        case '-':
        case '.':
        case 'E':
        case 'e':
        }
      while (true)
      {
        if (j == 0)
          break label164;
        paramf.a = k;
        return;
        i = 0;
        j = 1;
        continue;
        if ((k == paramInt) || (i != 0))
          break;
        paramf.b = true;
        i = 0;
        j = 1;
        continue;
        if (m == 0)
        {
          i = 0;
          m = 1;
          continue;
        }
        paramf.b = true;
        i = 0;
        j = 1;
        continue;
        i = 1;
      }
      label164: k += 1;
    }
  }

  private static void a(ArrayList<g> paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    paramArrayList.add(new g(paramChar, paramArrayOfFloat, null));
  }

  public static g[] a(String paramString)
  {
    if (paramString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int i = 0;
    while (j < paramString.length())
    {
      j = a(paramString, j);
      String str = paramString.substring(i, j).trim();
      if (str.length() > 0)
      {
        float[] arrayOfFloat = b(str);
        a(localArrayList, str.charAt(0), arrayOfFloat);
      }
      int k = j + 1;
      i = j;
      j = k;
    }
    if ((j - i == 1) && (i < paramString.length()))
      a(localArrayList, paramString.charAt(i), new float[0]);
    return (g[])localArrayList.toArray(new g[localArrayList.size()]);
  }

  public static g[] a(g[] paramArrayOfg)
  {
    if (paramArrayOfg == null)
      return null;
    g[] arrayOfg = new g[paramArrayOfg.length];
    int i = 0;
    while (i < paramArrayOfg.length)
    {
      arrayOfg[i] = new g(paramArrayOfg[i], null);
      i += 1;
    }
    return arrayOfg;
  }

  private static float[] b(String paramString)
  {
    int i;
    if (paramString.charAt(0) == 'z')
    {
      i = 1;
      if (paramString.charAt(0) != 'Z')
        break label39;
    }
    label39: for (int j = 1; ; j = 0)
    {
      if ((i | j) == 0)
        break label44;
      return new float[0];
      i = 0;
      break;
    }
    while (true)
    {
      label44: int k;
      try
      {
        float[] arrayOfFloat = new float[paramString.length()];
        f localf = new f(null);
        int n = paramString.length();
        i = 0;
        j = 1;
        if (j >= n)
          continue;
        a(paramString, j, localf);
        k = localf.a;
        if (j < k)
        {
          int m = i + 1;
          arrayOfFloat[i] = Float.parseFloat(paramString.substring(j, k));
          i = m;
          if (!localf.b)
            break label181;
          j = k;
          continue;
          arrayOfFloat = b(arrayOfFloat, 0, i);
          return arrayOfFloat;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new RuntimeException("error in parsing \"" + paramString + "\"", localNumberFormatException);
      }
      continue;
      label181: j = k + 1;
    }
  }

  private static float[] b(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException();
    int i = paramArrayOfFloat.length;
    if ((paramInt1 < 0) || (paramInt1 > i))
      throw new ArrayIndexOutOfBoundsException();
    paramInt2 -= paramInt1;
    i = Math.min(paramInt2, i - paramInt1);
    float[] arrayOfFloat = new float[paramInt2];
    System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.a.a.e
 * JD-Core Version:    0.6.0
 */