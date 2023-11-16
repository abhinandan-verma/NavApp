package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.navapp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity
        implements SecondFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void OnFragmentInteraction(Uri uri) {

    }
}