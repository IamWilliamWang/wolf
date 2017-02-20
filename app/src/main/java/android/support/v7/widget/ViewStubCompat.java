package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View
{
  private int a = 0;
  private int b;
  private WeakReference<View> c;
  private LayoutInflater d;
  private cg e;

  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, k.ViewStubCompat, paramInt, 0);
    this.b = paramContext.getResourceId(k.ViewStubCompat_android_inflatedId, -1);
    this.a = paramContext.getResourceId(k.ViewStubCompat_android_layout, 0);
    setId(paramContext.getResourceId(k.ViewStubCompat_android_id, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }

  public View a()
  {
    Object localObject = getParent();
    if ((localObject != null) && ((localObject instanceof ViewGroup)))
    {
      if (this.a != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        int i;
        if (this.d != null)
        {
          localObject = this.d;
          localObject = ((LayoutInflater)localObject).inflate(this.a, localViewGroup, false);
          if (this.b != -1)
            ((View)localObject).setId(this.b);
          i = localViewGroup.indexOfChild(this);
          localViewGroup.removeViewInLayout(this);
          ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
          if (localLayoutParams == null)
            break label140;
          localViewGroup.addView((View)localObject, i, localLayoutParams);
        }
        while (true)
        {
          this.c = new WeakReference(localObject);
          if (this.e != null)
            this.e.a(this, (View)localObject);
          return localObject;
          localObject = LayoutInflater.from(getContext());
          break;
          label140: localViewGroup.addView((View)localObject, i);
        }
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
  }

  public void draw(Canvas paramCanvas)
  {
  }

  public int getInflatedId()
  {
    return this.b;
  }

  public LayoutInflater getLayoutInflater()
  {
    return this.d;
  }

  public int getLayoutResource()
  {
    return this.a;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }

  public void setInflatedId(int paramInt)
  {
    this.b = paramInt;
  }

  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    this.d = paramLayoutInflater;
  }

  public void setLayoutResource(int paramInt)
  {
    this.a = paramInt;
  }

  public void setOnInflateListener(cg paramcg)
  {
    this.e = paramcg;
  }

  public void setVisibility(int paramInt)
  {
    if (this.c != null)
    {
      View localView = (View)this.c.get();
      if (localView != null)
        localView.setVisibility(paramInt);
    }
    do
    {
      return;
      throw new IllegalStateException("setVisibility called on un-referenced view");
      super.setVisibility(paramInt);
    }
    while ((paramInt != 0) && (paramInt != 4));
    a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ViewStubCompat
 * JD-Core Version:    0.6.0
 */