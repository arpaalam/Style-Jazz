package com.example.stylejazz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    Button ShoppButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShoppButton = (Button) findViewById(R.id.ShopBtnId);
        ShoppButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent page1Intent = new Intent(MainActivity.this, Page2.class);
        startActivity(page1Intent);
    }
}