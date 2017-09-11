package com.example.rishabh.accountmanagement.ui.splash;

import android.os.Bundle;

import com.example.rishabh.accountmanagement.AccountManagementApplication;
import com.example.rishabh.accountmanagement.R;
import com.example.rishabh.accountmanagement.data.DataManager;
import com.example.rishabh.accountmanagement.ui.baseactivity.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashView{

    @Inject
    SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AccountManagementApplication.mAppComponent.inject(this);
        presenter.attachView(this);

        System.out.println(presenter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
