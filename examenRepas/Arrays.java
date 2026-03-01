public class Arrays {
    public static void main(String[] args) {
        String entrada = "Java";
        char[] txtToChar = stringToCharArray(entrada);
        System.out.println(txtToChar);
    
        char[] entrada2 = {'4', 'm', '4', 'n', '1', 'd', '4'};
        char[] filtra = filtraArray(entrada2);
        System.out.println(filtra);
        
        String[][] taula = {
                {"Hola", "món", "bonic"},
                {"programar", "és", "divertit"},
                {"Vinga", "que", "pots!"}
        };
        
        String[] arrayText = taulaStrings(taula);
        for (int i = 0; i < arrayText.length; i++) {
            System.out.println(arrayText[i]);
        }
    }
    
    public static char[] stringToCharArray(String text) {
        char[] newChar = new char[text.length()];
        if (text.isEmpty()) {
            return newChar;    
        }
        for (int i = 0; i < text.length(); i++) {
            newChar[i] = text.charAt(i);
        }
        return newChar;
    }
    
    public static char[] filtraArray(char[] caracters) {
        String text = "";
        for (int i = 0; i < caracters.length; i++) {
            if (Character.isLetter(caracters[i])) {
                text += caracters[i];
            }
        }
        char[] filtrat = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            filtrat[i] = text.charAt(i);
        }
        return filtrat;    
    }  
    
    public static String[] taulaStrings(String[][] taula) {
        String[] text = new String[taula.length];
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[i].length; j++) {
                text[i] += taula[i][j] + " ";
            }
        }
        return text;
    }
}
