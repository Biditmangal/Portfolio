package com.example.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Menu;


public class ProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        ImageView imgbut1=findViewById(R.id.imgbutton1);

        imgbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.instagram.com/bidit.exe/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);

            }
        });
        ImageView imgbut2=findViewById(R.id.imgbutton2);

        imgbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://in.linkedin.com/in/bidit-mangal-401727173";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
        ImageView imgbut3=findViewById(R.id.imgbutton3);

        imgbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://twitter.com/biditmangal18";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
        ImageView imgbut4=findViewById(R.id.imgbutton4);

        imgbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://github.com/Biditmangal";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        TextView txt1=findViewById(R.id.text2);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialnumber=new Intent(Intent.ACTION_DIAL);
                dialnumber.setData(Uri.parse("tel:+919752445641"));
                startActivity(dialnumber);
            }
        });

    }
    public void gotoUrl(View view) {
        String url = "https://www.google.com/search?source=hp&ei=iIQQXcvKHYqAvgSfyoKYCQ&q=bidit+mangal&oq=bidit+mangal&gs_l=psy-ab.3..35i39j0i13j0i13i30l2j0i13i5i30l6.72.8675..8833...7.0..5.1245.11433.0j3j11j1j0j1j3j4......0....1..gws-wiz.....6..0i67j0i131j0j0i20i263j0i131i67j0i10j0i10i70i255j0i13i10j0i13i10i30.byXkQlEyZr4";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                return true;
            case R.id.help:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
