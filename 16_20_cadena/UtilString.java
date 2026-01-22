/*Nova versió de l'exercici de la cadena continua. En aquesta ocasió aplicarem els nous coneixements de funcions.

El programa CadenaContinua farà el pràcticament el mateix que la versió original però els càlculs els realitzarà una funció dins la llibreria UtilString amb la signatura: String cadenaContinua(String, int)

Addicionalment, la nova versió serà capaç de controlar el cas en que no introdueixin un número enter per la longitud de la cadena resultant.*/
public class UtilString {
    public static String cadenaContinua(String text, int longitud) {
        String resultat = "";
        for (int i = 0; i < longitud; i++) {
            int index = i % text.length();
            char c = text.charAt(index);
            resultat+=c;
         }
         return resultat;        
    }
}
