package com.example.tasksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("test1", "in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test1", "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test1", "on Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test1", "on stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test1", "on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test1", "on destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("test1", "on restart");
    }
}