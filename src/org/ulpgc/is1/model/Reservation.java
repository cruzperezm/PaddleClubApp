package org.ulpgc.is1.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private List<Customer> customers;
    private List<Court> courts;
    private List<Extra> extras;
    public Customer customer;
    public Court court;
    private int price;
    private Date date;
    private static int NEXT_ID = 0;
    private final int id;

    public Reservation(Date date, List<Customer> customers, List<Court> courts, int price) {
        this.customers = customers;
        this.courts = courts;
        this.price = price;
        this.date = date;
        this.id = NEXT_ID;
        NEXT_ID++;
        this.extras = new ArrayList<>();
    }

    public int price() {
        int total = 0;
        for (Court part : courts) {
            total += part.getPrice();
        }
        return total;
    }
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //composiciones * a 1 con Court
    public void setCourts(Court courts){
        this.courts = (List<Court>) courts;
    }
    public List<Court> getCourts(){
        return courts;
    }
    public void addCourts(Court court){
        courts.add(court);
    }
    public void removeCourts(Court court){
        courts.remove(court);
    }
    public Court getCourt(int index){
        if (index >= 0 && index < courts.size()){
            return courts.get(index);
        } else{
            return null;
        }
    }

    //composicion customer * a 1
    public void setCustomers(Customer customers){
        this.customers = (List<Customer>) customers;
    }
    public ArrayList<Customer> getCustomers(){
        return (ArrayList<Customer>) this.customers;
    }
    public Customer getCustomers(int index){
        if (index >= 0 && index < customers.size()){
            return customers.get(index);
        }
        else{
            return null;
        }
    }
    public void addCustomers(Customer customers){
        customers.add(customers);
    }
    public void removeCustomer(Customer customers){
        customers.remove(customers);
    }

    public List<Extra> getExtras() {
        return extras;
    }
    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
    public void addExtras(Extra extras) {
        extras.add(extras);
    }

    public void removeExtras(Extra extra) {
        extras.remove(extra);
    }

    public Extra getExtras(int index) {
        if (index >= 0 && index < extras.size()) {
            return extras.get(index);
        } else {
            return null;
        }
    }

    public void add(Reservation reservation) {
        this.add(reservation);
    }

    public void remove(Reservation reservation) {
        this.remove(reservation);
    }

    public int getPrice() {
        return price();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Court getCourt() {
        return this.court;
    }
}
