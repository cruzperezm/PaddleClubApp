package org.ulpgc.is1.model;

public class Equipment extends Extra {
    public String name;

    public Equipment(int price, String name) {
        super();
        this.name = name;
    }

    public void getName() {

        return name;
    }
}
