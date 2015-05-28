package com.test.uimodule.demo.models;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

import com.test.uimodule.demo.DemoAdapter;
import com.test.uimodule.boilerplate.core.RecyclerModel;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoVerticalOneColumnRecyclerModel implements RecyclerModel<DemoAdapter> {


    @Override
    public DemoAdapter provideAdapter() {
        return new DemoAdapter();
    }

    @Override
    public LinearLayoutManager provideLayoutManager(Context context) {
        return new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
    }


}
