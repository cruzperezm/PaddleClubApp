package org.ulpgc.is1.model;
import java.util.ArrayList; //CORREGIR PORQUE CREO QUE NO TIENE ARRAYS

public class Member extends Customer {
    private int points;
    private Address address;
    private ArrayList<Address> Address;

    public Member(int points, String name, String surname, NIF nif) {
        super(name, surname, nif);
        this.points = points;
        this.Address = new ArrayList<>();
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Address getAddress(){
        return address;
    }

    public void addAddress(Address address){
        Address.add(address);
    }

    public void removeAddress(Address address) {
        Address.remove(address);
    }
}
