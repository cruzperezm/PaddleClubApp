package org.ulpgc.is1.model;
public class Member extends Customer {
    private int points;
    private Address address;

    public Member(int points, String name, String surname, String nif,
                  String street, int number, int postalCode, String city) {
        super(name, surname, nif);
        this.points = points;
        this.address = new Address(street, number, postalCode, city);
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void setAddress(String street, int number, int postalCode, String city){
        this.address = new Address(street, number, postalCode, city);
    }

    public String getAddress(){
        return this.address.getStreet()
                + " "
                + this.address.getNumber()
                + " "
                + this.address.getPostalCode()
                + " "
                + this.address.getNumber();
    }
}
