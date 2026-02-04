/*Llegeix amb atenció per descobrir els canvis.

Desenvolupa un programa anomenat ParaulesReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.

Considerarem que una paraula està formada per una seqüència de lletres i finalitza quan apareix un caràcter no lletra o bé la fi del text.*/
public class ParaulaReves {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String invertit = inverteixParaules(text);
        System.out.println(copiaCas(invertit, text));
    }
    
    public static String inverteixParaules(String text) {
        String resultat = "";
        String aux = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); 
            if (!Character.isLetter(c)) {
                for (int j = aux.length()-1; j >= 0; j--) {
                    resultat+=aux.charAt(j);
                }
                resultat+=c;
                aux = "";
            } else {
                aux+=c;
            }
        }
        
        for (int j = aux.length()-1; j >= 0; j--) {
            resultat+=aux.charAt(j);
        }
        return resultat;
    }
    
    public static String copiaCas(String text, String model) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char cText = text.charAt(i);
            if (i < model.length()) {
                char cMod = model.charAt(i);
                if (Character.isUpperCase(cMod)) {
                    resultat+=Character.toUpperCase(cText);
                } else if (Character.isLowerCase(cMod)) {
                    resultat+=Character.toLowerCase(cText);
                } else {
                    resultat+=cMod;    
                }
            }
        } 
        return resultat;
    }
}
