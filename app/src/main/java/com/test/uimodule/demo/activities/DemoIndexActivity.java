package com.test.uimodule.demo.activities;

import android.support.v4.app.Fragment;

import com.test.uimodule.boilerplate.SinglePageActivity;
import com.test.uimodule.boilerplate.core.SinglePageModel;
import com.test.uimodule.demo.fragments.DemoIndexFragment;

/**
 * Created by rex.yau on 5/28/2015.
 */
public class DemoIndexActivity extends SinglePageActivity {
    @Override
    protected SinglePageModel getModel() {
        return new SinglePageModel() {
            @Override
            public Fragment provide() {
                return new DemoIndexFragment();
            }

            @Override
            public String provideName() {
                return DemoIndexFragment.class.getName();
            }
        };
    }
}
