package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class MarketingActivity extends AppCompatActivity {
    TextView social,affiliate,title;
    ImageView imageView;
    Animation bounce,animation;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);
        social = findViewById(R.id.social);
        affiliate = findViewById(R.id.affiliate);
        imageView = findViewById(R.id.imageview);
        title = findViewById(R.id.title);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        social.startAnimation(bounce);
        affiliate.startAnimation(bounce);
        title.startAnimation(animation);
        imageView.startAnimation(animation);
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
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MarketingActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
