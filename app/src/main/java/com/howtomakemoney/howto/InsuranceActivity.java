package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InsuranceActivity extends AppCompatActivity {
    TextView broker,agent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
        broker = findViewById(R.id.broker);
        agent = findViewById(R.id.agent);

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
