package com.test.uimodule.boilerplate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.test.uimodule.R;
import com.test.uimodule.boilerplate.core.SinglePageModel;

/**
 * Created by rex.yau on 5/19/2015.
 */
public abstract class SinglePageActivity extends FragmentActivity {

    private SinglePageModel mSinglePageModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_page);

        mSinglePageModel = getModel();

        Fragment fragment = getSupportFragmentManager().findFragmentByTag(mSinglePageModel.provideName());
        if (fragment == null) {
            fragment = mSinglePageModel.provide();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentContainerId, fragment, mSinglePageModel.provideName())
                    .commit();
        }

    }

    protected abstract SinglePageModel getModel();

}
