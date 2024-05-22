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
        this.id = ++NEXT_ID;
        this.court = court;
        this.extras = new ArrayList<>();
    }

    public int price() {
        int totalPrice = court.getPrice();
        if (this.extras != null) {
            for (Extra i : this.extras) {
                totalPrice += i.getPrice();
            }
        }
        return totalPrice;
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

    public ArrayList<Extra> getExtras() {
        return new ArrayList<>(this.extras);
    }
    public int getPrice() {
        return this.price();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Court getCourt() {
        return this.court;
    }
    public void removeExtra(int index){
        this.extras.remove(index);
    }
    public void addExtra(Extra extra){
        if (!this.extras.contains(extra)){
        this.extras.add(extra);
        }
    }
}
