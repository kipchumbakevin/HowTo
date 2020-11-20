package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class NextPageActivity extends AppCompatActivity {
    LinearLayoutCompat sellprogramming,instagram,affiliatewebsite,resellhosting,sellyours,
            jobboard,survey,socialmedia,graphic;
    RelativeLayout websitedeveloper;
    Animation animation;
    private AdView adView;
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
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        sellprogramming.startAnimation(animation);
        websitedeveloper.startAnimation(animation);
        affiliatewebsite.startAnimation(animation);
        instagram.startAnimation(animation);
        resellhosting.startAnimation(animation);
        sellyours.startAnimation(animation);
        jobboard.startAnimation(animation);
        survey.startAnimation(animation);
        socialmedia.startAnimation(animation);
        graphic.startAnimation(animation);

        sellprogramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(7));
                startActivity(intent);
                finish();
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(9));
                startActivity(intent);
                finish();
            }
        });
        resellhosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(11));
                startActivity(intent);
                finish();
            }
        });
        survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(14));
                startActivity(intent);
                finish();
            }
        });
        socialmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(15));
                startActivity(intent);
                finish();
            }
        });
        sellyours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(12));
                startActivity(intent);
                finish();
            }
        });
        jobboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(13));
                startActivity(intent);
                finish();
            }
        });
        affiliatewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(10));
                startActivity(intent);
                finish();
            }
        });
        websitedeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(8));
                startActivity(intent);
                finish();
            }
        });
        graphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(16));
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
        Intent intent = new Intent(NextPageActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
