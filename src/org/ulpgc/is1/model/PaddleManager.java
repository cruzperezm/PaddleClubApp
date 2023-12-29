package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class PaddleManager {

    private ArrayList<Customer> customerList;
    private ArrayList<Court> courtList;
    private ArrayList<Reservation> reservations;

    public PaddleManager() {
        customerList = new ArrayList<>();
        courtList = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, Nif nif) {
        Customer newCustomer = new Customer(name, surname, nif);
        customerList.add(newCustomer);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void addCourt(String name, int price, CourtType type) {
        Court newCourt = new Court(name, price, type);
        courtList.add(newCourt);
    }

    public void addCourt(Court court) {
        courtList.add(court);
    }

    public void reserve(Date date, Customer customer, Court court, int price) {
        Reservation reservation = new Reservation(date, customer, court, 0);
        reservation.setPrice();
        customer.addReservation(reservation);
        reservations.add(reservation);
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < customerList.size()) {
            return customerList.get(index);
        } else {
            return null;
        }
    }

    public Court getCourt(int index) {
        if (index >= 0 && index < courtList.size()) {
            return courtList.get(index);
        } else {
            return null;
        }
    }

    public void deleteCustomer(int index) {
        if (index >= 0 && index < customerList.size()) {
            customerList.remove(customerList.get(index));
        } else {
            customerList = customerList;
        }
    }

    public void deleteCourt(int index) {
        if (index >= 0 && index < courtList.size()) {
            courtList.remove(courtList.get(index));
        } else {
            courtList = courtList;
        }
    }

    public Customer getCustomer(Reservation reservation) {
        return reservation.getCustomer();
    }

    public Court getCourt(Reservation reservation) {
        return reservation.getCourt();
    }

    public int getCustomerSize() {
        int i = 0;
        for (Customer customer : customerList) {
            i += 1;
        }
        return i;
    }

    public int getCourtSize() {
        int i = 0;
        for (Court court : courtList) {
            i += 1;
        }
        return i;
    }

    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customerList;
    }
}