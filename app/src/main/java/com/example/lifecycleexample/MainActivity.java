package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static String TAG = "__Life__";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "[Activity_Main] onCreate");

        BtnListener();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "---메인 종료---");
    }

    private void BtnListener() {
        findViewById(R.id.fragment1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "---Fragment 1로 이동---");
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Fragment1()).commit();
            }
        });

        findViewById(R.id.fragment2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "---Fragment 2로 이동---");
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Fragment2()).commit();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "[Activity_Main] onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "[Activity_Main] onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "[Activity_Main] onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "[Activity_Main] onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "[Activity_Main] onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Activity_Main] onDestroy");
    }

    public void MoveToSub(View view){
        startActivity(new Intent(MainActivity.this, SubActivity.class));
        Log.d(TAG, "----Main에서 Sub호출---");
    }
}