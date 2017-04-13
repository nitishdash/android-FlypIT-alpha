package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/13/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestSuccess {

    @GET("category/success/?json=1&include=title,excerpt,content")
    Call<JSONResponse> getJSON();
}
