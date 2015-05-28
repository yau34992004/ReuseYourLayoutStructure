package com.test.uimodule.boilerplate.core;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by rex.yau on 5/21/2015.
 */
public interface RecyclerModel<T> {
    T provideAdapter();

    RecyclerView.LayoutManager provideLayoutManager(Context context);
}
