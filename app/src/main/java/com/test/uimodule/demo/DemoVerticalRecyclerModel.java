package com.test.uimodule.demo;

import android.support.v7.widget.RecyclerView;

import com.test.uimodule.sample.core.VerticalRecyclerModel;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoVerticalRecyclerModel implements VerticalRecyclerModel<DemoAdapter> {

    @Override
    public DemoAdapter provideAdapter() {
        return new DemoAdapter();
    }



}
