package com.test.uimodule.demo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.uimodule.R;

/**
 * Created by rex.yau on 5/20/2015.
 */
public class DemoPageFragment extends Fragment {

    private int mIndex;
    private TextView mTextView;
    private ViewGroup mViewGroup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo_single_page, container, false);
        mViewGroup = (ViewGroup) view.findViewById(R.id.background);
        mTextView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mTextView.setText(mIndex + "");
        if (mIndex == 0) {
            mViewGroup.setBackgroundColor(getResources().getColor(android.R.color.black));
        } else if (mIndex == 1) {
            mViewGroup.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        } else if (mIndex == 2) {
            mViewGroup.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        }

    }

    public void setIndex(int index) {
        mIndex = index;
    }
}
