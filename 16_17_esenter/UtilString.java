/*La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.*/
public class UtilString {
    public static boolean esEnter(String text) {
        boolean esDigit = true;
            for (int i = 0; i < text.length(); i++) {
                char n = text.charAt(i); 
                if (Character.isLetter(n)) {
                    esDigit = false;
                }
                
                if (!Character.isDigit(n) || n == ' ') {
                    esDigit = false;
                } 
                
                if (text.charAt(0) == '-' || text.charAt(0) == '+' && !Character.isLetter(text.charAt(1))) {
                    esDigit = true;                    
                } 
                
                if ((text.charAt(0) == '-' || text.charAt(0) == '+') && (text.charAt(1) == '-' || text.charAt(1) == '+')) {
                    esDigit = false;
                }
            }
            if (esDigit) {
                return true;
            } 
            return false;
    }
}
