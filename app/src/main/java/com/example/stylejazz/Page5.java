package com.example.stylejazz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Page5 extends AppCompatActivity implements
        View.OnClickListener {
    Button nextButton, prevButton;
    ImageView d1, d2, d3, d4, d5, d6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        nextButton = (Button) findViewById(R.id.NextButton);
        nextButton.setOnClickListener(this);
        prevButton = (Button) findViewById(R.id.PrevButton);
        prevButton.setOnClickListener(this);

        d1 = (ImageView) findViewById(R.id.dress1);
        d1.setOnClickListener(this);
        d2 = (ImageView) findViewById(R.id.dress2);
        d2.setOnClickListener(this);
        d3 = (ImageView) findViewById(R.id.dress3);
        d3.setOnClickListener(this);
        d4 = (ImageView) findViewById(R.id.dress4);
        d4.setOnClickListener(this);
        d5 = (ImageView) findViewById(R.id.dress5);
        d5.setOnClickListener(this);
        d6 = (ImageView) findViewById(R.id.dress6);
        d6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
       if (view.getId()==R.id.dress1)
       {
           d1.setVisibility(View.GONE);
           d2.setVisibility(View.VISIBLE);
           d3.setVisibility(View.GONE);
           d4.setVisibility(View.GONE);
           d5.setVisibility(View.GONE);
           d6.setVisibility(View.GONE);
       }

        if (view.getId() == R.id.dress2)
        {
            d1.setVisibility(View.GONE);
            d2.setVisibility(View.GONE);
            d3.setVisibility(View.VISIBLE);
            d4.setVisibility(View.GONE);
            d5.setVisibility(View.GONE);
            d6.setVisibility(View.GONE);
        }
        if (view.getId() == R.id.dress3)
        {
            d1.setVisibility(View.GONE);
            d2.setVisibility(View.GONE);
            d3.setVisibility(View.GONE);
            d4.setVisibility(View.VISIBLE);
            d5.setVisibility(View.GONE);
            d6.setVisibility(View.GONE);
        }
        if (view.getId() == R.id.dress4)
        {
            d1.setVisibility(View.GONE);
            d2.setVisibility(View.GONE);
            d3.setVisibility(View.GONE);
            d4.setVisibility(View.GONE);
            d5.setVisibility(View.VISIBLE);
            d6.setVisibility(View.GONE);
        }
        if (view.getId() == R.id.dress5)
        {
            d1.setVisibility(View.GONE);
            d2.setVisibility(View.GONE);
            d3.setVisibility(View.GONE);
            d4.setVisibility(View.GONE);
            d5.setVisibility(View.GONE);
            d6.setVisibility(View.VISIBLE);
        }
        if (view.getId() == R.id.dress6)
        {
            d1.setVisibility(View.VISIBLE);
            d2.setVisibility(View.GONE);
            d3.setVisibility(View.GONE);
            d4.setVisibility(View.GONE);
            d5.setVisibility(View.GONE);
            d6.setVisibility(View.GONE);
        }

        switch (view.getId()) {

            case R.id.NextButton:
                Intent page3nIntent = new Intent(Page5.this, Page6.class);
                startActivity(page3nIntent);
                break;
            case R.id.PrevButton:
                Intent page3pIntent = new Intent(Page5.this, Page4.class);
                startActivity(page3pIntent);
                break;

        }


    }



}