package com.test.uimodule.boilerplate.core;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by rex.yau on 5/20/2015.
 */
public interface MultiTabModel {
    FragmentStatePagerAdapter provideAdapter(FragmentManager fragmentManager);

}
