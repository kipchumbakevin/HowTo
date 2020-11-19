package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class YourServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_services);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(YourServices.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
