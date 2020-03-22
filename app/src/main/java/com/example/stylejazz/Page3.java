package com.example.stylejazz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity implements
        View.OnClickListener{
    Button loginButton,nextButton,prevButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
        nextButton = (Button) findViewById(R.id.NextButton);
        nextButton.setOnClickListener(this);
        prevButton = (Button) findViewById(R.id.PrevButton);
        prevButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                Intent loginIntent = new Intent(Page3.this, Page4.class);
                startActivity(loginIntent);
                break;
            case R.id.NextButton:
                Intent page3nIntent = new Intent(Page3.this, Page4.class);
                startActivity(page3nIntent);
                break;
            case R.id.PrevButton:
                Intent page3pIntent = new Intent(Page3.this, Page2.class);
                startActivity(page3pIntent);
                break;

        }




    }
}
