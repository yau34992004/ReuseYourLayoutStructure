package com.test.uimodule.demo.fragments;

import com.test.uimodule.boilerplate.PagerFragment;
import com.test.uimodule.boilerplate.core.MultiTabModel;
import com.test.uimodule.demo.models.DemoPagerModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPagerFragment extends PagerFragment {

    @Override
    protected MultiTabModel provide() {
        return new DemoPagerModel();
    }
}
