package com.test.uimodule.demo.fragments;

import com.test.uimodule.sample.PagerFragment;
import com.test.uimodule.sample.core.MultiTabModel;
import com.test.uimodule.demo.DemoPagerModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPagerFragment extends PagerFragment {

    @Override
    protected MultiTabModel provide() {
        return new DemoPagerModel(getChildFragmentManager());
    }
}
