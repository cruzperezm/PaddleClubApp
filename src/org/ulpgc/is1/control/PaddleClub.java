package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Date;

public class PaddleClub {

    private ArrayList<Customer> customerList;
    private ArrayList<Court> courtList;
    private ArrayList<Reservation> reservations;

    public void PaddleClub() {
        customerList = new ArrayList<>();
        courtList = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, NIF nif) {
        Customer newCustomer = new Customer(name, surname, nif);
        customerList.add(newCustomer);
    }

    public void addCourt(String name, int price, CourtType type) {
        Court newCourt = new Court(name, price, type);
        courtList.add(newCourt);
    }

    public void reserve(ArrayList<Customer> customers, ArrayList<Court> court, int price, Date date) {
        Reservation reservation = new Reservation(date, customers, court, price);
        reservations.add(reservation);
    }


}
