package org.ulpgc.is1.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private List<Extra> extras;
    private Customer customer;
    private Court court;
    private int price;
    private Date date;
    private static int NEXT_ID = 0;
    private final int id;

    public Reservation(Date date, Customer customer, Court court, int price) {
        this.price = price;
        this.date = date;
        this.id = NEXT_ID;
        NEXT_ID++;
        this.extras = new ArrayList<>();
    }

    public int price(){
        int price = 0;
        for (Extra i: this.extras) {
            price += i.getPrice();
        }
        return price;
    }
    public int getId() {
        return this.id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Extra> getExtras() {
        return this.extras;
    }
    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
    public void addExtras(Extra extras) {
        this.extras.add(extras);
    }

    public void removeExtras(Extra extra) {
        this.extras.remove(extra);
    }

    public Extra getExtras(int index) {
        if (index >= 0 && index < extras.size()) {
            return extras.get(index);
        }
        else {
            return null;
        }
    }
    public int getPrice() {
        return price();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Court getCourt() {
        return this.court;
    }
}
