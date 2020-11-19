package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout bitcoin;
    LinearLayoutCompat insurance,sellads,marketing,ecommerce,digitalcourse,membershipsite,directory,buysellwebsites,youtube;
    CardView share,rate;
    Animation animation;
    TextView nextpage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitcoin = findViewById(R.id.bitcoin);
        insurance = findViewById(R.id.insurance);
        sellads = findViewById(R.id.sellads);
        marketing = findViewById(R.id.marketing);
        share = findViewById(R.id.share);
        rate = findViewById(R.id.rate);
        nextpage = findViewById(R.id.nextpage);
        ecommerce = findViewById(R.id.ecommerce);
        digitalcourse = findViewById(R.id.digitalcourse);
        membershipsite = findViewById(R.id.membershipsite);
        directory = findViewById(R.id.onlinedirectory);
        buysellwebsites = findViewById(R.id.buysellwebsites);
        youtube = findViewById(R.id.youtube);
        animation = AnimationUtils.loadAnimation(this, R.anim.heart_beat);

        bitcoin.startAnimation(animation);
        insurance.startAnimation(animation);
        sellads.startAnimation(animation);
        marketing.startAnimation(animation);
        ecommerce.startAnimation(animation);
        digitalcourse.startAnimation(animation);
        directory.startAnimation(animation);
        membershipsite.startAnimation(animation);
        buysellwebsites.startAnimation(animation);
        youtube.startAnimation(animation);

        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NextPageActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ecommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(1));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        membershipsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(3));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        digitalcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(2));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        buysellwebsites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(5));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BuySell.class);
                startActivity(intent);
                finish();
            }
        });
        insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InsuranceActivity.class);
                startActivity(intent);
                finish();
            }
        });
        sellads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AdSpaceActivity.class);
                startActivity(intent);
                finish();
            }
        });
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MarketingActivity.class);
                startActivity(intent);
                finish();
            }
        });
        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(4));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TransitionActivity.class);
                intent.putExtra("INTENT",Integer.toString(6));
                intent.putExtra("GOBACK",Integer.toString(2));
                startActivity(intent);
                finish();
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // To count with Play market backstack, After pressing back button,
                // to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName())));
                }
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody =
                        "Find ideas to earn you money!. Download EA Loans App now at https://play.google.com/store/apps/details?id="
                                + MainActivity.this.getPackageName();
                intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share via"));
            }
        });
    }
}
