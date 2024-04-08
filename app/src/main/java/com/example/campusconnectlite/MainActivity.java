package com.example.campusconnectlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.zegocloud.zimkit.services.ZIMKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initZegocloud();

        startActivity(new Intent(this, LoginMockActivity.class));
        finish();
    }

    public void initZegocloud(){
        ZIMKit.initWith(this.getApplication(), (long) KeyConstant.appID,KeyConstant.appSign);
        ZIMKit.initNotifications();
    }
}