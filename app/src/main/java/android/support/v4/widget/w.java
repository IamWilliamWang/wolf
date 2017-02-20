package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class w extends View.BaseSavedState
{
  public static final Parcelable.Creator<w> CREATOR = new Parcelable.Creator()
  {
    public w a(Parcel paramParcel)
    {
      return new w(paramParcel);
    }

    public w[] a(int paramInt)
    {
      return new w[paramInt];
    }
  };
  public int a;

  public w(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
  }

  w(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.w
 * JD-Core Version:    0.6.0
 */