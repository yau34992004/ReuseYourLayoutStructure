package com.test.uimodule.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.test.uimodule.R;
import com.test.uimodule.sample.core.LeftMenuModel;

/**
 * Created by rex.yau on 5/20/2015.
 */
public abstract class LeftMenuPageActivity extends FragmentActivity {


    private LeftMenuModel mLeftMenuModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_menu);

        mLeftMenuModel = getModel();

        Fragment fragmentContent = getSupportFragmentManager().findFragmentByTag(mLeftMenuModel.provideContentName());
        if (fragmentContent == null) {
            fragmentContent = mLeftMenuModel.provideContent();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_frame, fragmentContent, mLeftMenuModel.provideContentName())
                    .commit();
        }

        Fragment fragmentMenu = getSupportFragmentManager().findFragmentByTag(mLeftMenuModel.provideMenuName());
        if (fragmentMenu == null) {
            fragmentMenu = mLeftMenuModel.provideMenu();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.left_drawer, fragmentMenu, mLeftMenuModel.provideMenuName())
                    .commit();
        }

    }


    protected abstract LeftMenuModel getModel();

}
