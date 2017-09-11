package com.example.rishabh.accountmanagement.data.local;

import io.realm.Realm;

/**
 * Created by Rishabh on 10/09/17.
 */

public class DataBaseManager {

    private final Realm realm;

    public DataBaseManager(){
        this.realm = Realm.getDefaultInstance();
    }
}
