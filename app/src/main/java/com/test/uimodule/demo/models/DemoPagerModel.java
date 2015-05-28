package com.test.uimodule.demo.models;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.test.uimodule.boilerplate.core.MultiTabModel;
import com.test.uimodule.demo.fragments.DemoGridFragment;
import com.test.uimodule.demo.fragments.DemoListFragment;
import com.test.uimodule.demo.fragments.DemoPageFragment;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPagerModel implements MultiTabModel {

    public DemoPagerModel() {
    }

    @Override
    public FragmentStatePagerAdapter provideAdapter(FragmentManager fragmentManager) {
        return new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0) {
                    return new DemoGridFragment();
                } else if (position == 1) {
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
