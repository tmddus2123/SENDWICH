package com.example.sendwich;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PostClickActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postclick);

        ActionBar ab = getSupportActionBar();
        ab.hide();  //액션바 숨기기
    }
}
