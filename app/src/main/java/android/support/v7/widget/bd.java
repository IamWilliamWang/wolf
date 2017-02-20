package android.support.v7.widget;

import android.database.DataSetObserver;

class bd extends DataSetObserver
{
  private bd(ax paramax)
  {
  }

  public void onChanged()
  {
    if (this.a.k())
      this.a.c();
  }

  public void onInvalidated()
  {
    this.a.i();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bd
 * JD-Core Version:    0.6.0
 */