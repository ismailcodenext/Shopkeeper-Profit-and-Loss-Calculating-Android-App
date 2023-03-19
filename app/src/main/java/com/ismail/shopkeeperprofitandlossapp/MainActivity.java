package com.ismail.shopkeeperprofitandlossapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvItemName, tvSellPrice, tvBuyPrice, tvDisplay;
    EditText edName, edSellPrice, edBuyPrice;
    Button resultBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvItemName = findViewById(R.id.tvItemName);
        tvSellPrice = findViewById(R.id.tvSellPrice);
        tvBuyPrice = findViewById(R.id.tvBuyPrice);
        tvDisplay = findViewById(R.id.tvDisplay);
        edName = findViewById(R.id.edName);
        edSellPrice = findViewById(R.id.edSellPrice);
        edBuyPrice = findViewById(R.id.edBuyPrice);
        resultBtn = findViewById(R.id.resultBtn);

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float buyPrice, sellPrice, profit, profitPersent;

                String edNameS = edName.getText().toString();

                String edSellS = edSellPrice.getText().toString();
                sellPrice = Float.parseFloat(edSellS);

                String edBuyS = edBuyPrice.getText().toString();
                buyPrice = Float.parseFloat(edBuyS);

                profit = sellPrice - buyPrice;
                profitPersent = profit / buyPrice*100;

                if ( buyPrice < sellPrice ){

                    tvDisplay.setText(edNameS+" এই পণ্যটি বিক্রয় করে লাভ হয়েছে = "+profit+ " টাকা\n"+"এবং শতকরায় লাভ হয়েছে ="+profitPersent+" শতাংশ " );
                }

                else{

                    tvDisplay.setText(edNameS+" এই পণ্যটি বিক্রয় করে লস হয়েছে = "+profit+ "\n"+"এবং শতকরায় লস হয়েছে ="+profitPersent+" শতাংশ " );

                }


            }
        });


    }
}