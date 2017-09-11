package com.example.rishabh.accountmanagement.ui.splash;

import com.example.rishabh.accountmanagement.data.DataManager;
import com.example.rishabh.accountmanagement.ui.baseactivity.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Rishabh on 10/09/17.
 */

public class SplashPresenter extends BasePresenter {

    DataManager mDatamanager;

    @Inject
    SplashPresenter(DataManager mDatamanager){
        this.mDatamanager = mDatamanager;
    }
}
