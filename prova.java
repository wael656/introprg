public class prova {
    public static void main(String[] args) {
        int max = 0;
        String textMax = "";
        while (true) {
            String entrada = Entrada.readLine();
            int compta = comptaVocalNum(entrada);
            if (max < compta) {
                max = compta;
                textMax = entrada;
            } 
            if (entrada.isBlank()) {
                System.out.println("El text guanyador: " + textMax + " amb: " + max);
                break;
            }
        }   
    }
    
    public static int comptaVocalNum(String text) {
        int cont = 0;
        String vocals = "AÀÁÄEÈÉËIÌÍÏOÒÓÖUÙÚÜ";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                    cont++;
                }
            for (int j = 0; j < vocals.length(); j++) {
                if (text.charAt(i) == vocals.charAt(j)) {
                    cont++;
                }
            }
        }
        return cont;
    }
}
