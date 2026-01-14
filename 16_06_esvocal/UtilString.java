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
