package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Court {
    private String name;
    private int price;
    private CourtType type;
    private List reservations;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public CourtType getType() {
        return this.type;
    }
    public void setType(CourtType type) {
        this.type = type;
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }
    public void addReservation(Date date, Customer customer, Court court, int price){
        Reservation reservation = new Reservation(date, customer, court, price);
        reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }
    public Reservation getReservation(int index) {
        if (index >= 0 && index < reservations.size()) {
            return (Reservation) reservations.get(index);
        }
        else {
            return null;
        }
    }
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
