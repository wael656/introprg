/*En aquest programa utilstring tenim una funció que retorna un boolean comprovant si el numero rebut es un enter o no. */
public class UtilString {
    public static boolean esEnter(String text) {
        if (text == null || text.isEmpty()) {
            return false;
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
}