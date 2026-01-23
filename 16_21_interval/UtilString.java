/*És a dir, ara els caràcters resultants apareixen a la mateixa línia.

L'operació de trobar els caràcters dins l'interval la realitzarà una funció anomenada intervalString() amb els paràmetres: la cadena de text corresponent, el valor inicial i el valor final. La funció retornarà la secció corresponent del text.

intervalString() estarà definida dins de UtilString.java i serà una funció pura.*/
public class UtilString {
    public static String intervalString(String text, int inici, int fin) {
        String resultat = "";
        if (inici < 0) {
            inici = 0;
        } 
        else if (inici > text.length()-1) {
            inici = text.length()-1;
        }
        if (fin < 0) {
            fin = 0;
        }
        
        else if (fin > text.length()-1) {
            fin = text.length() -1;
        } 

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
