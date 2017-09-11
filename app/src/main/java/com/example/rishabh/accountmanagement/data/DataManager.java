package com.example.rishabh.accountmanagement.data;

import com.example.rishabh.accountmanagement.data.local.DataBaseManager;
import com.example.rishabh.accountmanagement.data.local.SharedPreferencesManager;
import com.example.rishabh.accountmanagement.data.remote.AccountsApiService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Rishabh on 10/09/17.
 */

@Singleton
public class DataManager {

    private final AccountsApiService mAccountsApiService;
    private final DataBaseManager mDataBaseManager;
    private final SharedPreferencesManager mSharedPreferencesManager;

    @Inject
    public DataManager(AccountsApiService mAccountsApiService, DataBaseManager mDataBaseManager, SharedPreferencesManager mSharedPreferencesManager) {
        this.mAccountsApiService = mAccountsApiService;
        this.mDataBaseManager = mDataBaseManager;
        this.mSharedPreferencesManager = mSharedPreferencesManager;
    }
}
