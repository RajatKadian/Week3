package com.example.week3;

import java.text.DecimalFormat;

public class Ticket {

    private int tickets;
    private String game;
    private double cost;

    public Ticket(int tickets, String g)
    {
        this.tickets = tickets;
        game = g;
    }

    public double  calculateCost()
    {
        if(game.equals("Game 1"))
        {
            cost = 79.99;
        }
        else if(game.equals("Game 2"))
        {
            cost = 89.99;
        }
        else if(game.equals("Game 3"))
        {
            cost = 99.99;
        }
        cost = tickets * cost;
        return cost;

    }


    @Override
    public String toString()
    {
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        return " the cost is " + calculateCost() + "for" + game;

    }
}
