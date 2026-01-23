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
}
