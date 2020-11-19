package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WebDeveloper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_developer);
    }

    @Override
    public void onBackPressed() {
                Intent intent = new Intent(WebDeveloper.this,NextPageActivity.class);
                startActivity(intent);
                finish();

    }
}
