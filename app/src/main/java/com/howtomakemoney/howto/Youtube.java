package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Youtube.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
