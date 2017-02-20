package android.support.v4.a;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class aj extends FrameLayout
{
  public aj(Context paramContext)
  {
    super(paramContext);
  }

  static ViewGroup a(View paramView)
  {
    aj localaj = new aj(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
      localaj.setLayoutParams(localLayoutParams);
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localaj.addView(paramView);
    return localaj;
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v4.a.aj
 * JD-Core Version:    0.6.0
 */