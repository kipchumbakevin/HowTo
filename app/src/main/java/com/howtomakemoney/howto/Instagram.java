package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Instagram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Instagram.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
