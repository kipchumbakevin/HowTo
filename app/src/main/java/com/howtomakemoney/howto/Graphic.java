package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Graphic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Graphic.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
