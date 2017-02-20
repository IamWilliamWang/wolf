package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class bs extends View.BaseSavedState
{
  public static final Parcelable.Creator<bs> CREATOR = new Parcelable.Creator()
  {
    public bs a(Parcel paramParcel)
    {
      return new bs(paramParcel);
    }

    public bs[] a(int paramInt)
    {
      return new bs[paramInt];
    }
  };
  boolean a;

  public bs(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }

  bs(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Boolean.valueOf(this.a));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bs
 * JD-Core Version:    0.6.0
 */