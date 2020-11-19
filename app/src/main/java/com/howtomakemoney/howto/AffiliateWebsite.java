package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class AffiliateWebsite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiliate_website);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AffiliateWebsite.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
