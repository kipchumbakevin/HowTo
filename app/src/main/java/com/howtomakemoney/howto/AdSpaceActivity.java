package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdSpaceActivity extends AppCompatActivity {
    TextView site,blog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_space);
        site = findViewById(R.id.site);
        blog = findViewById(R.id.blog);

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
