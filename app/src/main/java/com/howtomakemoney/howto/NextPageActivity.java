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

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class NextPageActivity extends AppCompatActivity {
    LinearLayoutCompat sellprogramming,instagram,affiliatewebsite,resellhosting,sellyours,
            jobboard,survey,socialmedia,graphic;
    RelativeLayout websitedeveloper;
    Animation animation;
    private AdView adView;
    private InterstitialAd interstitialAd;
    int i = 0;
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
        AudienceNetworkAds.initialize(this);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        interstitialAd = new InterstitialAd(this, getString(R.string.interstitial));
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                //  Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                //  Log.e(TAG, "Interstitial ad dismissed.");
                if (i == 11){
                    Intent intent = new Intent(NextPageActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else if (i == 1){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(7));
                    startActivity(intent);
                    finish();
                }else if (i == 2){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(9));
                    startActivity(intent);
                    finish();
                }else if (i == 3){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(11));
                    startActivity(intent);
                    finish();
                }else if (i == 4){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(14));
                    startActivity(intent);
                    finish();
                }else if (i == 5){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(15));
                    startActivity(intent);
                    finish();
                }else if (i == 6){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(12));
                    startActivity(intent);
                    finish();
                }else if (i == 7){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(13));
                    startActivity(intent);
                    finish();
                }else if (i == 8){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(10));
                    startActivity(intent);
                    finish();
                }else if (i == 9){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(8));
                    startActivity(intent);
                    finish();
                }else if (i == 10){
                    Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                    intent.putExtra("INTENT",Integer.toString(16));
                    startActivity(intent);
                    finish();
                }
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                //Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                // Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                //interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                // Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                // Log.d(TAG, "Interstitial ad impression logged!");
            }
        };
        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
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
                i = 1;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(7));
                startActivity(intent);
                finish();
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 2;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(9));
                startActivity(intent);
                finish();
            }
        });
        resellhosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 3;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(11));
                startActivity(intent);
                finish();
            }
        });
        survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 4;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(14));
                startActivity(intent);
                finish();
            }
        });
        socialmedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 5;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(15));
                startActivity(intent);
                finish();
            }
        });
        sellyours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 6;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(12));
                startActivity(intent);
                finish();
            }
        });
        jobboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 7;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(13));
                startActivity(intent);
                finish();
            }
        });
        affiliatewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 8;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(10));
                startActivity(intent);
                finish();
            }
        });
        websitedeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 9;
                Intent intent = new Intent(NextPageActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(8));
                startActivity(intent);
                finish();
            }
        });
        graphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 10;
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
        }if (interstitialAd != null){
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
    @Override
    public void onBackPressed() {
        i = 11;
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }else {
            Intent intent = new Intent(NextPageActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
