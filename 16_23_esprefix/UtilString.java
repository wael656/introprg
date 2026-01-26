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
            text = text.strip();
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
}
