package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class BuySell extends AppCompatActivity {
    TextView busell,title,ff;
    CardView hh;
    RelativeLayout relativeLayout;
    Animation bounce,animation;
    ImageView imageView;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);
        busell = findViewById(R.id.buysell);
        ff = findViewById(R.id.ff);
        hh = findViewById(R.id.hh);
        relativeLayout = findViewById(R.id.relativebit);
        imageView = findViewById(R.id.imageview);
        title = findViewById(R.id.title);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        title.startAnimation(animation);
        hh.startAnimation(animation);
        busell.startAnimation(bounce);
        ff.startAnimation(bounce);
        busell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuySell.this,Bitcoin.class);
                startActivity(intent);
                finish();
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BuySell.this,Bitcoin.class);
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
        Intent intent = new Intent(BuySell.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
