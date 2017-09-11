package com.example.rishabh.accountmanagement;

import android.app.Application;

import com.example.rishabh.accountmanagement.dependencies.AppComponent;
import com.example.rishabh.accountmanagement.dependencies.DaggerAppComponent;
import com.example.rishabh.accountmanagement.dependencies.modules.ContextModule;

import io.realm.Realm;

/**
 * Created by Rishabh on 10/09/17.
 */

public class AccountManagementApplication extends Application {

    public static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        getAppComponent();

    }

    private void getAppComponent() {
        if(mAppComponent == null){
            mAppComponent = DaggerAppComponent.builder()
                    .contextModule(new ContextModule(this))
                    .build();
        }
    }
}
