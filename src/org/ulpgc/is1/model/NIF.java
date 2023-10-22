package org.ulpgc.is1.model;

public class NIF {

    public String number;
    public boolean isValid(){
        return number != null && number.matches("\\d{10}"); //????
    }

    public NIF(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
