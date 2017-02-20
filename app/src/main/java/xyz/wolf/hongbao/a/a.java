package xyz.wolf.hongbao.a;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

public class a extends PreferenceFragment
{
  private void a()
  {
    Preference localPreference = findPreference("pref_comment_switch");
    if (Build.VERSION.SDK_INT < 21)
      localPreference.setEnabled(false);
    localPreference = findPreference("pref_comment_words");
    String str1 = getResources().getString(2131230743);
    String str2 = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("pref_comment_words", "");
    if (str2.length() > 0)
      localPreference.setSummary(str1 + ":" + str2);
    localPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
      {
        String str = a.this.getResources().getString(2131230743);
        if ((paramObject != null) && (paramObject.toString().length() > 0))
          paramPreference.setSummary(str + ":" + paramObject.toString());
        while (true)
        {
          return true;
          paramPreference.setSummary(str);
        }
      }
    });
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131099649);
    a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.a.a
 * JD-Core Version:    0.6.0
 */