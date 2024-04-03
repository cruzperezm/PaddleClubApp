package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Nif nif;
    private List<Reservation> reservations;

    public Customer(String name, String surname, String nif) {
        this.name = name;
        this.surname = surname;
        this.nif = new Nif(nif);
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

    public String getNif() {
        return this.nif.getNumber();
    }

    public void setNif(String nif) {
        this.nif.setNumber(nif);
    }

    public List<Reservation> getReservations(){
        return new ArrayList<>(this.reservations);
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
            return reservations.get(index);
        }
        else {
            return null;
        }
    }
    public void addReservation(Reservation reservation) {
        if (!this.reservations.contains(reservation)){
            this.reservations.add(reservation);
        }
    }
}
