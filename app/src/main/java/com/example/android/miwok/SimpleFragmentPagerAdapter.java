package com.example.android.miwok;

/**
 * Created by jane on 16-10-29.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * SimpleFragmentPagerAdaper is a FragmentPagerAdapter that can provide the layout for each list item based on a data source which is a list of Word objects.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new SimpleFragmentPagerAdapter object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter across swipes.
     */
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    /**
     * @param position
     * @return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else
            return new PhrasesFragment();
    }

    /**
     * @return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}
