package android.support.v4.g;

import android.util.Log;
import java.io.Writer;

public class d extends Writer
{
  private final String a;
  private StringBuilder b = new StringBuilder(128);

  public d(String paramString)
  {
    this.a = paramString;
  }

  private void a()
  {
    if (this.b.length() > 0)
    {
      Log.d(this.a, this.b.toString());
      this.b.delete(0, this.b.length());
    }
  }

  public void close()
  {
    a();
  }

  public void flush()
  {
    a();
  }

  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n')
        a();
      while (true)
      {
        i += 1;
        break;
        this.b.append(c);
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.g.d
 * JD-Core Version:    0.6.0
 */