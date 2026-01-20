/*Nosaltres desenvoluparem la funció normalitzaBlancs() que farà el mateix que String.strip() però afegirà la part de normalitzar els espais en blanc sobrers entre mig de les paraules del text. Així:*/
public class UtilString {
    public static String normalitzaBlancs(String text) {
        String resultat = ""; 
        String nou = text.strip();
        boolean espai = false;
        for (int i = 0; i < nou.length(); i++) {
            char c = nou.charAt(i);
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
}
