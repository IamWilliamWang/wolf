package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.h.j;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

class z
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private void a()
  {
    if (ActivityChooserView.f(this.a) != null)
      ActivityChooserView.f(this.a).onDismiss();
  }

  public void onClick(View paramView)
  {
    if (paramView == ActivityChooserView.c(this.a))
    {
      this.a.b();
      paramView = ActivityChooserView.a(this.a).b();
      int i = ActivityChooserView.a(this.a).d().a(paramView);
      paramView = ActivityChooserView.a(this.a).d().b(i);
      if (paramView != null)
      {
        paramView.addFlags(524288);
        this.a.getContext().startActivity(paramView);
      }
      return;
    }
    if (paramView == ActivityChooserView.d(this.a))
    {
      ActivityChooserView.a(this.a, false);
      ActivityChooserView.a(this.a, ActivityChooserView.e(this.a));
      return;
    }
    throw new IllegalArgumentException();
  }

  public void onDismiss()
  {
    a();
    if (this.a.a != null)
      this.a.a.a(false);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (((y)paramAdapterView.getAdapter()).getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      ActivityChooserView.a(this.a, 2147483647);
    case 0:
    }
    while (true)
    {
      return;
      this.a.b();
      if (!ActivityChooserView.b(this.a))
        break;
      if (paramInt <= 0)
        continue;
      ActivityChooserView.a(this.a).d().c(paramInt);
      return;
    }
    if (ActivityChooserView.a(this.a).e());
    while (true)
    {
      paramAdapterView = ActivityChooserView.a(this.a).d().b(paramInt);
      if (paramAdapterView == null)
        break;
      paramAdapterView.addFlags(524288);
      this.a.getContext().startActivity(paramAdapterView);
      return;
      paramInt += 1;
    }
  }

  public boolean onLongClick(View paramView)
  {
    if (paramView == ActivityChooserView.c(this.a))
    {
      if (ActivityChooserView.a(this.a).getCount() > 0)
      {
        ActivityChooserView.a(this.a, true);
        ActivityChooserView.a(this.a, ActivityChooserView.e(this.a));
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.z
 * JD-Core Version:    0.6.0
 */