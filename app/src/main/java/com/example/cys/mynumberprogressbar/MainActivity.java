package com.example.cys.mynumberprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.library.MyNumberPrassbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       MyNumberPrassbar bar = new MyNumberPrassbar(this);
    }
}
