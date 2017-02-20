package android.support.v4.h.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class u extends v
{
  public Object a(r paramr)
  {
    return y.a(new z(paramr)
    {
      public Object a(int paramInt)
      {
        f localf = this.a.a(paramInt);
        if (localf == null)
          return null;
        return localf.a();
      }

      public List<Object> a(String paramString, int paramInt)
      {
        paramString = this.a.a(paramString, paramInt);
        ArrayList localArrayList = new ArrayList();
        int i = paramString.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localArrayList.add(((f)paramString.get(paramInt)).a());
          paramInt += 1;
        }
        return localArrayList;
      }

      public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
      {
        return this.a.a(paramInt1, paramInt2, paramBundle);
      }

      public Object b(int paramInt)
      {
        f localf = this.a.b(paramInt);
        if (localf == null)
          return null;
        return localf.a();
      }
    });
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.h.a.u
 * JD-Core Version:    0.6.0
 */