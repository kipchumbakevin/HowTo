package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class JobBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_board);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(JobBoard.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
