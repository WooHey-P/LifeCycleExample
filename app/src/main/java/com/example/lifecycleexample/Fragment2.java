package com.example.lifecycleexample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
    static String TAG = "__Life__";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "[Fragment_2] onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "[Fragment_2] onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "[Fragment_2] onCreateView");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "[Fragment_2] onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "[Fragment_2] onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "[Fragment_2] onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "[Fragment_2] onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "[Fragment_2] onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "[Fragment_2] onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[Fragment_2] onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "[Fragment_2] onDetach");
    }
}