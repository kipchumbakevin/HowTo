package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class AdSpaceActivity extends AppCompatActivity {
    TextView site,blog,title;
    Animation bounce,animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_space);
        site = findViewById(R.id.site);
        title = findViewById(R.id.title);
        blog = findViewById(R.id.blog);
        imageView = findViewById(R.id.imageview);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);
        title.startAnimation(animation);
        imageView.startAnimation(animation);
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
