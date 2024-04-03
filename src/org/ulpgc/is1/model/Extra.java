package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
abstract class Extra {
    private List<Reservation> reservations;
    private int price;

    abstract public String getName();

    public Extra(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Reservation getReservation(int index){
        return (Reservation) this.reservations.get(index);
    }

    public int reservationCount(){
        return this.reservations.size();
    }

    public void addReservation(Reservation newReservation){
        this.reservations.add(newReservation);
    }
}
