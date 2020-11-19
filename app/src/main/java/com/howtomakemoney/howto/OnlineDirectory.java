package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class OnlineDirectory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_directory);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(OnlineDirectory.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
