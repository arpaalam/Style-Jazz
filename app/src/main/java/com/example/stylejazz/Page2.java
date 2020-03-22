package com.example.stylejazz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page2 extends AppCompatActivity implements
        View.OnClickListener {
    Button NextButton, prevButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        NextButton = (Button) findViewById(R.id.NextButton);
        NextButton.setOnClickListener(this);
        prevButton = (Button) findViewById(R.id.PrevButton);
        prevButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.NextButton:
                Intent page3nIntent = new Intent(Page2.this, Page3.class);
                startActivity(page3nIntent);
                break;
            case R.id.PrevButton:
                Intent page3pIntent = new Intent(Page2.this, MainActivity.class);
                startActivity(page3pIntent);
                break;
        }
    }
}