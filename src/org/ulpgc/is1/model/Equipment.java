package org.ulpgc.is1.model;

public class Equipment extends Extra {
    public String name;

    public Equipment(int price, String name) {
        super(price);
        this.name = name;
    }

    public String getName(String name) {

        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
