package com.example.stylejazz;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import static com.example.stylejazz.R.layout.shop_view;

public class Page4 extends AppCompatActivity implements View.OnClickListener {
    Button NextButton, prevButton;


    String[] ShoppingMalls;

    private Spinner spinner;
    private TextView shopTextView,resultTextView,timeTextView,dateTextView;
    private Button okButton,buyButton,timeButton,dateButton;
    private CheckBox lipBox,linerBox,masBox,shadowBox;
    private TimePicker timePicker;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);



        NextButton = (Button) findViewById(R.id.NextButton);
        NextButton.setOnClickListener(this);
        prevButton = (Button) findViewById(R.id.PrevButton);
        prevButton.setOnClickListener(this);




        lipBox = (CheckBox) findViewById(R.id.lipId);
        linerBox= (CheckBox) findViewById(R.id.eyelId);
        masBox = (CheckBox) findViewById(R.id.masId);
        shadowBox = (CheckBox) findViewById(R.id.eyesId);
        buyButton= (Button) findViewById(R.id.BuyId);
        resultTextView= (TextView) findViewById(R.id.resultId);


        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lipBox.isChecked())
                {
                    Toast.makeText(Page4.this,"Yaay! Lipstick is mine",Toast.LENGTH_SHORT).show();
                }
                if(linerBox.isChecked())
                {
                    Toast.makeText(Page4.this,"Yaay! Eyeliner is mine",Toast.LENGTH_SHORT).show();
                }
                if(masBox.isChecked())
                {
                    Toast.makeText(Page4.this,"Yaay! Mascara is mine",Toast.LENGTH_SHORT).show();
                }
                if(shadowBox.isChecked())
                {
                    Toast.makeText(Page4.this,"Yaay! Eye Shadow is mine",Toast.LENGTH_SHORT).show();
                }



            }
        });


        ShoppingMalls = getResources().getStringArray(R.array.Shopping_Malls);
        spinner = (Spinner) findViewById(R.id.spinnerId);
        shopTextView = (TextView)findViewById(R.id.shopTextId);
        okButton = (Button) findViewById(R.id.okId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, shop_view,R.id.shopTextViewId,ShoppingMalls);
        spinner.setAdapter(adapter);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                Toast.makeText(Page4.this,"Shop Selected",Toast.LENGTH_SHORT).show();
            }
        });



    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.NextButton:
                Intent page3nIntent = new Intent(Page4.this, Page5.class);
                startActivity(page3nIntent);
                break;
            case R.id.PrevButton:
                Intent page3pIntent = new Intent(Page4.this, Page3.class);
                startActivity(page3pIntent);
                break;
        }
    }
}
