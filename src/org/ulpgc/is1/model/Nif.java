package org.ulpgc.is1.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nif {

    private String number;

    public Nif(String number){
        this.number = number;
    }
    private boolean isValid(String input) {
        // Adjusted the substring range to include the letter
        String pattern = "\\d{8}[a-zA-Z]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        boolean match = matcher.matches();
        if (match && input.length() >= 9) {
            int substring = Integer.parseInt(input.substring(0, 8));
            int i = (substring % 23);
            String letras = "TRWAGMYFPDXBNJZSQVHLCK";
            char letra = letras.charAt(i);
            // Make sure input has at least 9 characters before accessing index 8
            if (letra == input.charAt(8)) {
                return true;
            }
        }
        return false;
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
