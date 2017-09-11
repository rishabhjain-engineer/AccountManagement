package com.example.rishabh.accountmanagement.data.constants;

import com.example.rishabh.accountmanagement.utils.BuildConfiguration;

/**
 * Created by Rishabh on 10/09/17.
 */

public class Constants {

    private static final String URL_PRODUCTION = "http://www.rishabh.com/";
    private static final String URL_TEST = "http://www.rishabh.com/";

    public static final String BASE_URL = getUrl();


    private static String getUrl(){
        if(BuildConfiguration.IS_PRODUCTION){
            return URL_PRODUCTION;
        } else {
            return URL_TEST;
        }
    }

}
