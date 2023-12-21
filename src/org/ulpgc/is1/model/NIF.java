package org.ulpgc.is1.model;

public class NIF {

    private String number;

    public NIF(String number){
        this.number = number;
    }
    public boolean isValid(){
        String dni = this.number;
        if (dni.length() != 9){
            return false;
        }
        String number = dni.substring(0, 9);
        String letter = dni.substring(9);
        return true;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
