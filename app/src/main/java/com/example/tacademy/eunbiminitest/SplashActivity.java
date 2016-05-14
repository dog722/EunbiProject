package com.example.tacademy.eunbiminitest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;

import com.example.tacademy.eunbiminitest.login.LoginActivity;
import com.facebook.AccessToken;

public class SplashActivity extends AppCompatActivity {

    Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AccessToken token = AccessToken.getCurrentAccessToken();
        if(token == null) {


            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() { //로그인 되어 있지 않을 때
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }, 2000);
        }else{
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() { //로그인 되어 있을 때
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }, 2000);
        }
    }
}
