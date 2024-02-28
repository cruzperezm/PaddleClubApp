package org.ulpgc.is1.model;

import java.util.Date;
import java.util.ArrayList;

public class PaddleManager {

    private ArrayList<Customer> customerList;
    private ArrayList<Court> courtList;

    public PaddleManager() {
        customerList = new ArrayList<>();
        courtList = new ArrayList();
    }

    public void addCustomer(String name, String surname, String nif) {
        Customer newCustomer = new Customer(name, surname, nif);
        customerList.add(newCustomer);
    }
    public void addCustomer(Customer newCustomer) {;
        customerList.add(newCustomer);
    }

    public void addCourt(String name, int price, CourtType type) {
        Court newCourt = new Court(name, price, type);
        courtList.add(newCourt);
    }

    public void reserve(Date date, Customer customer, Court court, int price) {
        Reservation reservation = new Reservation(date, customer, court, price);
        customer.addReservation(reservation);
        court.addReservation(reservation);
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
        }
    }

    public void deleteCourt(int index) {
        if (index >= 0 && index < courtList.size()) {
            courtList.remove(courtList.get(index));
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
    public ArrayList<Customer> getCustomers() {
        return new ArrayList(this.customerList);
    }
    public ArrayList<Court> getCourts() {
        return new ArrayList<>(this.courtList);
    }
}