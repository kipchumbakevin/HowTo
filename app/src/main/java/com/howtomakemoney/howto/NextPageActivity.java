package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NextPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NextPageActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
