package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView result = findViewById(R.id.txtResult2);

        Intent intent = getIntent();
        if (intent!=null)
        {
            String game = intent.getStringExtra("Game");
            double price = intent.getDoubleExtra("PRICE", 0);
            DecimalFormat currency = new DecimalFormat("$###,##.##");
            result.setText( currency.format(price) + "for " + game );
        }
    }
}