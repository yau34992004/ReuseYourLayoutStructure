package com.test.uimodule.boilerplate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.uimodule.R;
import com.test.uimodule.boilerplate.core.MultiTabModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public abstract class PagerFragment extends Fragment {

    private static final String TAG = "PagerFragment";

    MultiTabModel mMultiTabModel;

    ViewPager mViewPager;
    FragmentStatePagerAdapter mFragmentStatePagerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mMultiTabModel = provide();
        mFragmentStatePagerAdapter = mMultiTabModel.provideAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mFragmentStatePagerAdapter);
        return view;
    }

    protected abstract MultiTabModel provide();

}
