/*Implementarem ara una nova versió per la funció de String: startsWith que anomenarem esPrefix().

La versió a implementar oferirà dues modalitats:

Comparació estricta: És bàsicament una còpia de la funcionalitat de String.startsWith(). Permetrà comprovar si un text comença exactament per un altre.

Per exemple el String "Mad" és prefix de "Madame Bovarie" però no ho serien "mad", "  Madam  ", "Màd" ni "Madonna".

Comparació laxa: Considerarà prefixos ignorant espais sobrers, majúscules/minúscules i caràcters especials de la nostra llengua.*/
public class UtilString {
    public static boolean esPrefix(String prefix, String text, boolean estricte) {
        if (estricte) {
            if (text.startsWith(prefix)) {
                return true;    
            }
        } else {
            text = normalitzaBlancs(text);
            text = normalitzaText(text);
            String resultat = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                resultat+=Character.toLowerCase(c);
            }
            
            for (int i = 0; i < resultat.length(); i++) {
                if (resultat.startsWith(prefix)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean esPrefix(String prefix, String text) {
        return esPrefix(prefix, text, true);    
    }
    
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
        } else if (c == 'Ú' || c == 'Ü') {
            c = 'U';
        } else if (c == 'ç') {
            c = 'c';
        } else if (c == 'Ç') {
            c = 'C';
        }
        return c;
    }
    
    public static String normalitzaBlancs(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (!Character.isWhitespace(c)) {
                resultat += c;
            }
        }
        
        return resultat;
    }
}
