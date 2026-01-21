/*La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.*/
public class UtilString {
    public static String normalitzaBlancs(String text) {
        String resultat = ""; 
        boolean espai = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (text.charAt(0) == ' ') {
                continue;
            } else if (text.charAt(text.length()-1) == ' ') {
                continue;
            }
            
            if (Character.isWhitespace(c)) {
                if (!espai) {
                    resultat+=" ";
                    espai = true;
                }
            } else {
                resultat+=c;
                espai = false;
            }
        
        }
        return resultat;
    }
    
    public static boolean esEnter(String text) {
        
        
        if (text.isEmpty()) {
            return false;
        }
        
        boolean esDigit = true;
            for (int i = 0; i < text.length(); i++) {
                char n = text.charAt(i); 
                
                if (Character.isDigit(n)) {

                }
                else if ((n == '+' || n == '-') && i == 0) {
                    if (text.length() == 1) {
                        esDigit = false;
                    }
                }
                else {
                    esDigit = false;
                }
                if (!esDigit) {
                    break;
                }
            }
                return esDigit;
    }
    
    public static void main(String[] args) {
        System.out.println(esEnter("	+67"));
    }
    
    
}
