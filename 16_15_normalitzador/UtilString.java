/*Per poder passar les proves, la nostra biblioteca UtilString haurà de definir la funció normalitzaChar() que rep un caràcter i el retorna normalitzat seguint els criteris especificats. Aquesta funció serà usada per LloroNormalitzador.

I ja que estem, no deixem que el main() de LloroNormalitzador hagi de fer tota la feina. Defineix la funció UtilString.normalitzaText() que se n'encarregui de cada línia que rebi el lloro.*/
public class UtilString {
    public static String normalitzaText(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = normalitzaChar(text.charAt(i));
            resultat+=c;
        } 
        return resultat;
    }
    
    public static char normalitzaChar(char c) {
        if (c == 'à') {
            c  = 'a';
        } else if (c == 'é' || c == 'è') {
            c = 'e';
        } else if (c == 'í' || c == 'ï') {
            c = 'i';
        } else if (c == 'ó' || c =='ò') {
            c = 'o';
        } else if (c == 'ú' || c == 'ü') {
            c = 'u';
        } else if (c == 'À') {
            c = 'A';
        } else if (c == 'É' || c == 'È') {
            c = 'E';
        } else if (c == 'Í' || c == 'Ï') {
            c = 'I';
        } else if (c == 'Ò' || c == 'Ó') {
            c = 'O';
        } else if (c == 'Ú' || c == 'ü') {
            c = 'U';
        } else if (c == 'ç') {
            c = 'c';
        } else if (c == 'Ç') {
            c = 'C';
        }
        return c;
    }
}
