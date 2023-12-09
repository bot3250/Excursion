package com.bot.excursion.entity;

public abstract class Ticket {
    int price;
    public Ticket(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

}
