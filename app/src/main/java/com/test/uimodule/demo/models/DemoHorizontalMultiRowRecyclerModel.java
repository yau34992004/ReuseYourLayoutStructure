package com.test.uimodule.demo.models;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.test.uimodule.boilerplate.core.RecyclerModel;
import com.test.uimodule.demo.DemoHorizontalAdapter;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoHorizontalMultiRowRecyclerModel implements RecyclerModel<DemoHorizontalAdapter> {


    @Override
    public DemoHorizontalAdapter provideAdapter() {
        return new DemoHorizontalAdapter();
    }

    @Override
    public LinearLayoutManager provideLayoutManager(Context context) {
        return new GridLayoutManager(context, 3, GridLayoutManager.HORIZONTAL, false);
    }


}
