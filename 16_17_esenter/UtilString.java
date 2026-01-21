/*La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.*/
public class UtilString {
    public static boolean esEnter(String text) {
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
}
