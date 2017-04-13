package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/3/2016.
 */
import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("?json=get_posts&include=title,excerpt,content,attachments")
    Call<JSONResponse> getJSON();
}
