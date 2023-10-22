package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {
    public String name;
    public int price;
    public List<Reservation> reservations;
    public CourtType type;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CourtType getType() {
        return type;
    }

    public void setType(CourtType type) {
        this.type = type;
    }

    public List<Reservation> getReservations(){
        return reservations;
    }
    public void setReservations(List<Reservation> reservations){
        this.reservations = reservations;
    }
    public void addReservations(Reservation reservation){
        reservation.add(reservation);
    }
    public void removeReservations(Reservation reservation){
        reservation.remove(reservation);
    }
    public Reservation getReservation(int index){
        if (index >= 0 && index < reservations.size()){
            return reservations.get(index);
        } else{
            return null;
        }
    }
    public void add(Court courts) {
        this.add(courts);
    }

    public void remove(Court courts) {
        this.remove(courts);
    }
}

