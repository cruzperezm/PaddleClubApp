package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.ArrayList;
import java.util.Date;

public class PaddleClub {

    private ArrayList<Customer> customerList;
    private ArrayList<Court> courtList;

    public PaddleClub() {
        customerList = new ArrayList<>();
        courtList = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, Nif nif) {
        Customer newCustomer = new Customer(name, surname, nif);
        customerList.add(newCustomer);
    }

    public void addCourt(String name, int price, CourtType type) {
        Court newCourt = new Court(name, price, type);
        courtList.add(newCourt);
    }
    public void init(){
    }
}