package com.test.uimodule.demo.models;

import android.support.v4.app.Fragment;

import com.test.uimodule.boilerplate.core.SinglePageModel;
import com.test.uimodule.demo.fragments.DemoGridFragment;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPageModel implements SinglePageModel {
    @Override
    public Fragment provide() {
        return new DemoGridFragment();
    }

    @Override
    public String provideName() {
        return DemoGridFragment.class.getName();
    }
}
