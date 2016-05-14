package com.example.tacademy.eunbiminitest;


import android.app.Application;
import android.content.Context;

import com.facebook.FacebookSdk;

/**
 * Created by Tacademy on 2016-05-09.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        FacebookSdk.sdkInitialize(this); //페이스북 설정시 해줘야 한다!
    }

    public static Context getContext() {
        return context;
    }
}
