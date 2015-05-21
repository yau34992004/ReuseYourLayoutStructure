package com.test.uimodule.demo.activities;

import com.test.uimodule.sample.LeftMenuPageActivity;
import com.test.uimodule.sample.core.LeftMenuModel;
import com.test.uimodule.demo.DemoMenuPageModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class SecondDemoPageActivity extends LeftMenuPageActivity {

    @Override
    protected LeftMenuModel getModel() {
        return new DemoMenuPageModel();
    }
}
