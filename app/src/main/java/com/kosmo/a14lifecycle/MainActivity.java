package com.kosmo.a14lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "KOSMO123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "메인 액티비티 실행됨");


    }//// onCreate() 끝


    public void onButtonClicked(View view){

        Log.d(TAG, "서브 액티비티 실행버튼 클릭");
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }

}//// MainActivity 끝