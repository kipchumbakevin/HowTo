package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class InsuranceActivity extends AppCompatActivity {
    TextView broker,agent,title;
    Animation bounce,animation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
        broker = findViewById(R.id.broker);
        agent = findViewById(R.id.agent);
        title = findViewById(R.id.title);
        imageView = findViewById(R.id.imageview);

        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        title.startAnimation(animation);
        imageView.startAnimation(animation);
        broker.startAnimation(bounce);
        agent.startAnimation(bounce);
        broker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InsuranceActivity.this,BrokerActivity.class);
                startActivity(intent);
                finish();
            }
        });
        agent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InsuranceActivity.this,AgentActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(InsuranceActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
