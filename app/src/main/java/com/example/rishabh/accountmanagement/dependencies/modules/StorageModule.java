package com.example.rishabh.accountmanagement.dependencies.modules;

import android.content.Context;

import com.example.rishabh.accountmanagement.data.local.DataBaseManager;
import com.example.rishabh.accountmanagement.data.local.SharedPreferencesManager;
import com.example.rishabh.accountmanagement.dependencies.scopes.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rishabh on 10/09/17.
 */

@Module(includes = ContextModule.class)
public class StorageModule {

    @Singleton
    @Provides
    SharedPreferencesManager provideSharedPreferencesManager(@ApplicationContext Context context){
        return new SharedPreferencesManager(context);
    }

    @Singleton
    @Provides
    DataBaseManager provideDataBaseManager(){
        return new DataBaseManager();
    }
}
