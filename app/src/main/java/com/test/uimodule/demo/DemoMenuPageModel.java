package com.test.uimodule.demo;

import android.support.v4.app.Fragment;

import com.test.uimodule.demo.fragments.DemoMenuFragment;
import com.test.uimodule.demo.fragments.DemoPageFragment;
import com.test.uimodule.sample.core.LeftMenuModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoMenuPageModel implements LeftMenuModel {

    @Override
    public Fragment provideMenu() {
        return new DemoMenuFragment();
    }

    @Override
    public Fragment provideContent() {
        return new DemoPageFragment();
    }

    @Override
    public String provideMenuName() {
        return DemoMenuFragment.class.getName();
    }

    @Override
    public String provideContentName() {
        return DemoPageFragment.class.getName();
    }
}
