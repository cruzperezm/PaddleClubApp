package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
abstract class Extra {
    private List reservations;
    private int price;

    abstract public String getName();

    public Extra(int price) {
        this.price = price;
        this.reservations = new ArrayList();
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Object getReservation(int index){
        return this.reservations.get(index);
    }
    public void addReservation(Reservation reservation){
        this.reservations.add(reservation);
    }
}
