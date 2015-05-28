package com.test.uimodule.demo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.uimodule.R;
import com.test.uimodule.demo.activities.FifthDemoActivity;
import com.test.uimodule.demo.activities.FirstDemoActivity;
import com.test.uimodule.demo.activities.FourthDemoActivity;
import com.test.uimodule.demo.activities.SecondDemoPageActivity;
import com.test.uimodule.demo.activities.ThirdDemoActivity;

/**
 * Created by rex.yau on 5/28/2015.
 */
public class DemoIndexFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_index, container, false);
        view.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FirstDemoActivity.class));
            }
        });
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SecondDemoPageActivity.class));
            }
        });
        view.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ThirdDemoActivity.class));
            }
        });
        view.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FourthDemoActivity.class));
            }
        });
        view.findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FifthDemoActivity.class));
            }
        });
        return view;
    }
}
