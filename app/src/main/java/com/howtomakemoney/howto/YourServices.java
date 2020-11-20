package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

import java.util.Timer;
import java.util.TimerTask;

public class YourServices extends AppCompatActivity {
    TextView message;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_services);
        message = findViewById(R.id.meso);

        adView = new AdView(this, getString(R.string.banner), AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        setText(getString(R.string.your));
    }
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    public void setText(final String s){
        final int[]i = new int[1];
        final int length = s.length();
        @SuppressLint("HandlerLeak") final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                char c = s.charAt(i[0]);
                message.append(String.valueOf(c));
                i[0]++;

            }
        };
        final Timer timer = new Timer();
        TimerTask taskEverySplitSecond = new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
                if (i[0] == length-1){
                    timer.cancel();
                }
            }
        };
        timer.schedule(taskEverySplitSecond,1,20);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(YourServices.this,TransitionActivity.class);
        intent.putExtra("INTENT",Integer.toString(12));
        startActivity(intent);
        finish();
    }
}
