package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.bi;
import android.support.v4.h.m;
import android.support.v7.b.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class av extends ViewGroup
{
  private boolean a = true;
  private int b = -1;
  private int c = 0;
  private int d;
  private int e = 8388659;
  private int f;
  private float g;
  private boolean h;
  private int[] i;
  private int[] j;
  private Drawable k;
  private int l;
  private int m;
  private int n;
  private int o;

  public av(Context paramContext)
  {
    this(paramContext, null);
  }

  public av(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public av(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ca.a(paramContext, paramAttributeSet, k.LinearLayoutCompat, paramInt, 0);
    paramInt = paramContext.a(k.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0)
      setOrientation(paramInt);
    paramInt = paramContext.a(k.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0)
      setGravity(paramInt);
    boolean bool = paramContext.a(k.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool)
      setBaselineAligned(bool);
    this.g = paramContext.a(k.LinearLayoutCompat_android_weightSum, -1.0F);
    this.b = paramContext.a(k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.h = paramContext.a(k.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(paramContext.a(k.LinearLayoutCompat_divider));
    this.n = paramContext.a(k.LinearLayoutCompat_showDividers, 0);
    this.o = paramContext.e(k.LinearLayoutCompat_dividerPadding, 0);
    paramContext.a();
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }

  private void c(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int i1 = 0;
    while (i1 < paramInt1)
    {
      View localView = b(i1);
      if (localView.getVisibility() != 8)
      {
        aw localaw = (aw)localView.getLayoutParams();
        if (localaw.width == -1)
        {
          int i3 = localaw.height;
          localaw.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i2, 0, paramInt2, 0);
          localaw.height = i3;
        }
      }
      i1 += 1;
    }
  }

  private void d(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    int i1 = 0;
    while (i1 < paramInt1)
    {
      View localView = b(i1);
      if (localView.getVisibility() != 8)
      {
        aw localaw = (aw)localView.getLayoutParams();
        if (localaw.height == -1)
        {
          int i3 = localaw.width;
          localaw.width = localView.getMeasuredWidth();
          measureChildWithMargins(localView, paramInt2, 0, i2, 0);
          localaw.width = i3;
        }
      }
      i1 += 1;
    }
  }

  int a(View paramView)
  {
    return 0;
  }

  int a(View paramView, int paramInt)
  {
    return 0;
  }

  void a(int paramInt1, int paramInt2)
  {
    this.f = 0;
    int i2 = 0;
    int i1 = 0;
    int i6 = 0;
    int i9 = 0;
    int i3 = 1;
    float f1 = 0.0F;
    int i15 = getVirtualChildCount();
    int i16 = View.MeasureSpec.getMode(paramInt1);
    int i17 = View.MeasureSpec.getMode(paramInt2);
    int i8 = 0;
    int i5 = 0;
    int i18 = this.b;
    boolean bool = this.h;
    int i4 = -2147483648;
    int i7 = 0;
    View localView;
    int i10;
    int i11;
    label211: aw localaw;
    int i12;
    if (i7 < i15)
    {
      localView = b(i7);
      if (localView == null)
      {
        this.f += d(i7);
        i10 = i4;
        i11 = i5;
        i5 = i2;
        i4 = i1;
        i2 = i11;
        i1 = i10;
      }
      while (true)
      {
        i7 += 1;
        i10 = i4;
        i11 = i5;
        i4 = i1;
        i5 = i2;
        i1 = i10;
        i2 = i11;
        break;
        if (localView.getVisibility() != 8)
          break label211;
        i11 = i7 + a(localView, i7);
        i7 = i4;
        i10 = i5;
        i4 = i1;
        i5 = i2;
        i1 = i7;
        i2 = i10;
        i7 = i11;
      }
      if (c(i7))
        this.f += this.m;
      localaw = (aw)localView.getLayoutParams();
      f1 += localaw.g;
      if ((i17 == 1073741824) && (localaw.height == 0) && (localaw.g > 0.0F))
      {
        i5 = this.f;
        this.f = Math.max(i5, localaw.topMargin + i5 + localaw.bottomMargin);
        i11 = 1;
        i10 = i4;
        if ((i18 >= 0) && (i18 == i7 + 1))
          this.c = this.f;
        if ((i7 < i18) && (localaw.g > 0.0F))
          throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
      }
      else
      {
        i11 = -2147483648;
        i10 = i11;
        if (localaw.height == 0)
        {
          i10 = i11;
          if (localaw.g > 0.0F)
          {
            i10 = 0;
            localaw.height = -2;
          }
        }
        if (f1 == 0.0F);
        for (i11 = this.f; ; i11 = 0)
        {
          a(localView, i7, paramInt1, 0, paramInt2, i11);
          if (i10 != -2147483648)
            localaw.height = i10;
          i12 = localView.getMeasuredHeight();
          i10 = this.f;
          this.f = Math.max(i10, i10 + i12 + localaw.topMargin + localaw.bottomMargin + b(localView));
          i10 = i4;
          i11 = i5;
          if (!bool)
            break;
          i10 = Math.max(i12, i4);
          i11 = i5;
          break;
        }
      }
      i5 = 0;
      if ((i16 == 1073741824) || (localaw.width != -1))
        break label1671;
      i4 = 1;
      i5 = 1;
    }
    while (true)
    {
      i8 = localaw.leftMargin;
      i8 = localaw.rightMargin + i8;
      i12 = localView.getMeasuredWidth() + i8;
      int i14 = Math.max(i2, i12);
      int i13 = ch.a(i1, bi.f(localView));
      if ((i3 != 0) && (localaw.width == -1))
      {
        i3 = 1;
        label611: if (localaw.g <= 0.0F)
          break label700;
        if (i5 == 0)
          break label693;
      }
      while (true)
      {
        i2 = Math.max(i9, i8);
        i1 = i6;
        i7 += a(localView, i7);
        i9 = i2;
        i6 = i1;
        i5 = i14;
        i1 = i10;
        i10 = i13;
        i8 = i4;
        i2 = i11;
        i4 = i10;
        break;
        i3 = 0;
        break label611;
        label693: i8 = i12;
      }
      label700: if (i5 != 0);
      while (true)
      {
        i1 = Math.max(i6, i8);
        i2 = i9;
        break;
        i8 = i12;
      }
      if ((this.f > 0) && (c(i15)))
        this.f += this.m;
      if ((bool) && ((i17 == -2147483648) || (i17 == 0)))
      {
        this.f = 0;
        i7 = 0;
        if (i7 < i15)
        {
          localView = b(i7);
          if (localView == null)
            this.f += d(i7);
          while (true)
          {
            i7 += 1;
            break;
            if (localView.getVisibility() == 8)
            {
              i7 = a(localView, i7) + i7;
              continue;
            }
            localaw = (aw)localView.getLayoutParams();
            i10 = this.f;
            i11 = localaw.topMargin;
            this.f = Math.max(i10, localaw.bottomMargin + (i10 + i4 + i11) + b(localView));
          }
        }
      }
      this.f += getPaddingTop() + getPaddingBottom();
      i11 = bi.a(Math.max(this.f, getSuggestedMinimumHeight()), paramInt2, 0);
      i7 = (0xFFFFFF & i11) - this.f;
      if ((i5 != 0) || ((i7 != 0) && (f1 > 0.0F)))
      {
        if (this.g > 0.0F)
          f1 = this.g;
        this.f = 0;
        i4 = 0;
        i5 = i3;
        i3 = i6;
        i6 = i7;
        i7 = i4;
        i4 = i2;
        i2 = i5;
        i5 = i6;
        while (true)
          if (i7 < i15)
          {
            localView = b(i7);
            if (localView.getVisibility() == 8)
            {
              i6 = i3;
              i3 = i4;
              i4 = i6;
              i7 += 1;
              i6 = i3;
              i3 = i4;
              i4 = i6;
              continue;
            }
            localaw = (aw)localView.getLayoutParams();
            float f2 = localaw.g;
            if (f2 <= 0.0F)
              break label1656;
            i9 = (int)(i5 * f2 / f1);
            i12 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localaw.leftMargin + localaw.rightMargin, localaw.width);
            if ((localaw.height == 0) && (i17 == 1073741824))
              break;
            i10 = i9 + localView.getMeasuredHeight();
            i6 = i10;
            if (i10 < 0)
              i6 = 0;
            localView.measure(i12, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            i1 = ch.a(i1, bi.f(localView) & 0xFFFFFF00);
            i6 = i5 - i9;
            i5 = i1;
            f1 -= f2;
            i1 = i6;
          }
      }
      while (true)
      {
        i9 = localaw.leftMargin + localaw.rightMargin;
        i10 = localView.getMeasuredWidth() + i9;
        i6 = Math.max(i4, i10);
        if ((i16 != 1073741824) && (localaw.width == -1))
        {
          i4 = 1;
          label1285: if (i4 == 0)
            break label1427;
          i4 = i9;
          label1294: i4 = Math.max(i3, i4);
          if ((i2 == 0) || (localaw.width != -1))
            break label1434;
        }
        label1427: label1434: for (i2 = 1; ; i2 = 0)
        {
          i3 = this.f;
          i9 = localView.getMeasuredHeight();
          i10 = localaw.topMargin;
          this.f = Math.max(i3, localaw.bottomMargin + (i9 + i3 + i10) + b(localView));
          i3 = i6;
          i6 = i1;
          i1 = i5;
          i5 = i6;
          break;
          if (i9 > 0);
          for (i6 = i9; ; i6 = 0)
          {
            localView.measure(i12, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            break;
          }
          i4 = 0;
          break label1285;
          i4 = i10;
          break label1294;
        }
        this.f += getPaddingTop() + getPaddingBottom();
        i5 = i2;
        i2 = i3;
        i3 = i5;
        while (true)
        {
          if ((i3 == 0) && (i16 != 1073741824));
          while (true)
          {
            setMeasuredDimension(bi.a(Math.max(i2 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i1), i11);
            if (i8 != 0)
              c(i15, paramInt2);
            return;
            i6 = Math.max(i6, i9);
            if ((!bool) || (i17 == 1073741824))
              break;
            i5 = 0;
            if (i5 >= i15)
              break;
            localView = b(i5);
            if ((localView == null) || (localView.getVisibility() == 8));
            while (true)
            {
              i5 += 1;
              break;
              if (((aw)localView.getLayoutParams()).g <= 0.0F)
                continue;
              localView.measure(View.MeasureSpec.makeMeasureSpec(localView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            i2 = i4;
          }
          i4 = i6;
          i5 = i2;
          i2 = i4;
          i4 = i5;
        }
        label1656: i6 = i1;
        i1 = i5;
        i5 = i6;
      }
      label1671: i4 = i8;
    }
  }

  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft();
    int i2 = paramInt3 - paramInt1;
    int i3 = getPaddingRight();
    int i4 = getPaddingRight();
    int i5 = getVirtualChildCount();
    paramInt1 = this.e;
    int i6 = this.e;
    label83: View localView;
    switch (paramInt1 & 0x70)
    {
    default:
      paramInt1 = getPaddingTop();
      paramInt3 = 0;
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      if (paramInt1 < i5)
      {
        localView = b(paramInt1);
        if (localView != null)
          break;
        paramInt2 += d(paramInt1);
      }
    case 80:
    case 16:
    }
    while (true)
    {
      paramInt1 += 1;
      break label83;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.f;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.f) / 2;
      break;
      if (localView.getVisibility() != 8)
      {
        int i7 = localView.getMeasuredWidth();
        int i8 = localView.getMeasuredHeight();
        aw localaw = (aw)localView.getLayoutParams();
        paramInt4 = localaw.h;
        paramInt3 = paramInt4;
        if (paramInt4 < 0)
          paramInt3 = i6 & 0x800007;
        switch (m.a(paramInt3, bi.d(this)) & 0x7)
        {
        default:
          paramInt3 = i1 + localaw.leftMargin;
          label257: if (!c(paramInt1))
            break;
          paramInt2 = this.m + paramInt2;
        case 1:
        case 5:
        }
        while (true)
        {
          paramInt2 += localaw.topMargin;
          a(localView, paramInt3, paramInt2 + a(localView), i7, i8);
          paramInt2 += localaw.bottomMargin + i8 + b(localView);
          paramInt1 = a(localView, paramInt1) + paramInt1;
          break;
          paramInt3 = (i2 - i1 - i4 - i7) / 2 + i1 + localaw.leftMargin - localaw.rightMargin;
          break label257;
          paramInt3 = i2 - i3 - i7 - localaw.rightMargin;
          break label257;
          return;
        }
      }
    }
  }

  void a(Canvas paramCanvas)
  {
    int i2 = getVirtualChildCount();
    int i1 = 0;
    View localView;
    aw localaw;
    while (i1 < i2)
    {
      localView = b(i1);
      if ((localView != null) && (localView.getVisibility() != 8) && (c(i1)))
      {
        localaw = (aw)localView.getLayoutParams();
        a(paramCanvas, localView.getTop() - localaw.topMargin - this.m);
      }
      i1 += 1;
    }
    if (c(i2))
    {
      localView = b(i2 - 1);
      if (localView != null)
        break label124;
    }
    for (i1 = getHeight() - getPaddingBottom() - this.m; ; i1 = localaw.bottomMargin + i1)
    {
      a(paramCanvas, i1);
      return;
      label124: localaw = (aw)localView.getLayoutParams();
      i1 = localView.getBottom();
    }
  }

  void a(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, this.m + paramInt);
    this.k.draw(paramCanvas);
  }

  void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  int b(View paramView)
  {
    return 0;
  }

  public aw b(AttributeSet paramAttributeSet)
  {
    return new aw(getContext(), paramAttributeSet);
  }

  protected aw b(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new aw(paramLayoutParams);
  }

  View b(int paramInt)
  {
    return getChildAt(paramInt);
  }

  void b(int paramInt1, int paramInt2)
  {
    this.f = 0;
    int i3 = 0;
    int i2 = 0;
    int i6 = 0;
    int i8 = 0;
    int i1 = 1;
    float f1 = 0.0F;
    int i16 = getVirtualChildCount();
    int i18 = View.MeasureSpec.getMode(paramInt1);
    int i17 = View.MeasureSpec.getMode(paramInt2);
    int i7 = 0;
    int i5 = 0;
    if ((this.i == null) || (this.j == null))
    {
      this.i = new int[4];
      this.j = new int[4];
    }
    Object localObject = this.i;
    int[] arrayOfInt = this.j;
    localObject[3] = -1;
    localObject[2] = -1;
    localObject[1] = -1;
    localObject[0] = -1;
    arrayOfInt[3] = -1;
    arrayOfInt[2] = -1;
    arrayOfInt[1] = -1;
    arrayOfInt[0] = -1;
    boolean bool1 = this.a;
    boolean bool2 = this.h;
    int i12;
    int i4;
    int i9;
    label155: View localView;
    int i10;
    int i11;
    if (i18 == 1073741824)
    {
      i12 = 1;
      i4 = -2147483648;
      i9 = 0;
      if (i9 >= i16)
        break label986;
      localView = b(i9);
      if (localView != null)
        break label261;
      this.f += d(i9);
      i10 = i4;
      i11 = i5;
      i5 = i3;
      i4 = i2;
      i3 = i1;
      i2 = i11;
      i1 = i10;
    }
    label261: int i13;
    while (true)
    {
      i9 += 1;
      i10 = i4;
      i11 = i5;
      i4 = i1;
      i5 = i2;
      i1 = i3;
      i2 = i10;
      i3 = i11;
      break label155;
      i12 = 0;
      break;
      if (localView.getVisibility() != 8)
        break label331;
      i13 = i9 + a(localView, i9);
      i9 = i4;
      i11 = i5;
      i4 = i1;
      i5 = i2;
      i10 = i3;
      i1 = i9;
      i2 = i11;
      i9 = i13;
      i3 = i4;
      i4 = i5;
      i5 = i10;
    }
    label331: if (c(i9))
      this.f += this.l;
    aw localaw = (aw)localView.getLayoutParams();
    f1 += localaw.g;
    if ((i18 == 1073741824) && (localaw.width == 0) && (localaw.g > 0.0F))
      if (i12 != 0)
      {
        this.f += localaw.leftMargin + localaw.rightMargin;
        label421: if (!bool1)
          break label727;
        i10 = View.MeasureSpec.makeMeasureSpec(0, 0);
        localView.measure(i10, i10);
        i11 = i5;
        i10 = i4;
        label450: i5 = 0;
        if ((i17 == 1073741824) || (localaw.height != -1))
          break label2365;
        i4 = 1;
        i5 = 1;
      }
    while (true)
    {
      i7 = localaw.topMargin;
      i7 = localaw.bottomMargin + i7;
      i13 = localView.getMeasuredHeight() + i7;
      int i14 = ch.a(i2, bi.f(localView));
      if (bool1)
      {
        i15 = localView.getBaseline();
        if (i15 != -1)
        {
          if (localaw.h >= 0)
            break label935;
          i2 = this.e;
          label546: i2 = ((i2 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
          localObject[i2] = Math.max(localObject[i2], i15);
          arrayOfInt[i2] = Math.max(arrayOfInt[i2], i13 - i15);
        }
      }
      int i15 = Math.max(i3, i13);
      if ((i1 != 0) && (localaw.height == -1))
      {
        i3 = 1;
        label619: if (localaw.g <= 0.0F)
          break label958;
        if (i5 == 0)
          break label951;
      }
      while (true)
      {
        i2 = Math.max(i8, i7);
        i1 = i6;
        i9 += a(localView, i9);
        i8 = i2;
        i6 = i1;
        i5 = i15;
        i1 = i10;
        i10 = i14;
        i7 = i4;
        i2 = i11;
        i4 = i10;
        break;
        i10 = this.f;
        this.f = Math.max(i10, localaw.leftMargin + i10 + localaw.rightMargin);
        break label421;
        label727: i11 = 1;
        i10 = i4;
        break label450;
        i11 = -2147483648;
        i10 = i11;
        if (localaw.width == 0)
        {
          i10 = i11;
          if (localaw.g > 0.0F)
          {
            i10 = 0;
            localaw.width = -2;
          }
        }
        if (f1 == 0.0F)
        {
          i11 = this.f;
          label789: a(localView, i9, paramInt1, i11, paramInt2, 0);
          if (i10 != -2147483648)
            localaw.width = i10;
          i13 = localView.getMeasuredWidth();
          if (i12 == 0)
            break label893;
          this.f += localaw.leftMargin + i13 + localaw.rightMargin + b(localView);
        }
        while (true)
        {
          i10 = i4;
          i11 = i5;
          if (!bool2)
            break;
          i10 = Math.max(i13, i4);
          i11 = i5;
          break;
          i11 = 0;
          break label789;
          label893: i10 = this.f;
          this.f = Math.max(i10, i10 + i13 + localaw.leftMargin + localaw.rightMargin + b(localView));
        }
        label935: i2 = localaw.h;
        break label546;
        i3 = 0;
        break label619;
        label951: i7 = i13;
      }
      label958: if (i5 != 0);
      while (true)
      {
        i1 = Math.max(i6, i7);
        i2 = i8;
        break;
        i7 = i13;
      }
      label986: if ((this.f > 0) && (c(i16)))
        this.f += this.l;
      if ((localObject[1] != -1) || (localObject[0] != -1) || (localObject[2] != -1) || (localObject[3] != -1));
      for (i9 = Math.max(i3, Math.max(localObject[3], Math.max(localObject[0], Math.max(localObject[1], localObject[2]))) + Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(arrayOfInt[1], arrayOfInt[2])))); ; i9 = i3)
      {
        if ((bool2) && ((i18 == -2147483648) || (i18 == 0)))
        {
          this.f = 0;
          i3 = 0;
          if (i3 < i16)
          {
            localView = b(i3);
            if (localView == null)
              this.f += d(i3);
            while (true)
            {
              i3 += 1;
              break;
              if (localView.getVisibility() == 8)
              {
                i3 = a(localView, i3) + i3;
                continue;
              }
              localaw = (aw)localView.getLayoutParams();
              if (i12 != 0)
              {
                i10 = this.f;
                i11 = localaw.leftMargin;
                this.f = (localaw.rightMargin + (i11 + i4) + b(localView) + i10);
                continue;
              }
              i10 = this.f;
              i11 = localaw.leftMargin;
              this.f = Math.max(i10, localaw.rightMargin + (i10 + i4 + i11) + b(localView));
            }
          }
        }
        this.f += getPaddingLeft() + getPaddingRight();
        i13 = bi.a(Math.max(this.f, getSuggestedMinimumWidth()), paramInt1, 0);
        i3 = (0xFFFFFF & i13) - this.f;
        if ((i5 != 0) || ((i3 != 0) && (f1 > 0.0F)))
        {
          if (this.g > 0.0F)
            f1 = this.g;
          localObject[3] = -1;
          localObject[2] = -1;
          localObject[1] = -1;
          localObject[0] = -1;
          arrayOfInt[3] = -1;
          arrayOfInt[2] = -1;
          arrayOfInt[1] = -1;
          arrayOfInt[0] = -1;
          this.f = 0;
          i9 = 0;
          i8 = i6;
          i5 = i2;
          i4 = i3;
          i3 = -1;
          i6 = i9;
          i2 = i8;
          if (i6 < i16)
          {
            localView = b(i6);
            if (localView == null)
              break label2335;
            if (localView.getVisibility() == 8)
            {
              i8 = i4;
              i4 = i3;
              i3 = i2;
              i2 = i1;
              i1 = i8;
            }
          }
        }
        while (true)
        {
          i8 = i6 + 1;
          i6 = i4;
          i4 = i1;
          i1 = i2;
          i2 = i3;
          i3 = i6;
          i6 = i8;
          break;
          localaw = (aw)localView.getLayoutParams();
          float f2 = localaw.g;
          if (f2 > 0.0F)
          {
            i9 = (int)(i4 * f2 / f1);
            i8 = i4 - i9;
            i10 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localaw.topMargin + localaw.bottomMargin, localaw.height);
            if ((localaw.width != 0) || (i18 != 1073741824))
            {
              i9 += localView.getMeasuredWidth();
              i4 = i9;
              if (i9 < 0)
                i4 = 0;
              localView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i10);
              i5 = ch.a(i5, bi.f(localView) & 0xFF000000);
              f1 -= f2;
              i4 = i8;
            }
          }
          while (true)
          {
            if (i12 != 0)
            {
              this.f += localView.getMeasuredWidth() + localaw.leftMargin + localaw.rightMargin + b(localView);
              label1722: if ((i17 == 1073741824) || (localaw.height != -1))
                break label1979;
              i8 = 1;
              label1741: i11 = localaw.topMargin + localaw.bottomMargin;
              i10 = localView.getMeasuredHeight() + i11;
              i9 = Math.max(i3, i10);
              if (i8 == 0)
                break label1985;
              i3 = i11;
              label1782: i3 = Math.max(i2, i3);
              if ((i1 == 0) || (localaw.height != -1))
                break label1992;
              i1 = 1;
              label1808: if (bool1)
              {
                i8 = localView.getBaseline();
                if (i8 != -1)
                  if (localaw.h >= 0)
                    break label1998;
              }
            }
            label1979: label1985: label1992: label1998: for (i2 = this.e; ; i2 = localaw.h)
            {
              i2 = ((i2 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject[i2] = Math.max(localObject[i2], i8);
              arrayOfInt[i2] = Math.max(arrayOfInt[i2], i10 - i8);
              i2 = i1;
              i1 = i4;
              i4 = i9;
              break;
              if (i9 > 0);
              for (i4 = i9; ; i4 = 0)
              {
                localView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i10);
                break;
              }
              i8 = this.f;
              this.f = Math.max(i8, localView.getMeasuredWidth() + i8 + localaw.leftMargin + localaw.rightMargin + b(localView));
              break label1722;
              i8 = 0;
              break label1741;
              i3 = i10;
              break label1782;
              i1 = 0;
              break label1808;
            }
            this.f += getPaddingLeft() + getPaddingRight();
            if ((localObject[1] == -1) && (localObject[0] == -1) && (localObject[2] == -1))
            {
              i4 = i3;
              if (localObject[3] == -1);
            }
            else
            {
              i4 = Math.max(i3, Math.max(localObject[3], Math.max(localObject[0], Math.max(localObject[1], localObject[2]))) + Math.max(arrayOfInt[3], Math.max(arrayOfInt[0], Math.max(arrayOfInt[1], arrayOfInt[2]))));
            }
            i3 = i1;
            i1 = i5;
            i5 = i3;
            i3 = i2;
            while (true)
            {
              if ((i5 == 0) && (i17 != 1073741824));
              while (true)
              {
                setMeasuredDimension(0xFF000000 & i1 | i13, bi.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, i1 << 16));
                if (i7 != 0)
                  d(i16, paramInt1);
                return;
                i5 = Math.max(i6, i8);
                if ((!bool2) || (i18 == 1073741824))
                  break;
                i3 = 0;
                if (i3 >= i16)
                  break;
                localObject = b(i3);
                if ((localObject == null) || (((View)localObject).getVisibility() == 8));
                while (true)
                {
                  i3 += 1;
                  break;
                  if (((aw)((View)localObject).getLayoutParams()).g <= 0.0F)
                    continue;
                  ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject).getMeasuredHeight(), 1073741824));
                }
                i3 = i4;
              }
              i3 = i5;
              i4 = i9;
              i5 = i1;
              i1 = i2;
            }
          }
          label2335: i8 = i4;
          i4 = i3;
          i3 = i2;
          i2 = i1;
          i1 = i8;
        }
      }
      label2365: i4 = i7;
    }
  }

  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = ch.a(this);
    int i3 = getPaddingTop();
    int i5 = paramInt4 - paramInt2;
    int i6 = getPaddingBottom();
    int i7 = getPaddingBottom();
    int i8 = getVirtualChildCount();
    paramInt2 = this.e;
    int i9 = this.e;
    boolean bool2 = this.a;
    int[] arrayOfInt1 = this.i;
    int[] arrayOfInt2 = this.j;
    switch (m.a(paramInt2 & 0x800007, bi.d(this)))
    {
    default:
      paramInt1 = getPaddingLeft();
      if (!bool1)
        break;
      paramInt4 = -1;
    case 5:
    case 1:
    }
    for (int i1 = i8 - 1; ; i1 = 0)
    {
      paramInt2 = 0;
      paramInt3 = paramInt1;
      label127: int i10;
      View localView;
      if (paramInt2 < i8)
      {
        i10 = i1 + paramInt4 * paramInt2;
        localView = b(i10);
        if (localView == null)
        {
          paramInt3 += d(i10);
          paramInt1 = paramInt2;
        }
      }
      while (true)
      {
        paramInt2 = paramInt1 + 1;
        break label127;
        paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.f;
        break;
        paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.f) / 2;
        break;
        if (localView.getVisibility() != 8)
        {
          int i11 = localView.getMeasuredWidth();
          int i12 = localView.getMeasuredHeight();
          aw localaw = (aw)localView.getLayoutParams();
          if ((bool2) && (localaw.height != -1));
          for (int i2 = localView.getBaseline(); ; i2 = -1)
          {
            int i4 = localaw.h;
            paramInt1 = i4;
            if (i4 < 0)
              paramInt1 = i9 & 0x70;
            switch (paramInt1 & 0x70)
            {
            default:
              paramInt1 = i3;
              label327: if (!c(i10))
                break;
              paramInt3 = this.l + paramInt3;
            case 48:
            case 16:
            case 80:
            }
            while (true)
            {
              paramInt3 += localaw.leftMargin;
              a(localView, paramInt3 + a(localView), paramInt1, i11, i12);
              paramInt3 += localaw.rightMargin + i11 + b(localView);
              paramInt1 = a(localView, i10) + paramInt2;
              break;
              i4 = i3 + localaw.topMargin;
              paramInt1 = i4;
              if (i2 == -1)
                break label327;
              paramInt1 = i4 + (arrayOfInt1[1] - i2);
              break label327;
              paramInt1 = (i5 - i3 - i7 - i12) / 2 + i3 + localaw.topMargin - localaw.bottomMargin;
              break label327;
              i4 = i5 - i6 - i12 - localaw.bottomMargin;
              paramInt1 = i4;
              if (i2 == -1)
                break label327;
              paramInt1 = localView.getMeasuredHeight();
              paramInt1 = i4 - (arrayOfInt2[2] - (paramInt1 - i2));
              break label327;
              return;
            }
          }
        }
        paramInt1 = paramInt2;
      }
      paramInt4 = 1;
    }
  }

  void b(Canvas paramCanvas)
  {
    int i3 = getVirtualChildCount();
    boolean bool = ch.a(this);
    int i1 = 0;
    View localView;
    aw localaw;
    if (i1 < i3)
    {
      localView = b(i1);
      if ((localView != null) && (localView.getVisibility() != 8) && (c(i1)))
      {
        localaw = (aw)localView.getLayoutParams();
        if (!bool)
          break label92;
        i2 = localView.getRight();
      }
      label92: for (int i2 = localaw.rightMargin + i2; ; i2 = localView.getLeft() - localaw.leftMargin - this.l)
      {
        b(paramCanvas, i2);
        i1 += 1;
        break;
      }
    }
    if (c(i3))
    {
      localView = b(i3 - 1);
      if (localView != null)
        break label171;
      if (!bool)
        break label153;
      i1 = getPaddingLeft();
    }
    while (true)
    {
      b(paramCanvas, i1);
      return;
      label153: i1 = getWidth() - getPaddingRight() - this.l;
      continue;
      label171: localaw = (aw)localView.getLayoutParams();
      if (bool)
      {
        i1 = localView.getLeft() - localaw.leftMargin - this.l;
        continue;
      }
      i1 = localView.getRight();
      i1 = localaw.rightMargin + i1;
    }
  }

  void b(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(paramInt, getPaddingTop() + this.o, this.l + paramInt, getHeight() - getPaddingBottom() - this.o);
    this.k.draw(paramCanvas);
  }

  protected boolean c(int paramInt)
  {
    if (paramInt == 0)
      if ((this.n & 0x1) == 0);
    while (true)
    {
      return true;
      return false;
      if (paramInt != getChildCount())
        break;
      if ((this.n & 0x4) == 0)
        return false;
    }
    if ((this.n & 0x2) != 0)
    {
      paramInt -= 1;
      while (true)
      {
        if (paramInt < 0)
          break label75;
        if (getChildAt(paramInt).getVisibility() != 8)
          break;
        paramInt -= 1;
      }
    }
    return false;
    label75: return false;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof aw;
  }

  int d(int paramInt)
  {
    return 0;
  }

  protected aw g()
  {
    if (this.d == 0)
      return new aw(-2, -2);
    if (this.d == 1)
      return new aw(-1, -2);
    return null;
  }

  public int getBaseline()
  {
    int i1 = -1;
    if (this.b < 0)
      i1 = super.getBaseline();
    View localView;
    int i2;
    while (true)
    {
      return i1;
      if (getChildCount() <= this.b)
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      localView = getChildAt(this.b);
      i2 = localView.getBaseline();
      if (i2 != -1)
        break;
      if (this.b == 0)
        continue;
      throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    i1 = this.c;
    if (this.d == 1)
    {
      int i3 = this.e & 0x70;
      if (i3 != 48)
        switch (i3)
        {
        default:
        case 80:
        case 16:
        }
    }
    while (true)
    {
      return ((aw)localView.getLayoutParams()).topMargin + i1 + i2;
      i1 = getBottom() - getTop() - getPaddingBottom() - this.f;
      continue;
      i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.f) / 2;
    }
  }

  public int getBaselineAlignedChildIndex()
  {
    return this.b;
  }

  public Drawable getDividerDrawable()
  {
    return this.k;
  }

  public int getDividerPadding()
  {
    return this.o;
  }

  public int getDividerWidth()
  {
    return this.l;
  }

  public int getOrientation()
  {
    return this.d;
  }

  public int getShowDividers()
  {
    return this.n;
  }

  int getVirtualChildCount()
  {
    return getChildCount();
  }

  public float getWeightSum()
  {
    return this.g;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.k == null)
      return;
    if (this.d == 1)
    {
      a(paramCanvas);
      return;
    }
    b(paramCanvas);
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(av.class.getName());
    }
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(av.class.getName());
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.d == 1)
    {
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    b(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.d == 1)
    {
      a(paramInt1, paramInt2);
      return;
    }
    b(paramInt1, paramInt2);
  }

  public void setBaselineAligned(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getChildCount()))
      throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    this.b = paramInt;
  }

  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == this.k)
      return;
    this.k = paramDrawable;
    if (paramDrawable != null)
      this.l = paramDrawable.getIntrinsicWidth();
    for (this.m = paramDrawable.getIntrinsicHeight(); ; this.m = 0)
    {
      if (paramDrawable == null)
        bool = true;
      setWillNotDraw(bool);
      requestLayout();
      return;
      this.l = 0;
    }
  }

  public void setDividerPadding(int paramInt)
  {
    this.o = paramInt;
  }

  public void setGravity(int paramInt)
  {
    if (this.e != paramInt)
    {
      if ((0x800007 & paramInt) != 0)
        break label46;
      paramInt = 0x800003 | paramInt;
    }
    label46: 
    while (true)
    {
      int i1 = paramInt;
      if ((paramInt & 0x70) == 0)
        i1 = paramInt | 0x30;
      this.e = i1;
      requestLayout();
      return;
    }
  }

  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 8388615;
    if ((this.e & 0x800007) != paramInt)
    {
      this.e = (paramInt | this.e & 0xFF7FFFF8);
      requestLayout();
    }
  }

  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public void setOrientation(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      requestLayout();
    }
  }

  public void setShowDividers(int paramInt)
  {
    if (paramInt != this.n)
      requestLayout();
    this.n = paramInt;
  }

  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 112;
    if ((this.e & 0x70) != paramInt)
    {
      this.e = (paramInt | this.e & 0xFFFFFF8F);
      requestLayout();
    }
  }

  public void setWeightSum(float paramFloat)
  {
    this.g = Math.max(0.0F, paramFloat);
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.av
 * JD-Core Version:    0.6.0
 */