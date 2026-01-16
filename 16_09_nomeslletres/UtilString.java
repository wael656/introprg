/**/
public class UtilString {
    public static String nomesLletres(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                resultat+=c;        
            }
        }
        return resultat;
    }
    
    public static String lletresSeparades(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (i < text.length()-1) {
                resultat+=c + ", "; 
            } else {
                resultat+=c;
            }
        }
        return resultat;
    }
}
