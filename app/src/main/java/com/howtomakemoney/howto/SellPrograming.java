package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SellPrograming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_programing);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SellPrograming.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
