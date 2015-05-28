package com.test.uimodule.demo.models;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.test.uimodule.boilerplate.core.RecyclerModel;
import com.test.uimodule.demo.DemoAdapter;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoVerticalMultiColumnRecyclerModel implements RecyclerModel<DemoAdapter> {


    @Override
    public DemoAdapter provideAdapter() {
        return new DemoAdapter();
    }

    @Override
    public LinearLayoutManager provideLayoutManager(Context context) {
        return new GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false);
    }


}
