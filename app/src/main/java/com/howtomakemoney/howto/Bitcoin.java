package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Bitcoin extends AppCompatActivity {
    TextView message,freebit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoin);
        message = findViewById(R.id.meso);
        freebit = findViewById(R.id.freebit);

        setText(getString(R.string.bitcoin));

        freebit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bitcoin.this,FreeBitcoinActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Bitcoin.this,BuySell.class);
        startActivity(intent);
        finish();
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
}
