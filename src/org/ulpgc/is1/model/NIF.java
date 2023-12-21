package org.ulpgc.is1.model;

public class NIF {

    public String number;

    public NIF(String number){
        this.number = number;
    }
    public boolean isValid(){
        String number = this.number;
        if (number.length() != 9){
            return false;
        }

    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
