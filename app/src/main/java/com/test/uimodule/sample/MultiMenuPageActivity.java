package com.test.uimodule.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.test.uimodule.R;
import com.test.uimodule.sample.core.MultiMenuModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public abstract class MultiMenuPageActivity extends FragmentActivity {


    private MultiMenuModel mMultiMenuModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_menu);

        mMultiMenuModel = getModel();

        Fragment fragmentContent = getSupportFragmentManager().findFragmentByTag(mMultiMenuModel.provideContentName());
        if (fragmentContent == null) {
            fragmentContent = mMultiMenuModel.provideContent();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_frame, fragmentContent, mMultiMenuModel.provideContentName())
                    .commit();
        }

        Fragment fragmentMenu = getSupportFragmentManager().findFragmentByTag(mMultiMenuModel.provideMenuName());
        if (fragmentMenu == null) {
            fragmentMenu = mMultiMenuModel.provideMenu();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.left_drawer, fragmentMenu, mMultiMenuModel.provideMenuName())
                    .commit();
        }

    }


    protected abstract MultiMenuModel getModel();

}
