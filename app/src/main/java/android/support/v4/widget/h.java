package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class h extends Filter
{
  i a;

  h(i parami)
  {
    this.a = parami;
  }

  public CharSequence convertResultToString(Object paramObject)
  {
    return this.a.c((Cursor)paramObject);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      localFilterResults.count = paramCharSequence.getCount();
      localFilterResults.values = paramCharSequence;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.a.a();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != paramCharSequence))
      this.a.a((Cursor)paramFilterResults.values);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.0
 */