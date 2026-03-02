/*Implementarem ara una nova versió per la funció de String: startsWith que anomenarem esPrefix().

La versió a implementar oferirà dues modalitats:

Comparació estricta: És bàsicament una còpia de la funcionalitat de String.startsWith(). Permetrà comprovar si un text comença exactament per un altre.

Per exemple el String "Mad" és prefix de "Madame Bovarie" però no ho serien "mad", "  Madam  ", "Màd" ni "Madonna".

Comparació laxa: Considerarà prefixos ignorant espais sobrers, majúscules/minúscules i caràcters especials de la nostra llengua.
Si has fet l'exercici anterior, és possible que hagis pensat, i què passa amb String.endsWith().

Aquest exercici és la resposta: desenvolupa la funció esSufix() amb les següents signatures:
La funció String.contains() permet saber si un text està inclòs dins d'un altre.

És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.

De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:*/
public class UtilString {
    public static String entreComes(int[] num, char c) {
        String resultat = "";
        for (int i = 0; i < num.length; i++) {
            if (i < num.length-1) {
                resultat += (num[i] + "" + c + " ");
            } else {
                resultat += num[i];
            }
        }
        return resultat;
    }

    public static boolean esSubstring(String substring, String text, boolean estricte) {
        if (estricte) {
            if (substring.length() > text.length()) {
                return false;
            }
            int limit = text.length() - substring.length();
            
            for (int i = 0; i <= limit; i++) {
                boolean trobada = true;
                for (int j = 0; j < substring.length(); j++) {
                    if (substring.charAt(j) != text.charAt(i+j)) {
                        trobada = false;
                        break;
                    }
                }
                
                if (trobada) {
                    return true;
                }
                
            }
            return false;
            
        } else {
            String tNorm = normalitzaText(text);
            String sNorm = normalitzaText(substring);
            int limit2 = tNorm.length() - sNorm.length();
            
            for (int i = 0; i <= limit2; i++) {
                boolean trobada = true;
                for (int j = 0; j < sNorm.length(); j++) {
                    if (sNorm.charAt(j) != tNorm.charAt(i+j)) {
                        trobada = false;
                        break;
                    }
                }
                
                if (trobada) {
                    return true;
                }
                
            }
            return false;
        }
    }
    
    public static boolean esSubstring(String substring, String text) {
        return esSubstring(substring, text, true); 
    }
    
    public static boolean esSufix(String sufix, String text, boolean estricte) {
        int diferencia = text.length() - sufix.length();
        if (estricte) {
            if (sufix.length() > text.length()) {
                return false;
            }
            for (int i = 0; i < sufix.length(); i++) {
                if (sufix.charAt(i) != text.charAt(diferencia+i)) {
                    return false;
                }
            }
            return true;
        } else { 
            String tNorm = normalitzaText(text);
            String sNorm = normalitzaText(sufix);
            int dNorm = tNorm.length() - sNorm.length();
            for (int i = 0; i < sNorm.length(); i++) {
                if (sNorm.charAt(i) != tNorm.charAt(dNorm + i)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static boolean esSufix(String sufix, String text) {
        return esSufix(sufix, text, true);
    }
    
    public static boolean esPrefix(String prefix, String text, boolean estricte) {
        if (estricte) {
            if (prefix.length() > text.length()) {
               return false;
        }
            for (int i = 0; i < prefix.length(); i++) {
                char c1 = prefix.charAt(i);
                char c2 = text.charAt(i);
                if (c1 != c2) {
                    return false;
                }
            }
            return true;    
        } else {
            String tNorm = normalitzaText(text);
            String pNorm = normalitzaText(prefix);
            for (int i = 0; i < pNorm.length(); i++) {
                char c1 = tNorm.charAt(i);
                char c2 = pNorm.charAt(i);
                if (c1 != c2) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static boolean esPrefix(String prefix, String text) {
        return esPrefix(prefix, text, true);    
    }
    
    public static String normalitzaText(String text) {
        String senseBlancs = normalitzaBlancs(text);
        String resultat = "";
        for (int i = 0; i < senseBlancs.length(); i++) {
            char c = senseBlancs.charAt(i);
            c = Character.toLowerCase(c);
            c = normalitzaChar(c);
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
    
    public static boolean esVocal(char c) {
        String vocals = "aeiouàèéíïòóúü";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (c == v) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean esVocalMajus(char c) {
        String vocals = "AEIOUÀÈÉÍÏÒÓÚÜ";
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (c == v) {
                return true;
            }
        }
        return false;
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
            if (esVocalMajus(c)) {
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
            if (esVocal(c) || esVocalMajus(c)) {
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
    
    public static int lletresRares(String text) {                
        int lletres = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'お' || c == 'は' || c == 'よ' || c == 'う' || c == 'ご' || c == 'ざ' || c == 'い' || c == 'ま' || c == 'す' || c == 'ر' || c == 'ي' || c == 'خ' || c == 'ل' || c == 'ا' || c == 'ح' || c == 'ب' || c == 'ص' || c == '早' || c == '上' || c == '好') {
            lletres++;
            } 
        }
        return lletres;
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
        return numLletresMinuscules(text) + numLletresMajuscules(text) + lletresRares(text);
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
    
    public static boolean esEnter(String text) {
        return esEnter(text, true);
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        
        if (!estricte) {
            text = normalitzaBlancs(text); 
        }
        int i = 0;
        
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            i = 1;
            if (text.length() == 1) {
                return false;
            }
        }
        
        
        while (i < text.length() && text.charAt(i) == '0') {
            i++;
        }
        
        int digitsSignificatius = 0;
        for (int k = i; k < text.length(); k++) {
            char c = text.charAt(k);
            
            if (!Character.isDigit(c)) {
                return false;
            }
            digitsSignificatius++;
        }
        return digitsSignificatius <= 9;
    }


    public static int aEnter(String text) {
        return aEnter(text, true);
    }
    
    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            return Integer.parseInt(text);
        } else {
            return Integer.parseInt(normalitzaBlancs(text));
        }
    }
}
