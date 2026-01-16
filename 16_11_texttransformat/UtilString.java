/*Aquest programa UtilString revisa que els caracters dels texts introduïts siguin vocals catalanes.*/
public class UtilString {
    public static boolean esVocal(char caracter) {
        String vocals = "AaEeIiOoUuÀàÈèÉéÍíÏïÒòÓóÚúÜü";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (caracter == v) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean esConsonant(char caracter) {
        String cons = "qQwWrRtTyYpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNMm";
        for (int i = 0; i < cons.length(); i++) {
            char c = cons.charAt(i);
            if (caracter == c) {
                return true;
            }
        }
        return false;
    }
}
