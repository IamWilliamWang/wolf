package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

class s
{
  static void a(ListView paramListView, int paramInt)
  {
    int i = paramListView.getFirstVisiblePosition();
    if (i == -1);
    View localView;
    do
    {
      return;
      localView = paramListView.getChildAt(0);
    }
    while (localView == null);
    paramListView.setSelectionFromTop(i, localView.getTop() - paramInt);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.widget.s
 * JD-Core Version:    0.6.0
 */