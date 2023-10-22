package org.ulpgc.is1.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;

    public Reservation(){
        this.id = NEXT_ID; //error
        NEXT_ID++;
        this.customers = new ArrayList<>();
        this.courts = new ArrayList<>();
        this.extras = new ArrayList<>();
    }
    public Date date;
    public List<Customer> customers;
    public List<Court> courts;
    public List<Extra> extras;

    public void price(){
        int total = 0;
        for (Court part : courts){
            total += part.getPrice();
        }
    }

    public Reservation(int id, Date date) {
        this.id = id;
        NEXT_ID++;
        this.date = date;
        customers = new ArrayList<Customer>();
        courts = new ArrayList<Court>();
        extras = new ArrayList<Extra>();
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

    //composiciones * a 1 con Court
    public void setCourts(Court courts){
        this.courts = (List<Court>) courts;
    }
    public List<Court> getCourts(){
        return courts;
    }
    public void addCourts(Court courts){
        courts.add(courts);
    }
    public void removeCourts(Court courts){
        courts.remove(courts); //añadirlo en Court
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
    public List<Customer> getCustomers(){
        return customers;
    }
    public void addCustomer(Customer customers){
        customers.add(customers);
    }
    public void removeCustomer(Customer customers){
        customers.remove(customers); //añadirlo en Court
    }
    public Customer getCustomers(int index){
        if (index >= 0 && index < customers.size()){
            return customers.get(index);
        } else{
            return null;
        }
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
}
