package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BuySell extends AppCompatActivity {
    TextView busell;
    RelativeLayout relativeLayout;
    Animation bounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);
        busell = findViewById(R.id.buysell);
        relativeLayout = findViewById(R.id.relativebit);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        busell.startAnimation(bounce);
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
