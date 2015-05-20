package com.test.uimodule.demo.activities;

import com.test.uimodule.sample.MultiMenuPageActivity;
import com.test.uimodule.sample.core.MultiMenuModel;
import com.test.uimodule.demo.MultipleMenuPageModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class SecondDemoPageActivity extends MultiMenuPageActivity {

    @Override
    protected MultiMenuModel getModel() {
        return new MultipleMenuPageModel();
    }
}
