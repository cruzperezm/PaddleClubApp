package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;
abstract class Extra {
    private int price;

    public Extra(int price) {
        this.price = price;
    }

    public String getName(String name){
        return name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(Extra extras) {
        this.add(extras);
    }
    public void remove(Extra extras){
        this.remove(extras);
    }
}
