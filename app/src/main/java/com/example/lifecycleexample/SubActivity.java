package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SubActivity extends AppCompatActivity {
    static String TAG = "__Life__";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "[Activity_Sub] onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "[Activity_Sub] onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "[Activity_Sub] onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "[Activity_Sub] onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "[Activity_Sub] onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "[Activity_Sub] onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Activity_Sub] onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "---Sub에서 Main으로 돌아옴---");
    }
}