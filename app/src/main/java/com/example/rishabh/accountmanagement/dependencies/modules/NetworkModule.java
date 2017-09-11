package com.example.rishabh.accountmanagement.dependencies.modules;

import android.content.Context;

import com.example.rishabh.accountmanagement.data.constants.Constants;
import com.example.rishabh.accountmanagement.data.remote.AccountsApiService;
import com.example.rishabh.accountmanagement.dependencies.scopes.ApplicationContext;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rishabh on 10/09/17.
 */

@Module(includes = ContextModule.class)
public class NetworkModule {

    @Singleton
    @Provides
    AccountsApiService provideAccountsApiService(Retrofit retrofit){
        return retrofit.create(AccountsApiService.class);
    }

    @Provides
    Retrofit provideRetrofit(OkHttpClient client, Gson gson){
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }

    @Provides
    OkHttpClient provideOkHttpClient(Cache cache){
        return new OkHttpClient.Builder()
                .cache(cache)
                .build();
    }

    @Provides
    Cache provideCache(File file){
        return new Cache(file, 10*1000*1000); //10Mb Cache
    }

    @Provides
    File provideFile(@ApplicationContext Context context){
        return new File(context.getCacheDir(), "account-okhttp-cache");
    }

    @Provides
    Gson provideGson(){
        return new GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create();
    }
}
