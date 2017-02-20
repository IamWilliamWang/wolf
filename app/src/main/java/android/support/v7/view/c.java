package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.b.j;
import android.view.LayoutInflater;

public class c extends ContextWrapper
{
  private int a;
  private Resources.Theme b;
  private LayoutInflater c;

  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }

  public c(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    this.b = paramTheme;
  }

  private void a()
  {
    if (this.b == null);
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
      {
        this.b = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null)
          this.b.setTo(localTheme);
      }
      a(this.b, this.a, bool);
      return;
    }
  }

  protected void a(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    paramTheme.applyStyle(paramInt, true);
  }

  public Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      return this.c;
    }
    return getBaseContext().getSystemService(paramString);
  }

  public Resources.Theme getTheme()
  {
    if (this.b != null)
      return this.b;
    if (this.a == 0)
      this.a = j.Theme_AppCompat_Light;
    a();
    return this.b;
  }

  public void setTheme(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      a();
    }
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     android.support.v7.view.c
 * JD-Core Version:    0.6.0
 */