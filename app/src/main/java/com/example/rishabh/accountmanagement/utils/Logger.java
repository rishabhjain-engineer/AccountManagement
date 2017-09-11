package com.example.rishabh.accountmanagement.utils;

import timber.log.Timber;

/**
 * Created by Rishabh on 10/09/17.
 */

public class Logger {

    public static void log(String className, String message){
        if(BuildConfiguration.ENABLE_LOGGING){
            Timber.i(className + ", " + message);
        }
    }
}
