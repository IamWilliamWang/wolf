package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.b.b;
import android.support.v7.b.f;
import android.support.v7.b.h;
import android.support.v7.b.k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a
{
  private CharSequence g;
  private CharSequence h;
  private View i;
  private View j;
  private LinearLayout k;
  private TextView l;
  private TextView m;
  private int n;
  private int o;
  private boolean p;
  private int q;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.actionModeStyle);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ca.a(paramContext, paramAttributeSet, k.ActionMode, paramInt, 0);
    setBackgroundDrawable(paramContext.a(k.ActionMode_background));
    this.n = paramContext.g(k.ActionMode_titleTextStyle, 0);
    this.o = paramContext.g(k.ActionMode_subtitleTextStyle, 0);
    this.e = paramContext.f(k.ActionMode_height, 0);
    this.q = paramContext.g(k.ActionMode_closeItemLayout, h.abc_action_mode_close_item_material);
    paramContext.a();
  }

  private void a()
  {
    int i4 = 8;
    int i2 = 1;
    if (this.k == null)
    {
      LayoutInflater.from(getContext()).inflate(h.abc_action_bar_title_item, this);
      this.k = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.l = ((TextView)this.k.findViewById(f.action_bar_title));
      this.m = ((TextView)this.k.findViewById(f.action_bar_subtitle));
      if (this.n != 0)
        this.l.setTextAppearance(getContext(), this.n);
      if (this.o != 0)
        this.m.setTextAppearance(getContext(), this.o);
    }
    this.l.setText(this.g);
    this.m.setText(this.h);
    int i1;
    label167: Object localObject;
    if (!TextUtils.isEmpty(this.g))
    {
      i1 = 1;
      if (TextUtils.isEmpty(this.h))
        break label234;
      localObject = this.m;
      if (i2 == 0)
        break label239;
    }
    label234: label239: for (int i3 = 0; ; i3 = 8)
    {
      ((TextView)localObject).setVisibility(i3);
      localObject = this.k;
      if (i1 == 0)
      {
        i1 = i4;
        if (i2 == 0);
      }
      else
      {
        i1 = 0;
      }
      ((LinearLayout)localObject).setVisibility(i1);
      if (this.k.getParent() == null)
        addView(this.k);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label167;
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public CharSequence getSubtitle()
  {
    return this.h;
  }

  public CharSequence getTitle()
  {
    return this.g;
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.d != null)
    {
      this.d.e();
      this.d.g();
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.g);
      }
    }
    else
      return;
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = ch.a(this);
    int i1;
    int i2;
    int i3;
    Object localObject;
    if (paramBoolean)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      if ((this.i == null) || (this.i.getVisibility() == 8))
        break label289;
      localObject = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      if (!paramBoolean)
        break label252;
      paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      label83: if (!paramBoolean)
        break label261;
      paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      label94: paramInt2 = a(i1, paramInt2, paramBoolean);
    }
    label261: label284: label289: for (paramInt2 = a(a(this.i, paramInt2, i2, i3, paramBoolean) + paramInt2, paramInt4, paramBoolean); ; paramInt2 = i1)
    {
      paramInt4 = paramInt2;
      if (this.k != null)
      {
        paramInt4 = paramInt2;
        if (this.j == null)
        {
          paramInt4 = paramInt2;
          if (this.k.getVisibility() != 8)
            paramInt4 = paramInt2 + a(this.k, paramInt2, i2, i3, paramBoolean);
        }
      }
      if (this.j != null)
        a(this.j, paramInt4, i2, i3, paramBoolean);
      if (paramBoolean)
      {
        paramInt1 = getPaddingLeft();
        label210: if (this.c != null)
        {
          localObject = this.c;
          if (paramBoolean)
            break label284;
        }
      }
      for (paramBoolean = true; ; paramBoolean = false)
      {
        a((View)localObject, paramInt1, i2, i3, paramBoolean);
        return;
        i1 = getPaddingLeft();
        break;
        label252: paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        break label83;
        paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
        break label94;
        paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
        break label210;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = 1073741824;
    int i4 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
    int i6 = View.MeasureSpec.getSize(paramInt1);
    int i1;
    int i5;
    int i2;
    if (this.e > 0)
    {
      i1 = this.e;
      int i7 = getPaddingTop() + getPaddingBottom();
      paramInt1 = i6 - getPaddingLeft() - getPaddingRight();
      i5 = i1 - i7;
      i2 = View.MeasureSpec.makeMeasureSpec(i5, -2147483648);
      paramInt2 = paramInt1;
      Object localObject;
      if (this.i != null)
      {
        paramInt1 = a(this.i, paramInt1, i2, 0);
        localObject = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
        paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        paramInt2 = paramInt1 - (((ViewGroup.MarginLayoutParams)localObject).rightMargin + paramInt2);
      }
      paramInt1 = paramInt2;
      if (this.c != null)
      {
        paramInt1 = paramInt2;
        if (this.c.getParent() == this)
          paramInt1 = a(this.c, paramInt2, i2, 0);
      }
      paramInt2 = paramInt1;
      if (this.k != null)
      {
        paramInt2 = paramInt1;
        if (this.j == null)
        {
          if (!this.p)
            break label512;
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.k.measure(paramInt2, i2);
          int i8 = this.k.getMeasuredWidth();
          if (i8 > paramInt1)
            break label500;
          i2 = 1;
          label307: paramInt2 = paramInt1;
          if (i2 != 0)
            paramInt2 = paramInt1 - i8;
          localObject = this.k;
          if (i2 == 0)
            break label506;
          paramInt1 = 0;
          label332: ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label338: if (this.j != null)
      {
        localObject = this.j.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject).width == -2)
          break label528;
        paramInt1 = 1073741824;
        label368: i2 = paramInt2;
        if (((ViewGroup.LayoutParams)localObject).width >= 0)
          i2 = Math.min(((ViewGroup.LayoutParams)localObject).width, paramInt2);
        if (((ViewGroup.LayoutParams)localObject).height == -2)
          break label535;
        paramInt2 = i3;
        if (((ViewGroup.LayoutParams)localObject).height < 0)
          break label542;
        i3 = Math.min(((ViewGroup.LayoutParams)localObject).height, i5);
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i2, paramInt1), View.MeasureSpec.makeMeasureSpec(i3, paramInt2));
      }
      label403: label423: if (this.e > 0)
        break label557;
      i2 = getChildCount();
      paramInt1 = 0;
      paramInt2 = i4;
      label460: if (paramInt2 >= i2)
        break label549;
      i1 = getChildAt(paramInt2).getMeasuredHeight() + i7;
      if (i1 <= paramInt1)
        break label565;
      paramInt1 = i1;
    }
    label512: label528: label535: label542: label549: label557: label565: 
    while (true)
    {
      paramInt2 += 1;
      break label460;
      i1 = View.MeasureSpec.getSize(paramInt2);
      break;
      label500: i2 = 0;
      break label307;
      label506: paramInt1 = 8;
      break label332;
      paramInt2 = a(this.k, paramInt1, i2, 0);
      break label338;
      paramInt1 = -2147483648;
      break label368;
      paramInt2 = -2147483648;
      break label403;
      i3 = i5;
      break label423;
      setMeasuredDimension(i6, paramInt1);
      return;
      setMeasuredDimension(i6, i1);
      return;
    }
  }

  public void setContentHeight(int paramInt)
  {
    this.e = paramInt;
  }

  public void setCustomView(View paramView)
  {
    if (this.j != null)
      removeView(this.j);
    this.j = paramView;
    if ((paramView != null) && (this.k != null))
    {
      removeView(this.k);
      this.k = null;
    }
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    a();
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.g = paramCharSequence;
    a();
  }

  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != this.p)
      requestLayout();
    this.p = paramBoolean;
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.ActionBarContextView
 * JD-Core Version:    0.6.0
 */