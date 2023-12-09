package com.bot.excursion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bot.excursion.entity.Ticket;

public class MainActivity extends AppCompatActivity {
    TextView textOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOutput = findViewById(R.id.textViewOutput);
        textOutput.setText("Стоймость всех билетов "+calculate()+" монет");
    }

    int calculate(){
        int price = 0;

        TicketGrown ticketGrown = new TicketGrown(35);
        TicketChild ticketChild = new TicketChild(35);
        TicketPensioner ticketPensioner = new TicketPensioner(35);

        for (int i = 0; i<=12; i++){
            price+=ticketGrown.getPrice();
        }
        for (int i = 0; i<=14 ; i++){
            price+=ticketChild.getPrice();
        }
        for (int i = 0; i<=10 ; i++){
            price+=ticketPensioner.getPrice();
        }
        return price;
    }
}