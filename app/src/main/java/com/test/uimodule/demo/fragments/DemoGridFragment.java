package com.test.uimodule.demo.fragments;

import android.os.Bundle;

import com.test.uimodule.boilerplate.RecyclerFragment;
import com.test.uimodule.boilerplate.core.RecyclerModel;
import com.test.uimodule.demo.DemoAdapter;
import com.test.uimodule.demo.models.DemoVerticalMultiColumnRecyclerModel;

import java.util.ArrayList;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoGridFragment extends RecyclerFragment<DemoAdapter> {

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
    public RecyclerModel<DemoAdapter> provideModel() {
        return new DemoVerticalMultiColumnRecyclerModel();
    }
}
