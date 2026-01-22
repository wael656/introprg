/*Nova versió de l'exercici de la cadena continua. En aquesta ocasió aplicarem els nous coneixements de funcions.

El programa CadenaContinua farà el pràcticament el mateix que la versió original però els càlculs els realitzarà una funció dins la llibreria UtilString amb la signatura: String cadenaContinua(String, int)

Addicionalment, la nova versió serà capaç de controlar el cas en que no introdueixin un número enter per la longitud de la cadena resultant.*/
public class UtilString {
    public static String cadenaContinua(String text, int longitud) {
        String resultat = "";
        for (int i = 0; i < longitud; i++) {
            int index = i % text.length();
            char c = text.charAt(index);
            resultat+=c;
         }
         return resultat;        
    }
    
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
