package com.example.finfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Feedback1 extends AppCompatActivity implements View.OnClickListener{
    private Button siteLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback1);
        siteLink = findViewById(R.id.siteLink);
        siteLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.siteLink) {
            Uri uri = Uri.parse("https://www.hsbc.co.in/accounts/products/basic-savings/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}