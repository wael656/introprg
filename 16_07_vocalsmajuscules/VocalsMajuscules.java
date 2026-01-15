/*Ara que disposem de la funció que ens indica si un caracter és o no vocal, ens hauria de resultar molt còmode fer exercicis que maneguen vocals.

Desenvolupa un programa anomenat VocalsMajuscules que demani un text i mostri totes les lletres en minúscules excepte les vocals, que hauran de quedar en majúscules.*/
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(majusculitzaVocals(text));
    }
    
    public static String majusculitzaVocals(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (UtilString.esVocal(c)) {
               resultat+=Character.toUpperCase(c);
            } else {
                resultat+=Character.toLowerCase(c);
            }   
        }
        return resultat; 
    }
}
