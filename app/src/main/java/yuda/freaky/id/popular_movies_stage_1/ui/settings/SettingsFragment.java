package yuda.freaky.id.popular_movies_stage_1.ui.settings;

/**
 * Created by yuda on 15/05/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragment {


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(yuda.freaky.id.popular_movies_stage_1.R.xml.preferences);

    }
}
