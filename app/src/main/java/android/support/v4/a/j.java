package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class j
  implements Parcelable
{
  public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator()
  {
    public j a(Parcel paramParcel)
    {
      return new j(paramParcel);
    }

    public j[] a(int paramInt)
    {
      return new j[paramInt];
    }
  };
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;

  public j(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }

  public j(g paramg)
  {
    h localh = paramg.c;
    int n;
    for (int m = 0; localh != null; m = n)
    {
      n = m;
      if (localh.i != null)
        n = m + localh.i.size();
      localh = localh.a;
    }
    this.a = new int[m + paramg.e * 7];
    if (!paramg.l)
      throw new IllegalStateException("Not on back stack");
    localh = paramg.c;
    m = 0;
    if (localh != null)
    {
      int[] arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = localh.c;
      arrayOfInt = this.a;
      int i1 = n + 1;
      if (localh.d != null);
      for (m = localh.d.g; ; m = -1)
      {
        arrayOfInt[n] = m;
        arrayOfInt = this.a;
        m = i1 + 1;
        arrayOfInt[i1] = localh.e;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localh.f;
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = localh.g;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localh.h;
        if (localh.i == null)
          break label314;
        i1 = localh.i.size();
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = i1;
        n = 0;
        while (n < i1)
        {
          this.a[m] = ((m)localh.i.get(n)).g;
          n += 1;
          m += 1;
        }
      }
      while (true)
      {
        localh = localh.a;
        break;
        label314: arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = 0;
      }
    }
    this.b = paramg.j;
    this.c = paramg.k;
    this.d = paramg.n;
    this.e = paramg.p;
    this.f = paramg.q;
    this.g = paramg.r;
    this.h = paramg.s;
    this.i = paramg.t;
    this.j = paramg.u;
    this.k = paramg.v;
  }

  public g a(w paramw)
  {
    g localg = new g(paramw);
    int i1 = 0;
    int m = 0;
    while (m < this.a.length)
    {
      h localh = new h();
      Object localObject = this.a;
      int n = m + 1;
      localh.c = localObject[m];
      if (w.a)
        Log.v("FragmentManager", "Instantiate " + localg + " op #" + i1 + " base fragment #" + this.a[n]);
      localObject = this.a;
      m = n + 1;
      n = localObject[n];
      if (n >= 0);
      for (localh.d = ((m)paramw.f.get(n)); ; localh.d = null)
      {
        localObject = this.a;
        n = m + 1;
        localh.e = localObject[m];
        localObject = this.a;
        m = n + 1;
        localh.f = localObject[n];
        localObject = this.a;
        n = m + 1;
        localh.g = localObject[m];
        localObject = this.a;
        m = n + 1;
        localh.h = localObject[n];
        localObject = this.a;
        n = m + 1;
        int i3 = localObject[m];
        m = n;
        if (i3 <= 0)
          break;
        localh.i = new ArrayList(i3);
        int i2 = 0;
        while (true)
        {
          m = n;
          if (i2 >= i3)
            break;
          if (w.a)
            Log.v("FragmentManager", "Instantiate " + localg + " set remove fragment #" + this.a[n]);
          localObject = (m)paramw.f.get(this.a[n]);
          localh.i.add(localObject);
          i2 += 1;
          n += 1;
        }
      }
      localg.a(localh);
      i1 += 1;
    }
    localg.j = this.b;
    localg.k = this.c;
    localg.n = this.d;
    localg.p = this.e;
    localg.l = true;
    localg.q = this.f;
    localg.r = this.g;
    localg.s = this.h;
    localg.t = this.i;
    localg.u = this.j;
    localg.v = this.k;
    localg.a(1);
    return (g)localg;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.j
 * JD-Core Version:    0.6.0
 */