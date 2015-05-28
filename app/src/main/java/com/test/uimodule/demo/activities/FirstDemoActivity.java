package com.test.uimodule.demo.activities;

import com.test.uimodule.boilerplate.core.SinglePageModel;
import com.test.uimodule.boilerplate.SinglePageActivity;
import com.test.uimodule.demo.models.DemoPageModel;

/**
 * Created by rex.yau on 5/19/2015.
 */
public class FirstDemoActivity extends SinglePageActivity {

    @Override
    protected SinglePageModel getModel() {
        return new DemoPageModel();
    }
}
