package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class bo
{
  private Method a;
  private Method b;
  private Method c;
  private Method d;

  bo()
  {
    try
    {
      this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.a.setAccessible(true);
      try
      {
        label27: this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
        try
        {
          label50: this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
          this.c.setAccessible(true);
          try
          {
            label79: this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { Integer.TYPE, ResultReceiver.class });
            this.d.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            return;
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          break label79;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        break label50;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException4)
    {
      break label27;
    }
  }

  void a(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.a != null);
    try
    {
      this.a.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (java.lang.Exception paramAutoCompleteTextView)
    {
    }
  }

  void a(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
  {
    if (this.c != null);
    try
    {
      this.c.invoke(paramAutoCompleteTextView, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (java.lang.Exception paramAutoCompleteTextView)
    {
    }
  }

  void b(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.b != null);
    try
    {
      this.b.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (java.lang.Exception paramAutoCompleteTextView)
    {
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.widget.bo
 * JD-Core Version:    0.6.0
 */