package com.howtomakemoney.howto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TransitionActivity extends AppCompatActivity {
    TextView title,desc,shortd;
    ImageView imageView;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        title = findViewById(R.id.title);
        desc = findViewById(R.id.ff);
        imageView = findViewById(R.id.image);
        shortd = findViewById(R.id.buysell);
        i = Integer.parseInt(getIntent().getExtras().getString("INTENT"));
        populate();

        shortd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goOn();
            }
        });
    }

    private void goOn() {
        if (i == 1){
            Intent intent = new Intent(TransitionActivity.this,EcommerceActivity.class);
            startActivity(intent);
            finish();
        }else if (i == 2){
            Intent intent = new Intent(TransitionActivity.this,DigitalCourse.class);
            startActivity(intent);
            finish();
        }else if (i == 3){
            Intent intent = new Intent(TransitionActivity.this,MembershipSite.class);
            startActivity(intent);
            finish();
        }else if (i == 4){
            Intent intent = new Intent(TransitionActivity.this,OnlineDirectory.class);
            startActivity(intent);
            finish();
        }else if (i == 5){
            Intent intent = new Intent(TransitionActivity.this,BuySellWebsites.class);
            startActivity(intent);
            finish();
        }else if (i == 6){
            Intent intent = new Intent(TransitionActivity.this,Youtube.class);
            startActivity(intent);
            finish();
        }else if (i == 7){
            Intent intent = new Intent(TransitionActivity.this,SellPrograming.class);
            startActivity(intent);
            finish();
        }else if (i == 8){
            Intent intent = new Intent(TransitionActivity.this,WebDeveloper.class);
            startActivity(intent);
            finish();
        }else if (i == 9){
            Intent intent = new Intent(TransitionActivity.this,Instagram.class);
            startActivity(intent);
            finish();
        }else if (i == 10){
            Intent intent = new Intent(TransitionActivity.this,Affiliate.class);
            startActivity(intent);
            finish();
        }else if (i == 11){
            Intent intent = new Intent(TransitionActivity.this,ResellWebhosting.class);
            startActivity(intent);
            finish();
        }else if (i == 12){
            Intent intent = new Intent(TransitionActivity.this,YourServices.class);
            startActivity(intent);
            finish();
        }else if (i == 13){
            Intent intent = new Intent(TransitionActivity.this,JobBoard.class);
            startActivity(intent);
            finish();
        }else if (i == 14){
            Intent intent = new Intent(TransitionActivity.this,Survey.class);
            startActivity(intent);
            finish();
        }else if (i == 15){
            Intent intent = new Intent(TransitionActivity.this,SocialManage.class);
            startActivity(intent);
            finish();
        }else if (i == 16){
            Intent intent = new Intent(TransitionActivity.this,Graphic.class);
            startActivity(intent);
            finish();
        }
    }

    private void populate() {
        if (i == 1){
            title.setText("Website");
            desc.setText("Build an eCommerce Website easily");
            imageView.setImageResource(R.drawable.ecomercewebsite);
            shortd.setText("eCommerce Website-->");

        }else if (i == 2){
            title.setText("Digital Course");
            desc.setText("Share your valuable knowledge and earn");
            imageView.setImageResource(R.drawable.digitalcourse);
            shortd.setText("Digital course-->");
        }else if (i == 3){
            title.setText("Membership");
            desc.setText("The idea is easy enough to implement");
            imageView.setImageResource(R.drawable.membershipsite);
            shortd.setText("Membership site-->");
        }else if (i == 4){
            title.setText("Directory");
            desc.setText("Create an Online Directory and make money");
            imageView.setImageResource(R.drawable.onlinedirectory);
            shortd.setText("Online directory-->");
        }else if (i == 5){
            title.setText("Websites");
            desc.setText("Buy and Sell Websites make your profit");
            imageView.setImageResource(R.drawable.buysellwebsites);
            shortd.setText("Buy and sell websites-->");
        }else if (i == 6){
            title.setText("Youtube");
            desc.setText("Monetize your YouTube channel by using their advertising system");
            imageView.setImageResource(R.drawable.youtube);
            shortd.setText("Youtube channel");
        }else if (i == 7){
            title.setText("Programming");
            desc.setText(" Sell Your Programming Services or Software");
            imageView.setImageResource(R.drawable.sellprogramming);
            shortd.setText("About programming-->");
        }else if (i == 8){
            title.setText("Web Developer");
            desc.setText("Become a Website Developer, code your way to the bank");
            imageView.setImageResource(R.drawable.websitedeveloper);
            shortd.setText("Development-->");
        }else if (i == 9){
            title.setText("IG");
            desc.setText("Instagram is one of the fastest-growing social media platforms");
            imageView.setImageResource(R.drawable.instagraminfluencer);
            shortd.setText("IG influencer-->");
        }else if (i == 10){
            title.setText("Website");
            desc.setText("Start an Affiliate Website, receive a commission");
            imageView.setImageResource(R.drawable.affiliatewebsite);
            shortd.setText("Affiliate Website-->");
        }else if (i == 11){
            title.setText("Hosting");
            desc.setText("Resell Web Hosting and make cash");
            imageView.setImageResource(R.drawable.resellwebhosting);
            shortd.setText("Webhosting-->");
        }else if (i == 12){
            title.setText("Services");
            desc.setText("One of the fastest ways to online money making.");
            imageView.setImageResource(R.drawable.sellservices);
            shortd.setText("Sell your services-->");
        }else if (i == 13){
            title.setText("Job Board");
            desc.setText("It can be a rather profitable way to earn a living");
            imageView.setImageResource(R.drawable.jobboard);
            shortd.setText("Job Board-->");
        }else if (i == 14){
            title.setText("Survey");
            desc.setText("If you’re looking for some fast cash and prizes...");
            imageView.setImageResource(R.drawable.surveys);
            shortd.setText("Surveys");
        }else if (i == 15){
            title.setText("Social media");
            desc.setText("Most of us are active on social media these days");
            imageView.setImageResource(R.drawable.socialmediaaccounts);
            shortd.setText("Social media-->");
        }else if (i == 16){
            title.setText("Graphic");
            desc.setText("Use this skill to start making money online.");
            imageView.setImageResource(R.drawable.graphicdesigner);
            shortd.setText("Graphic design");
        }
    }
}
