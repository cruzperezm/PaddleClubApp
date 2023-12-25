package org.ulpgc.is1.model;

public class Nif {

    private String number;

    public Nif(String number){
        this.number = number;
    }
    public boolean isValid(){
        String dni = this.number;
        if (dni.length() != 9){
            return false;
        }
        // String number = dni.substring(0, 9);
        // String letra = dni.substring(9);
        return true;
    }
    public String getNumber() {
        if(!isValid()){
            return "XXXX";
        }
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
