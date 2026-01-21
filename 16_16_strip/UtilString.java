/*Nosaltres desenvoluparem la funció normalitzaBlancs() que farà el mateix que String.strip() però afegirà la part de normalitzar els espais en blanc sobrers entre mig de les paraules del text. Així:*/
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
}
