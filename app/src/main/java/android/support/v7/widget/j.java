package android.support.v7.widget;

import android.view.View;

class j
  implements Runnable
{
  private l b;

  public j(g paramg, l paraml)
  {
    this.b = paraml;
  }

  public void run()
  {
    g.g(this.a).e();
    View localView = (View)g.h(this.a);
    if ((localView != null) && (localView.getWindowToken() != null) && (this.b.d()))
      g.a(this.a, this.b);
    g.a(this.a, null);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.j
 * JD-Core Version:    0.6.0
 */