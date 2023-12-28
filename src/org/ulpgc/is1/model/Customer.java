package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Nif nif;
    private ArrayList<Reservation> reservations;

    public Customer(String name, String surname, Nif nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Nif getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif.setNumber(nif);
    }

    public List<Reservation> getReservations(){
        return this.reservations;
    }
    public void setReservations(ArrayList<Reservation> reservations){
        this.reservations = reservations;
    }
    public void addReservation(Date date, Customer customer, Court court, int price){
        Reservation reservation = new Reservation(date, customer, court, price);
        reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }
    public Reservation getReservations(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        }
        else {
            return null;
        }
    }
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
