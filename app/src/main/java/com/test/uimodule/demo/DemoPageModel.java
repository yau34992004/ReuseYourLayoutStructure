package com.test.uimodule.demo;

import android.support.v4.app.Fragment;

import com.test.uimodule.demo.fragments.DemoPageFragment;
import com.test.uimodule.sample.core.SinglePageModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPageModel implements SinglePageModel {
    @Override
    public Fragment provide() {
        return new DemoPageFragment();
    }

    @Override
    public String provideName() {
        return DemoPageFragment.class.getName();
    }
}
