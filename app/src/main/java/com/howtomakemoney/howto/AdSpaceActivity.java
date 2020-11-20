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
import com.facebook.ads.AudienceNetworkAds;

public class AdSpaceActivity extends AppCompatActivity {
    TextView site,blog,title;
    Animation bounce,animation;
    ImageView imageView;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_space);
        site = findViewById(R.id.site);
        title = findViewById(R.id.title);
        blog = findViewById(R.id.blog);
        imageView = findViewById(R.id.imageview);
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);
        title.startAnimation(animation);
        imageView.startAnimation(animation);
        site.startAnimation(bounce);
        blog.startAnimation(bounce);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdSpaceActivity.this,WebsiteActivity.class);
                startActivity(intent);
                finish();
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdSpaceActivity.this,BlogActivity.class);
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
        Intent intent = new Intent(AdSpaceActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
