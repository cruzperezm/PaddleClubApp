package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
abstract class Extra {
    private List reservations;
    private int price;

    abstract public String getName();

    public Extra(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
