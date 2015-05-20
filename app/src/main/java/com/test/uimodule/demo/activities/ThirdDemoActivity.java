package com.test.uimodule.demo.activities;

import android.support.v4.app.Fragment;

import com.test.uimodule.demo.fragments.DemoPagerFragment;
import com.test.uimodule.sample.SinglePageActivity;
import com.test.uimodule.sample.core.SinglePageModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class ThirdDemoActivity extends SinglePageActivity {
    @Override
    protected SinglePageModel getModel() {
        return new SinglePageModel() {
            @Override
            public Fragment provide() {
                return new DemoPagerFragment();
            }

            @Override
            public String provideName() {
                return DemoPagerFragment.class.getName();
            }
        };
    }
}
