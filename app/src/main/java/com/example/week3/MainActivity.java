package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double ticketprice = 99.9;
    int numberOfticket;
    double price;
    String game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tickets = findViewById(R.id.txtinputTickets);
        Spinner ChooseAgame = findViewById(R.id.spnGames);
        Button btnCost = findViewById(R.id.btnCost);
        TextView result = findViewById(R.id.txtResult);

        btnCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(tickets.getText().toString()))
                {
                    tickets.setError("enter number of tickets");

                }
                else
                {
                    numberOfticket = Integer.parseInt(tickets.getText().toString());
                    game = ChooseAgame.getSelectedItem().toString();
                    Ticket ticket = new Ticket(numberOfticket, game);
                    result.setText(ticket.toString());
//                    if(game.equals("Game 1"))
//                    {
//                        ticketprice = 79.99;
//                    }
//                    else if(game.equals("Game 2"))
//                    {
//                        ticketprice = 89.99;
//                    }
//                    else if(game.equals("Game 3"))
//                    {
//                        ticketprice = 99.99;
//                    }
//                    price = numberOfticket * ticketprice;


//                    Intent intent = new Intent(MainActivity.this, Second.class);
//                    intent.putExtra("GAME", game); //Key value pair
//                    intent.putExtra("PRICE", price);
//                    startActivity(intent);


                   // DecimalFormat currency = new DecimalFormat("$###,##.##");
                   // result.setText(String.format("the cost is " + currency.format(price) + "for " + game ));
                }




            }
        });

    }
}