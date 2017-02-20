package android.support.v7.view.menu;

import android.support.v7.view.b;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class m extends FrameLayout
  implements b
{
  final CollapsibleActionView a;

  m(View paramView)
  {
    super(paramView.getContext());
    this.a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }

  public void a()
  {
    this.a.onActionViewExpanded();
  }

  public void b()
  {
    this.a.onActionViewCollapsed();
  }

  View c()
  {
    return (View)this.a;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.m
 * JD-Core Version:    0.6.0
 */