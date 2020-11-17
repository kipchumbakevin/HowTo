package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AdSpaceActivity extends AppCompatActivity {
    TextView site,blog;
    Animation bounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_space);
        site = findViewById(R.id.site);
        blog = findViewById(R.id.blog);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        site.startAnimation(bounce);
        blog.startAnimation(bounce);
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
    public void onBackPressed() {
        Intent intent = new Intent(AdSpaceActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
