package com.example.tasksapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Log.d("test1", "In Second on Click");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test1", "In Second on Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test1", "In Second on Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test1", "In Second on Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test1", "In Second on Stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test1", "In Second on Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("test1", "In Second on Restart");
    }
}
