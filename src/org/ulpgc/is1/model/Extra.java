package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
public class Extra{
    public int price;
    public List<Reservation> reservations;

    public Extra(int price) {
        this.price = price;
        this.reservations = new ArrayList<>();
    }

    public String getName(String name){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public void add(Extra extras) {
        this.add(extras);
    }
    public void remove(Extra extras){
        this.remove(extras);
    }
}
