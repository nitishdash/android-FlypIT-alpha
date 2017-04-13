package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/3/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestNational {

    @GET("category/national/?json=1&include=title,excerpt,content")
    Call<JSONResponse> getJSON();
}
