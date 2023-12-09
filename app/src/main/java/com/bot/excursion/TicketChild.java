package com.bot.excursion;

import com.bot.excursion.entity.Ticket;

public class TicketChild extends Ticket {
    int discount=50;
    public TicketChild(int price) {
        super(price);
    }
    @Override
    public int getPrice() {
        return super.getPrice()-(100-discount)/100;
    }
}
