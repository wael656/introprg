public class UtilString {
    public static boolean esVocal(char primer, char ultim) {
        String vocals = "aeiouàéèíòóú";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (primer == v || ultim == v) {
                return true;
            }
        }
        return false;
    }
}
