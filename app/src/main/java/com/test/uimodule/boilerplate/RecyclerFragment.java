package com.test.uimodule.boilerplate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.uimodule.R;
import com.test.uimodule.boilerplate.core.RecyclerModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public abstract class RecyclerFragment<T extends RecyclerView.Adapter<?>> extends Fragment {

    protected RecyclerView mRecyclerView;
    protected T mAdapter;
    protected RecyclerModel<T> mRecyclerModel;
    protected RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRecyclerModel = provideModel();
        mAdapter = mRecyclerModel.provideAdapter();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResourcesId(), container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        mLayoutManager = mRecyclerModel.provideLayoutManager(container.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

    protected int getLayoutResourcesId() {
        return R.layout.fragment_vertical_recycler;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mRecyclerView.setAdapter(null);
        mRecyclerView = null;
    }

    public abstract RecyclerModel<T> provideModel();

    public T getAdapter() {
        return mAdapter;
    }
}
