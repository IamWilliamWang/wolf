package xyz.wolf.hongbao.a;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import xyz.wolf.hongbao.activities.a;
import xyz.wolf.hongbao.b.e;

public class b extends PreferenceFragment
{
  private void a()
  {
    findPreference("pref_etc_check_update").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public boolean onPreferenceClick(Preference paramPreference)
      {
        new e(b.this.getActivity().getApplicationContext(), true).a();
        return false;
      }
    });
    findPreference("pref_etc_issue").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public boolean onPreferenceClick(Preference paramPreference)
      {
        paramPreference = new Intent(b.this.getActivity(), a.class);
        paramPreference.putExtra("title", "GitHub Issues");
        paramPreference.putExtra("url", b.this.getString(2131230765));
        paramPreference.setFlags(268435456);
        b.this.startActivity(paramPreference);
        return false;
      }
    });
    Preference localPreference = findPreference("pref_watch_exclude_words");
    String str1 = getResources().getString(2131230744);
    String str2 = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("pref_watch_exclude_words", "");
    if (str2.length() > 0)
      localPreference.setSummary(str1 + ":" + str2);
    localPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
    {
      public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
      {
        String str = b.this.getResources().getString(2131230744);
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
    addPreferencesFromResource(2131099650);
    a();
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     xyz.wolf.hongbao.a.b
 * JD-Core Version:    0.6.0
 */