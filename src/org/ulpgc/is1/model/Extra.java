package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
public class Extra{
    private int price;
    private List<Reservation> reservations;

    public Extra(int price) {
        this.price = price;
        this.reservations = new ArrayList<>();
    }

    public String getName(String name){
        return name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }
    public void setReservations(List<Reservation> reservations){
        this.reservations = reservations;
    }
    public void addReservations(Reservation reservation){
        reservations.add(reservation);
    }
    public void removeReservations(Reservation reservation){
        reservations.remove(reservation);
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
