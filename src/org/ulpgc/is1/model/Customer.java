package org.ulpgc.is1.model;

import java.util.ArrayList;
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

    public String getNif() {
        return this.nif.getNumber();
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
    public void addReservations(Reservation reservation){
        reservations.add(reservation);
    }
    public void removeReservations(Reservation reservation){
        reservation.remove(reservation);
    }
    public Reservation getReservations(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            return null;
        }
    }

    public boolean add(Customer customer) {
        this.add(customer);
        boolean wasAlreadyThere = this.add(customer);
        return wasAlreadyThere;
    }

    public void remove(Customer customer) {
        this.remove(customer);
    }
}
