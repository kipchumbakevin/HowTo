package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class EcommerceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecommerce);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(EcommerceActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
