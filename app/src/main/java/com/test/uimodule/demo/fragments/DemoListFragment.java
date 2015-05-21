package com.test.uimodule.demo.fragments;

import android.os.Bundle;

import com.test.uimodule.demo.DemoAdapter;
import com.test.uimodule.demo.DemoVerticalRecyclerModel;
import com.test.uimodule.sample.VerticalRecyclerFragment;
import com.test.uimodule.sample.core.VerticalRecyclerModel;

import java.util.ArrayList;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoListFragment extends VerticalRecyclerFragment<DemoAdapter> {

    private ArrayList<String> mArrayList;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mArrayList.add(i + "");
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        DemoAdapter demoAdapter = getAdapter();
        if (demoAdapter.getItemCount() == 0) {
            demoAdapter.setArrayList(mArrayList);
        }

    }

    @Override
    public VerticalRecyclerModel<DemoAdapter> provideModel() {
        return new DemoVerticalRecyclerModel();
    }
}
