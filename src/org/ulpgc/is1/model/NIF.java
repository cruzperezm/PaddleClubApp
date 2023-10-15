package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public NIF(String number) {
        this.number = number;
    }
    public String isValid() {
        if (this.number().length() == 9) {
            return this.number();
        }
        else {
            return "XXXX";
        }
    }
}
