package com.test.uimodule.demo.activities;

import android.support.v4.app.Fragment;

import com.test.uimodule.boilerplate.SinglePageActivity;
import com.test.uimodule.boilerplate.core.SinglePageModel;
import com.test.uimodule.demo.fragments.DemoHorGridFragment;

/**
 * Created by rex.yau on 5/28/2015.
 */
public class FifthDemoActivity extends SinglePageActivity {
    @Override
    protected SinglePageModel getModel() {
        return new SinglePageModel() {
            @Override
            public Fragment provide() {
                return new DemoHorGridFragment();
            }

            @Override
            public String provideName() {
                return DemoHorGridFragment.class.getName();
            }
        };
    }
}
