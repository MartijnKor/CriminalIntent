package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mkort on 10-12-2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
