/*Per què el teu programa tingui el verd del prgtest caldrà que incloguis les següents funcions dins de UtilString:

boolean esVocal(char): indica si el caràcter introduït és una vocal catalana en minúscules.

int numDigits(String)

int numVocalsMajuscules(String)

int numVocalsMinuscules(String)

int numLletresMajuscules(String)

int numLletresMinuscules(String)

int numLletres(String): no totes les lletres són o bé majúscules o bé minúscules!*/
public class UtilString {
    public static boolean esVocal(char c) {
        String vocals = "aEeIiOoUuÀàÈèÉéÍíÏïÒòÓóÚúÜü";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (c == v) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(esVocal('A'));
    }
    
    public static int numDigits(String text) {
        int digits = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                digits++;
            }
        }
        return digits;
    }
    
    public static int numVocalsMajuscules(String text) {
        int numVocalsMajus = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (esVocal(c)) {
                if (Character.isUpperCase(c)) {
                    numVocalsMajus++;
                }
            }
        }
        return numVocalsMajus;
    }
    
    public static int numVocalsMinuscules(String text) {
        int numVocalsMinus = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (esVocal(c)) {
                if (Character.isLowerCase(c)) {
                    numVocalsMinus++;
                }
            }
        }
        return numVocalsMinus;
    }
    
    public static int numVocals(String text) {
        int numVocals = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (esVocal(c)) {
                    numVocals++;
            }
        }
        return numVocals;
    }
    
    public static int numLletresMajuscules(String text) {
        int NumLletresMajus = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    NumLletresMajus++;
                }
            }
        }
        return NumLletresMajus;        
    }
    
    public static int numLletresMinuscules(String text) {
        int NumLletresMinus = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    NumLletresMinus++;
                }
            }
        }
        return NumLletresMinus;
    }
    
    public static int numLletres(String text) {
        return numLletresMinuscules(text) + numLletresMajuscules(text);
    }
    
    public static int totalCaracters(String text) {
        int total = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
                total++;
        }
        return total;
    }
    
    public static int altresCaracters(String text) {
        int altres = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                continue;
            }
            if (Character.isDigit(c)) {
                continue;
            }
            altres++;
        }
        return altres;
    }
}
