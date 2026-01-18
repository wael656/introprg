/*Aquest programa UtilString en la primera funció guarda només els caràcters, la resta la deixa fora, en la segona funció les separa i posa una coma després de cada caràcter menys el caràcter final.*/
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
