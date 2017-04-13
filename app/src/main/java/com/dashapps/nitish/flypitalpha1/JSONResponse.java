package com.dashapps.nitish.flypitalpha1;

/**
 * Created by Nitish on 6/3/2016.
 *
*/

public class JSONResponse {
    public String getStatus() {
        return status;
    }

    public int getCount() {
        return count;
    }

    public int getCount_total() {
        return count_total;
    }

    public int getPages() {
        return pages;
    }


    public ModelClass[] getPosts() {
        return posts;
    }

    public JSONQuery[] getArrquery() {
        return arrquery;
    }

    private String status;
    private int count;
    private int count_total;
    private int pages;
    private ModelClass[] posts;
    private JSONQuery[] arrquery;


}

