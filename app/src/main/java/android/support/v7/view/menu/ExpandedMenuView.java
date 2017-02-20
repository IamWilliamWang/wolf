package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.ca;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView
  implements i, v, AdapterView.OnItemClickListener
{
  private static final int[] a = { 16842964, 16843049 };
  private g b;
  private int c;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = ca.a(paramContext, paramAttributeSet, a, paramInt, 0);
    if (paramContext.f(0))
      setBackgroundDrawable(paramContext.a(0));
    if (paramContext.f(1))
      setDivider(paramContext.a(1));
    paramContext.a();
  }

  public boolean a(j paramj)
  {
    return this.b.a(paramj, 0);
  }

  public int getWindowAnimations()
  {
    return this.c;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((j)getAdapter().getItem(paramInt));
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.0
 */