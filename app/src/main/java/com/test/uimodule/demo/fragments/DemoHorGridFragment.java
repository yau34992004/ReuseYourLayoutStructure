package com.test.uimodule.demo.fragments;

import android.os.Bundle;

import com.test.uimodule.boilerplate.RecyclerFragment;
import com.test.uimodule.boilerplate.core.RecyclerModel;
import com.test.uimodule.demo.DemoAdapter;
import com.test.uimodule.demo.DemoHorizontalAdapter;
import com.test.uimodule.demo.models.DemoHorizontalMultiRowRecyclerModel;
import com.test.uimodule.demo.models.DemoHorizontalOneRowRecyclerModel;

import java.util.ArrayList;

/**
 * Created by rex.yau on 5/28/2015.
 */
public class DemoHorGridFragment extends RecyclerFragment<DemoHorizontalAdapter> {

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

        DemoHorizontalAdapter demoAdapter = getAdapter();
        if (demoAdapter.getItemCount() == 0) {
            demoAdapter.setArrayList(mArrayList);
        }

    }

    @Override
    public RecyclerModel<DemoHorizontalAdapter> provideModel() {
        return new DemoHorizontalMultiRowRecyclerModel();
    }
}
