package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class JobBoard extends AppCompatActivity {
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_board);
        message = findViewById(R.id.meso);

        setText(getString(R.string.board));
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
        Intent intent = new Intent(JobBoard.this,NextPageActivity.class);
        startActivity(intent);
        finish();
    }
}
