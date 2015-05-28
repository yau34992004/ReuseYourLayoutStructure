package com.test.uimodule.boilerplate.core;

import android.support.v4.app.Fragment;

/**
 * Created by rex.yau on 5/20/2015.
 */
public interface LeftMenuModel {
    Fragment provideMenu();
    Fragment provideContent();

    String provideMenuName();
    String provideContentName();

}
