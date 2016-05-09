package com.example.tacademy.eunbiminitest.manager;

import java.io.File;
import java.net.CookieManager;

import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/**
 * Created by Tacademy on 2016-05-09.
 */
public class NetworkManager {
    private static NetworkManager instance;
    public static NetworkManager getInstance(){
        if(instance == null){ //싱글톤! 하나밖에 만들어지지 않는다.
            instance = new NetworkManager();
        }

        return instance;
    }

    private static final int DEFAULT_CACHE_SIZE = 50 * 1024 * 1024;
    private  static  final  String DEFAULT_CACHE_DIR = "miniapp";
    OkHttpClient mClient;
    private NetworkManager(){
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
        CookieManager cookieManager = new CookieManager(); //여기 쫌있다 인자로 클래스 2개 넘겨주기!
        builder.cookieJar(new JavaNetCookieJar(cookieManager)); //쿠키등록

    

    }
}
