package android.support.v4.f;

import java.util.Locale;

class i
{
  private static int b(Locale paramLocale)
  {
    switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
    {
    default:
      return 0;
    case 1:
    case 2:
    }
    return 1;
  }

  public int a(Locale paramLocale)
  {
    if ((paramLocale != null) && (!paramLocale.equals(h.a)))
    {
      String str = a.a(paramLocale);
      if (str == null)
        return b(paramLocale);
      if ((str.equalsIgnoreCase(h.a())) || (str.equalsIgnoreCase(h.b())))
        return 1;
    }
    return 0;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.f.i
 * JD-Core Version:    0.6.0
 */