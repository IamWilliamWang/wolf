package android.support.v7.view.menu;

import android.support.v7.widget.ax;
import android.support.v7.widget.az;

class b extends az
{
  public b(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }

  public ax a()
  {
    if (ActionMenuItemView.a(this.a) != null)
      return ActionMenuItemView.a(this.a).a();
    return null;
  }

  protected boolean b()
  {
    int j = 0;
    int i = j;
    if (ActionMenuItemView.b(this.a) != null)
    {
      i = j;
      if (ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a)))
      {
        ax localax = a();
        i = j;
        if (localax != null)
        {
          i = j;
          if (localax.k())
            i = 1;
        }
      }
    }
    return i;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.menu.b
 * JD-Core Version:    0.6.0
 */