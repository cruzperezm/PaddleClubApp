package org.ulpgc.is1.model;

public class Equipment extends Extra {
    private String name;

    public Equipment(int price, String name) {
        super(price);
        this.name = name;
    }

    public String getName() {
        return this.getName(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

}
