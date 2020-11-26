package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class MainActivity extends AppCompatActivity {
    RelativeLayout bitcoin;
    LinearLayoutCompat insurance,sellads,marketing,ecommerce,digitalcourse,membershipsite,directory,buysellwebsites,youtube;
    CardView share,rate;
    Animation animation;
    private AdView adView;
    TextView nextpage,policy;
    private InterstitialAd interstitialAd;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitcoin = findViewById(R.id.bitcoin);
        insurance = findViewById(R.id.insurance);
        sellads = findViewById(R.id.sellads);
        marketing = findViewById(R.id.marketing);
        share = findViewById(R.id.share);
        rate = findViewById(R.id.rate);
        policy = findViewById(R.id.policy);
        nextpage = findViewById(R.id.nextpage);
        ecommerce = findViewById(R.id.ecommerce);
        digitalcourse = findViewById(R.id.digitalcourse);
        membershipsite = findViewById(R.id.membershipsite);
        directory = findViewById(R.id.onlinedirectory);
        buysellwebsites = findViewById(R.id.buysellwebsites);
        youtube = findViewById(R.id.youtube);
        AudienceNetworkAds.initialize(this);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        interstitialAd = new InterstitialAd(this, getString(R.string.interstitial));
        final InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                //  Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                //  Log.e(TAG, "Interstitial ad dismissed.");
                if (i == 1){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(1));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }else if (i == 2){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(3));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }else if (i == 3){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(2));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }else if (i == 4){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(5));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }else if (i == 5){
                    Intent intent = new Intent(MainActivity.this, BuySell.class);
                    startActivity(intent);
                    finish();
                }else if (i == 6){
                    Intent intent = new Intent(MainActivity.this, InsuranceActivity.class);
                    startActivity(intent);
                    finish();
                }else if (i == 7){
                    Intent intent = new Intent(MainActivity.this, AdSpaceActivity.class);
                    startActivity(intent);
                    finish();
                }else if (i == 8){
                    Intent intent = new Intent(MainActivity.this, MarketingActivity.class);
                    startActivity(intent);
                    finish();
                }else if (i == 9){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(4));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }else if (i == 10){
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(6));
                    intent.putExtra("GOBACK", Integer.toString(2));
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
        bitcoin.startAnimation(animation);
        insurance.startAnimation(animation);
        sellads.startAnimation(animation);
        marketing.startAnimation(animation);
        ecommerce.startAnimation(animation);
        digitalcourse.startAnimation(animation);
        directory.startAnimation(animation);
        membershipsite.startAnimation(animation);
        buysellwebsites.startAnimation(animation);
        youtube.startAnimation(animation);

        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NextPageActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ecommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 1;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(1));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        membershipsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 2;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(3));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        digitalcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 3;if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(2));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        buysellwebsites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 4;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(5));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 5;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, BuySell.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 6;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, InsuranceActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        sellads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 7;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, AdSpaceActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 8;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, MarketingActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 9;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(4));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 10;
                if (interstitialAd.isAdLoaded()){
                    interstitialAd.show();
                }else {
                    Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
                    intent.putExtra("INTENT", Integer.toString(6));
                    intent.putExtra("GOBACK", Integer.toString(2));
                    startActivity(intent);
                    finish();
                }
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName())));
                }
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://lovidovi.co.ke/appprivacypolicy");
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://lovidovi.co.ke/appprivacypolicy")));
                }
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody =
                        "Find ideas to earn you money!. Download cashASAP App now at https://play.google.com/store/apps/details?id="
                                + MainActivity.this.getPackageName();
                intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share via"));
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
}
