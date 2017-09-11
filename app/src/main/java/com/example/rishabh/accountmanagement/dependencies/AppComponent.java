package com.example.rishabh.accountmanagement.dependencies;

import android.content.Context;

import com.example.rishabh.accountmanagement.data.local.DataBaseManager;
import com.example.rishabh.accountmanagement.data.local.SharedPreferencesManager;
import com.example.rishabh.accountmanagement.data.remote.AccountsApiService;
import com.example.rishabh.accountmanagement.dependencies.modules.ContextModule;
import com.example.rishabh.accountmanagement.dependencies.modules.NetworkModule;
import com.example.rishabh.accountmanagement.dependencies.modules.StorageModule;
import com.example.rishabh.accountmanagement.dependencies.scopes.ApplicationContext;
import com.example.rishabh.accountmanagement.ui.splash.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rishabh on 10/09/17.
 */

@Singleton
@Component(modules = {
        ContextModule.class,
        NetworkModule.class,
        StorageModule.class
})
public interface AppComponent {

    @ApplicationContext
    Context context();

    DataBaseManager databaseManager();

    SharedPreferencesManager sharedPreferencesManager();

    AccountsApiService accountsApiService();

    void inject(SplashActivity splashActivity);

}
