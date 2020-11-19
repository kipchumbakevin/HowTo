package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BuySell extends AppCompatActivity {
    TextView busell,title,ff;
    CardView hh;
    RelativeLayout relativeLayout;
    Animation bounce,animation;
    ImageView imageView;
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
    public void onBackPressed() {
        Intent intent = new Intent(BuySell.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
