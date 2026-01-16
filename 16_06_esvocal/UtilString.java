/*Aquest programa UtilString revisa que els caracters dels texts introduïts siguin vocals catalanes.*/
public class UtilString {
    public static boolean esVocal(char caracter) {
        String vocals = "aeiouàèéíïòóúü";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (caracter == v) {
                return true;
            }
        }
        return false;
    }
}
