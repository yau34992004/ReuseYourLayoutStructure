package com.test.uimodule.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.uimodule.R;
import com.test.uimodule.sample.core.VerticalRecyclerModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public abstract class VerticalRecyclerFragment<T extends RecyclerView.Adapter<?>> extends Fragment {

    private RecyclerView mRecyclerView;
    private T mAdapter;
    private VerticalRecyclerModel<T> mVerticalRecyclerModel;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVerticalRecyclerModel = provideModel();
        mAdapter = mVerticalRecyclerModel.provideAdapter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vertical_recycler, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mRecyclerView.setAdapter(null);
        mRecyclerView = null;
    }

    public abstract VerticalRecyclerModel<T> provideModel();

    public T getAdapter() {
        return mAdapter;
    }
}
