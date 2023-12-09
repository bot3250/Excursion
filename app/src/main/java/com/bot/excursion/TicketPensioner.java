package com.bot.excursion;

import com.bot.excursion.entity.Ticket;

public class TicketPensioner extends Ticket {
    int discount=45;
    public TicketPensioner(int price) {
        super(price);
    }
    @Override
    public int getPrice() {
        return super.getPrice()-(100-discount)/100;
    }
}
