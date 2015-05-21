package com.test.uimodule.demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.test.uimodule.demo.fragments.DemoListFragment;
import com.test.uimodule.demo.fragments.DemoPageFragment;
import com.test.uimodule.sample.core.MultiTabModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPagerModel implements MultiTabModel {

    private final FragmentManager mFragmentManager;

    public DemoPagerModel(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
    }

    @Override
    public FragmentStatePagerAdapter provideAdapter() {
        return new FragmentStatePagerAdapter(mFragmentManager) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0 || position == 1) {
                    return new DemoListFragment();
                } else {
                    DemoPageFragment demoPageFragment = new DemoPageFragment();
                    demoPageFragment.setIndex(position);
                    return demoPageFragment;
                }

            }

            @Override
            public int getCount() {
                return 10;
            }
        };
    }
}
