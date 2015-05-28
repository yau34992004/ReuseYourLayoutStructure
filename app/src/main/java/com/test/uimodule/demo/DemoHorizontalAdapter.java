package com.test.uimodule.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.uimodule.R;

import java.util.ArrayList;

/**
 * Created by rex.yau on 5/21/2015.
 */
public class DemoHorizontalAdapter extends RecyclerView.Adapter<DemoViewHolder> {

    private ArrayList<String> mArrayList;

    public DemoHorizontalAdapter() {
        mArrayList = new ArrayList<>();
    }

    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.viewholder_horizontal_demo, viewGroup, false);
        DemoViewHolder demoViewHolder = new DemoViewHolder(view);
        return demoViewHolder;
    }

    @Override
    public void onBindViewHolder(DemoViewHolder demoViewHolder, int i) {
        demoViewHolder.setTitle(i + "");
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public void setArrayList(ArrayList<String> arrayList) {

        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("youShouldNotSetEmptyArrayList");
        }

        mArrayList.addAll(arrayList);
    }
}
