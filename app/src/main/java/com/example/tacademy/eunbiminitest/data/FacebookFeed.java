package com.example.tacademy.eunbiminitest.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by seoeunbi on 2016. 5. 11..
 */
public class FacebookFeed {

    public String story;
    public String message;
    public String created_time;
    public Date createdDate;
    public String id;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

    public void changeStringToDate(){
        try {
            createdDate = simpleDateFormat.parse(created_time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

