package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class ce extends View.BaseSavedState
{
  public static final Parcelable.Creator<ce> CREATOR = new Parcelable.Creator()
  {
    public ce a(Parcel paramParcel)
    {
      return new ce(paramParcel);
    }

    public ce[] a(int paramInt)
    {
      return new ce[paramInt];
    }
  };
  int a;
  boolean b;

  public ce(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      return;
    }
  }

  public ce(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    if (this.b);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ce
 * JD-Core Version:    0.6.0
 */