package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class NextPageActivity extends AppCompatActivity {
    LinearLayoutCompat sellprogramming,instagram,affiliatewebsite,resellhosting,sellyours,
            jobboard,survey,socialmedia,graphic;
    RelativeLayout websitedeveloper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        sellprogramming = findViewById(R.id.sellprogramming);
        websitedeveloper = findViewById(R.id.websitedeveloper);
        affiliatewebsite = findViewById(R.id.affiliatewebsite);
        instagram = findViewById(R.id.instagram);
        resellhosting = findViewById(R.id.resellwebshosting);
        sellyours = findViewById(R.id.sellyourservices);
        jobboard = findViewById(R.id.jobboard);
        survey = findViewById(R.id.survey);
        socialmedia = findViewById(R.id.socialmedia);
        graphic = findViewById(R.id.graphic);

        sellprogramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,SellPrograming.class);
                startActivity(intent);
                finish();
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,Instagram.class);
                startActivity(intent);
                finish();
            }
        });
        affiliatewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,AffiliateWebsite.class);
                startActivity(intent);
                finish();
            }
        });
        websitedeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,WebDeveloper.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NextPageActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
