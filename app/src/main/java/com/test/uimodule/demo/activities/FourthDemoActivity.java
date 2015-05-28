package com.test.uimodule.demo.activities;

import android.support.v4.app.Fragment;

import com.test.uimodule.boilerplate.SinglePageActivity;
import com.test.uimodule.boilerplate.core.SinglePageModel;
import com.test.uimodule.demo.fragments.DemoHorListFragment;
import com.test.uimodule.demo.fragments.DemoPagerFragment;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class FourthDemoActivity extends SinglePageActivity {
    @Override
    protected SinglePageModel getModel() {
        return new SinglePageModel() {
            @Override
            public Fragment provide() {
                return new DemoHorListFragment();
            }

            @Override
            public String provideName() {
                return DemoHorListFragment.class.getName();
            }
        };
    }
}
