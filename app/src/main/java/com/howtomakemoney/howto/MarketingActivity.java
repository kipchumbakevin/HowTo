package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MarketingActivity extends AppCompatActivity {
    TextView social,affiliate;
    Animation bounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);
        social = findViewById(R.id.social);
        affiliate = findViewById(R.id.affiliate);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        social.startAnimation(bounce);
        affiliate.startAnimation(bounce);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MarketingActivity.this,SocialMedia.class);
                startActivity(intent);
                finish();
            }
        });
        affiliate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MarketingActivity.this,Affiliate.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MarketingActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
