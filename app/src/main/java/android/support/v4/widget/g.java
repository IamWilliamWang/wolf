package android.support.v4.widget;

import android.database.DataSetObserver;

class g extends DataSetObserver
{
  private g(e parame)
  {
  }

  public void onChanged()
  {
    this.a.a = true;
    this.a.notifyDataSetChanged();
  }

  public void onInvalidated()
  {
    this.a.a = false;
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.g
 * JD-Core Version:    0.6.0
 */