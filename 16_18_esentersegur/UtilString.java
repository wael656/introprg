/*La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.*/
public class UtilString {
    public static String normalitzaBlancs(String text) {
        int inici = 0;
        while (inici < text.length() && Character.isWhitespace(text.charAt(inici))) {
            inici++;
        }

        if (inici == text.length()) {
            return ""; 
        }

        int fi = text.length() - 1;
        while (fi >= 0 && Character.isWhitespace(text.charAt(fi))) {
            fi--;
        }

        String resultat = "";
        boolean espai = false;

        for (int i = inici; i <= fi; i++) {
            char c = text.charAt(i);

            if (Character.isWhitespace(c)) {
                if (!espai) {
                    resultat += " ";
                    espai = true;
                }
            } else {
                resultat += c;
                espai = false;
            }
        }
        
        return resultat;
    }
    
    public static boolean esEnter(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isDigit(c)) {
                continue;
            }
            
            if (text.length() < 10) {
                continue;
            }
            
            if ((c == '-' || c == '+') && i == 0 && text.length() > 1) {
                continue; 
            }

            return false; 
        }

        return true;
    }
}
