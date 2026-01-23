/**/
public class UtilString {
    public static String intervalString(String text, int inici, int fin) {
        String resultat = "";
        if (inici <= fin) {
            for (int i = inici; i <= fin; i++) {
                char c = text.charAt(i);
                resultat+=c;
            }   
        }    
        
        if (inici > fin) {
            for (int i = inici; i >= fin; i--) {
                char c = text.charAt(i);
                resultat+=c;
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

            if ((text.charAt(0) == '-' || text.charAt(0) == '+') && text.length() > 1) {
                continue; 
            }

            return false; 
        }
            return true;
    } 
}
