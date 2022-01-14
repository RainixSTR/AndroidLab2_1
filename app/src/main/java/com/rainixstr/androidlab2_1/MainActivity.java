package com.rainixstr.androidlab2_1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity_Cycle", "onCreate");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity_Cycle", "onDestroy");
    }

    protected void onPause() {
        super.onPause();
        Log.i("Activity_Cycle", "onPause");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Activity_Cycle", "onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Activity_Cycle", "onResume ");
    }

    protected void onStart() {
        super.onStart();
        Log.i("Activity_Cycle", "onStart");
    }

    protected void onStop() {
        super.onStop();
        Log.i("Activity_Cycle", "onStop");
    }
}