package com.example.rishabh.accountmanagement.data.remote;

import com.google.gson.JsonElement;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Rishabh on 10/09/17.
 */

public interface AccountsApiService {

    @Headers({
            "Content-Type: application/json"
    })
    @GET("/products")
    Call<JsonElement> getProducts();


    @POST("/categories")
    Call<JsonElement> getCategories(@Body RequestBody body);

}
