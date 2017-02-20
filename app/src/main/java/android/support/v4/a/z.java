package android.support.v4.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class z
  implements Parcelable
{
  public static final Parcelable.Creator<z> CREATOR = new Parcelable.Creator()
  {
    public z a(Parcel paramParcel)
    {
      return new z(paramParcel);
    }

    public z[] a(int paramInt)
    {
      return new z[paramInt];
    }
  };
  aa[] a;
  int[] b;
  j[] c;

  public z()
  {
  }

  public z(Parcel paramParcel)
  {
    this.a = ((aa[])paramParcel.createTypedArray(aa.CREATOR));
    this.b = paramParcel.createIntArray();
    this.c = ((j[])paramParcel.createTypedArray(j.CREATOR));
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.z
 * JD-Core Version:    0.6.0
 */