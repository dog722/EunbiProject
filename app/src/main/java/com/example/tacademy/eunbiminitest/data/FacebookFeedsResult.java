package com.example.tacademy.eunbiminitest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by seoeunbi on 2016. 5. 11..
 */
public class FacebookFeedsResult {

    @SerializedName("data")
    public List<FacebookFeed> feeds;

    public void convertStringToDate(){
        for (FacebookFeed ff : feeds){
            ff.changeStringToDate();
        }
    }
}
