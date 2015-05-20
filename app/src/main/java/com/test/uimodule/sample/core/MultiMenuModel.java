package com.test.uimodule.sample.core;

import android.support.v4.app.Fragment;

/**
 * Created by rex.yau on 5/20/2015.
 */
public interface MultiMenuModel {
    Fragment provideMenu();
    Fragment provideContent();

    String provideMenuName();
    String provideContentName();

}
