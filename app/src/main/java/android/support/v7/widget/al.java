package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

class al
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter a;
  private ListAdapter b;

  public al(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
  {
    this.a = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof SpinnerAdapter))
      this.b = ((SpinnerAdapter)paramSpinnerAdapter);
    if (paramTheme != null)
    {
      if ((!ak.a()) || (!(paramSpinnerAdapter instanceof ThemedSpinnerAdapter)))
        break label64;
      paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
      if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme)
        paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
    }
    label64: 
    do
    {
      do
        return;
      while (!(paramSpinnerAdapter instanceof bw));
      paramSpinnerAdapter = (bw)paramSpinnerAdapter;
    }
    while (paramSpinnerAdapter.a() != null);
    paramSpinnerAdapter.a(paramTheme);
  }

  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null)
      return localListAdapter.areAllItemsEnabled();
    return true;
  }

  public int getCount()
  {
    if (this.a == null)
      return 0;
    return this.a.getCount();
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a == null)
      return null;
    return this.a.getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public Object getItem(int paramInt)
  {
    if (this.a == null)
      return null;
    return this.a.getItem(paramInt);
  }

  public long getItemId(int paramInt)
  {
    if (this.a == null)
      return -1L;
    return this.a.getItemId(paramInt);
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    return (this.a != null) && (this.a.hasStableIds());
  }

  public boolean isEmpty()
  {
    return getCount() == 0;
  }

  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null)
      return localListAdapter.isEnabled(paramInt);
    return true;
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null)
      this.a.registerDataSetObserver(paramDataSetObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null)
      this.a.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.al
 * JD-Core Version:    0.6.0
 */