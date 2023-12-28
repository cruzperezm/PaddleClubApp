package org.ulpgc.is1.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nif {

    private String number;

    public Nif(String number){
        this.number = number;
    }

    private boolean isValid(String input) {
        String pattern = "\\d{8}[a-zA-Z]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        return matcher.matches();
    }

    public String getNumber() {
        if(!isValid(this.number)){
            return "XXXX";
        }
        return number;
    }
    public void setNumber(String number) {
        if(!isValid(number)){
            this.number = "XXXX";
        }
        this.number = number;
    }
}
