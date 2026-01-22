public class UtilString {

    public static boolean esEnter(String text) {
        return esEnter(text, true);
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        
        if (!estricte) {
            text = normalitzaBlancs(text); 
        }
        int i = 0;
        
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            i = 1;
            if (text.length() == 1) {
                return false;
            }
        }
        
        
        while (i < text.length() && text.charAt(i) == '0') {
            i++;
        }
        
        int digitsSignificatius = 0;
        for (int k = i; k < text.length(); k++) {
            char c = text.charAt(k);
            
            if (!Character.isDigit(c)) {
                return false;
            }
            digitsSignificatius++;
        }
        return digitsSignificatius <= 9;
    }


    public static int aEnter(String text) {
        return aEnter(text, true);
    }
    
    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            return Integer.parseInt(text);
        } else {
            return Integer.parseInt(normalitzaBlancs(text));
        }
    }
    
    public static String normalitzaBlancs(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!Character.isWhitespace(c)) {
                resultat += c;
            }
        }
        
        return resultat;
    }
}
