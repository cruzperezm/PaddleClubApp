package org.ulpgc.is1.model;
import java.util.Date;

public class Reservation {
    private static int NEXT_ID = 0;
    public final int id;
    public Date date;
    public int price;

    public Reservation() {
        this.id = NEXT_ID;
        NEXT_ID++;
    }

    public Reservation(Date date, int price) {
        this();
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
