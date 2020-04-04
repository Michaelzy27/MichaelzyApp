package com.michael.michaelzyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
       // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.custom_title_bar);



        toolbar2 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar2);
    }
}
/*toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);*/