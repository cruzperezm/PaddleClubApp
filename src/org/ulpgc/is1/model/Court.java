package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {
    private String name;
    private int price;
    private CourtType type;
    private List reservations;

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.reservations = new ArrayList();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public CourtType getType() {
        return this.type;
    }
    public void setType(CourtType type) {
        this.type = type;
    }
}
