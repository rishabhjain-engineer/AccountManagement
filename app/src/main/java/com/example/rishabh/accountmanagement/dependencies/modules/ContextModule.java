package com.example.rishabh.accountmanagement.dependencies.modules;

import android.app.Application;
import android.content.Context;

import com.example.rishabh.accountmanagement.dependencies.scopes.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rishabh on 10/09/17.
 */

@Module
public class ContextModule {

    private Application mApplication; //external dependency

    public ContextModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

}
